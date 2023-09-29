ALTER TABLE users
    ADD COLUMN role VARCHAR(64);

ALTER TABLE address
    DROP COLUMN apartment_no;

ALTER TABLE rental
    ADD COLUMN status VARCHAR(64);

