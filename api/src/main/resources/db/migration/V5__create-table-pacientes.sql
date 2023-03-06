create table if not exists pacientes(

    id BIGINT NOT NULL AUTO_INCREMENT,
    nome STRING NOT NULL,
    email STRING,
    telefone STRING,
    cpf STRING NOT NULL,
    ativo TINYINT NOT NULL,
    endereco_id ID NOT NULL,

    PRIMARY KEY (id),
    CONSTRAINT fk_endereco_id FOREIGN KEY endereco_id REFERENCES endecos(id)

);