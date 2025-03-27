CREATE TABLE dormitorio (
    dormitorio_id VARCHAR(255) PRIMARY KEY,
    nome VARCHAR(255),
    localizacao VARCHAR(255),
    descricao TEXT,
    capacidade INTEGER
);

CREATE TABLE leito (
    numero_leito VARCHAR(255) PRIMARY KEY,
    dormitorio_id VARCHAR(255) NOT NULL,
    FOREIGN KEY (dormitorio_id) REFERENCES dormitorio(dormitorio_id) ON DELETE CASCADE
);

CREATE TABLE reservas_rge_raw (
    id_reserva varchar(255),
    horario_reserva timestamp(255),
    nome_completo varchar(255),
    ministerio varchar(255),
    cidade varchar(255),
    data_nascimento date,
    data_ordernacao date,
    enfermidade varchar(255),
    participa_reuniao_ministerio boolean,
    preside_regional boolean,
    data_checkin date,
    data_checkout date,
    hospedou_rge_passada boolean,
    celular varchar(255),
    leito_id VARCHAR(255) UNIQUE,
    FOREIGN KEY (leito_id) REFERENCES leito(numero_leito) ON DELETE CASCADE
);
