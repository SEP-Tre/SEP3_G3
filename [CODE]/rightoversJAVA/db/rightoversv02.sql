DROP SCHEMA IF EXISTS rightovers CASCADE;
CREATE SCHEMA IF NOT EXISTS rightovers;

SET SCHEMA 'rightovers';

DROP DOMAIN IF EXISTS post_state CASCADE;
CREATE DOMAIN post_state VARCHAR(10)
    CHECK (VALUE IN ('posted', 'reserved', 'closed'));
DROP DOMAIN IF EXISTS username CASCADE;
CREATE DOMAIN username varchar(50);

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
    username     username primary key,
    firstname    varchar(50),
    password_    varchar(100),
    address_id   int references address (address_id) ON DELETE CASCADE,
    is_business  bool,
    phone_number varchar(15)
);

DROP TABLE IF EXISTS food_post;
CREATE TABLE food_post
(
    post_id            serial primary key,
    title              varchar(100),
    category_          varchar(100),
    description        varchar(1000),
    picture_url        varchar(1000),
    days_until_expired int,
    post_state         post_state,
    timestamp_posted   timestamp,
    pickup_start_date  date,
    pickup_end_date    date,
    pickup_start_time  time,
    pickup_end_time    time,
    username           username references user_ (username) ON DELETE CASCADE
);


DROP TABLE IF EXISTS opening_hours;
CREATE TABLE opening_hours
(
    id                      SERIAL PRIMARY KEY,
    username                username references user_ (username) ON DELETE CASCADE,
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
    sunday_closing_hours    time,
    monday_is_open          bool,
    tuesday_is_open         bool,
    wednesday_is_open       bool,
    thursday_is_open        bool,
    friday_is_open          bool,
    saturday_is_open        bool,
    sunday_is_open          bool
);

DROP TABLE IF EXISTS reservation;
CREATE TABLE reservation
(
    reservation_id SERIAL PRIMARY KEY,
    post_id        int REFERENCES food_post (post_id) ON DELETE CASCADE,
    username       username REFERENCES user_ (username) ON DELETE CASCADE
);

DROP TABLE IF EXISTS rating;
CREATE TABLE rating
(
    rating_id       SERIAL PRIMARY KEY,
    value_          int,
    comment_        varchar,
    rating_type     varchar,
    username_rating username REFERENCES user_ (username) ON DELETE CASCADE,
    username_rated  username REFERENCES user_ (username) ON DELETE CASCADE
);

DROP TABLE IF EXISTS report;
CREATE TABLE report
(
    report_id          SERIAL PRIMARY KEY,
    post_id            int REFERENCES food_post (post_id) ON DELETE CASCADE,
    comment_           varchar,
    username_reporting username REFERENCES user_ (username) ON DELETE CASCADE
);




