<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include '../Conexion.php';

    if (!empty($_POST['id_usuario']) and !empty($_POST['id_parqueadero'])) {

        $id_usuario = $_POST['id_usuario'];
        $id_parqueadero = $_POST['id_parqueadero'];


        try {
            $consultaVerificar = $base_de_datos->prepare("SELECT * FROM parqueadero_vendedores WHERE id_usuario = :idu");
            $consultaVerificar->bindParam(':idu', $id_usuario);

            $procesoConsulta = $consultaVerificar->execute();

            if($consultaVerificar->rowCount() > 0){
                $consultaUpdate = $base_de_datos->prepare("UPDATE parqueadero_vendedores SET id_parqueadero = :idp WHERE id_usuario = :idu");
                $consultaUpdate->bindParam(':idu', $id_usuario);
                $consultaUpdate->bindParam(':idp', $id_parqueadero);

                $procesoUpdate = $consultaUpdate->execute();

                if( $procesoUpdate ){
                    $respuesta = [
                                    'status' => true,
                                    'mesagge' => "OK##PARKING-USER##INSERT"
                                  ];
                    echo json_encode($respuesta);
                }else{
                    $respuesta = [
                                    'status' => false,
                                    'mesagge' => "ERROR##PARKING-USER##INSERT"
                                  ];
                    echo json_encode($respuesta);
                }
            }else{
                $consulta = $base_de_datos->prepare("INSERT INTO parqueadero_vendedores (id_usuario, id_parqueadero) VALUES(:idu, :idp) ");

                $consulta->bindParam(':idu', $id_usuario);
                $consulta->bindParam(':idp', $id_parqueadero);
                
                $proceso = $consulta->execute();

                if( $proceso ){
                    $respuesta = [
                                    'status' => true,
                                    'mesagge' => "OK##PARKING-USER##INSERT"
                                  ];
                    echo json_encode($respuesta);
                }else{
                    $respuesta = [
                                    'status' => false,
                                    'mesagge' => "ERROR##PARKING-USER##INSERT"
                                  ];
                    echo json_encode($respuesta);
                }
            }            
        } catch (Exception $e) {
            $respuesta = [
                            'status' => false,
                            'mesagge' => "ERROR##SQL",
                            'exception' => $e,
                            '$_GET' => $_GET,
                            '$_POST' => $_POST
                          ];
            echo json_encode($respuesta);
        }
    }else{
        $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##POST",
                        '$_GET' => $_GET,
                        '$_POST' => $_POST
                      ];
        echo json_encode($respuesta);
    }
?>
