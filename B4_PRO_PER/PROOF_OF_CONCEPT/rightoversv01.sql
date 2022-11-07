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
)