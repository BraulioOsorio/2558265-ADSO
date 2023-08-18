DROP DATABASE app_tareas;
CREATE DATABASE app_tareas;
USE app_tareas;

CREATE TABLE usuarios(
    id_usuario INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    cedula VARCHAR(20) UNIQUE,
    nombre_user VARCHAR(60),
    correo VARCHAR(60) UNIQUE,
    pass VARCHAR(255),
    
    Icono VARCHAR(255)
);
CREATE TABLE tareas(
    id_tarea INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    tarea TEXT,
    Fecha_inicio DATETIME,
    Fecha_fin DATETIME,
    estado TINYINT
);
CREATE TABLE user_tareas(
    id_user_tarea INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT UNSIGNED,
    id_tarea INT UNSIGNED,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario),
    FOREIGN KEY (id_tarea) REFERENCES tareas(id_tarea)
);
ALTER TABLE `tareas` CHANGE `estado` `estado` TINYINT(4) NULL DEFAULT '0';

ALTER TABLE `tareas` CHANGE `estado` `estado` ENUM("PENDIENTE","PROCESO","CANCELAR","REALIZADO","TIEMPO") NULL;
