CREATE TABLE sectors (
    id serial PRIMARY KEY,
    code INT NOT NULL UNIQUE NOT NULL,
    name VARCHAR(255) NOT NULL
);
