<?php 
	header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
	header("Access-Control-Allow-Methods: GET, POST");
	header("Access-Control-Allow-Headers: Content-Type");

    include '../Conexion.php';

    $consulta = $base_de_datos->query("SELECT usuarios.* FROM usuarios LEFT JOIN parqueadero_vendedores ON usuarios.documento = parqueadero_vendedores.id_usuario WHERE parqueadero_vendedores.id_usuario IS NULL");
    
    $datos = $consulta->fetchAll();

    $respuesta['registros'] = $datos;
    echo json_encode($respuesta);
    
?>