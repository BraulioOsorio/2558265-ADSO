<?php
header("Access-Control-Allow-Origin: * ");
header("Access-Control-Allow-Methods: GET, POST");
header("Access-Control-Allow-Headers: Content-Type");

include 'Conexion.php';

$sql = "SELECT puntajes.id_puntaje, puntajes.puntaje, puntajes.fecha, usuarios.nombre FROM puntajes JOIN usuarios ON puntajes.id_usuario = usuarios.id_usuario ORDER BY puntajes.puntaje DESC";

$consulta = $base_de_datos->query($sql);
$datos = $consulta->fetchAll(PDO::FETCH_ASSOC);

$respuesta['puntajes'] = $datos;
echo json_encode($respuesta);
?>
