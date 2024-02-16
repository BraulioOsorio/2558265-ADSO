<?php
header("Access-Control-Allow-Origin: *");
header("Access-Control-Allow-Methods: GET, POST");
header("Access-Control-Allow-Headers: Content-Type");

include '../Conexion.php';

if (!empty($_GET['idP'])) {
    $id_parqueadero = $_GET['idP'];

    try {
        $consulta = $base_de_datos->prepare("SELECT * FROM tickets WHERE tickets.parqueadero = :id ORDER BY  id_tickets DESC");
        $consulta->bindParam(':id', $id_parqueadero, PDO::PARAM_INT);
        $proceso = $consulta->execute();
        $datos = $consulta->fetchAll(PDO::FETCH_ASSOC);

        if ($proceso) {
            $respuesta['registros'] = $datos;
            echo json_encode($respuesta);
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
