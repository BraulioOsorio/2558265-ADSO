-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-12-2023 a las 13:32:36
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `preguntas`
--
CREATE DATABASE IF NOT EXISTS `preguntas` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `preguntas`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `preguntas`
--

CREATE TABLE `preguntas` (
  `id_pregunta` int(11) NOT NULL,
  `descripcion` text DEFAULT NULL,
  `opcion1` text DEFAULT NULL,
  `opcion2` text DEFAULT NULL,
  `opcion3` text DEFAULT NULL,
  `opcion4` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `preguntas`
--

INSERT INTO `preguntas` (`id_pregunta`, `descripcion`, `opcion1`, `opcion2`, `opcion3`, `opcion4`) VALUES
(1, '¿HTML es un lenguaje de programacion?', 'Si', 'No', NULL, NULL),
(2, '¿En qué año se llevó a cabo la Revolución Rusa?', '1917', '1933', '1921', '1905'),
(3, '¿En qué año se celebró la independencia de Estados Unidos?', '1804', '1776', '1789', '1792'),
(4, '¿Cuál es el río más largo del mundo?', 'Nilo', 'Amazonas', 'Yangtse', 'Misisipi'),
(5, '¿Cuál es el elemento más abundante en la corteza terrestre?', 'Hierro', 'Oxigeno', 'Silicio', 'Aluminio'),
(6, '¿En qué continente se encuentra el Monte Kilimanjaro?', 'Asia', 'Africa', 'Europa', 'Sudamerica'),
(7, '¿Cuál es la capital de Japón?', 'Seul', 'Tokio', 'Pekín', 'Bangkok'),
(8, '¿Quién escribió \'Cien años de soledad\'?', 'Gabriel García Marquez', 'Pablo Neruda', 'Mario Vargas Llosa', 'Isabel Allende'),
(9, '¿Cuántos planetas hay en nuestro sistema solar?', '8', '10', '9', '7'),
(10, '¿Qué famoso pintor creó la obra \'La noche estrellada\'?', 'Vincent van Gogh', 'Pablo Picasso', 'Leonardo da Vinci', 'Claude Monet');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `puntajes`
--

CREATE TABLE `puntajes` (
  `id_puntaje` int(11) NOT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `puntaje` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `puntajes`
--

INSERT INTO `puntajes` (`id_puntaje`, `id_usuario`, `puntaje`, `fecha`) VALUES
(2, 2, 5, '2023-12-04'),
(3, 3, 9, '2023-12-04');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuestas_usuarios`
--

CREATE TABLE `respuestas_usuarios` (
  `id_respuesta` int(11) NOT NULL,
  `id_pregunta` int(11) DEFAULT NULL,
  `respuesta` text DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `intento` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `respuestas_usuarios`
--

INSERT INTO `respuestas_usuarios` (`id_respuesta`, `id_pregunta`, `respuesta`, `id_usuario`, `intento`) VALUES
(11, 7, 'Tokio', 2, 2),
(12, 9, '8', 2, 2),
(13, 4, 'Amazonas', 2, 2),
(14, 1, 'Si', 2, 2),
(15, 2, '1933', 2, 2),
(16, 6, 'Asia', 2, 2),
(17, 8, 'Pablo Neruda', 2, 2),
(18, 5, 'Hierro', 2, 2),
(19, 10, 'Leonardo da Vinci', 2, 2),
(20, 3, '1776', 2, 2),
(21, 8, 'Gabriel García Marquez', 3, 3),
(22, 6, 'Africa', 3, 3),
(23, 3, '1776', 3, 3),
(24, 2, '1917', 3, 3),
(25, 9, '8', 3, 3),
(26, 1, 'No', 3, 3),
(27, 4, 'Amazonas', 3, 3),
(28, 5, 'Oxigeno', 3, 3),
(29, 7, 'Tokio', 3, 3),
(30, 10, 'Vincent van Gogh', 3, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `numero_cedula` varchar(20) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `numero_cedula`, `nombre`) VALUES
(2, '1088247454', 'david'),
(3, '555', 'fefi');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `preguntas`
--
ALTER TABLE `preguntas`
  ADD PRIMARY KEY (`id_pregunta`);

--
-- Indices de la tabla `puntajes`
--
ALTER TABLE `puntajes`
  ADD PRIMARY KEY (`id_puntaje`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `respuestas_usuarios`
--
ALTER TABLE `respuestas_usuarios`
  ADD PRIMARY KEY (`id_respuesta`),
  ADD KEY `id_pregunta` (`id_pregunta`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`),
  ADD UNIQUE KEY `numero_cedula` (`numero_cedula`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `puntajes`
--
ALTER TABLE `puntajes`
  MODIFY `id_puntaje` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `respuestas_usuarios`
--
ALTER TABLE `respuestas_usuarios`
  MODIFY `id_respuesta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `puntajes`
--
ALTER TABLE `puntajes`
  ADD CONSTRAINT `puntajes_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`);

--
-- Filtros para la tabla `respuestas_usuarios`
--
ALTER TABLE `respuestas_usuarios`
  ADD CONSTRAINT `respuestas_usuarios_ibfk_1` FOREIGN KEY (`id_pregunta`) REFERENCES `preguntas` (`id_pregunta`),
  ADD CONSTRAINT `respuestas_usuarios_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
