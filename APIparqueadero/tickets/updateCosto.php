<?php
header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
header("Access-Control-Allow-Methods: GET, POST");
header("Access-Control-Allow-Headers: Content-Type");

include '../Conexion.php';

if (!empty($_GET['salida']) and !empty($_GET['placa']) and !empty($_GET['ingreso']) and !empty($_GET['pago'])) {

    $salida = $_GET['salida'];
    $placa = $_GET['placa'];
    $ingreso = $_GET['ingreso'];
    $pago = $_GET['pago'];

    try {
        $consulta = $base_de_datos->prepare("UPDATE tickets  SET hora_salida=:sal, total_pago=:pag, estado_pago = 1 WHERE placa = :pla AND hora_ingreso=:ing");

        $consulta->bindParam(':sal', $salida);
        $consulta->bindParam(':pla', $placa);
        $consulta->bindParam(':pag', $pago);
        $consulta->bindParam(':ing', $ingreso);

        $proceso = $consulta->execute();

        if ($proceso) {
            $respuesta = [
                'status' => true,
                'mesagge' => "OK##PARKING##UPDATE"
            ];
            echo json_encode($respuesta);
        } else {
            $respuesta = [
                'status' => false,
                'mesagge' => "ERROR##PARKING##UPDATE"
            ];
            echo json_encode($respuesta);
        }
    } catch (Exception $e) {
        $respuesta = [
            'status' => false,
            'mesagge' => "ERROR##SQL",
            'exception' => $e
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