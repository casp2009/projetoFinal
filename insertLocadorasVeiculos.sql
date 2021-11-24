INSERT INTO locadora (id, endereco, nome, cidade_id) VALUES
(1, 'Rio Branco City', 'Loca Rio Branco', 94),
(2, 'Maceio City', 'Loca Maceio', 147),
(3, 'Camapa City', 'Loca Macapa', 209),
(4, 'Manaus City', 'Loca Manaus', 256),
(5, 'Salvador City', 'Loca Salvador', 616),
(6, 'Fortaleza City', 'Loca Fortaleza', 756),
(7, 'Brasilia City', 'Loca Brasilia', 882),
(8, 'Vitória City', 'Loca Vitória', 78),
(9, 'Goiania City', 'Loca Goiania', 977),
(10, 'São Luís City', 'Loca São Luís', 1314),
(11, 'Cuiabá City', 'Loca Cuiabá', 1383),
(12, 'Campo Grande City', 'Loca Campo Grande', 116),
(13, 'Belo Horizonte City', 'Loca BH', 1630),
(14, 'Belém City', 'Loca Belém', 108),
(15, 'João Pessoa City', 'Loca JP', 2655),
(16, 'Curitiba City', 'Loca Curitiba', 2878),
(17, 'Recife City', 'Loca Recife', 3315),
(18, 'Teresina City', 'Loca Teresina', 3582),
(19, 'Rio de Janeiro City', 'Loca Rio', 3658),
(20, 'Natal City', 'Loca Natal', 3770),
(21, 'Porto Alegre City', 'Loca Porto Alegre', 4174),
(22, 'Porto Velho City', 'Loca Porto Velho', 4382),
(23, 'Boa Vista City', 'Loca Boa Vista', 2590),
(24, 'Florianópolis City', 'Loca Florianópolis', 4500),
(25, 'São Paulo City', 'Loca SP', 5270),
(26, 'Aracaju City', 'Loca Aracaju', 5353),
(27, 'Palmas City', 'Loca Palmas', 5514);

INSERT INTO veiculo (id, ano_fab, arcondicionado, cambio, modelo, placa, preco, reservado, tipo_combustivel, locadora_id) VALUES
(1,'2019', 'sim','automatico','Citroen C3','A123',35.000,FALSE,'gasolina',1),
(2,'2020', 'sim','manual','Citroen C4','A456',45.000,FALSE,'flex',1),
(3,'2021', 'sim','automatico','Citroen C5','A789',55.000,FALSE,'gasolina',1),

(4,'2019', 'sim','automatico','Citroen C3','B123',35.000,FALSE,'gasolina',2),
(5,'2020', 'sim','manual','Citroen C4','B456',45.000,FALSE,'flex',2),
(6,'2021', 'sim','automatico','Citroen C5','B789',55.000,FALSE,'gasolina',2),

(7,'2019', 'sim','automatico','Citroen C3','C123',35.000,FALSE,'gasolina',3),
(8,'2020', 'sim','manual','Citroen C4','C456',45.000,FALSE,'flex',3),
(9,'2021', 'sim','automatico','Citroen C5','C789',55.000,FALSE,'gasolina',3),

(10,'2019', 'sim','automatico','Citroen C3','D123',35.000,FALSE,'gasolina',4),
(11,'2020', 'sim','manual','Citroen C4','D456',45.000,FALSE,'flex',4),
(12,'2021', 'sim','automatico','Citroen C5','D789',55.000,FALSE,'gasolina',4),

(13,'2019', 'sim','automatico','Citroen C3','E123',35.000,FALSE,'gasolina',5),
(14,'2020', 'sim','manual','Citroen C4','E456',45.000,FALSE,'flex',5),
(15,'2021', 'sim','automatico','Citroen C5','E789',55.000,FALSE,'gasolina',5),

(16,'2019', 'sim','automatico','Citroen C3','F123',35.000,FALSE,'gasolina',6),
(17,'2020', 'sim','manual','Citroen C4','F456',45.000,FALSE,'flex',6),
(18,'2021', 'sim','automatico','Citroen C5','F789',55.000,FALSE,'gasolina',6),

(19,'2019', 'sim','automatico','Citroen C3','G123',35.000,FALSE,'gasolina',7),
(20,'2020', 'sim','manual','Citroen C4','G456',45.000,FALSE,'flex',7),
(21,'2021', 'sim','automatico','Citroen C5','G789',55.000,FALSE,'gasolina',7),

(22,'2019', 'sim','automatico','Citroen C3','H123',35.000,FALSE,'gasolina',8),
(23,'2020', 'sim','manual','Citroen C4','H456',45.000,FALSE,'flex',8),
(24,'2021', 'sim','automatico','Citroen C5','H789',55.000,FALSE,'gasolina',8),

(25,'2019', 'sim','automatico','Citroen C3','I123',35.000,FALSE,'gasolina',9),
(26,'2020', 'sim','manual','Citroen C4','I456',45.000,FALSE,'flex',9),
(27,'2021', 'sim','automatico','Citroen C5','I789',55.000,FALSE,'gasolina',9),

(28,'2019', 'sim','automatico','Citroen C3','J123',35.000,FALSE,'gasolina',10),
(29,'2020', 'sim','manual','Citroen C4','J456',45.000,FALSE,'flex',10),
(30,'2021', 'sim','automatico','Citroen C5','J789',55.000,FALSE,'gasolina',10),

