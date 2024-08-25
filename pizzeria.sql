-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 25, 2024 at 05:21 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pizzeria`
--

-- --------------------------------------------------------

--
-- Table structure for table `config`
--

CREATE TABLE `config` (
  `id` int(11) NOT NULL,
  `ruc` varchar(15) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `telefono` varchar(11) NOT NULL,
  `direccion` text NOT NULL,
  `mensaje` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `config`
--

INSERT INTO `config` (`id`, `ruc`, `nombre`, `telefono`, `direccion`, `mensaje`) VALUES
(1, '65479877', 'Restaurante la Delicia', '957847894', 'Lima - Perú', 'Gracias por la compra');

-- --------------------------------------------------------

--
-- Table structure for table `detalle_pedidos`
--

CREATE TABLE `detalle_pedidos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `comentario` text DEFAULT NULL,
  `id_pedido` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `detalle_pedidos`
--

INSERT INTO `detalle_pedidos` (`id`, `nombre`, `precio`, `cantidad`, `comentario`, `id_pedido`) VALUES
(1, 'CHAUFA', 20.00, 1, '', 1),
(2, 'ARROZ CON POLLO', 10.00, 5, 'ARTO MAYONESA', 1),
(3, 'GASEOSA COCA COLA 1.5 LITROS', 8.00, 1, '', 1),
(4, 'ARROZ CON POLLO', 10.00, 1, '', 2),
(5, 'CHAUFA', 20.00, 1, '', 2),
(6, 'GASEOSA COCA COLA 1.5 LITROS', 8.00, 1, '', 3),
(7, 'CHAUFA', 20.00, 1, '', 3),
(8, 'ARROZ CON POLLO', 10.00, 2, '', 4),
(9, 'pollo', 1.00, 6, '', 5),
(10, 'pizza familiar', 50.00, 1, 'sin sal', 6),
(11, 'pizza hawaiana', 40.00, 1, 'con ensalada', 6),
(12, 'pizza hawaiana', 40.00, 1, '', 7),
(13, 'pizza familiar', 50.00, 1, '', 7),
(14, 'ron', 900.00, 1, '', 8);

-- --------------------------------------------------------

--
-- Table structure for table `pedidos`
--

CREATE TABLE `pedidos` (
  `id` int(11) NOT NULL,
  `id_sala` int(11) NOT NULL,
  `num_mesa` int(11) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `total` decimal(10,2) NOT NULL,
  `estado` enum('PENDIENTE','FINALIZADO') NOT NULL DEFAULT 'PENDIENTE',
  `usuario` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `pedidos`
--

INSERT INTO `pedidos` (`id`, `id_sala`, `num_mesa`, `fecha`, `total`, `estado`, `usuario`) VALUES
(1, 1, 2, '2022-05-18 05:31:52', 78.00, 'FINALIZADO', 'ANGEL SIFUENTES'),
(2, 2, 8, '2024-08-24 20:31:52', 30.00, 'FINALIZADO', 'ANGEL SIFUENTES'),
(3, 1, 9, '2022-05-18 05:32:29', 28.00, 'PENDIENTE', 'ANGEL SIFUENTES'),
(4, 1, 11, '2022-05-18 06:04:47', 20.00, 'PENDIENTE', 'ANGEL SIFUENTES'),
(5, 3, 1, '2024-08-24 20:37:19', 6.00, 'FINALIZADO', 'amilcar'),
(6, 5, 1, '2024-08-24 20:44:34', 90.00, 'FINALIZADO', 'amilcar'),
(7, 6, 1, '2024-08-24 20:51:26', 90.00, 'FINALIZADO', 'amilcar'),
(8, 7, 1, '2024-08-24 21:00:01', 900.00, 'FINALIZADO', 'yhury');

-- --------------------------------------------------------

--
-- Table structure for table `platos`
--

CREATE TABLE `platos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `platos`
--

INSERT INTO `platos` (`id`, `nombre`, `precio`, `fecha`) VALUES
(1, 'ARROZ CON POLLO', 10.00, '2022-05-17'),
(2, 'CHAUFA', 20.00, '2022-05-17'),
(3, 'GASEOSA COCA COLA 1.5 LITROS', 8.00, '2022-05-17'),
(4, 'pollito', 15.00, '2024-08-24'),
(5, 'pizza familiar', 50.00, '2024-08-24'),
(6, 'pizza hawaiana', 40.00, '2024-08-24'),
(8, 'piza', 20.00, '2024-08-24'),
(9, 'alfajar', 21.50, '2024-08-24'),
(10, 'ron', 900.00, '2024-08-24');

-- --------------------------------------------------------

--
-- Table structure for table `salas`
--

CREATE TABLE `salas` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `mesas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `salas`
--

INSERT INTO `salas` (`id`, `nombre`, `mesas`) VALUES
(1, 'SALA PRINCIPAL', 15),
(2, 'SEGUNDO PISO', 10),
(3, 'sala sadas', 7),
(5, 'sala cocina', 5),
(6, 'sala pedidos', 3),
(7, 'bar', 5);

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `correo` varchar(200) NOT NULL,
  `pass` varchar(64) NOT NULL,
  `rol` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombre`, `correo`, `pass`, `rol`) VALUES
(1, 'amilcar', 'amilcar@gmail.com', 'f969248d621bcded4a3582a1c3b17a71eedfefa9120c36ee3bd1957438cd55b9', 'Administrador'),
(3, 'putito', 'cristianputo@gamil.com', 'e18d32ae9fbbc73ad17467d6337803f69a2549e080dbb732db058c715db970f9', 'Administrador'),
(4, 'giovanni', 'tito@gmail.com', '7d981a80605a95cd18e2cbb2340ef4931cfd7fc9b5b175e180dc4b642afe1bd8', 'Asistente'),
(5, 'giovanni', 'tito@gmail.com', 'c8529aae84ae9e835d37dc06d89cfebb75d013db4308553ed1c431c4c9f016bc', 'Asistente'),
(6, 'yhury', 'yhury@gmail.com', 'daaad6e5604e8e17bd9f108d91e26afe6281dac8fda0091040a7a6d7bd9b43b5', 'Administrador');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `config`
--
ALTER TABLE `config`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `detalle_pedidos`
--
ALTER TABLE `detalle_pedidos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_pedido` (`id_pedido`);

--
-- Indexes for table `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_sala` (`id_sala`);

--
-- Indexes for table `platos`
--
ALTER TABLE `platos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `salas`
--
ALTER TABLE `salas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `config`
--
ALTER TABLE `config`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `detalle_pedidos`
--
ALTER TABLE `detalle_pedidos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `platos`
--
ALTER TABLE `platos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `salas`
--
ALTER TABLE `salas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detalle_pedidos`
--
ALTER TABLE `detalle_pedidos`
  ADD CONSTRAINT `detalle_pedidos_ibfk_1` FOREIGN KEY (`id_pedido`) REFERENCES `pedidos` (`id`);

--
-- Constraints for table `pedidos`
--
ALTER TABLE `pedidos`
  ADD CONSTRAINT `pedidos_ibfk_1` FOREIGN KEY (`id_sala`) REFERENCES `salas` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
