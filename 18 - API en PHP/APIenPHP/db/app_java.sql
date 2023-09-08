-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-09-2023 a las 14:19:33
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `app_java`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--
CREATE DATABASE app_java;
USE app_java;
CREATE TABLE `personas` (
  `cedula` bigint(20) NOT NULL,
  `nombres` varchar(30) DEFAULT NULL,
  `apellidos` varchar(30) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Volcado de datos para la tabla `personas`
--

INSERT INTO `personas` (`cedula`, `nombres`, `apellidos`, `telefono`, `direccion`, `email`) VALUES
(108800, 'Juan David', 'Peña Rodriguez', 'Calle 9', 'Calle 01', 'juan@mail.com'),
(108802, 'Andres Camilo', 'Gonzalez Perez', '', 'Calle 02', 'andres@mail.com'),
(108803, 'Ana Maria', 'Lopez Perez', '', 'Calle 03', 'ana@mail.com'),
(108804, 'Daniel Alberto', 'Gomez Guzman', '', 'Calle 04', 'daniel@mail.com'),
(108805, 'Maria Alejandra', 'Guzman Hernandez', '', 'Calle 05', 'maria@mail.com'),
(108806, 'ANDRES ARTURO', 'PEREZ GUZMAN', '3000002', '', 'arturo@mail.com'),
(109902, 'PRUEBA 02', 'PRUEBA 02', '213123123', 'ASKJB DLJAB', 'ASNDLANDK@JBADJA.COM');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `personas`
--
ALTER TABLE `personas`
  ADD PRIMARY KEY (`cedula`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
