CREATE TABLE profile
(
    id           BIGSERIAL PRIMARY KEY,
    avatar_img   VARCHAR(256),
    first_name   VARCHAR(256),
    last_name    VARCHAR(256),
    phone_number VARCHAR(128)
);

CREATE TABLE users
(
    id         BIGSERIAL PRIMARY KEY,
    profile_id BIGINT REFERENCES profile (id),
    email      VARCHAR(256) UNIQUE NOT NULL,
    username   VARCHAR(128) UNIQUE NOT NULL,
    password   VARCHAR(128)        NOT NULL
);

CREATE TABLE city
(
    id    BIGSERIAL PRIMARY KEY,
    name  VARCHAR(128) NOT NULL,
    image VARCHAR(256) NOT NULL
);

CREATE TABLE street
(
    id       BIGSERIAL PRIMARY KEY,
    name     VARCHAR(256) NOT NULL,
    zip_code BIGINT       NOT NULL
);

CREATE TABLE address
(
    id           BIGSERIAL PRIMARY KEY,
    city_id      BIGINT REFERENCES city (id),
    street_id    BIGINT REFERENCES street (id),
    house_no     BIGINT NOT NULL,
    apartment_no BIGINT NOT NULL
);

CREATE TABLE about
(
    id            BIGSERIAL PRIMARY KEY,
    property_type VARCHAR(128),
    parking_type  VARCHAR(128),
    lease_term    DATE NOT NULL,
    short_term    DATE,
    furnished     VARCHAR(128),
    year_built    DATE NOT NULL
);

CREATE TABLE rental
(
    id          BIGSERIAL PRIMARY KEY,
    user_id     BIGINT REFERENCES users (id),
    address_id  BIGINT REFERENCES address (id),
    about_id    BIGINT REFERENCES about (id),
    images      VARCHAR(1024) NOT NULL,
    price       NUMERIC       NOT NULL,
    description VARCHAR(520)
);

CREATE TABLE amenities
(
    id   BIGSERIAL PRIMARY KEY,
    name VARCHAR(128)
);

CREATE TABLE feature
(
    id   BIGSERIAL PRIMARY KEY,
    name VARCHAR(128)
);

CREATE TABLE rental_amenities
(
    id           BIGSERIAL PRIMARY KEY,
    rental_id    BIGINT REFERENCES rental (id),
    amenities_id BIGINT REFERENCES amenities (id)
);

CREATE TABLE rental_feature
(
    id         BIGSERIAL PRIMARY KEY,
    rental_id  BIGINT REFERENCES rental (id),
    feature_id BIGINT REFERENCES feature (id)
);

CREATE TABLE neighbourhood
(
    id   BIGSERIAL PRIMARY KEY,
    name VARCHAR(256) UNIQUE NOT NULL
);
