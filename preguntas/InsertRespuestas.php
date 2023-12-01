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

                // Insertar en la tabla puntajes
                $consultaPuntaje = $base_de_datos->prepare("INSERT INTO puntajes (id_usuario, puntaje, fecha) VALUES (:idUsuario, :puntaje, CURDATE())");
                $consultaPuntaje->bindParam(':idUsuario', $idUsuario);
                $consultaPuntaje->bindParam(':puntaje', $puntaje);
                $consultaPuntaje->execute();

                // Insertar en la tabla respuestas_usuarios
                foreach ($respuestas as $opcion => $respuesta) {
                    if ($respuesta !== "null") {
                        $consultaRespuestas = $base_de_datos->prepare("INSERT INTO respuestas_usuarios (id_pregunta, respuesta, id_usuario) VALUES (:idPregunta, :respuesta, :idUsuario)");
                        $consultaRespuestas->bindParam(':idPregunta', $opcion);
                        $consultaRespuestas->bindParam(':respuesta', $respuesta);
                        $consultaRespuestas->bindParam(':idUsuario', $idUsuario);
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
