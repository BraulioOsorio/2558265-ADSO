<?php  

    include "Conexion.php";

    if((!empty($_POST['correo']) and !empty($_POST['password'])) || (!empty($_GET['correo']) and !empty($_GET['password']))){
        $correo = ( !empty($_POST['correo'])? $_POST['correo']: $_GET['correo']);
        $password = (!empty($_POST['password'])? md5($_POST['password']): md5($_GET['password']));

        $consulta = $base_de_datos->prepare("SELECT * FROM usuarios WHERE correo = :cor AND password = :pas");
        $consulta->bindParam(":cor", $correo);
        $consulta->bindParam(":pas", $password);
        $consulta->execute();

        $datosUsuario = $consulta->fetchAll(PDO::FETCH_ASSOC);
        if(!empty($datosUsuario)){
            $respuesta = [
                "status" => true,
                "message" => "TODOSALIOBIEN##^_^##POST",
                "usuario" => $datosUsuario[0]
            ];
            echo json_encode($respuesta);
        }else{
            $respuesta = [
                "status" => false,
                "message" => "ERROR##PROCESS##POST"
            ];
            echo json_encode($respuesta);    
        }
    }else{
        $respuesta = [
            "status" => false,
            "message" => "Error##DATOS##POST"
        ];
        echo json_encode($respuesta);
    }

?>