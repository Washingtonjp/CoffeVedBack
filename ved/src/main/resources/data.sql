use ved; 

INSERT INTO categoria VALUES(1,'Frutas');
INSERT INTO categoria VALUES(2,'Verduras');
INSERT INTO categoria VALUES(3,'Legumes');
INSERT INTO categoria VALUES(4,'Mercearia'); 
INSERT INTO categoria VALUES(5,'Planos'); 

INSERT INTO marca VALUES(1, 'Korin');
INSERT INTO marca VALUES(2, 'Mãe Terra');
INSERT INTO marca VALUES(3, 'Vapza');
INSERT INTO marca VALUES(4, 'Coopernatural');
INSERT INTO marca VALUES(5, 'BioEssência');
INSERT INTO marca VALUES(6, 'Surya Brasil');
INSERT INTO marca VALUES(7, 'TerraFlor');
INSERT INTO marca VALUES(8, 'Soouvie');   

INSERT INTO serie VALUES(1,"Compra");
INSERT INTO serie VALUES(2,"Venda"); 

INSERT INTO bandeira VALUES(2, 'Visa');
INSERT INTO bandeira VALUES(3, 'Hipercard'); 

INSERT INTO status_produto VALUES(1,'Disponível');
INSERT INTO status_produto VALUES(2,'Indisponível');
INSERT INTO status_produto VALUES(3,'Descontinuado'); 

INSERT INTO armazenamento VALUES(1, 'Armazenar em Temperatura Ambiente.');
INSERT INTO armazenamento VALUES(2, 'Armazenar na Geladeira Abaixo de 8ªC.');
INSERT INTO armazenamento VALUES(3, 'Armazenar em frizer abaixo de 0ºC.');  

INSERT INTO pedido_status VALUES(1,'Aguardando confirmação');
INSERT INTO pedido_status VALUES(2,'Pedido confirmado');
INSERT INTO pedido_status VALUES(3,'Pedido a caminho');
INSERT INTO pedido_status VALUES(4,'Pedido entregue'); 
INSERT INTO pedido_status VALUES(5,'Cancelado'); 

INSERT INTO uf VALUES(1, 'AC');
INSERT INTO uf VALUES(2, 'AL');
INSERT INTO uf VALUES(3, 'AP');
INSERT INTO uf VALUES(4, 'AM');
INSERT INTO uf VALUES(5, 'BA');
INSERT INTO uf VALUES(6, 'CE');
INSERT INTO uf VALUES(7, 'DF');
INSERT INTO uf VALUES(8, 'ES');
INSERT INTO uf VALUES(9, 'GO');
INSERT INTO uf VALUES(10, 'MA');
INSERT INTO uf VALUES(11, 'MT');
INSERT INTO uf VALUES(12, 'MS');
INSERT INTO uf VALUES(13, 'MG');
INSERT INTO uf VALUES(14, 'PA');
INSERT INTO uf VALUES(15, 'PB');
INSERT INTO uf VALUES(16, 'PR');
INSERT INTO uf VALUES(17, 'PE');
INSERT INTO uf VALUES(18, 'PI');
INSERT INTO uf VALUES(19, 'RJ');
INSERT INTO uf VALUES(20, 'RN');
INSERT INTO uf VALUES(21, 'RS');
INSERT INTO uf VALUES(22, 'RO');
INSERT INTO uf VALUES(23, 'RR');
INSERT INTO uf VALUES(24, 'SC');
INSERT INTO uf VALUES(25, 'SP');
INSERT INTO uf VALUES(26, 'SE');
INSERT INTO uf VALUES(27, 'TO'); 

INSERT INTO tipo_frete VALUES(1, 'Comum');
INSERT INTO tipo_frete VALUES(2, 'Expresso');



INSERT INTO fornecedor VALUES(1, 'Distribuidora Santos'      ,  '22789635000135'  , 'DistribuidoraSantos@hotmail.com');
INSERT INTO fornecedor VALUES(2, 'Distribuidora Oliveira'    ,  '22789635000136'  , 'DistribuidoraOliveira@hotmail.com');
INSERT INTO fornecedor VALUES(3, 'Organicos do Brasil'       ,  '22789635000137'  , 'OrganicoBrasil@hotmail.com');
INSERT INTO fornecedor VALUES(4, 'Hortifrute Grangera '      ,  '22789635000138'  , 'HortifruteGrangera@hotmail.com');


INSERT INTO pix VALUES(1,'000000000000000000000000000000000000001');
insert into cupom_desconto values (1, "ved10", 10);

