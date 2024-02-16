<?php
header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
header("Access-Control-Allow-Methods: GET, POST");
header("Access-Control-Allow-Headers: Content-Type");

include '../Conexion.php';

if (!empty($_POST['placa']) and !empty($_POST['id_parqueadero'])) {

    $placa = $_POST['placa'];
    $id_parqueadero = $_POST['id_parqueadero'];

    try {
        $contador = $base_de_datos->prepare("SELECT COUNT(placa) FROM tickets WHERE placa=:pla");
        $contador->bindParam(':pla', $placa);
        $contador->execute();
        $count = $contador->fetchColumn(); 
        if ($count == 0) {
            $consulta = $base_de_datos->prepare("INSERT INTO tickets (placa, parqueadero) VALUES(:pla, :idp)");

            $consulta->bindParam(':pla', $placa);
            $consulta->bindParam(':idp', $id_parqueadero);

            $proceso = $consulta->execute();

            if ($proceso) {
                $consultaSelect = $base_de_datos->query("SELECT tickets.hora_ingreso, tickets.placa, parqueadero.nombre, vehiculo_registrados.propietario, vehiculo_registrados.tipo FROM tickets INNER JOIN vehiculo_registrados ON tickets.placa = vehiculo_registrados.placa INNER JOIN parqueadero ON parqueadero.id_parqueadero =  tickets.parqueadero ORDER BY tickets.id_tickets DESC  LIMIT 1");

                $ticket = $consultaSelect->fetch(PDO::FETCH_ASSOC);

                if ($proceso) {
                    if ($consultaSelect->rowCount() == 1) {
                        $respuesta = [
                            'status' => true,
                            'mesagge' => "Se creó el ticket",
                            'registros' => $ticket
                        ];
                        echo json_encode($respuesta);
                    } else {
                        $respuesta = [
                            'status' => false,
                            'mesagge' => "No se encontraron registros"
                        ];
                        echo json_encode($respuesta);
                    }
                } else {
                    $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##PARQUEADERO##POST"
                    ];
                    echo json_encode($respuesta);
                }
            } else {
                $respuesta = [
                    'status' => false,
                    'mesagge' => "ERROR##TICKET##INSERT"
                ];
                echo json_encode($respuesta);
            }

        }elseif ($count > 0) {
            $consultaSelectTicket = $base_de_datos->prepare("SELECT COUNT(placa) FROM tickets WHERE placa =:pla AND estado_pago=0");
            $consultaSelectTicket->bindParam(':pla', $placa);
            $consultaSelectTicket->execute();
            $countt = $consultaSelectTicket->fetchColumn(); 

            if ($countt == 0) {
                $consulta = $base_de_datos->prepare("INSERT INTO tickets (placa, parqueadero) VALUES(:pla, :idp)");

                $consulta->bindParam(':pla', $placa);
                $consulta->bindParam(':idp', $id_parqueadero);

                $proceso = $consulta->execute();

                if ($proceso) {
                    $consultaSelect = $base_de_datos->query("SELECT tickets.hora_ingreso, tickets.placa, parqueadero.nombre, vehiculo_registrados.propietario, vehiculo_registrados.tipo FROM tickets INNER JOIN vehiculo_registrados ON tickets.placa = vehiculo_registrados.placa INNER JOIN parqueadero ON parqueadero.id_parqueadero =  tickets.parqueadero ORDER BY tickets.id_tickets DESC  LIMIT 1");

                    $ticket = $consultaSelect->fetch(PDO::FETCH_ASSOC);

                    if ($proceso) {
                        if ($consultaSelect->rowCount() == 1) {
                            $respuesta = [
                                'status' => true,
                                'mesagge' => "Se creó el ticket",
                                'registros' => $ticket
                            ];
                            echo json_encode($respuesta);
                        } else {
                            $respuesta = [
                                'status' => false,
                                'mesagge' => "No se encontraron registros"
                            ];
                            echo json_encode($respuesta);
                        }
                    } else {
                        $respuesta = [
                            'status' => false,
                            'mesagge' => "ERROR##PARQUEADERO##POST"
                        ];
                        echo json_encode($respuesta);
                    }
                } else {
                    $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##TICKET##INSERT"
                    ];
                    echo json_encode($respuesta);
                }
            } else {
                $respuesta = [
                    'status' => false,
                    'mesagge' => "FACTURA#PENDIENTE"
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
} else {
    $respuesta = [
        'status' => false,
        'mesagge' => "ERROR##DATOS##POST",
        '$_GET' => $_GET,
        '$_POST' => $_POST
    ];
    echo json_encode($respuesta);
}
?>