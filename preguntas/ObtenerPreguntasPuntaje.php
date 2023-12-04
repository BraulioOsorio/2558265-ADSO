<?php
header("Access-Control-Allow-Origin: *");
header("Access-Control-Allow-Methods: GET, POST");
header("Access-Control-Allow-Headers: Content-Type");

include 'Conexion.php';

if ($_SERVER['REQUEST_METHOD'] === 'POST') {

    $postData = json_decode(file_get_contents("php://input"), true);
    if (isset($postData['id_puntaje'])) {
        $id = $postData['id_puntaje'];
        try {
            // Evita la inyección SQL usando prepared statements
            $consulta = $base_de_datos->prepare("SELECT p.descripcion,ru.respuesta FROM respuestas_usuarios ru JOIN preguntas p ON ru.id_pregunta = p.id_pregunta WHERE ru.intento = :id ORDER BY p.id_pregunta");
            $consulta->bindParam(':id', $id);
            if ($consulta->execute()) {
                $datos = $consulta->fetchAll(PDO::FETCH_ASSOC);
                $respuesta = [
                    'status' => true,
                    'message' => "OK",
                    'registros' => $datos
                ];
                echo json_encode($respuesta);
            } else {
                $respuesta = [
                    'status' => false,
                    'message' => "ERROR##CLIENT##INSERT"
                ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                'status' => false,
                'message' => "ERROR##SQL",
                'exception' => $e->getMessage()
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
        'message' => "ERROR##METODO##POST"
    ];
    echo json_encode($respuesta);
}