(31,'2019', 'sim','automatico','Citroen C3','K123',35.000,FALSE,'gasolina',11),
(32,'2020', 'sim','manual','Citroen C4','K456',45.000,FALSE,'flex',11),
(33,'2021', 'sim','automatico','Citroen C5','K789',55.000,FALSE,'gasolina',11),

(34,'2019', 'sim','automatico','Citroen C3','L123',35.000,FALSE,'gasolina',12),
(35,'2020', 'sim','manual','Citroen C4','L456',45.000,FALSE,'flex',12),
(36,'2021', 'sim','automatico','Citroen C5','L789',55.000,FALSE,'gasolina',12),

(37,'2019', 'sim','automatico','Citroen C3','M123',35.000,FALSE,'gasolina',13),
(38,'2020', 'sim','manual','Citroen C4','M456',45.000,FALSE,'flex',13),
(39,'2021', 'sim','automatico','Citroen C5','M789',55.000,FALSE,'gasolina',13),

(40,'2019', 'sim','automatico','Citroen C3','N123',35.000,FALSE,'gasolina',14),
(41,'2020', 'sim','manual','Citroen C4','N456',45.000,FALSE,'flex',14),
(42,'2021', 'sim','automatico','Citroen C5','N789',55.000,FALSE,'gasolina',14),

(43,'2019', 'sim','automatico','Citroen C3','O123',35.000,FALSE,'gasolina',15),
(44,'2020', 'sim','manual','Citroen C4','O456',45.000,FALSE,'flex',15),
(45,'2021', 'sim','automatico','Citroen C5','O789',55.000,FALSE,'gasolina',15),

(46,'2019', 'sim','automatico','Citroen C3','P123',35.000,FALSE,'gasolina',16),
(47,'2020', 'sim','manual','Citroen C4','P456',45.000,FALSE,'flex',16),
(48,'2021', 'sim','automatico','Citroen C5','P789',55.000,FALSE,'gasolina',16),

(49,'2019', 'sim','automatico','Citroen C3','Q123',35.000,FALSE,'gasolina',17),
(50,'2020', 'sim','manual','Citroen C4','Q456',45.000,FALSE,'flex',17),
(51,'2021', 'sim','automatico','Citroen C5','Q789',55.000,FALSE,'gasolina',17),

(52,'2019', 'sim','automatico','Citroen C3','R123',35.000,FALSE,'gasolina',18),
(53,'2020', 'sim','manual','Citroen C4','R456',45.000,FALSE,'flex',18),
(54,'2021', 'sim','automatico','Citroen C5','R789',55.000,FALSE,'gasolina',18),

(55,'2019', 'sim','automatico','Citroen C3','S123',35.000,FALSE,'gasolina',19),
(56,'2020', 'sim','manual','Citroen C4','S456',45.000,FALSE,'flex',19),
(57,'2021', 'sim','automatico','Citroen C5','S789',55.000,FALSE,'gasolina',19),

(58,'2019', 'sim','automatico','Citroen C3','T123',35.000,FALSE,'gasolina',20),
(59,'2020', 'sim','manual','Citroen C4','T456',45.000,FALSE,'flex',20),
(60,'2021', 'sim','automatico','Citroen C5','T789',55.000,FALSE,'gasolina',20),

(61,'2019', 'sim','automatico','Citroen C3','U123',35.000,FALSE,'gasolina',21),
(62,'2020', 'sim','manual','Citroen C4','U456',45.000,FALSE,'flex',21),
(63,'2021', 'sim','automatico','Citroen C5','U789',55.000,FALSE,'gasolina',21),

(64,'2019', 'sim','automatico','Citroen C3','V123',35.000,FALSE,'gasolina',22),
(65,'2020', 'sim','manual','Citroen C4','V456',45.000,FALSE,'flex',22),
(66,'2021', 'sim','automatico','Citroen C5','V789',55.000,FALSE,'gasolina',22),

(67,'2019', 'sim','automatico','Citroen C3','X123',35.000,FALSE,'gasolina',23),
(68,'2020', 'sim','manual','Citroen C4','X456',45.000,FALSE,'flex',23),
(69,'2021', 'sim','automatico','Citroen C5','X789',55.000,FALSE,'gasolina',23),

(70,'2019', 'sim','automatico','Citroen C3','Y123',35.000,FALSE,'gasolina',24),
(71,'2020', 'sim','manual','Citroen C4','Y456',45.000,FALSE,'flex',24),
(72,'2021', 'sim','automatico','Citroen C5','Y789',55.000,FALSE,'gasolina',24),

(73,'2019', 'sim','automatico','Citroen C3','W123',35.000,FALSE,'gasolina',25),
(74,'2020', 'sim','manual','Citroen C4','W456',45.000,FALSE,'flex',25),
(75,'2021', 'sim','automatico','Citroen C5','W789',55.000,FALSE,'gasolina',25),

(76,'2019', 'sim','automatico','Citroen C3','Z123',35.000,FALSE,'gasolina',26),
(77,'2020', 'sim','manual','Citroen C4','Z456',45.000,FALSE,'flex',26),
(78,'2021', 'sim','automatico','Citroen C5','Z789',55.000,FALSE,'gasolina',26),

(79,'2019', 'sim','automatico','Citroen C3','TO123',35.000,FALSE,'gasolina',27),
(80,'2020', 'sim','manual','Citroen C4','TO456',45.000,FALSE,'flex',27),
(81,'2021', 'sim','automatico','Citroen C5','TO789',55.000,FALSE,'gasolina',27);