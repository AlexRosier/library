CREATE TABLE library.book (
	id BIGSERIAL NOT NULL,
	title varchar(50) NOT NULL,
	isbn varchar(20),
	year integer NOT NULL,
	author varchar(100),
	CONSTRAINT book_pk PRIMARY KEY (id));

CREATE TABLE library.user (
	id BIGSERIAL NOT NULL,
	username varchar(50) NOT NULL,
	firstname varchar(50) NOT NULL,
	lastname varchar(50) NOT NULL,
	email varchar(100) NOT NULL,
	CONSTRAINT user_pk PRIMARY KEY (id));

CREATE TABLE library.rental (
	id BIGSERIAL NOT NULL,
	book_id BIGINT NOT NULL,
	user_id BIGINT NOT NULL,
	pickup_date timestamp(6) NOT NULL,
	return_date timestamp(6),
	CONSTRAINT rental_pk PRIMARY KEY (id),
	CONSTRAINT rental_book_fk1 FOREIGN KEY (book_id) REFERENCES library.book (id),
	CONSTRAINT rental_user_fk1 FOREIGN KEY (user_id) REFERENCES library.user (id));

CREATE TABLE library.suggestion (
	id BIGSERIAL NOT NULL,
	user_id BIGINT NOT NULL,
	url varchar(200),
	motivation TEXT,
	isbn varchar(20),
	CONSTRAINT suggestion_pk PRIMARY KEY (id),
	CONSTRAINT suggestion_user_fk1 FOREIGN KEY (user_id) REFERENCES library.user (id));

CREATE TABLE library.tag (
	id BIGSERIAL NOT NULL,
	book_id BIGINT NOT NULL,
	value varchar(50),
	CONSTRAINT tag_pk PRIMARY KEY (id),
	CONSTRAINT tag_book_fk1 FOREIGN KEY (book_id) REFERENCES library.book (id));
