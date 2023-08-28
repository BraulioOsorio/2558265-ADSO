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

-- Insertar personas en la tabla usuarios
INSERT INTO usuarios (cedula, nombre_user, correo, pass, Icono)
VALUES
    ('108800', 'Oscar Loaiza', 'andres@mail.com', '123', '108800'),
    ('108801', 'David Osorio', 'david@gmail.com', '1234', '108801'),
    ('108802', 'Winder Roman', 'winder@gmail.com', '12345', '108802');

-- Insertar tareas para la Persona 1 y relacionarlas
INSERT INTO tareas (tarea, Fecha_inicio, Fecha_fin, estado)
VALUES
    ('Tarea 1 - Persona 1', NOW(), '2023-08-28 9:00:00' ,'PENDIENTE'),
    ('Tarea 2 - Persona 1', NOW(), '2023-09-30 13:00:00', 'PENDIENTE'),
    ('Tarea 3 - Persona 1', NOW(), '2023-07-29 10:00:00', 'TIEMPO');

INSERT INTO user_tareas (id_usuario, id_tarea)
VALUES
    (1, 1),
    (1, 2),
    (1, 3);

-- Insertar tareas para la Persona 2 y relacionarlas
INSERT INTO tareas (tarea, Fecha_inicio, Fecha_fin, estado)
VALUES
    ('Tarea 1 - Persona 2', NOW(),'2023-08-20 9:00:00', 'TIEMPO'),
    ('Tarea 2 - Persona 2', NOW(),'2023-10-30 5:00:00', 'PENDIENTE'),
    ('Tarea 3 - Persona 2', NOW(),'2023-12-28 23:00:00', 'PENDIENTE');

INSERT INTO user_tareas (id_usuario, id_tarea)
VALUES
    (2, 4),
    (2, 5),
    (2, 6);

-- Insertar tareas para la Persona 3 y relacionarlas
INSERT INTO tareas (tarea, Fecha_inicio, Fecha_fin, estado)
VALUES
    ('Tarea 1 - Persona 3', NOW(), '2023-08-01 24:00:00', 'TIEMPO'),
    ('Tarea 2 - Persona 3', NOW(), '2023-11-25 11:00:00', 'PENDIENTE'),
    ('Tarea 3 - Persona 3', NOW(),'2023-12-10 1:00:00', 'PENDIENTE');

INSERT INTO user_tareas (id_usuario, id_tarea)
VALUES
    (3, 7),
    (3, 8),
    (3, 9);
