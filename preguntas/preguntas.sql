-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-12-2023 a las 23:00:50
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `preguntas`
--

DROP TABLE IF EXISTS `preguntas`;
CREATE TABLE `preguntas` (
  `id_pregunta` int(11) NOT NULL,
  `descripcion` text DEFAULT NULL,
  `opcion1` varchar(250) DEFAULT NULL,
  `opcion2` varchar(250) DEFAULT NULL,
  `opcion3` varchar(250) DEFAULT NULL,
  `opcion4` varchar(250) DEFAULT NULL
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
(10, '¿Qué famoso pintor creó la obra \'¿La noche estrellada?', 'Vincent van Gogh', 'Pablo Picasso', 'Leonardo da Vinci', 'Claude Monet');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `preguntas`
--
ALTER TABLE `preguntas`
  ADD PRIMARY KEY (`id_pregunta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `preguntas`
--
ALTER TABLE `preguntas`
  MODIFY `id_pregunta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
