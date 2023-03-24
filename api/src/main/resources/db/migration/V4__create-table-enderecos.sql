CREATE TABLE IF NOT EXISTS enderecos(

    id BIGINT NOT NULL AUTO_INCREMENT,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(9) not null,
    complemento varchar(100),
    numero varchar(20),
    uf char(2) not null,
    cidade varchar(100) not null,

    PRIMARY KEY (id)

);


INSERT INTO enderecos (logradouro, bairro, cep, complemento, numero, Uf, cidade)
VALUES ("Rua Trinta e Um", "Vila Embratel", "65081390", "Bloco C", "2354", "MG", "São Luís"),
       ("Rua Francisco Soares Magalhães", "Jardim Primavera II", "35703-125", "", "5", "MG", "Sete Lagoas"),
       ("Rua Alves Júnior", "Centenário", "36045150", "", "3110", "MG", "Juiz de Fora"),
       ("Rua Pedro Wiereck", "Aeroporto", "36038319", "", "78", "MG", "Juiz de Fora"),
       ("Rua Andaluzita", "Rua Andaluzita", "30310030", "", "66", "MG", "Belo Horizonte"),
       ("Avenida Presidente Juscelino Kubitschek", "Califórnia", "308554505", "", "893", "MG", "Belo Horizonte"),
       ("Rua Cinqüenta", "Florença", "33823470", "", "173", "MG", "Ribeirão das Neves"),
       ("Rua Edgard de Paiva Aguiar", "Cerâmica", "36080280", "", "64", "MG", "Juiz de Fora"),
       ("Rua Lagoa Santa", "Turmalina", "35052857", "", "5430", "MG", "Governador Valadares");