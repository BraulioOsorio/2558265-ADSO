<?php 
	header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
	header("Access-Control-Allow-Methods: GET, POST");
	header("Access-Control-Allow-Headers: Content-Type");

    include '../Conexion.php';

    $consulta = $base_de_datos->query("SELECT usuarios.*, parqueadero.nombre AS nombre_parqueadero FROM usuarios INNER JOIN parqueadero_vendedores ON usuarios.documento = parqueadero_vendedores.id_usuario INNER JOIN parqueadero ON parqueadero_vendedores.id_parqueadero = parqueadero.id_parqueadero WHERE usuarios.rol = 'vendedor'");
    $datos = $consulta->fetchAll();

    $respuesta['registros'] = $datos;
    echo json_encode($respuesta);
    
?>