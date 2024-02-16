<?php
header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
header("Access-Control-Allow-Methods: GET, POST");
header("Access-Control-Allow-Headers: Content-Type");

include '../Conexion.php';

if (!empty($_POST['id_parqueadero'])) {

    $id_parqueadero = (int) $_POST['id_parqueadero'];
    $moto = (float) $_POST['moto'];
    $carro = (float) $_POST['carro'];
    $camion = (float) $_POST['camion'];
    $camioneta = (float) $_POST['camioneta'];

    try {
        $consulta = $base_de_datos->prepare("UPDATE parqueadero SET moto=:mot, carro=:car, camiones=:cam ,camioneta=:cmta WHERE id_parqueadero = :id");

        $consulta->bindParam(':mot', $moto);
        $consulta->bindParam(':car', $carro);
        $consulta->bindParam(':cam', $camion);
        $consulta->bindParam(':cmta', $camioneta);
        $consulta->bindParam(':id', $id_parqueadero);

        $proceso = $consulta->execute();

        if ($proceso) {
            $respuesta = [
                'status' => true,
                'mesagge' => "OK##TARIFA##UPDATE"
            ];
            echo json_encode($respuesta);
        } else {
            $respuesta = [
                'status' => false,
                'mesagge' => "ERROR##TARIFA##UPDATE"
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