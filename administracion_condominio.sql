-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-07-2021 a las 04:32:24
-- Versión del servidor: 10.4.17-MariaDB
-- Versión de PHP: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `administracion_condominio`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `nombre_usuario` varchar(30) NOT NULL,
  `contraseña` varchar(30) DEFAULT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `pregunta1` varchar(30) DEFAULT NULL,
  `pregunta2` varchar(30) DEFAULT NULL,
  `respuesta1` varchar(30) DEFAULT NULL,
  `respuesta2` varchar(30) DEFAULT NULL,
  `ultima_entrada` date DEFAULT NULL,
  `sesion` varchar(10) DEFAULT NULL,
  `nombre_condominio2` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`nombre_usuario`, `contraseña`, `nombre`, `apellido`, `sexo`, `email`, `pregunta1`, `pregunta2`, `respuesta1`, `respuesta2`, `ultima_entrada`, `sesion`, `nombre_condominio2`) VALUES
('proyecto2021', '123456', 'Samuel', 'Moreno', 'Masculino', 'proyecto@gmail.com', 'Color Favorito', 'Comida Favorita', 'Rojo', 'Pasta', '2021-07-19', 'Activo', 'Bucare');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `balance`
--

CREATE TABLE `balance` (
  `año` smallint(4) NOT NULL,
  `mes` tinyint(4) NOT NULL,
  `deuda_morosa_dolares` float DEFAULT NULL,
  `deuda_morosa_bolivares` int(11) DEFAULT NULL,
  `deuda_actual_dolares` float DEFAULT NULL,
  `deuda_actual_bolivares` int(11) DEFAULT NULL,
  `total_ingresos_dolares` float DEFAULT NULL,
  `total_ingresos_bolivares` int(11) DEFAULT NULL,
  `aseo_dolares` float DEFAULT NULL,
  `aseo_bolivares` int(11) DEFAULT NULL,
  `vigilancia_externa_dolares` float DEFAULT NULL,
  `vigilancia_externa_bolivares` int(11) DEFAULT NULL,
  `vigilancia_interna_dolares` float DEFAULT NULL,
  `vigilancia_interna_bolivares` int(11) DEFAULT NULL,
  `cuota_especial1_dolares` float DEFAULT NULL,
  `cuota_especial1_bolivares` int(11) DEFAULT NULL,
  `cuota_especial2_dolares` float DEFAULT NULL,
  `cuota_especial2_bolivares` int(11) DEFAULT NULL,
  `cuota_especial3_dolares` float DEFAULT NULL,
  `cuota_especial3_bolivares` int(11) DEFAULT NULL,
  `total_egresos_dolares` float DEFAULT NULL,
  `total_egresos_bolivares` int(11) DEFAULT NULL,
  `saldo_dolares` float DEFAULT NULL,
  `saldo_bolivares` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `balance`
--

INSERT INTO `balance` (`año`, `mes`, `deuda_morosa_dolares`, `deuda_morosa_bolivares`, `deuda_actual_dolares`, `deuda_actual_bolivares`, `total_ingresos_dolares`, `total_ingresos_bolivares`, `aseo_dolares`, `aseo_bolivares`, `vigilancia_externa_dolares`, `vigilancia_externa_bolivares`, `vigilancia_interna_dolares`, `vigilancia_interna_bolivares`, `cuota_especial1_dolares`, `cuota_especial1_bolivares`, `cuota_especial2_dolares`, `cuota_especial2_bolivares`, `cuota_especial3_dolares`, `cuota_especial3_bolivares`, `total_egresos_dolares`, `total_egresos_bolivares`, `saldo_dolares`, `saldo_bolivares`) VALUES
(2021, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `casa`
--

CREATE TABLE `casa` (
  `numero_casa` tinyint(4) NOT NULL,
  `estado_pago` varchar(10) DEFAULT NULL,
  `cedula_propietario` varchar(15) DEFAULT NULL,
  `nombre` varchar(15) DEFAULT NULL,
  `apellido` varchar(15) DEFAULT NULL,
  `telefono` varchar(30) DEFAULT NULL,
  `fondo_dolares` float DEFAULT NULL,
  `fondo_bolivares` int(11) DEFAULT NULL,
  `total_deuda_dolares` float DEFAULT NULL,
  `total_deuda_bolivares` int(11) DEFAULT NULL,
  `nombre_condominio3` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `casa`
--

INSERT INTO `casa` (`numero_casa`, `estado_pago`, `cedula_propietario`, `nombre`, `apellido`, `telefono`, `fondo_dolares`, `fondo_bolivares`, `total_deuda_dolares`, `total_deuda_bolivares`, `nombre_condominio3`) VALUES
(1, 'Solvente', 'V-11.228.314', 'Wilmer', 'Contreras', NULL, 0, 0, 0, 0, 'Bucare'),
(2, 'Solvente', 'V-13.007.608', 'Jenny', 'Medina', NULL, 0, 0, 0, 0, 'Bucare'),
(3, 'Solvente', 'V-05.861.466', 'Ines', 'Bejarano', NULL, 0, 0, 0, 0, 'Bucare'),
(4, 'Solvente', 'V-03.697.346', 'Pedro', 'Cedeño', NULL, 0, 0, 0, 0, 'Bucare'),
(5, 'Solvente', 'V-11.773.115', 'Oscar', 'Azcarate', NULL, 0, 0, 0, 0, 'Bucare'),
(6, 'Solvente', 'V-08.982.242', 'Ana', 'Rincones', NULL, 0, 0, 0, 0, 'Bucare'),
(7, 'Solvente', 'V-07.084.168', 'Maria', 'Sosa', NULL, 0, 0, 0, 0, 'Bucare'),
(8, 'Solvente', 'V-13.475.827', 'Ovidio', 'Gonzalez', NULL, 0, 0, 0, 0, 'Bucare'),
(9, 'Solvente', 'V-13.475.149', 'Alberto', 'Ferreri', NULL, 0, 0, 0, 0, 'Bucare'),
(10, 'Solvente', 'V-13.248.638', 'Natalie', 'Salave', NULL, 0, 0, 0, 0, 'Bucare'),
(11, 'Solvente', 'V-12.537.480', 'Adriana', 'Azocar', NULL, 0, 0, 0, 0, 'Bucare'),
(12, 'Solvente', 'V-20.597.564', 'Jose', 'Caldera', NULL, 0, 0, 0, 0, 'Bucare'),
(13, 'Solvente', 'V-03.017.348', 'Jesus Ramon', 'Salom', NULL, 0, 0, 0, 0, 'Bucare'),
(14, 'Solvente', 'V-13.466.513', 'Ines', 'Alcantara', NULL, 0, 0, 0, 0, 'Bucare'),
(15, 'Solvente', 'V-12.465.729', 'Yennifer', 'Rodriguez', NULL, 0, 0, 0, 0, 'Bucare'),
(16, 'Solvente', 'V-05.424.997', 'Simara', 'Martinez', NULL, 0, 0, 0, 0, 'Bucare'),
(17, 'Solvente', 'V-09.861.312', 'Aixa', 'Valdiviezo', NULL, 0, 0, 0, 0, 'Bucare'),
(18, 'Solvente', 'V-15.791.912', 'Carlos', 'Dos Santos', NULL, 0, 0, 0, 0, 'Bucare'),
(19, 'Solvente', 'V-05.876.162', 'Luisa', 'Suniaga', NULL, 0, 0, 0, 0, 'Bucare'),
(20, 'Solvente', 'V-11.777.068', 'Yonsin', 'Yee', NULL, 0, 0, 0, 0, 'Bucare'),
(21, 'Solvente', 'V-06.191.827', 'Victor', 'Maldonado', NULL, 0, 0, 0, 0, 'Bucare'),
(22, 'Solvente', 'V-11.507.753', 'Edgard', 'Uribe', NULL, 0, 0, 0, 0, 'Bucare'),
(23, 'Solvente', 'V-09.867.304', 'Neudelices', 'Gibory', NULL, 0, 0, 0, 0, 'Bucare'),
(24, 'Solvente', 'V-10.222.116', 'Carmen', 'De Fernandez', NULL, 0, 0, 0, 0, 'Bucare'),
(25, 'Solvente', 'V-23.899.442', 'Carlos', 'Jimenez', NULL, 0, 0, 0, 0, 'Bucare'),
(26, 'Solvente', 'V-10.574.490', 'Julio', 'Marcano', NULL, 0, 0, 0, 0, 'Bucare'),
(27, 'Solvente', 'V-09.284.976', 'Carmen', 'Romero', NULL, 0, 0, 0, 0, 'Bucare'),
(28, 'Solvente', 'V-15.230.916', 'Miguelangel', 'Gallardo', NULL, 0, 0, 0, 0, 'Bucare'),
(29, 'Solvente', '', 'Maria', 'Carril', NULL, 0, 0, 0, 0, 'Bucare'),
(30, 'Solvente', 'V-10.195.247', 'Donna', 'Caraballo', NULL, 0, 0, 0, 0, 'Bucare'),
(31, 'Solvente', 'V-06.350.695', 'Norberto', 'Saavedra', NULL, 0, 0, 0, 0, 'Bucare'),
(32, 'Solvente', 'V-14.009.608', 'Daniel', 'Castañeda', NULL, 0, 0, 0, 0, 'Bucare'),
(33, 'Solvente', 'V-12.074.170', 'Maite', 'Aranaga', '', 0, 0, 0, 0, 'Bucare'),
(34, 'Solvente', 'V-03.673.622', 'Marcos', 'Perez', NULL, 0, 0, 0, 0, 'Bucare'),
(35, 'Solvente', 'V-10.839.979', 'Maria', 'Gil', NULL, 0, 0, 0, 0, 'Bucare'),
(36, 'Solvente', 'V-11.011.355', 'Zurelys', 'Sosa', NULL, 0, 0, 0, 0, 'Bucare'),
(37, 'Solvente', 'V-04.900.014', 'Pedro', 'Rivas', NULL, 0, 0, 0, 0, 'Bucare'),
(38, 'Solvente', 'V-05.860.220', 'Francisca', 'Quevedo', NULL, 0, 0, 0, 0, 'Bucare'),
(39, 'Solvente', 'V-10.625.398', 'Jose', 'Patete', NULL, 0, 0, 0, 0, 'Bucare'),
(40, 'Solvente', 'V-11.336.152', 'Francisco', 'Ledezma', NULL, 0, 0, 0, 0, 'Bucare'),
(41, 'Solvente', 'V-08.042.974', 'Eduardo', 'Rivas', NULL, 0, 0, 0, 0, 'Bucare'),
(42, 'Solvente', 'V-08.352.020', 'Jacinto', 'Vasquez', NULL, 0, 0, 0, 0, 'Bucare'),
(43, 'Solvente', 'V-11.009.291', 'Daniel', 'Gonzalez', NULL, 0, 0, 0, 0, 'Bucare'),
(44, 'Solvente', 'V-10.305.336', 'Rosa', 'Guzman', NULL, 0, 0, 0, 0, 'Bucare'),
(45, 'Solvente', 'V-11.337.253', 'Rousslet', 'Guzman', NULL, 0, 0, 0, 0, 'Bucare'),
(46, 'Solvente', 'V-14.476.295', 'Anny', 'Mago', NULL, 0, 0, 0, 0, 'Bucare'),
(47, 'Solvente', 'V-09.977.743', 'Enrique', 'Rivas', NULL, 0, 0, 0, 0, 'Bucare'),
(48, 'Solvente', 'V-17.642.029', 'Rosemaries', 'Martinez', NULL, 0, 0, 0, 0, 'Bucare');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `condominio`
--

CREATE TABLE `condominio` (
  `nombre_condominio` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `condominio`
--

INSERT INTO `condominio` (`nombre_condominio`) VALUES
('Bucare');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta`
--

CREATE TABLE `cuenta` (
  `id` int(11) NOT NULL,
  `pago_dolares` float DEFAULT NULL,
  `pago_bolivares` int(11) DEFAULT NULL,
  `deuda_dolares` float DEFAULT NULL,
  `deuda_bolivares` int(11) DEFAULT NULL,
  `numero_casa4` tinyint(4) DEFAULT NULL,
  `año2` smallint(4) DEFAULT NULL,
  `mes2` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cuenta`
--

INSERT INTO `cuenta` (`id`, `pago_dolares`, `pago_bolivares`, `deuda_dolares`, `deuda_bolivares`, `numero_casa4`, `año2`, `mes2`) VALUES
(49, 0, 0, 0, 0, 1, 2021, 7),
(50, 0, 0, 0, 0, 2, 2021, 7),
(51, 0, 0, 0, 0, 3, 2021, 7),
(52, 0, 0, 0, 0, 4, 2021, 7),
(53, 0, 0, 0, 0, 5, 2021, 7),
(54, 0, 0, 0, 0, 6, 2021, 7),
(55, 0, 0, 0, 0, 7, 2021, 7),
(56, 0, 0, 0, 0, 8, 2021, 7),
(57, 0, 0, 0, 0, 9, 2021, 7),
(58, 0, 0, 0, 0, 10, 2021, 7),
(59, 0, 0, 0, 0, 11, 2021, 7),
(60, 0, 0, 0, 0, 12, 2021, 7),
(61, 0, 0, 0, 0, 13, 2021, 7),
(62, 0, 0, 0, 0, 14, 2021, 7),
(63, 0, 0, 0, 0, 15, 2021, 7),
(64, 0, 0, 0, 0, 16, 2021, 7),
(65, 0, 0, 0, 0, 17, 2021, 7),
(66, 0, 0, 0, 0, 18, 2021, 7),
(67, 0, 0, 0, 0, 19, 2021, 7),
(68, 0, 0, 0, 0, 20, 2021, 7),
(69, 0, 0, 0, 0, 21, 2021, 7),
(70, 0, 0, 0, 0, 22, 2021, 7),
(71, 0, 0, 0, 0, 23, 2021, 7),
(72, 0, 0, 0, 0, 24, 2021, 7),
(73, 0, 0, 0, 0, 25, 2021, 7),
(74, 0, 0, 0, 0, 26, 2021, 7),
(75, 0, 0, 0, 0, 27, 2021, 7),
(76, 0, 0, 0, 0, 28, 2021, 7),
(77, 0, 0, 0, 0, 29, 2021, 7),
(78, 0, 0, 0, 0, 30, 2021, 7),
(79, 0, 0, 0, 0, 31, 2021, 7),
(80, 0, 0, 0, 0, 32, 2021, 7),
(81, 0, 0, 0, 0, 33, 2021, 7),
(82, 0, 0, 0, 0, 34, 2021, 7),
(83, 0, 0, 0, 0, 35, 2021, 7),
(84, 0, 0, 0, 0, 36, 2021, 7),
(85, 0, 0, 0, 0, 37, 2021, 7),
(86, 0, 0, 0, 0, 38, 2021, 7),
(87, 0, 0, 0, 0, 39, 2021, 7),
(88, 0, 0, 0, 0, 40, 2021, 7),
(89, 0, 0, 0, 0, 41, 2021, 7),
(90, 0, 0, 0, 0, 42, 2021, 7),
(91, 0, 0, 0, 0, 43, 2021, 7),
(92, 0, 0, 0, 0, 44, 2021, 7),
(93, 0, 0, 0, 0, 45, 2021, 7),
(94, 0, 0, 0, 0, 46, 2021, 7),
(95, 0, 0, 0, 0, 47, 2021, 7),
(96, 0, 0, 0, 0, 48, 2021, 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `deuda`
--

CREATE TABLE `deuda` (
  `id_deuda` varchar(10) NOT NULL,
  `fecha_carga` date DEFAULT NULL,
  `descripcion` varchar(30) DEFAULT NULL,
  `monto_dolares` float DEFAULT NULL,
  `monto_bolivares` bigint(11) DEFAULT NULL,
  `tasa_dolar` bigint(11) DEFAULT NULL,
  `id_servicio2` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `deudae`
--

CREATE TABLE `deudae` (
  `id_deudae` varchar(10) NOT NULL,
  `fecha_carga` date DEFAULT NULL,
  `descripcion` varchar(30) DEFAULT NULL,
  `monto_dolares` float DEFAULT NULL,
  `monto_bolivares` bigint(11) DEFAULT NULL,
  `deuda_restante_dolares` float DEFAULT NULL,
  `deuda_restante_bolivares` bigint(11) DEFAULT NULL,
  `estado` varchar(10) DEFAULT NULL,
  `id_deuda2` varchar(10) DEFAULT NULL,
  `numero_casa3` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `id_factura` varchar(10) NOT NULL,
  `descripcion` varchar(20) DEFAULT NULL,
  `monto_dolares` float DEFAULT NULL,
  `monto_bolivares` int(11) DEFAULT NULL,
  `fecha_emision` date DEFAULT NULL,
  `id_servicio3` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago`
--

CREATE TABLE `pago` (
  `id_pago` varchar(20) NOT NULL,
  `monto_dolares` float DEFAULT NULL,
  `monto_bolivares` int(11) DEFAULT NULL,
  `fecha_pago` date DEFAULT NULL,
  `descripcion` varchar(20) DEFAULT NULL,
  `tasa_dolar` int(11) DEFAULT NULL,
  `numero_casa2` tinyint(4) DEFAULT NULL,
  `id_deuda2` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `id_servicio` varchar(10) NOT NULL,
  `nombre_servicio` varchar(20) DEFAULT NULL,
  `rif_proveedor` varchar(20) DEFAULT NULL,
  `nombre_proveedor` varchar(15) DEFAULT NULL,
  `apellido_proveedor` varchar(15) DEFAULT NULL,
  `nombre_empresa` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`id_servicio`, `nombre_servicio`, `rif_proveedor`, `nombre_proveedor`, `apellido_proveedor`, `nombre_empresa`) VALUES
('BLBS1AB', 'Aseo', '', '', '', ''),
('BLBS2VI', 'Vigilancia Interna', '', '', '', ''),
('BLBS3VE', 'Vigilancia Externa', NULL, NULL, NULL, NULL),
('BLBS4C1', 'Cuota Especial 1', NULL, NULL, NULL, NULL),
('BLBS5C2', 'Cuota Especial 2 ', NULL, NULL, NULL, NULL),
('BLBS6C3', 'Cuota Especial 3', NULL, NULL, NULL, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`nombre_usuario`),
  ADD KEY `nombre_condominio2` (`nombre_condominio2`);

--
-- Indices de la tabla `balance`
--
ALTER TABLE `balance`
  ADD PRIMARY KEY (`año`,`mes`);

--
-- Indices de la tabla `casa`
--
ALTER TABLE `casa`
  ADD PRIMARY KEY (`numero_casa`),
  ADD KEY `nombre_condominio3` (`nombre_condominio3`);

--
-- Indices de la tabla `condominio`
--
ALTER TABLE `condominio`
  ADD PRIMARY KEY (`nombre_condominio`);

--
-- Indices de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `numero_casa4` (`numero_casa4`),
  ADD KEY `año2` (`año2`);

--
-- Indices de la tabla `deuda`
--
ALTER TABLE `deuda`
  ADD PRIMARY KEY (`id_deuda`),
  ADD KEY `id_servicio2` (`id_servicio2`);

--
-- Indices de la tabla `deudae`
--
ALTER TABLE `deudae`
  ADD PRIMARY KEY (`id_deudae`),
  ADD KEY `id_deuda2` (`id_deuda2`),
  ADD KEY `numero_casa3` (`numero_casa3`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`id_factura`),
  ADD KEY `id_servicio3` (`id_servicio3`);

--
-- Indices de la tabla `pago`
--
ALTER TABLE `pago`
  ADD PRIMARY KEY (`id_pago`),
  ADD KEY `numero_casa2` (`numero_casa2`),
  ADD KEY `id_deuda2` (`id_deuda2`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`id_servicio`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=97;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD CONSTRAINT `administrador_ibfk_1` FOREIGN KEY (`nombre_condominio2`) REFERENCES `condominio` (`nombre_condominio`);

--
-- Filtros para la tabla `casa`
--
ALTER TABLE `casa`
  ADD CONSTRAINT `casa_ibfk_1` FOREIGN KEY (`nombre_condominio3`) REFERENCES `condominio` (`nombre_condominio`);

--
-- Filtros para la tabla `cuenta`
--
ALTER TABLE `cuenta`
  ADD CONSTRAINT `cuenta_ibfk_1` FOREIGN KEY (`numero_casa4`) REFERENCES `casa` (`numero_casa`),
  ADD CONSTRAINT `cuenta_ibfk_2` FOREIGN KEY (`año2`) REFERENCES `balance` (`año`);

--
-- Filtros para la tabla `deuda`
--
ALTER TABLE `deuda`
  ADD CONSTRAINT `deuda_ibfk_1` FOREIGN KEY (`id_servicio2`) REFERENCES `servicio` (`id_servicio`);

--
-- Filtros para la tabla `deudae`
--
ALTER TABLE `deudae`
  ADD CONSTRAINT `deudae_ibfk_1` FOREIGN KEY (`id_deuda2`) REFERENCES `deuda` (`id_deuda`),
  ADD CONSTRAINT `deudae_ibfk_2` FOREIGN KEY (`numero_casa3`) REFERENCES `casa` (`numero_casa`);

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`id_servicio3`) REFERENCES `servicio` (`id_servicio`);

--
-- Filtros para la tabla `pago`
--
ALTER TABLE `pago`
  ADD CONSTRAINT `pago_ibfk_1` FOREIGN KEY (`numero_casa2`) REFERENCES `casa` (`numero_casa`),
  ADD CONSTRAINT `pago_ibfk_2` FOREIGN KEY (`id_deuda2`) REFERENCES `deuda` (`id_deuda`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
