CREATE DATABASE IF NOT EXISTS app_java DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE app_java;

-- --------------------------------------------------------

CREATE TABLE productos (
  id_producto INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre_producto VARCHAR(255) DEFAULT NULL,
  costo_producto FLOAT UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE personas (
  cedula BIGINT NOT NULL PRIMARY KEY,
  nombres VARCHAR(30) DEFAULT NULL,
  apellidos VARCHAR(30) DEFAULT NULL,
  telefono VARCHAR(20) DEFAULT NULL,
  direccion VARCHAR(100) DEFAULT NULL,
  email VARCHAR(100) DEFAULT NULL,
  rol ENUM('CLIENTE','VENDEDOR') DEFAULT 'CLIENTE'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

CREATE TABLE facturas (
  id_facturas INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  cedula_vendedor BIGINT NOT NULL,
  cedula_cliente BIGINT NOT NULL,
  precio_factura FLOAT,
  fecha TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP() ON UPDATE CURRENT_TIMESTAMP(),
  estado ENUM('PENDIENTE','COMPRADO') DEFAULT 'PENDIENTE',
  FOREIGN KEY (cedula_vendedor) REFERENCES personas (cedula),
  FOREIGN KEY (cedula_cliente) REFERENCES personas (cedula)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE items_facturas (
  id_items INT UNSIGNED AUTO_INCREMENT NOT NULL PRIMARY KEY,
  cantidad INT,
  id_producto INT UNSIGNED DEFAULT NULL,
  id_facturas INT UNSIGNED DEFAULT NULL,
  FOREIGN KEY (id_producto) REFERENCES productos (id_producto),
  FOREIGN KEY (id_facturas) REFERENCES facturas (id_facturas)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

DELIMITER //
CREATE TRIGGER before_delete_item_factura
BEFORE DELETE ON items_facturas FOR EACH ROW
BEGIN
  DECLARE precio_producto FLOAT;
  DECLARE cantidad_eliminar INT;
  DECLARE factura_id INT;

  SELECT productos.costo_producto, items_facturas.cantidad, items_facturas.id_facturas INTO precio_producto, cantidad_eliminar, factura_id
  FROM items_facturas
  JOIN productos ON items_facturas.id_producto = productos.id_producto
  WHERE items_facturas.id_items = OLD.id_items;

  UPDATE facturas
  SET precio_factura = precio_factura - (precio_producto * cantidad_eliminar)
  WHERE id_facturas = factura_id;
END;
//
DELIMITER ;
