CREATE DATABASE IF NOT EXISTS ficha_acolhimento_prisional;

USE ficha_acolhimento_prisional;

CREATE TABLE IF NOT EXISTS ficha_acolhimento (
id INT AUTO_INCREMENT PRIMARY KEY,

-- Seção de Atendimento
responsavel_atendimento VARCHAR(255),
data_entrada VARCHAR(10),
data_atendimento VARCHAR(10),
transferencia BOOLEAN,
transferencia_local VARCHAR(255),

-- Seção de Identificação
nome_completo VARCHAR(255),
nome_social VARCHAR(255),
data_nascimento VARCHAR(10),
idade INT,
cpf VARCHAR(14) UNIQUE,
nacionalidade ENUM('Brasileiro', 'Naturalizado', 'Estrangeiro'),
nome_mae VARCHAR(255),
estado_civil ENUM('Solteiro', 'Casado', 'União Estável'),

-- Seção Raça/cor
raca_cor ENUM('Branco', 'Preto', 'Pardo', 'Amarelo', 'Indígena'),
etnia ENUM('Branco', 'Preto', 'Pardo', 'Amarelo', 'Indígena'),

-- Seção Gênero
sexo_biologico ENUM('Feminino', 'Masculino'),
identidade_genero ENUM('Homem', 'Mulher', 'Transexual', 'Não binário'),
orientacao_sexual ENUM('Heterossexual', 'Homossexual(gay/lésbica)', 'Bissexual', 'Outra')
);

-- INSERTS
INSERT INTO ficha_acolhimento (
responsavel_atendimento, data_entrada, data_atendimento, transferencia, transferencia_local, 
nome_completo, nome_social, data_nascimento, idade, cpf, nacionalidade, nome_mae, estado_civil, raca_cor, etnia,
sexo_biologico, identidade_genero, orientacao_sexual
) 
VALUES 
-- 1
('Clara Beatriz', '24/06/2025', '24/06/2025', 0, '', 
 'Pedro Rodrigues Filho', 'Pedrinho Matador', '29/11/1954', 70, '99999999999', 'Brasileiro', 'Lucinda', 'Solteiro', 'Pardo', 'Pardo',
 'Masculino', 'Homem', 'Heterossexual'),

-- 2
('João Silva', '01/01/2025', '02/01/2025', 1, 'Presídio Central',
 'Ana Souza', '', '12/03/1980', 45, '00000000001', 'Naturalizado', 'Maria Souza', 'Casado', 'Branco', 'Europeia',
 'Feminino', 'Mulher', 'Homossexual(gay/lésbica)'),

-- 3
('Carlos Mendes', '10/02/2025', '11/02/2025', 0, '',
 'Alex Johnson', 'Lexa', '05/06/1990', 34, '00000000002', 'Estrangeiro', 'Jane Johnson', 'União Estável', 'Preto', 'Africana',
 'Feminino', 'Transexual', 'Bissexual'),

-- 4
('Larissa Ramos', '15/03/2025', '15/03/2025', 0, '',
 'Daniel Tanaka', 'Dani', '22/07/1995', 29, '00000000003', 'Brasileiro', 'Keiko Tanaka', 'Casado', 'Amarelo', 'Japonesa',
 'Masculino', 'Não binário', 'Outra'),

-- 5
('Fernanda Lima', '20/04/2025', '21/04/2025', 1, 'Ala B',
 'Carlos Souza', '', '18/11/1985', 39, '00000000004', 'Naturalizado', 'Joana Souza', 'Solteiro', 'Branco', 'Latino',
 'Masculino', 'Homem', 'Bissexual'),

-- 6
('Bruno Costa', '30/05/2025', '31/05/2025', 0, '',
 'Júlia Martinez', 'Juh', '10/01/1993', 32, '00000000005', 'Estrangeiro', 'Lucia Martinez', 'União Estável', 'Pardo', 'Mestiça',
 'Feminino', 'Mulher', 'Heterossexual');

SELECT * FROM ficha_acolhimento;

DROP TABLE ficha_acolhimento;