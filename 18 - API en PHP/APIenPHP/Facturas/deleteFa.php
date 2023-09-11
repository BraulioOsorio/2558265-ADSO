<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include '../Conexion.php';

    if (!empty($_POST['id'])) {
        $id = $_POST['id'];
        try {
            $consultaEliminarI = $base_de_datos ->prepare("DELETE FROM items_facturas WHERE id_facturas = :id");
            $consultaEliminarI->bindParam(':id', $id);
            $procesoItems = $consultaEliminarI->execute();
            if($procesoItems){
                $consulta = $base_de_datos->prepare("DELETE FROM facturas WHERE id_facturas = :id");

                $consulta->bindParam(':id', $id);
                
                $proceso = $consulta->execute();

                if( $proceso ){
                    $respuesta = [
                                    'status' => true,
                                    'mesagge' => "OK##CLIENT##DELETE"
                                  ];
                    echo json_encode($respuesta);
                }else{
                    $respuesta = [
                                    'status' => false,
                                    'mesagge' => "ERROR##CLIENT##DELETE"
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
