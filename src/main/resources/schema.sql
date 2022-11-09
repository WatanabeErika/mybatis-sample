DROP TABLE IF EXISTS "USER";

CREATE TABLE "USER" (
  ID INT NOT NULL,
  NAME VARCHAR(50),
  AGE INT,
  PRIMARY KEY(ID)
);


DROP TABLE IF EXISTS comments;

CREATE TABLE comments(
	id serial NOT NULL,
	name text NOT NULL,
	content text NOT NULL,
	article_id integer NOT NULL,
	CONSTRAINT comments_pkey PRIMARY KEY(id),
	FOREIGN KEY(article_id)REFERENCES articles(id)
);

