<?php
header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
header("Access-Control-Allow-Methods: GET, POST");
header("Access-Control-Allow-Headers: Content-Type");

include '../Conexion.php';

if (!empty($_POST['placa'])) {

    $placa = $_POST['placa'];

    try {
        $consulta = $base_de_datos->prepare("SELECT * FROM vehiculo_registrados  WHERE placa = :pla  LIMIT 1");
        $consulta->bindParam(':pla', $placa);

        $proceso = $consulta->execute();
        $vehiculo = $consulta->fetch(PDO::FETCH_ASSOC);

        if ($proceso) {
            if ($consulta->rowCount() == 1) {
                $respuesta['registros'] = $vehiculo;
                $respuesta = [
                    'status' => true,
                    'mesagge' => "Se enocontró un vehiculo",
                    'registros' => $vehiculo
                ]; 
                echo json_encode($respuesta);
            } else {
                $respuesta = [
                    'status' => false,
                    'mesagge' => "No se encontraron registros"
                ];
                echo json_encode($respuesta);
            }
        } else {
            $respuesta = [
                'status' => false,
                'mesagge' => "ERROR##PARQUEADERO##GET"
            ];
            echo json_encode($respuesta);
        }
    } catch (Exception $e) {
        $respuesta = [
            'status' => false,
            'mesagge' => "ERROR##SQL",
            'exception' => $e,
            '$_GET' => $_GET,
            '$_POST' => $_POST
        ];
        echo json_encode($respuesta);
    }
} else {
    $respuesta = [
        'status' => false,
        'mesagge' => "ERROR##DATOS##POST",
        '$_GET' => $_GET,
        '$_POST' => $_POST
    ];
    echo json_encode($respuesta);
}
?>