ALTER TABLE medicos ADD endereco_id BIGINT;
ALTER TABLE medicos ADD FOREIGN KEY (endereco_id) REFERENCES enderecos(id);

--ALTER TABLE medicos ADD endereco_id BIGINT FOREIGN KEY (endereco_id) REFERENCES enderecos(id);

--ALTER TABLE medicos ADD endereco_id BIGINT NOT NULL;
--ALTER TABLE medicos ADD FOREIGN KEY (endereco_id) REFERENCES endero(id);
--
--ALTER TABLE medicos ADD endereco_id BIGINT NOT NULL FOREIGN KEY enderecos(id);
--
--ALTER TABLE medicos ADD endereco_id BIGINT NOT NULL FOREIGN KEY endecos(id);
--ALTER TABLE medicos ADD FOREIGN KEY (endereco_id) REFERENCES enderecos(id);

