DROP TABLE IF EXISTS collection_dvd;
DROP TABLE IF EXISTS producers;
DROP TABLE IF EXISTS countries;
DROP TABLE IF EXISTS genres;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START WITH 100000;

CREATE TABLE genres
(
  id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  name             VARCHAR                 NOT NULL
  /*CONSTRAINT genre_idx UNIQUE (name)*/
);

CREATE TABLE countries
(
  id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  name             VARCHAR                 NOT NULL
  /*CONSTRAINT country_idx UNIQUE (name)*/
);

CREATE TABLE producers
(
  id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  name             VARCHAR                 NOT NULL
  /*CONSTRAINT producer_idx UNIQUE (name)*/
);

CREATE TABLE collection_dvd
(
  id          INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  genre_id     INTEGER   NOT NULL,
  country_id     INTEGER   NOT NULL,
  producer_id     INTEGER   NOT NULL,
  date_time   TIMESTAMP NOT NULL,
  name VARCHAR      NOT NULL,
  description TEXT      NOT NULL,
  FOREIGN KEY (genre_id) REFERENCES genres (id) ON DELETE CASCADE,
  FOREIGN KEY (country_id) REFERENCES countries (id) ON DELETE CASCADE,
  FOREIGN KEY (producer_id) REFERENCES producers (id) ON DELETE CASCADE
);

CREATE UNIQUE INDEX collection_dvd_datetime_idx
  ON collection_dvd (name, date_time);