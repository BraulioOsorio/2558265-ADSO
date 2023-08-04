DROP DATABASE app_tareas;
CREATE DATABASE app_tareas;
USE app_tareas;

CREATE TABLE usuarios(
    id_usuario INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre_user VARCHAR(60),
    correo VARCHAR(60),
    pass VARCHAR(255),
    
);
CREATE TABLE tareas(
    id_tarea INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    tarea TEXT,
    estado TINYINT
);
--Triger
CREATE TABLE user_tareas(
    id_usuario INT UNSIGNED,
    id_tarea INT UNSIGNED,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario),
    FOREIGN KEY (id_tarea) REFERENCES tareas(id_tarea),
    PRIMARY KEY(id_usuario,id_tarea)
);
ALTER TABLE `tareas` CHANGE `estado` `estado` TINYINT(4) NULL DEFAULT '0';

ALTER TABLE `tareas` CHANGE `estado` `estado` ENUM("PENDIENTE","PROCESO","CANCELAR","REALIZADO") NULL;
ALTER TABLE `tareas` ADD `Fecha_inicio` DATE NOT NULL AFTER `estado`;
ALTER TABLE `tareas` ADD `Fecha_fin` DATE NOT NULL AFTER `Fecha_inicio`;
ALTER TABLE `usuarios` ADD `Icono` ENUM("1","2","3","4","5","6") NOT NULL AFTER `pass`;