/**
 * Author:  Marce
 * Created: Oct 2, 2018
 */

CREATE DATABASE registroAutomovilesUsadosIntentoEnCasa;

USE registroAutomovilesUsadosIntentoEnCasa;


CREATE TABLE ultimoDuenio(
run VARCHAR (20),
nombreCompleto VARCHAR (40),
telefono VARCHAR (20),
PRIMARY KEY (run)
);

CREATE TABLE automovil(
id int AUTO_INCREMENT,
patente VARCHAR (20),
marca VARCHAR (20),
anio int,
detalles VARCHAR (100),
ultimoDuenio_fk VARCHAR (20),
foreign key (ultimoDuenio_fk) REFERENCES ultimoDuenio (run),
PRIMARY KEY (id)
);


INSERT INTO ultimoDuenio VALUES('20','marce','12323223');
INSERT INTO automovil VALUES (NULL, 'AAA', 'Ford', 12, 'esque','20');


