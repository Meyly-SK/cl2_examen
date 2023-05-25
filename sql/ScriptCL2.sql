DROP DATABASE IF EXISTS db_empresa;
-- creamos la bd
CREATE DATABASE db_empresa;
-- activamos la bd
USE db_empresa;

CREATE TABLE Area (
    area_id INT PRIMARY KEY,
    area_nombre VARCHAR(255),
    jefe_area VARCHAR(255)
);

CREATE TABLE Personal (
	personal_id INT PRIMARY KEY,
    personal_nombre VARCHAR(255),
    personal_sueldo double,
    personal_area_id INT,
    FOREIGN KEY (personal_area_id) REFERENCES Area(area_id)
);

INSERT INTO Area (area_id, area_nombre, jefe_area)
VALUES (1, 'Ventas', 'Ana García');

INSERT INTO Area (area_id, area_nombre, jefe_area)
VALUES (2, 'Marketing', 'Juan Pérez');

INSERT INTO Area (area_id, area_nombre, jefe_area)
VALUES (3, 'Recursos Humanos', 'María López');


INSERT INTO Personal (personal_id, personal_nombre, personal_sueldo, personal_area_id)
VALUES (1001,'Juan Pérez', 2500.00, 1);

INSERT INTO Personal (personal_id, personal_nombre, personal_sueldo, personal_area_id)
VALUES (1002,'María López',  3000.00, 1);

INSERT INTO Personal (personal_id, personal_nombre, personal_sueldo, personal_area_id)
VALUES (1003,'Pedro Gómez', 2800.00, 2);

INSERT INTO Personal (personal_id, personal_nombre, personal_sueldo, personal_area_id)
VALUES (1004,'Ana Ramírez',  2600.00, 2);

INSERT INTO Personal (personal_id, personal_nombre, personal_sueldo, personal_area_id)
VALUES (1005,'Carlos Martínez',  3200.00, 3);

INSERT INTO Personal (personal_id, personal_nombre, personal_sueldo, personal_area_id)
VALUES (1006,'Laura Herrera', 2700.00, 3);

INSERT INTO Personal (personal_id, personal_nombre, personal_sueldo, personal_area_id)
VALUES (1007,'Andrés Torres',  2900.00, 3);

INSERT INTO Personal (personal_id, personal_nombre, personal_sueldo, personal_area_id)
VALUES (1008,'Isabel García',  3100.00, 2);

select * from Personal;