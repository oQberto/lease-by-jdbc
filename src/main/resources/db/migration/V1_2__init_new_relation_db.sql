CREATE TABLE image
(
    id         BIGSERIAL PRIMARY KEY,
    image_path VARCHAR(528) NOT NULL
);

ALTER TABLE rental
    DROP COLUMN images;

ALTER TABLE rental
    ADD COLUMN image_id BIGINT;