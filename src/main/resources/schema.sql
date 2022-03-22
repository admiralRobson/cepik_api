CREATE TABLE CAR (
  id BIGINT AUTO_INCREMENT  PRIMARY KEY,
  typ VARCHAR(400) NOT NULL
);

create table users(
    id BIGINT  AUTO_INCREMENT PRIMARY KEY,
    username varchar ( 50 ) not null UNIQUE,
    password varchar ( 100 ) not null,
    enabled boolean not null
);