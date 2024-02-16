<?php
header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
header("Access-Control-Allow-Methods: GET, POST");
header("Access-Control-Allow-Headers: Content-Type");

include '../Conexion.php';

if (!empty($_POST['id_parqueadero']) and !empty($_POST['nombre']) and !empty($_POST['direccion'])) {

    $id = $_POST['id_parqueadero'];
    $nombre = $_POST['nombre'];
    $direccion = $_POST['direccion'];
    $estado = $_POST['estado'];

    try {
        $consulta = $base_de_datos->prepare("UPDATE parqueadero  SET nombre=:nom, direccion=:dir, estado=:est WHERE id_parqueadero = :id");

        $consulta->bindParam(':id', $id);
        $consulta->bindParam(':nom', $nombre);
        $consulta->bindParam(':dir', $direccion);
        $consulta->bindParam(':est', $estado);

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