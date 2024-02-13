<?php
include "Conexion.php";

if (!empty($_POST['cant_preguntas']) and !empty($_POST['cant_ok']) and !empty($_POST['cant_error']) and !empty($_POST['id_cuestionario'])) {
    $cant_preguntas = $_POST['cant_preguntas'];
    $cant_ok = $_POST['cant_ok'];
    $cant_error = $_POST['cant_error'];
    $id_cuestionario = $_POST['id_cuestionario'];


    if (!empty($_POST['fecha_fin'])) {
        $fecha_fin = $_POST['fecha_fin'];

        $consultaInsert = $base_de_datos->prepare("UPDATE cuestionarios SET cant_preguntas = :cantp, cant_ok = :canto, cant_error = :cante, fecha_fin = :fecf WHERE id = :idc");
        $consultaInsert->bindParam(":cantp", $cant_preguntas);
        $consultaInsert->bindParam(":canto", $cant_ok);
        $consultaInsert->bindParam(":cante", $cant_error);
        $consultaInsert->bindParam(":idc", $id_cuestionario);
        $consultaInsert->bindParam(":fecf", $fecha_fin);

        if ($consultaInsert->execute()) {
            $respuesta = [
                "status" => true,
                "message" => "ACTUALIZO##CUESTIONARIO##RESPUESTA##FIN"
            ];
            echo json_encode($respuesta);
        } else {
            $respuesta = [
                "status" => false,
                "message" => "ERROR##CUESTIONARIO##RESPUESTA##FIN"
            ];
            echo json_encode($respuesta);
        }

    } else {
        $consultaInsert = $base_de_datos->prepare("UPDATE cuestionarios SET cant_preguntas = :cantp, cant_ok = :canto, cant_error = :cante WHERE id = :idc");
        $consultaInsert->bindParam(":cantp", $cant_preguntas);
        $consultaInsert->bindParam(":canto", $cant_ok);
        $consultaInsert->bindParam(":cante", $cant_error);
        $consultaInsert->bindParam(":idc", $id_cuestionario);

        if ($consultaInsert->execute()) {
            $respuesta = [
                "status" => true,
                "message" => "ACTUALIZO##CUESTIONARIO##RESPUESTA"
            ];
            echo json_encode($respuesta);
        } else {
            $respuesta = [
                "status" => false,
                "message" => "NO##ACTUALIZO##CUESTIONARIO##RESPUESTA"
            ];
            echo json_encode($respuesta);
        }
    }
} else {
    $respuesta = [
        "status" => false,
        "message" => "ERROR##DATOS##POST"
    ];
    echo json_encode($respuesta);
}

?>