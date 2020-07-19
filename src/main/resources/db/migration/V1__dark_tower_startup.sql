CREATE SCHEMA IF NOT EXISTS palindrome;

CREATE TABLE IF NOT EXISTS palindrome.words
(
    word text NOT NULL,
    definition text NOT NULL,
    added_at timestamp without time zone NOT NULL DEFAULT now(),
    PRIMARY KEY (word)
);