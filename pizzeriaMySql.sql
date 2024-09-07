/*
Servidor XAMPP
Database              :MySQL
Nombre Servidor       : localhost
Nº puerto             : 3306 (por defecto)
Nombre Database       : pizzeria
Date: 2024-09-07 7:15:25
*/


-- 1. Crear la tabla salas
CREATE TABLE salas (
  id int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(100) NOT NULL,
  mesas int(11) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Insertar datos en salas
INSERT INTO salas VALUES 
(1, 'SALA PRINCIPAL', 15);

-- 2. Crear la tabla pedidos
CREATE TABLE pedidos (
  id int(11) NOT NULL AUTO_INCREMENT,
  id_sala int(11) NOT NULL,
  num_mesa int(11) NOT NULL,
  fecha timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  total decimal(10,2) NOT NULL,
  estado enum('PENDIENTE','FINALIZADO') NOT NULL DEFAULT 'PENDIENTE',
  usuario varchar(100) NOT NULL,
  PRIMARY KEY (id),
  KEY id_sala (id_sala),
  CONSTRAINT pedidos_ibfk_1 FOREIGN KEY (id_sala) REFERENCES salas (id)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Insertar datos en pedidos
INSERT INTO pedidos VALUES 
(1, 1, 2, '2024-08-23 18:31:52', 78.00, 'FINALIZADO', 'CRISTIAN OLIVERA CHAVEZ'),
(2, 1, 8, '2024-08-23 18:35:52', 30.00, 'FINALIZADO', 'CRISTIAN OLIVERA CHAVEZ'),
(3, 1, 9, '2024-08-23 18:39:52', 28.00, 'PENDIENTE', 'CRISTIAN OLIVERA CHAVEZ'),
(4, 1, 11, '2024-08-23 18:41:52', 20.00, 'PENDIENTE', 'CRISTIAN OLIVERA CHAVEZ');

-- 3. Crear la tabla detalle_pedidos
CREATE TABLE detalle_pedidos (
  id int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(200) NOT NULL,
  precio decimal(10,2) NOT NULL,
  cantidad int(11) NOT NULL,
  comentario text DEFAULT NULL,
  id_pedido int(11) NOT NULL,
  PRIMARY KEY (id),
  KEY id_pedido (id_pedido),
  CONSTRAINT detalle_pedidos_ibfk_1 FOREIGN KEY (id_pedido) REFERENCES pedidos (id)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Insertar datos en detalle_pedidos
INSERT INTO detalle_pedidos VALUES 
(1, 'Pizza Margherita', 15.00, 2, '', 1),
(2, 'Coca Cola 1.5L', 5.00, 3, '', 1),
(3, 'Pizza Pepperoni', 18.00, 2, 'Extra queso', 2),
(4, 'Coca Cola 1.5L', 5.00, 2, '', 2),
(5, 'Pizza Hawaiana', 20.00, 1, 'Sin piña', 3),
(6, 'Sprite 1.5L', 5.00, 2, '', 3),
(7, 'Pizza Cuatro Quesos', 22.00, 1, '', 4),
(8, 'Fanta 1.5L', 5.00, 1, '', 4);

-- 4. Crear la tabla config
CREATE TABLE config (
  id int(11) NOT NULL AUTO_INCREMENT,
  ruc varchar(15) NOT NULL,
  nombre varchar(255) NOT NULL,
  telefono varchar(11) NOT NULL,
  direccion text NOT NULL,
  mensaje varchar(255) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Insertar datos en config
INSERT INTO config VALUES 
(1, '65479877', 'Pizzeria Adriana', '954306632', 'Abancay - Apurimac', '¡Gracias por su preferencia!');

-- 5. Crear la tabla productos 
CREATE TABLE platos (
  id INT(11) NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(200) NOT NULL,
  precio DECIMAL(10,2) NOT NULL,
  fecha DATE DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Insertar datos en productos
INSERT INTO platos VALUES 
(1, 'Pizza Margherita', 15.00, '2024-08-01'),
(2, 'Pizza Pepperoni', 18.00, '2024-08-01'),
(3, 'Pizza Hawaiana', 20.00, '2024-08-01'),
(4, 'Coca Cola 1.5L', 5.00, '2024-08-01'),
(5, 'Sprite 1.5L', 5.00, '2024-08-01'),
(6, 'Fanta 1.5L', 5.00, '2024-08-01');

-- 6. Crear la tabla usuarios
CREATE TABLE usuarios (
  id int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(200) NOT NULL,
  correo varchar(200) NOT NULL,
  pass varchar(64) NOT NULL,
  rol varchar(20) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Insertar datos en usuarios
INSERT INTO usuarios VALUES 
(1, 'CRISTIAN OLIVERA CHAVEZ', 'cristian@gmail.com', '17672158eb11f7de7b753048f4fd35b42bc59d0801e7cd4ecf782e7f0bc5e74d', 'Administrador');

--IMPORTANTE --> la contraseña esta encriptada(17672158eb11f7de7b753048f4fd35b42bc59d0801e7cd4ecf782e7f0bc5e74d = administrador123)