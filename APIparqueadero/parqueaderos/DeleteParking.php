<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include '../Conexion.php';

    if (!empty($_POST['id_parqueadero'])) {
        $id = $_POST['id_parqueadero'];
        try {
            $consultaEliminarI = $base_de_datos ->prepare("DELETE FROM parqueadero_vendedores WHERE id_parqueadero = :id");
            $consultaEliminarI->bindParam(':id', $id);
            $procesoItems = $consultaEliminarI->execute();
            if($procesoItems){
                $consulta = $base_de_datos->prepare("DELETE FROM parqueadero WHERE id_parqueadero = :id");

                $consulta->bindParam(':id', $id);
                
                $proceso = $consulta->execute();

                if( $proceso ){
                    $respuesta = [
                                    'status' => true,
                                    'mesagge' => "OK##PARKING##DELETE"
                                  ];
                    echo json_encode($respuesta);
                }else{
                    $respuesta = [
                                    'status' => false,
                                    'mesagge' => "ERROR##PARKING##DELETE"
                                  ];
                    echo json_encode($respuesta);
                }
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
