DROP table IF EXISTS departamentos;
DROP table IF EXISTS empleados;

CREATE TABLE departamentos (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(115),
presupuesto INT 
);

INSERT INTO departamentos (nombre, presupuesto) VALUES ('DPT10', 500);
INSERT INTO departamentos (nombre, presupuesto) VALUES ('DPT20', 600);
INSERT INTO departamentos (nombre, presupuesto) VALUES ('DPT30', 700);

CREATE TABLE empleados (
dni VARCHAR(8) PRIMARY KEY,
nombre VARCHAR(115),
apellidos VARCHAR(115),
id_departamento int,
FOREIGN KEY (id_departamento) REFERENCES Departamentos(id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO empleados (dni, nombre, apellidos, id_departamento) VALUES ('1111111G', 'Robert', 'López', 1);
INSERT INTO empleados (dni, nombre, apellidos, id_departamento) VALUES ('2222222W', 'Jose', 'Lopez', 1);
INSERT INTO empleados (dni, nombre, apellidos, id_departamento) VALUES ('3333333P', 'Laura', 'Fornos', 2);
INSERT INTO empleados (dni, nombre, apellidos, id_departamento) VALUES ('4444444L', 'Sandra', 'Machuca', 2);
INSERT INTO empleados (dni, nombre, apellidos, id_departamento) VALUES ('5555555A', 'Victor', 'Garcia', 2);