<?php
header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
header("Access-Control-Allow-Methods: GET, POST");
header("Access-Control-Allow-Headers: Content-Type");

include '../Conexion.php';

if (!empty($_POST['documento']) and !empty($_POST['nombre']) and !empty($_POST['correo']) and !empty($_POST['contrasenia'])) {

    $documento = $_POST['documento'];
    $nombre = $_POST['nombre'];
    $correo = $_POST['correo'];
    $contrasenia = $_POST['contrasenia'];
    $estado = $_POST['estado'];

    try {
        $consulta = $base_de_datos->prepare("UPDATE usuarios SET nombre=:nom, correo=:cor, contrasenia=:cont ,estado=:es WHERE documento = :doc");

        $consulta->bindParam(':doc', $documento);
        $consulta->bindParam(':nom', $nombre);
        $consulta->bindParam(':cor', $correo);
        $consulta->bindParam(':cont', $contrasenia);
        $consulta->bindParam(':es', $estado);
        $proceso = $consulta->execute();
        if($estado == 0){
            $delete = $base_de_datos->prepare("DELETE FROM parqueadero_vendedores WHERE id_usuario= :doc");
            $delete->bindParam(':doc', $documento);
            $proceso_delete = $delete->execute();
        }
        

        if ($proceso) {
            $respuesta = [
                'status' => true,
                'mesagge' => "OK##USER##UPDATE"
            ];
            echo json_encode($respuesta);
        } else {
            $respuesta = [
                'status' => false,
                'mesagge' => "ERROR##USER##UPDATE"
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