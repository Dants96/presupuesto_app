-- DROP SCHEMA app_data;

CREATE SCHEMA app_data AUTHORIZATION postgres;

-- DROP SEQUENCE app_data.budgets_id_seq;

CREATE SEQUENCE app_data.budgets_id_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 2147483647
	START 1
	CACHE 1
	NO CYCLE;

-- Permissions

ALTER SEQUENCE app_data.budgets_id_seq OWNER TO postgres;
GRANT ALL ON SEQUENCE app_data.budgets_id_seq TO postgres;

-- DROP SEQUENCE app_data.expenses_id_seq;

CREATE SEQUENCE app_data.expenses_id_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 2147483647
	START 1
	CACHE 1
	NO CYCLE;

-- Permissions

ALTER SEQUENCE app_data.expenses_id_seq OWNER TO postgres;
GRANT ALL ON SEQUENCE app_data.expenses_id_seq TO postgres;
-- app_data.budgets definition

-- Drop table

-- DROP TABLE app_data.budgets;

CREATE TABLE app_data.budgets (
	id serial4 NOT NULL,
	user_id int4 NOT NULL,
	budget_date date NOT NULL,
	actual_expense numeric(12, 2) DEFAULT 0 NOT NULL,
	expected_expense numeric(12, 2) DEFAULT 0 NOT NULL,
	created_at timestamp DEFAULT now() NOT NULL,
	update_at timestamp DEFAULT now() NOT NULL,
	"name" varchar(100) NULL,
	description varchar(300) NULL,
	CONSTRAINT budgets_pkey PRIMARY KEY (id)
);

-- Permissions

ALTER TABLE app_data.budgets OWNER TO postgres;
GRANT ALL ON TABLE app_data.budgets TO postgres;


-- app_data.expese_types definition

-- Drop table

-- DROP TABLE app_data.expese_types;

CREATE TABLE app_data.expese_types (
	id varchar(4) NOT NULL,
	description varchar(50) NOT NULL,
	created_at timestamp DEFAULT now() NOT NULL,
	updated_at timestamp DEFAULT now() NOT NULL,
	CONSTRAINT expeses_types_pkey PRIMARY KEY (id)
);

-- Permissions

ALTER TABLE app_data.expese_types OWNER TO postgres;
GRANT ALL ON TABLE app_data.expese_types TO postgres;


-- app_data.expenses definition

-- Drop table

-- DROP TABLE app_data.expenses;

CREATE TABLE app_data.expenses (
	id serial4 NOT NULL,
	budget_id int4 NOT NULL,
	type_id varchar(4) DEFAULT '0' NOT NULL,
	description varchar(100) NOT NULL,
	"cost" numeric(12, 2) DEFAULT 0 NOT NULL,
	created_at timestamp DEFAULT now() NOT NULL,
	updated_at timestamp DEFAULT now() NOT NULL,
	within_budget bool DEFAULT false NOT NULL,
	CONSTRAINT expenses_pkey PRIMARY KEY (id),
	CONSTRAINT expenses_fk1 FOREIGN KEY (budget_id) REFERENCES app_data.budgets(id),
	CONSTRAINT expenses_fk2 FOREIGN KEY (type_id) REFERENCES app_data.expese_types(id)
);

-- Permissions

ALTER TABLE app_data.expenses OWNER TO postgres;
GRANT ALL ON TABLE app_data.expenses TO postgres;




-- Permissions

GRANT ALL ON SCHEMA app_data TO postgres;