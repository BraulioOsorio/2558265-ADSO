<?php
    include "Conexion.php";

    if(!empty($_POST['id_cuestionario'])){
        $id_cuestionario = $_POST['id_cuestionario'];

        $consultaRespuestas = $base_de_datos->prepare("SELECT respuestas.respuesta, respuestas.estado,respuestas.id_respuesta, preguntas.*, preguntas.descripcion AS desc_pregunta, opciones.*, opciones.descripcion AS desc_opcion 
        FROM respuestas 
        INNER JOIN preguntas ON preguntas.id = respuestas.id_pregunta
        INNER JOIN opciones ON opciones.id_pregunta = preguntas.id 
        WHERE respuestas.id_cuestionario = :idc");
        $consultaRespuestas->bindParam(":idc", $id_cuestionario);
        $consultaRespuestas->execute();

        $datosRespuesta = $consultaRespuestas->fetchAll(PDO::FETCH_ASSOC);
        if($datosRespuesta){
            $respuestas = [];
            foreach ($datosRespuesta as $dato) {
                $id_respuesta = $dato["id_respuesta"];
                $respuestas[$id_respuesta]["pregunta"] = [
                    "id" => $dato["id"],
                    "descripcion" => $dato["desc_pregunta"],
                    "id_correcta" => $dato["id_correcta"],
                    "url_imagen" => $dato["url_imagen"],
                    "respuesta" => $dato["respuesta"],
                    "estado" => $dato["estado"]
                ];

                $respuestas[$id_respuesta]["opciones"][] = [
                    "id" => $dato["id"],
                    "id_pregunta" => $dato["id_pregunta"],
                    "descripcion" => $dato["desc_opcion"]
                ];
            }
            //Esto de aca es para quitarle el indice que sale en cada arreglo asociativo
            $respuestas = array_values($respuestas);
            
            $resultado = [
                "status" => true,
                "respuestas" => $respuestas       
            ];
            echo json_encode($resultado);
        }else{
            $respuesta = [
                "status" => false,
                "message" => "ERROR##CUESTIONARIO##NOENCONTRADO"
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