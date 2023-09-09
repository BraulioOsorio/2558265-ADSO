<?php
header("Access-Control-Allow-Origin: *");
header("Access-Control-Allow-Methods: POST");
header("Access-Control-Allow-Headers: Content-Type");

// Incluye el archivo de conexión a la base de datos
include '../Conexion.php';

// Verifica si la solicitud es de tipo POST
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Verifica si se recibieron datos válidos en JSON
    $data = json_decode(file_get_contents("php://input"), true);

    if ($data && isset($data['productos'])) {
        // Verifica si se proporciona la clave 'id_factura' en los datos JSON
        if (isset($data['id_factura'])) {
            try {
                $id_facturaActual = intval($data['id_factura']);
                $totalPrecioFactura = 0; // Inicializa el total del precio de la factura

                // Prepara una sentencia SQL para insertar información de productos en la tabla items_facturas
                $stmt = $base_de_datos->prepare("INSERT INTO items_facturas (id_producto, id_facturas) VALUES (?, ?)");

                // Itera a través de los productos y realiza las inserciones y cálculos
                foreach ($data['productos'] as $product) {
                    $productId = intval($product['id']);
                    $cantidad = intval($product['cantidad']);

                    // Consultar el precio del producto en la tabla productos
                    $consultaPrecioProducto = $base_de_datos->prepare("SELECT costo_producto FROM productos WHERE id_producto = ?");
                    $consultaPrecioProducto->execute([$productId]);
                    $precioProducto = $consultaPrecioProducto->fetchColumn();

                    // Calcular el precio total del producto
                    $precioTotalProducto = $precioProducto * $cantidad;
                    $totalPrecioFactura += $precioTotalProducto;

                    // Insertar la relación entre la factura y el producto en la tabla items_facturas
                    $stmt->execute([$productId, $id_facturaActual]);
                }

                // Actualizar el precio_factura y el estado de la factura a COMPRADO
                $actualizarFactura = $base_de_datos->prepare("UPDATE facturas SET precio_factura = :precio_total, estado = 'COMPRADO' WHERE id_facturas = :id_factura");
                $actualizarFactura->bindParam(':precio_total', $totalPrecioFactura, PDO::PARAM_STR);
                $actualizarFactura->bindParam(':id_factura', $id_facturaActual, PDO::PARAM_INT);
                $actualizarFactura->execute();

                $respuesta = [
                    'status' => true,
                    'message' => "OK##FACTURA##INSERT"
                ];
                echo json_encode($respuesta);
            } catch (Exception $e) {
                $respuesta = [
                    'status' => false,
                    'message' => "ERROR##SQL",
                    'exception_message' => $e->getMessage() // Captura el mensaje de la excepción
                ];
                echo json_encode($respuesta);
            }
        } else {
            $respuesta = [
                'status' => false,
                'message' => "ERROR##ID_FACTURA"
            ];
            echo json_encode($respuesta);
        }
    } else {
        $respuesta = [
            'status' => false,
            'message' => "ERROR##DATOS##JSON"
        ];
        echo json_encode($respuesta);
    }
} else {
    $respuesta = [
        'status' => false,
        'message' => "ERROR##METODO##HTTP"
    ];
    echo json_encode($respuesta);
}
?>
