<?php
header("Access-Control-Allow-Origin: *");
header("Access-Control-Allow-Methods: GET, POST");
header("Access-Control-Allow-Headers: Content-Type");

include '../Conexion.php';

if (!empty($_POST['placa'])) {
    $placa = $_POST['placa'];
    $id_parqueadero = $_POST['idP'];

    try {
        $consulta = $base_de_datos->prepare("SELECT * FROM tickets AS t  INNER JOIN vehiculo_registrados AS vr ON t.placa= vr.placa  WHERE (t.placa LIKE :pla OR vr.tipo LIKE :pla OR vr.propietario LIKE :pla) AND t.parqueadero = :id");


        $parametroPlaca = '%' . $placa . '%'; 

        $consulta->bindValue(':pla', $parametroPlaca, PDO::PARAM_STR);
        $consulta->bindParam(':id', $id_parqueadero, PDO::PARAM_INT);

        $proceso = $consulta->execute();
        $datos = $consulta->fetchAll(PDO::FETCH_ASSOC);

        if ($proceso) {
            $respuesta = [
                'status' => true,
                'registros' => $datos
            ];
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
