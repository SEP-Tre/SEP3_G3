DROP SCHEMA IF EXISTS rightovers CASCADE;
CREATE SCHEMA IF NOT EXISTS rightovers;

SET SCHEMA 'rightovers';

CREATE DOMAIN post_state VARCHAR(50)
    CHECK (VALUE IN ('posted', 'reserved', 'closed'));

CREATE TABLE food_post
(
    post_id            serial primary key,
    title              varchar(100),
    category_          varchar(100),
    description        varchar(1000),
    picture_url        varchar(1000),
    days_until_expired int,
    post_state         post_state
);

CREATE TABLE address
(
    address_id    serial primary key,
    street        varchar(100),
    street_number varchar(30),
    city          varchar(50),
    post_code     int,
    longitude     numeric,
    latitude      numeric
);

INSERT INTO address(street, street_number, post_code, city, longitude, latitude)
VALUES ('Haldsvej', '1', 8700, 'Horsens', 55.87746972455174, 9.835904241121996),
       ('Banegårdsgade', '2', 8700, 'Horsens', 55.86358739147706, 9.837638462738413),
       ('Torvet', '9', 8700, 'Horsens', 55.86216308465828, 9.851752734511157);

UPDATE food_post
SET post_state = 'posted'
WHERE post_id = 1;

