<?php
header("Access-Control-Allow-Origin: *");
header("Access-Control-Allow-Methods: POST");
header("Access-Control-Allow-Headers: Content-Type");

include 'Conexion.php';

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $data = json_decode(file_get_contents("php://input"), true);

    if (!empty($data['cedula']) && !empty($data['respuestas']) && isset($data['puntaje'])) {
        $cedula = $data['cedula'];
        $respuestas = $data['respuestas'];
        $puntaje = $data['puntaje'];

        try {
            // Buscar al usuario por cédula
            $consultaUsuario = $base_de_datos->prepare("SELECT id_usuario FROM usuarios WHERE numero_cedula = :cedula");
            $consultaUsuario->bindParam(':cedula', $cedula);
            $consultaUsuario->execute();
            $resultadoUsuario = $consultaUsuario->fetch(PDO::FETCH_ASSOC);

            if ($resultadoUsuario) {
                $idUsuario = $resultadoUsuario['id_usuario'];

                $consultaPuntaje = $base_de_datos->prepare("INSERT INTO puntajes (id_usuario, puntaje, fecha) VALUES (:idUsuario, :puntaje, NOW())");
                $consultaPuntaje->bindParam(':idUsuario', $idUsuario);
                $consultaPuntaje->bindParam(':puntaje', $puntaje);
                $consultaPuntaje->execute();
                $idIntentos = $base_de_datos->lastInsertId();

                foreach ($respuestas as $opcion => $respuesta) {
                    if ($respuesta !== "null") {

                        $consultaBuscarPregunta = $base_de_datos->prepare("SELECT id_pregunta FROM preguntas WHERE opcion1 = :opcion OR opcion2 = :opcion OR opcion3 = :opcion OR opcion4 = :opcion ");
                        $consultaBuscarPregunta->bindParam(':opcion', $respuesta);
                        $consultaBuscarPregunta->execute();
                        $resultadoBuscarPregunta = $consultaBuscarPregunta->fetch(PDO::FETCH_ASSOC);
                        $idPregunta = $resultadoBuscarPregunta['id_pregunta'];


                        $consultaRespuestas = $base_de_datos->prepare("INSERT INTO respuestas_usuarios (id_pregunta, respuesta, id_usuario,intento) VALUES (:idPregunta, :respuesta, :idUsuario,:intentos)");
                        $consultaRespuestas->bindParam(':idPregunta', $idPregunta);
                        $consultaRespuestas->bindParam(':respuesta', $respuesta);
                        $consultaRespuestas->bindParam(':idUsuario', $idUsuario);
                        $consultaRespuestas->bindParam(':intentos', $idIntentos);
                        $consultaRespuestas->execute();
                    }
                }

                $respuesta = [
                    'status' => true,
                    'message' => "OK##CLIENT##INSERT"
                ];
                echo json_encode($respuesta);
            } else {
                $respuesta = [
                    'status' => false,
                    'message' => "ERROR##CEDULA##NOENCONTRADO"
                ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                'status' => false,
                'message' => "ERROR##SQL",
                'exception' => $e
            ];
            echo json_encode($respuesta);
        }
    } else {
        $respuesta = [
            'status' => false,
            'message' => "ERROR##DATOS##POST"
        ];
        echo json_encode($respuesta);
    }
} else {
    $respuesta = [
        'status' => false,
        'message' => "ERROR##METODO##NOPOST"
    ];
    echo json_encode($respuesta);
}
?>
