CREATE DATABASE preguntas;
USE preguntas;
CREATE TABLE preguntas (
    id_pregunta INT PRIMARY KEY,
    descripcion TEXT,
    opcion1 TEXT,
    opcion2 TEXT,
    opcion3 TEXT,
    opcion4 TEXT
);
CREATE TABLE usuarios (
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    numero_cedula VARCHAR(20) NOT NULL UNIQUE,
    nombre VARCHAR(50) NOT NULL
);

CREATE TABLE respuestas_usuarios (
    id_respuesta INT PRIMARY KEY AUTO_INCREMENT,
    id_pregunta INT,
    respuesta TEXT,
    id_usuario INT,
    FOREIGN KEY (id_pregunta) REFERENCES preguntas(id_pregunta),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

CREATE TABLE puntajes (
    id_puntaje INT PRIMARY KEY AUTO_INCREMENT,
    id_usuario INT,
    puntaje INT,
    fecha DATE,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

INSERT INTO preguntas (id_pregunta, descripcion, opcion1, opcion2, opcion3, opcion4)
VALUES
    (1, '¿HTML es un lenguaje de programacion?', 'Si', 'No', NULL, NULL),
    (2, '¿En qué año se llevó a cabo la Revolución Rusa?', '1917', '1933', '1921', '1905'),
    (3, '¿En qué año se celebró la independencia de Estados Unidos?', '1804', '1776', '1789', '1792'),
    (4, '¿Cuál es el río más largo del mundo?', 'Nilo', 'Amazonas', 'Yangtse', 'Misisipi'),
    (5, '¿Cuál es el elemento más abundante en la corteza terrestre?', 'Hierro', 'Oxigeno', 'Silicio', 'Aluminio'),
    (6, '¿En qué continente se encuentra el Monte Kilimanjaro?', 'Asia', 'Africa', 'Europa', 'Sudamerica'),
    (7, '¿Cuál es la capital de Japón?', 'Seul', 'Tokio', 'Pekín', 'Bangkok'),
    (8, '¿Quién escribió ''Cien años de soledad''?', 'Gabriel García Marquez', 'Pablo Neruda', 'Mario Vargas Llosa', 'Isabel Allende'),
    (9, '¿Cuántos planetas hay en nuestro sistema solar?', '8', '10', '9', '7'),
    (10, '¿Qué famoso pintor creó la obra ''La noche estrellada''?', 'Vincent van Gogh', 'Pablo Picasso', 'Leonardo da Vinci', 'Claude Monet');
