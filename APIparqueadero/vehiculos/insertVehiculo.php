<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include '../Conexion.php';

    if (!empty($_POST['placa']) and !empty($_POST['propietario']) and !empty($_POST['tipo_vehiculo']) ) {

        $placa = $_POST['placa'];
        $propietario = $_POST['propietario'];
        $tipo_vehiculo = $_POST['tipo_vehiculo'];

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO vehiculo_registrados (placa, propietario, tipo) VALUES(:pla, :pro, :tip) ");

            $consulta->bindParam(':pla', $placa);
            $consulta->bindParam(':pro', $propietario);
            $consulta->bindParam(':tip', $tipo_vehiculo);
            
            $proceso = $consulta->execute();

            if( $proceso ){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##PARKING##INSERT"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##PARKING##INSERT"
                              ];
                echo json_encode($respuesta);
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
