
CREATE DATABASE app_parqueadero;
USE app_parqueadero;

CREATE TABLE usuarios(
    cedula CHAR(10) PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    telefono VARCHAR(10) NOT NULL,
    email VARCHAR(70) NOT NULL
);

INSERT INTO usuarios (cedula,nombre,apellido,telefono,email) 
VALUES 
    ('1088360430','Winder','Roman','3217046953','winderroman3131@gmail.com'),
    ('1088789456','Oscar','Loaiza','123456777','loaiza9@gmail.com'),
    ('1088123456','David','Osorio','12313232','braulioosorio@gmail.com');

