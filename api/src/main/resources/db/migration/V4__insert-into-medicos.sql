INSERT INTO medicos(id, nome, email,
    crm VARCHAR(6) NOT NULL UNIQUE,
    especialidade VARCHAR(100) NOT NULL,
    logradouro VARCHAR(100) NOT NULL,
    bairro VARCHAR(100) NOT NULL,
    cep VARCHAR(9) NOT NULL,
    complemento VARCHAR(100),
    numero VARCHAR(20),
    uf CHAR(2) NOT NULL,
    cidade VARCHAR(100) not null,
    telefone varchar(20) not null,
    ativo TINYINT;
    update medicos set ativo = 1;
)
VALUES (
    1, "Nívia Margarethe Pinto", "nivia.margarethe@voll.com.br"
    "",
)


INSERT INTO enderecos (logradouro, bairro, cep, complemento, numero, Uf, cidade)
VALUES (
    "Rua Trinta e Um", "Vila Embratel", "65081-390", "Bloco C", "2354", "MG", "São Luís",
    "Rua Francisco Soares Magalhães", "Jardim Primavera II", "35703-125", "", "MG", "Sete Lagoas",
    "Rua Alves Júnior", "Centenário", "36045-150", "", "3110", "MG", "Juiz de Fora",
    "Rua Pedro Wiereck", "Aeroporto", "36038-319", "", "78", "MG", "Juiz de Fora",
    "Rua Andaluzita", "Rua Andaluzita", "30310-030", "", "66", "MG", "Belo Horizonte",
    "Avenida Presidente Juscelino Kubitschek", "Califórnia", "30855-4505", "", "893", "MG", "Belo Horizonte",
    "Rua Cinqüenta", "Florença", "33823-470", "", "173", "MG", "Ribeirão das Neves",
    "Rua Edgard de Paiva Aguiar", "Cerâmica", "36080-280", "", "64", "MG", "Juiz de Fora",
    "Rua Lagoa Santa", "Turmalina", "35052-857", "", "5430", "MG", "Governador Valadares"
);