<?php
    include "Conexion.php";

    if(!empty($_POST['id_usuario'])){
        $id_usuario = $_POST['id_usuario'];

        $consulta = $base_de_datos->prepare("SELECT * FROM cuestionarios WHERE id_usuario = :idu ORDER BY fecha_inicio DESC");
        $consulta->bindParam(":idu", $id_usuario);
        $consulta->execute();


        $datosCuestionario = $consulta->fetchAll(PDO::FETCH_ASSOC);

        if($datosCuestionario){
            $respuesta = [
                "status" => true,
                "resumen" => $datosCuestionario
            ];
            echo json_encode($respuesta);
        }else{
            $respuesta = [
                "status" => false,
                "message" => "ERROR##SINDATOS"
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