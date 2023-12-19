<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include '../Conexion.php';

    if (!empty($_POST['cedulaCliente']) and !empty($_POST['cedulaVendedor'])) {

        $nombreC = $_POST['cedulaCliente'];
        $nombreV = $_POST['cedulaVendedor'];
        

        try {
            $consultaVendedor = $base_de_datos->query("SELECT * FROM personas WHERE cedula = $nombreV AND rol = 'VENDEDOR'");
            if($consultaVendedor->rowCount() == 1){
                $consulta = $base_de_datos->prepare("INSERT INTO facturas (cedula_vendedor, cedula_cliente) VALUES(:noV, :noC) ");

                $consulta->bindParam(':noV', $nombreV);
                $consulta->bindParam(':noC', $nombreC);
                
                
                $proceso = $consulta->execute();
                $id_generado = $base_de_datos->lastInsertId();

                if( $proceso ){
                    $respuesta = [
                                    'status' => true,
                                    'mesagge' => "OK##PRODUCT##INSERT",
                                    'id' => $id_generado
                                ];
                    echo json_encode($respuesta);
                }else{
                    $respuesta = [
                                    'status' => false,
                                    'mesagge' => "ERROR##PRODUCT##INSERT"
                                ];
                    echo json_encode($respuesta);
                }
            } else {
                
                $respuesta = [
                    'status' => false,
                    'message' => "CEDULA"
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
    }else{
        $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##POST"
                      ];
        echo json_encode($respuesta);
    }
?>
