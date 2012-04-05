# Accounts schema
 
# --- !Ups
 
CREATE TABLE Account (
  id bigserial NOT NULL,
  email varchar(255) NOT NULL,
  fullname varchar(255) NOT NULL,
  isAdmin boolean NOT NULL,
  CONSTRAINT pk_account PRIMARY KEY (id)
);
 
# --- !Downs
 
DROP TABLE Account;

