DROP SCHEMA IF EXISTS rightovers CASCADE;
CREATE SCHEMA IF NOT EXISTS rightovers;

SET SCHEMA 'rightovers';

DROP DOMAIN IF EXISTS post_state CASCADE ;
CREATE DOMAIN post_state VARCHAR(50)
    CHECK (VALUE IN ('posted', 'reserved', 'closed'));

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
    username    varchar(50) primary key,
    firstname   varchar(50),
    password_   varchar(100),
    address_id  int references address (address_id),
    is_business bool
);

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
    ADD username          varchar(50) references user_ (username)
        ON DELETE CASCADE;

DROP TABLE IF EXISTS opening_hours;
CREATE TABLE opening_hours
(
    id                      SERIAL PRIMARY KEY,
    username                varchar(50) references user_ (username)
        ON DELETE CASCADE,
    monday_opening_hours    time,
    monday_closing_hours    time,
    tuesday_opening_hours   time,
    tuesday_closing_hours   time,
    wednesday_opening_hours time,
    wednesday_closing_hours time,
    thursday_opening_hours  time,
    thursday_closing_hours  time,
    friday_opening_hours    time,
    friday_closing_hours    time,
    saturday_opening_hours  time,
    saturday_closing_hours  time,
    sunday_opening_hours    time,
    sunday_closing_hours    time
);

DROP TABLE IF EXISTS reservation;
CREATE TABLE reservation
(
    reservation_id SERIAL PRIMARY KEY,
    post_id        int REFERENCES food_post (post_id)
        ON DELETE CASCADE,
    username       varchar(50) REFERENCES user_ (username)
        ON DELETE CASCADE
);

DROP TABLE IF EXISTS rating;
CREATE TABLE rating
(
    rating_id       SERIAL PRIMARY KEY,
    value_          int,
    comment_        varchar,
    rating_type     varchar,
    username_rating varchar REFERENCES user_ (username)
        ON DELETE CASCADE,
    username_rated  varchar REFERENCES user_ (username)
        ON DELETE CASCADE
);

DROP TABLE IF EXISTS report;
CREATE TABLE report
(
    report_id          SERIAL PRIMARY KEY,
    post_id            int REFERENCES food_post (post_id),
    comment_           varchar,
    username_reporting varchar REFERENCES user_ (username)
);

UPDATE food_post
SET post_state = 'posted'
WHERE post_id = 2;

DROP TABLE IF EXISTS user_;
CREATE TABLE user_
(
    username    varchar(50) primary key,
    firstname   varchar(50),
    password_   varchar(100),
    address_id  int references address (address_id),
    is_business bool
);

