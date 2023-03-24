create table if not exists pacientes(

    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    ativo TINYINT NOT NULL,
    endereco_id BIGINT,

    PRIMARY KEY (id),
    FOREIGN KEY (endereco_id) REFERENCES enderecos(id)

);