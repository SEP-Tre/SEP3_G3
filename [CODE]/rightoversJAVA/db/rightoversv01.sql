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
ALTER TABLE food_post
    ADD timestamp_posted  timestamp,
    ADD pickup_start_date date,
    ADD pickup_end_date   date,
    ADD pickup_start_time time,
    ADD pickup_end_time   time,
    ADD username          varchar(50) references user_ (username);


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

DROP TABLE IF EXISTS user_;
CREATE TABLE user_
(
    username   varchar(50) primary key,
    firstname  varchar(50),
    password_  varchar(100),
    address_id int references address (address_id),
    isBusiness bool
);

DROP TABLE IF EXISTS reservation;
CREATE TABLE reservation
(
    reservation_id SERIAL PRIMARY KEY,
    post_id        int REFERENCES food_post (post_id),
    username       varchar(50) REFERENCES user_ (username)
);


INSERT INTO address(street, street_number, post_code, city, latitude, longitude)
VALUES ('Haldsvej', '1', 8700, 'Horsens', 55.87746972455174, 9.835904241121996),
       ('Banegårdsgade', '2', 8700, 'Horsens', 55.86358739147706, 9.837638462738413),
       ('Torvet', '9', 8700, 'Horsens', 55.86216308465828, 9.851752734511157);


DROP TABLE IF EXISTS rating;
CREATE TABLE rating
(
    rating_id SERIAL PRIMARY KEY,
    value_ int,
    comment_             varchar,
    rating_type          varchar,
    username_rating      varchar REFERENCES user_ (username),
    username_rated varchar REFERENCES user_ (username)
);
UPDATE food_post
SET post_state = 'posted'
WHERE post_id = 2;

