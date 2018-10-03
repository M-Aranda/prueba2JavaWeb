

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
FOREIGN KEY (ultimoDuenio_fk) REFERENCES ultimoDuenio (run),
PRIMARY KEY (id)
);


INSERT INTO ultimoDuenio VALUES('20','marce','12323223');
INSERT INTO automovil VALUES (NULL, 'AAA', 'Ford', 12, 'esque','20');
INSERT INTO ultimoDuenio VALUES ('20848088-2', 'Marcelo Aranda Tatto', '+9568677107');
INSERT INTO ultimoDuenio VALUES ('30898018-2', 'Gonzalo Aranda Tatto', '+9568899107');
INSERT INTO ultimoDuenio VALUES ('10898038-2', 'Paula Aranda Tatto', '+9562277107');

INSERT INTO automovil VALUES (NULL, 'AAAA-11', 'Ford', 1995, 'En buen estado, poco kilometraje','20848088-2');
INSERT INTO automovil VALUES (NULL, ' BBBB-22', 'Toshiba', 1998, 'Tiene algunos rayones','30898018-2');
INSERT INTO automovil VALUES (NULL, 'CCCC-33', 'Subaru', 2000, '5000 de kilometraje','10898038-2');

-- SELECT * FROM ultimoDuenio WHERE run='20';

/*
DROP DATABASE registroAutomovilesUsadosIntentoEnCasa;
*/
