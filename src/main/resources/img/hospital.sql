CREATE DATABASE Hospital
GO
USE Hospital
GO
CREATE TABLE Dept
(
Dept_No INT NOT NULL,
DNombre VARCHAR(50) NULL,
Loc VARCHAR(50) NULL,
CONSTRAINT PK_Dept PRIMARY KEY(Dept_No)
)
GO
CREATE TABLE Emp
(
Emp_No INT NOT NULL,
Apellido VARCHAR(50) NULL,
Oficio VARCHAR(50) NULL,
Dir INT NULL,
Fecha_Alt SMALLDATETIME NULL,
Salario NUMERIC(9,2) NULL,
Comision NUMERIC(9,2) NULL,
Dept_No INT NULL
CONSTRAINT PK_Emp PRIMARY KEY(Emp_No),
CONSTRAINT FK_Emp_Dept FOREIGN KEY (Dept_No) REFERENCES Dept(Dept_No)
)
GO
CREATE TABLE Hospital
(
Hospital_Cod INT NOT NULL,
Nombre VARCHAR(50) NULL,
Direccion VARCHAR(50) NULL,
Telefono VARCHAR(50) NULL,
Num_Cama INT NULL,
CONSTRAINT PK_Hospital PRIMARY KEY(Hospital_Cod)
)
GO
CREATE TABLE Doctor
(
Doctor_No INT NOT NULL,
Hospital_Cod INT NOT NULL,
Apellido VARCHAR(50) NULL,
Especialidad VARCHAR(50) NULL
CONSTRAINT PK_Doctor PRIMARY KEY(Doctor_No),
CONSTRAINT FK_Doctor_Hospital FOREIGN KEY (Hospital_Cod) REFERENCES
Hospital(Hospital_Cod)
)
GO
CREATE TABLE Sala
(
Sala_Cod INT NOT NULL,
Hospital_Cod INT NOT NULL,
Nombre VARCHAR(50) NULL,
Num_Cama INT NULL

CONSTRAINT PK_Sala PRIMARY KEY(Sala_Cod,Hospital_Cod),
CONSTRAINT FK_Sala_Hospital FOREIGN KEY (Hospital_Cod) REFERENCES
Hospital(Hospital_Cod)
)
GO
CREATE TABLE Plantilla
(
Empleado_No INT NOT NULL,
Sala_Cod INT NOT NULL,
Hospital_Cod INT NOT NULL,
Apellido VARCHAR(50) NULL,
Funcion VARCHAR(50) NULL,
T VARCHAR(15) NULL,
Salario NUMERIC(9,2) NULL
CONSTRAINT PK_Plantilla PRIMARY KEY(Empleado_No),
CONSTRAINT FK_Plantilla_Sala01 FOREIGN KEY (Sala_Cod,Hospital_Cod)
REFERENCES Sala(Sala_Cod,Hospital_Cod)
)
GO
CREATE TABLE Enfermo
(
Inscripcion INT NOT NULL,
Apellido VARCHAR(50) NULL,
Direccion VARCHAR(50) NULL,
Fecha_Nac VARCHAR(50) NULL,
S VARCHAR(2) NULL,
NSS INT NULL
)
INSERT INTO Dept(Dept_No,DNombre,Loc) VALUES(10,'CONTABILIDAD','ELCHE')
INSERT INTO Dept(Dept_No,DNombre,Loc) VALUES(20,'INVESTIGACI�N','MADRID')
INSERT INTO Dept(Dept_No,DNombre,Loc) VALUES(30,'VENTAS','BARCELONA')
INSERT INTO Dept(Dept_No,DNombre,Loc) VALUES(40,'PRODUCCI�N','SALAMANCA')
GO
--Insertar datos en la tabla Emp
INSERT INTO Emp( Emp_No, Apellido, Oficio, Dir, Fecha_Alt, Salario, Comision,
Dept_No)
VALUES
(7369,'SANCHEZ','EMPLEADO',7902,'17/12/1980',10400,0,20),
(7499,'ARROYO','VENDEDOR',7698,'22/02/1981',208000,39000,30),
(7521,'SALA','VENDEDOR',689,'22/02/1981',162500,65000,30),
(7566,'JIMENEZ','DIRECTOR',7839,'02/04/1981',386750,0,20),
(7654,'MARTIN','VENDEDOR',7698,'28/09/1981',182000,182000,30),
(7698,'NEGRO','DIRECTOR',7839,'01/05/1981',370500,0,30),
(7782,'CEREZO','DIRECTOR',7839,'09/06/1981',318500,0,10),
(7788,'NINO','ANALISTA',7566,'30/03/1987',390000,0,20),
(7839,'REY','PRESIDENTE',0,'17/11/1981',650000,0,10),
(7844,'TOVAR','VENDEDOR',7698,'08/09/1981',195000,0,30),
(7876,'ALONSO','EMPLEADO',7788,'03/05/1987',143000,0,20),
(7900,'JIMENO','EMPLEADO',7698,'03/12/1981',123500,0,30),
(7902,'FERNANDEZ','ANALISTA',7566,'03/12/1981',390000,0,20),
(7934,'MU�OZ','EMPLEADO',7782,'23/06/1982',169000,0,10),
(7119,'SERRA','DIRECTOR',7839,'19/11/1983',225000,39000,20),
(7322,'GARCIA','EMPLEADO',7119,'12/10/1982',129000,0,20)
INSERT INTO Hospital(Hospital_Cod,Nombre,Direccion,Telefono, Num_Cama)
VALUES(19,'Provincial','O Donell 50','964-4256',502)
INSERT INTO Hospital(Hospital_Cod,Nombre,Direccion,Telefono, Num_Cama)
VALUES(18,'General','Atocha s/n','595-3111',987)
INSERT INTO Hospital(Hospital_Cod,Nombre,Direccion,Telefono, Num_Cama)
VALUES(22,'La Paz','Castellana 1000','923-5411',412)
INSERT INTO Hospital(Hospital_Cod,Nombre,Direccion,Telefono, Num_Cama)
VALUES(45,'San Carlos','Ciudad Universitaria','597-1500',845)
GO
--Insertar datos en la tabla Doctor
INSERT INTO Doctor(Hospital_Cod,Doctor_No,Apellido,Especialidad)
VALUES(22,386,'Cabeza D.','Psiquiatr�a')
INSERT INTO Doctor(Hospital_Cod,Doctor_No,Apellido,Especialidad)
VALUES(22,398,'Best D.','Urolog�a')
INSERT INTO Doctor(Hospital_Cod,Doctor_No,Apellido,Especialidad)
VALUES(19,435,'L�pez A.','Cardiolog�a')
INSERT INTO Doctor(Hospital_Cod,Doctor_No,Apellido,Especialidad)
VALUES(22,453,'Galo D.','Pediatr�a')
INSERT INTO Doctor(Hospital_Cod,Doctor_No,Apellido,Especialidad)
VALUES(45,522,'Adams C.','Neurolog�a')
INSERT INTO Doctor(Hospital_Cod,Doctor_No,Apellido,Especialidad)
VALUES(18,585,'Miller G.','Ginecolog�a')
INSERT INTO Doctor(Hospital_Cod,Doctor_No,Apellido,Especialidad)
VALUES(45,607,'Chuki P.','Pediatr�a')
INSERT INTO Doctor(Hospital_Cod,Doctor_No,Apellido,Especialidad)
VALUES(18,982,'Cajal R.','Cardiolog�a')
GO
--Insertar datos en la tabla Sala
INSERT INTO SALA VALUES(1,22,'Recuperaci�n',10)
INSERT INTO SALA VALUES(1,45,'Recuperaci�n',15)
INSERT INTO SALA VALUES(2,22,'Maternidad',34)
INSERT INTO SALA VALUES(2,45,'Maternidad',24)
INSERT INTO SALA VALUES(3,19,'Cuidados Intensivos',21)
INSERT INTO SALA VALUES(3,18,'Cuidados Intensivos',10)
INSERT INTO SALA VALUES(4,18,'Cardiolog�a',53)
INSERT INTO SALA VALUES(4,45,'Cardiolog�a',55)
INSERT INTO SALA VALUES(6,19,'Psiqui�tricos',67)
INSERT INTO SALA VALUES(6,22,'Psiqui�tricos',118)
GO
--Insertar datos en la tabla Plantilla
INSERT INTO Plantilla(Hospital_Cod,Sala_Cod,Empleado_No,Apellido, Funcion, T,
Salario)
VALUES
(22,6,1009,'Higueras D.','Enfermera','T',200500),
(45,4,1280,'Amigo R.','Interino','N',221000),
(19,6,3106,'Hern�ndez','Enfermero','T',275000),
(19,6,3754,'D�az B.','Enfermera','T',226200),
(22,1,6065,'Rivera G.','Enfermera','N',162600),
(18,4,6357,'Karplus W.','Interino','T',337900),
(22,1,7379,'Carlos R.','Enfermera','T',211900),
(22,6,8422,'Bocina G.','Enfermero','M',183800),
(45,1,8526,'Frank H.','Enfermera','T',252200),
(22,2,9901,'N��ez C.','Interino','M',221000)
GO
--Insertar datos en la tabla Enfermo
INSERT INTO Enfermo(Inscripcion,Apellido,Direccion,Fecha_Nac,S,NSS)
VALUES
(10995,'Lagu�a M.','Goya 20','16-may-56','M',280862422),
(14024,'Fern�ndez M.','Recoletos 50','21-may-60','F',284991452),
(18004,'Serrano V.','Alcal� 12','23-jun-67','F',321790059),
(36658,'Domin S.','Mayor 71','01-ene-42','M',160654471),
(38702,'Neal R.','Orense 11','18-jun-40','F',380010217),

(39217,'Cervantes M.','Per�n 38','29-feb-52','M',440294390),
(59076,'Miller B.','L�pez de Hoyos 2','16-sep-45','F',311969044),
(63827,'Ruiz P.','Ezquerdo 103','26-dic-80','M',100973253),
(64823,'Fraiser A.','Soto 3','10-jul-80','F',285201776),
(74835,'Ben�tez E.','Argentina','05-oct-57','M',154811767)

select *from Emp