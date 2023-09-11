<?php
header("Access-Control-Allow-Origin: *");
header("Access-Control-Allow-Methods: GET, POST");
header("Access-Control-Allow-Headers: Content-Type");

include '../Conexion.php';

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Verifica si se ha enviado un ID de facturas en el cuerpo de la solicitud POST.
    $postData = json_decode(file_get_contents("php://input"), true);
    if (isset($postData['id_facturas'])) {
        $id = $postData['id_facturas'];
        try {
            // Evita la inyección SQL usando prepared statements
            $consulta = $base_de_datos->prepare("SELECT i.id_items, p.nombre_producto, p.costo_producto, i.cantidad, f.precio_factura, (i.cantidad * p.costo_producto) AS subtotal FROM items_facturas i INNER JOIN productos p ON i.id_producto = p.id_producto INNER JOIN facturas f ON i.id_facturas = f.id_facturas WHERE f.id_facturas = :id");
            $consulta->bindParam(':id', $id);
            if ($consulta->execute()) {
                $datos = $consulta->fetchAll(PDO::FETCH_ASSOC);
                $respuesta = [
                    'status' => true,
                    'message' => "OK",
                    'registros' => $datos
                ];
                echo json_encode($respuesta);
            } else {
                $respuesta = [
                    'status' => false,
                    'message' => "ERROR##CLIENT##INSERT"
                ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                'status' => false,
                'message' => "ERROR##SQL",
                'exception' => $e->getMessage()
            ];
            echo json_encode($respuesta);
        }
    } else {
        $respuesta = [
            'status' => false,
            'message' => "ERROR##DATOS##POST"
        ];
        echo json_encode($respuesta);
    }
} else {
    $respuesta = [
        'status' => false,
        'message' => "ERROR##METODO##POST"
    ];
    echo json_encode($respuesta);
}
