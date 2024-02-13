<?php
include "Conexion.php";

if(!empty($_POST['id_cuestionario']) and !empty($_POST['id_pregunta']) and !empty($_POST['respuesta']) and !empty($_POST['estado'])){
    $id_cuestionario = $_POST['id_cuestionario'];
    $id_pregunta = $_POST['id_pregunta'];
    $respuesta = $_POST['respuesta'];
    $estado = $_POST['estado'];

    $consultaInsert = $base_de_datos->prepare("INSERT INTO respuestas (id_cuestionario, id_pregunta, respuesta, estado) VALUES (:idc, :idp, :res, :est)");
    $consultaInsert->bindParam(":idc", $id_cuestionario);
    $consultaInsert->bindParam(":idp", $id_pregunta);
    $consultaInsert->bindParam(":res", $respuesta);
    $consultaInsert->bindParam(":est", $estado);

    if($consultaInsert->execute()){
        $respuesta = [
            "status" => true,
            "message" => "SE##INSERTO##RESPUESTA"
        ];
        echo json_encode($respuesta);
    }else{
        $respuesta = [
            "status" => false,
            "message" => "ERROR##DATOS##POST"
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