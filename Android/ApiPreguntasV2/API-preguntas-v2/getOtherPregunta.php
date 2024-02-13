<?php
include "Conexion.php";
session_start();

//La razon por la que se me estaba remplazando los id de las preguntas era que se estaba creando el arreglo del SESSION cada que salida de bucle, ya con el ternario se verifica para que tome el valor del arreglo anterior y sino entonces se crea de nuevo el array();
//Esto en el android no funciona ($_SESSION);
$_SESSION['preguntas_anteriores'] = isset($_SESSION['preguntas_anteriores']) ? $_SESSION['preguntas_anteriores'] : array();

if (!empty($_POST['id_cuestionario'])) {
    $id_cuestionario = $_POST['id_cuestionario'];

    
    if (count($_SESSION['preguntas_anteriores']) > 9) {
        session_destroy();
        $respuesta = [
            "status" => false,
            "message" => "LIMITE DE PREGUNTAS ALCANZADA"
        ];
        echo json_encode($respuesta);
    }else{
        $seguir = true;
        while ($seguir) {
    
            $consultaPreguntas = $base_de_datos->query("SELECT * FROM preguntas ORDER BY RAND() LIMIT 1");
    
            if ($consultaPreguntas->rowCount() > 0) {
                $dataPreguntas = $consultaPreguntas->fetch(PDO::FETCH_ASSOC);
    
                if (!in_array($dataPreguntas['id'], $_SESSION['preguntas_anteriores'])) {
                    $_SESSION['preguntas_anteriores'][] = $dataPreguntas['id'];
                    $seguir = false;
    
                    $consultaOpciones = $base_de_datos->prepare("SELECT * FROM opciones WHERE id_pregunta = :idp");
                    $consultaOpciones->bindParam(":idp", $dataPreguntas['id']);
                    $consultaOpciones->execute();
    
                    $datosOpciones = $consultaOpciones->fetchAll(PDO::FETCH_ASSOC);
    
                    if ($datosOpciones) {
                        $respuesta = [
                            "status" => true,
                            "message" => "OK##QUERY##PREGUNTAS",
                            "pregunta" => $dataPreguntas,
                            "opciones" => $datosOpciones,
                            "arreglo" => $_SESSION['preguntas_anteriores']
                        ];
                        echo json_encode($respuesta);
                    } else {
                        $respuesta = [
                            "status" => false,
                            "message" => "ERROR##QUERY##OPCIONES"
                        ];
                        echo json_encode($respuesta);
                    }
    
    
                }
            } else {
                $respuesta = [
                    "status" => false,
                    "message" => "ERROR##QUERY##PREGUNTAS"
                ];
                echo json_encode($respuesta);
            }
            
    
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