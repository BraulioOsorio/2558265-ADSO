<?php
    include "Conexion.php";

    if(!empty($_POST['id_usuario']) and !empty($_POST['fecha_inicio'])){
        $id_usuario = $_POST['id_usuario'];
        $fecha_inicio = $_POST['fecha_inicio'];

        $consultaInsert = $base_de_datos->prepare("INSERT INTO cuestionarios(id_usuario, fecha_inicio) VALUES (:idu, :fech)");
        $consultaInsert->bindParam(":idu", $id_usuario);
        $consultaInsert->bindParam(":fech", $fecha_inicio);
        $procesoQuery = $consultaInsert->execute();

        if($procesoQuery){

            $consultaData = $base_de_datos->query("SELECT id FROM cuestionarios ORDER BY fecha_inicio DESC LIMIT 1");

            if($consultaData->rowCount()>0){
                $dataCuestionario = $consultaData->fetch(PDO::FETCH_ASSOC);
                $id = $dataCuestionario["id"];
                $respuesta = [
                    "status" => true,
                    "message" => "OK##CUESTIONARIO##INSERT",
                    "id_cuestionario" => $id
                ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                    "status" => false,
                    "message" => "ERROR##CONSULTA##CUESTIONARIO"
                ];
                echo json_encode($respuesta);
            }
           
        }else{
            $respuesta = [
                "status" => false,
                "message" => "ERROR##INSERTS"
            ];
            echo json_encode($respuesta);
        }
    }else{
        $respuesta = [
            "status" => false,
            "message" => "ERROR##DATOS##POST"
        ];
        echo json_encode($respuesta);
    }

?>