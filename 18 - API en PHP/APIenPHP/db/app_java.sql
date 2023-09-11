DROP DATABASE app_java;
CREATE DATABASE IF NOT EXISTS app_java DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE app_java;

-- --------------------------------------------------------

CREATE TABLE productos (
  id_producto int(10) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre_producto varchar(255) DEFAULT NULL,
  costo_producto float UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE personas (
  cedula bigint(20) NOT NULL PRIMARY KEY,
  nombres varchar(30) DEFAULT NULL,
  apellidos varchar(30) DEFAULT NULL,
  telefono varchar(20) DEFAULT NULL,
  direccion varchar(100) DEFAULT NULL,
  email varchar(100) DEFAULT NULL,
  rol = ENUM('CLIENTE','VENDEDOR')
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

CREATE TABLE facturas (
  id_facturas int(10) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  cedula_vendedor bigint(20) NOT NULL,
  cedula_cliente bigint(20) NOT NULL,
  precio_factura float,
  FOREIGN KEY (cedula_vendedor) REFERENCES personas (cedula),
  FOREIGN KEY (cedula_cliente) REFERENCES personas (cedula),
  fecha timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  estado = ENUM('PENDIENTE','COMPRADO')
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE items_facturas (
  id_items int(10) UNSIGNED AUTO_INCREMENT NOT NULL PRIMARY KEY,
  cantidad int,
  id_producto int(10) UNSIGNED DEFAULT NULL,
  id_facturas int(10) UNSIGNED DEFAULT NULL,
  FOREIGN KEY (id_producto) REFERENCES productos (id_producto),
  FOREIGN KEY (id_facturas) REFERENCES facturas (id_facturas)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;




