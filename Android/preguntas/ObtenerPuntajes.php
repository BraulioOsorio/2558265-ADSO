<?php
header("Access-Control-Allow-Origin: * ");
header("Access-Control-Allow-Methods: GET, POST");
header("Access-Control-Allow-Headers: Content-Type");

include 'Conexion.php';

// Verificar si la solicitud es de tipo POST
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Obtener la cédula del cuerpo de la solicitud POST
    $cedula = $_POST['cedula'];

    // Preparar la consulta con parámetros
    $sql = "SELECT puntajes.id_puntaje, puntajes.puntaje, puntajes.fecha, usuarios.nombre 
            FROM puntajes 
            JOIN usuarios ON puntajes.id_usuario = usuarios.id_usuario 
            WHERE usuarios.numero_cedula = :cedula 
            ORDER BY puntajes.puntaje DESC";

    $consulta = $base_de_datos->prepare($sql);
    $consulta->bindParam(':cedula', $cedula);
    $consulta->execute();

    // Obtener los datos y enviar la respuesta en formato JSON
    $datos = $consulta->fetchAll(PDO::FETCH_ASSOC);
    $respuesta['puntajes'] = $datos;
    echo json_encode($respuesta);
} else {
    // Si la solicitud no es de tipo POST, devolver un error
    http_response_code(400);
    echo json_encode(['error' => 'Bad request']);
}
?>
