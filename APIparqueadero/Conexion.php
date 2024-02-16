<?php

// $servidor = 'buaintbvbdqsgljpdyc6-mysql.services.clever-cloud.com';
// $usuario = 'uclqdwam0wnaolzx';
// $contrasena = 'L5P8CHkaUL6e0fnNXMUH';
// $nombre_de_base = 'buaintbvbdqsgljpdyc6';

$servidor = 'localhost';
$usuario = 'root';
$contrasena = '';
$nombre_de_base = 'parqueadero';

try{
   $base_de_datos = new PDO("mysql:host=$servidor;dbname=$nombre_de_base", $usuario, $contrasena);
}catch(Exception $e){
   echo 'Ha surgido un error y no se puede conectar a la base de datos. Detalle: ' . $e->getMessage();
   exit;
}