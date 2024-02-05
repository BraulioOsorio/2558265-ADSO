-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-01-2024 a las 13:52:01
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

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
  `opcion4` text DEFAULT NULL,
  `imagen` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `preguntas`
--

INSERT INTO `preguntas` (`id_pregunta`, `descripcion`, `opcion1`, `opcion2`, `opcion3`, `opcion4`, `imagen`) VALUES
(1, '¿HTML es un lenguaje de programacion?', 'Si', 'No', NULL, NULL, 'https://www.ionos.es/digitalguide/fileadmin/DigitalGuide/Teaser/html-tagst.jpg'),
(2, '¿En qué año se llevó a cabo la Revolución Rusa?', '1917', '1933', '1921', '1905', 'https://imagenes.elpais.com/resizer/_iGXk1x-9Wlr6bn1HqQS-t-QLlM=/1960x0/arc-anglerfish-eu-central-1-prod-prisa.s3.amazonaws.com/public/2AZ7ACD7I5Y47TLJKN4NVRPJJU.jpg'),
(3, '¿En qué año se celebró la independencia de Estados Unidos?', '1804', '1776', '1789', '1792', 'https://historia.nationalgeographic.com.es/medio/2017/07/03/37673_04658188.jpg'),
(4, '¿Cuál es el río más largo del mundo?', 'Nilo', 'Amazonas', 'Yangtse', 'Misisipi', 'https://www.fundacionaquae.org/wp-content/uploads/2017/05/riolargo.jpg'),
(5, '¿Cuál es el elemento más abundante en la corteza terrestre?', 'Hierro', 'Oxigeno', 'Silicio', 'Aluminio', 'https://ichef.bbci.co.uk/news/640/amz/worldservice/live/assets/images/2016/01/04/160104124333_tabla_periodica_640x360_spl_nocredit.jpg'),
(6, '¿En qué continente se encuentra el Monte Kilimanjaro?', 'Asia', 'Africa', 'Europa', 'Sudamerica', 'https://upload.wikimedia.org/wikipedia/commons/6/6b/Mt._Kilimanjaro_12.2006.JPG'),
(7, '¿Cuál es la capital de Japón?', 'Seul', 'Tokio', 'Pekín', 'Bangkok', 'https://www.civitatis.com/blog/wp-content/uploads/2022/11/calle-akihabara-tokio.jpg'),
(8, '¿Quién escribió \'Cien años de soledad\'?', 'Gabriel García Marquez', 'Pablo Neruda', 'Mario Vargas Llosa', 'Isabel Allende', 'https://www.researchgate.net/publication/332688417/figure/fig1/AS:752108177461249@1556327971858/Figura-1-Quinta-imagen-del-libro-Cien-anos-de-soledad-de-Gabriel-Garcia-Marquez.jpg'),
(9, '¿Cuántos planetas hay en nuestro sistema solar?', '8', '10', '9', '7', 'https://www.semana.com/resizer/8W9cXOsC1jv-iPC-hMDEAw5bHh4=/1280x720/smart/filters:format(jpg):quality(80)/cloudfront-us-east-1.images.arcpublishing.com/semana/HNTZ5TVGYJGMFBSB7B72TWVR4U.jpg'),
(10, '¿Qué famoso pintor creó la obra \'La noche estrellada\'?', 'Vincent van Gogh', 'Pablo Picasso', 'Leonardo da Vinci', 'Claude Monet', 'https://revistasietearteshome.files.wordpress.com/2019/01/descarga-5.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `puntajes`
--

CREATE TABLE `puntajes` (
  `id_puntaje` int(11) NOT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `puntaje` int(11) DEFAULT NULL,
  `fecha` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
  MODIFY `id_puntaje` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `respuestas_usuarios`
--
ALTER TABLE `respuestas_usuarios`
  MODIFY `id_respuesta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=58;

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
