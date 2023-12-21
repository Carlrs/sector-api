CREATE TABLE company_sectors (
    id serial PRIMARY KEY,
    company_id INT NOT NULL,
    sector_id INT NOT NULL,
    CONSTRAINT fk_company_id
        FOREIGN KEY(company_id)
            REFERENCES companies(id)
    CONSTRAINT fk_sector_id
        FOREIGN KEY(sector_id)
            REFERENCES sectors(id)
);
