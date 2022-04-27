-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-04-27 12:58:07.89

-- tables
-- Table: allowed_measure_unit
CREATE TABLE toidu_app.allowed_measure_unit (
                                                id serial  NOT NULL,
                                                ingredient_id int  NOT NULL,
                                                measure_unit_id int  NOT NULL,
                                                conversion_multiplier int  NOT NULL,
                                                onversion_description varchar(255)  NULL,
                                                CONSTRAINT allowed_measure_unit_unique UNIQUE (ingredient_id, measure_unit_id) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                                                CONSTRAINT allowed_measure_unit_pk PRIMARY KEY (id)
);

-- Table: contact
CREATE TABLE toidu_app.contact (
                                   id serial  NOT NULL,
                                   users_id int  NOT NULL,
                                   first_name varchar(255)  NOT NULL,
                                   last_name varchar(255)  NOT NULL,
                                   address varchar(255)  NULL,
                                   mobile_number varchar(255)  NULL,
                                   email varchar(255)  NULL,
                                   CONSTRAINT contact_pk PRIMARY KEY (id)
);

-- Table: day_plan
CREATE TABLE toidu_app.day_plan (
                                    id serial  NOT NULL,
                                    date_time_added timestamp  NOT NULL,
                                    description varchar(100)  NOT NULL,
                                    CONSTRAINT plan_unique UNIQUE (date_time_added, description) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                                    CONSTRAINT plan_pk PRIMARY KEY (id)
);

-- Table: ingredient
CREATE TABLE toidu_app.ingredient (
                                      id serial  NOT NULL,
                                      name varchar(255)  NOT NULL,
                                      description varchar(255),
                                      energy decimal(6,1)  NOT NULL,
                                      carbs decimal(6,1)  NOT NULL,
                                      fat decimal(6,1)  NOT NULL,
                                      protein decimal(6,1)  NOT NULL,
                                      CONSTRAINT ingredient_unique UNIQUE (name) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                                      CONSTRAINT ingredient_pk PRIMARY KEY (id)
);

-- Table: ingredient_group
CREATE TABLE toidu_app.ingredient_group (
                                            id serial  NOT NULL,
                                            name varchar(30)  NOT NULL,
                                            CONSTRAINT ingredient_group_unique UNIQUE (name) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                                            CONSTRAINT ingredient_group_pk PRIMARY KEY (id)
);

-- Table: ingredient_in_ingredient_group
CREATE TABLE toidu_app.ingredient_in_ingredient_group (
                                                          id serial  NOT NULL,
                                                          ingredient_id int  NOT NULL,
                                                          ingredient_group_id int  NOT NULL,
                                                          CONSTRAINT ingredient_in_ingredient_group_unique UNIQUE (ingredient_id, ingredient_group_id) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                                                          CONSTRAINT ingredient_in_ingredient_group_pk PRIMARY KEY (id)
);

-- Table: ingredient_plan
CREATE TABLE toidu_app.ingredient_plan (
                                           id serial  NOT NULL,
                                           day_plan_id int  NOT NULL,
                                           ingredient_id int  NOT NULL,
                                           serving_size int  NOT NULL,
                                           measure_unit_id int  NOT NULL,
                                           CONSTRAINT ingredient_plan_pk PRIMARY KEY (id)
);

-- Table: measure_unit
CREATE TABLE toidu_app.measure_unit (
                                        id serial  NOT NULL,
                                        name varchar(4)  NOT NULL,
                                        CONSTRAINT measure_unit_unique UNIQUE (name) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                                        CONSTRAINT measure_unit_pk PRIMARY KEY (id)
);

-- Table: plan_recipe
CREATE TABLE toidu_app.plan_recipe (
                                       id serial  NOT NULL,
                                       day_plan_id int  NOT NULL,
                                       recipe_id int  NOT NULL,
                                       planned_serving_size int  NOT NULL DEFAULT 1,
                                       date_time_added timestamp  NOT NULL,
                                       CONSTRAINT plan_recipes_pk PRIMARY KEY (id)
);

-- Table: recipe
CREATE TABLE toidu_app.recipe (
                                  id serial  NOT NULL,
                                  users_id int  NOT NULL,
                                  name varchar(255)  NOT NULL,
                                  description varchar(200)  NOT NULL,
                                  instructions varchar(2000)  NULL,
                                  public_recipe boolean  NOT NULL,
                                  CONSTRAINT recipe_unique UNIQUE (description) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                                  CONSTRAINT recipe_pk PRIMARY KEY (id)
);

-- Table: recipe_ingredient
CREATE TABLE toidu_app.recipe_ingredient (
                                             id serial  NOT NULL,
                                             recipe_id int  NOT NULL,
                                             ingredient_id int  NOT NULL,
                                             measure_unit_id int  NOT NULL,
                                             quantity decimal(6,2)  NOT NULL,
                                             date_from date  NOT NULL,
                                             date_to date  NULL,
                                             CONSTRAINT recipe_ingredient_unique UNIQUE (recipe_id, ingredient_id) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                                             CONSTRAINT recipe_ingredient_pk PRIMARY KEY (id)
);

-- Table: recipe_picture
CREATE TABLE toidu_app.recipe_picture (
                                          id serial  NOT NULL,
                                          recipe_id int  NOT NULL,
                                          title varchar(255)  NULL,
                                          description varchar(500)  NULL,
                                          picture_data bytea  NULL,
                                          CONSTRAINT recipe_picture_pk PRIMARY KEY (id)
);

-- Table: recipe_tags
CREATE TABLE toidu_app.recipe_tags (
                                       id serial  NOT NULL,
                                       recipe_id int  NOT NULL,
                                       tag_id int  NOT NULL,
                                       CONSTRAINT recipe_tags_unique UNIQUE (tag_id, recipe_id) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                                       CONSTRAINT recipe_tags_pk PRIMARY KEY (id)
);

-- Table: role
CREATE TABLE toidu_app.role (
                                id serial  NOT NULL,
                                name varchar(255)  NOT NULL,
                                CONSTRAINT role_pk PRIMARY KEY (id)
);

-- Table: tag
CREATE TABLE toidu_app.tag (
                               id serial  NOT NULL,
                               description varchar(30)  NOT NULL,
                               CONSTRAINT tag_unique UNIQUE (description) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                               CONSTRAINT tag_pk PRIMARY KEY (id)
);

-- Table: user_role
CREATE TABLE toidu_app.user_role (
                                     id serial  NOT NULL,
                                     users_id int  NOT NULL,
                                     role_id int  NOT NULL,
                                     CONSTRAINT user_role_pk PRIMARY KEY (id)
);

-- Table: users
CREATE TABLE toidu_app.users (
                                 id serial  NOT NULL,
                                 username varchar(50)  NOT NULL,
                                 password varchar(100)  NOT NULL,
                                 CONSTRAINT users_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: allowed_measure_unit_ingredient (table: allowed_measure_unit)
ALTER TABLE toidu_app.allowed_measure_unit ADD CONSTRAINT allowed_measure_unit_ingredient
    FOREIGN KEY (ingredient_id)
        REFERENCES toidu_app.ingredient (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: allowed_measure_unit_measure_unit (table: allowed_measure_unit)
ALTER TABLE toidu_app.allowed_measure_unit ADD CONSTRAINT allowed_measure_unit_measure_unit
    FOREIGN KEY (measure_unit_id)
        REFERENCES toidu_app.measure_unit (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: contact_users (table: contact)
ALTER TABLE toidu_app.contact ADD CONSTRAINT contact_users
    FOREIGN KEY (users_id)
        REFERENCES toidu_app.users (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: ingredient_in_ingredient_group_ingredient (table: ingredient_in_ingredient_group)
ALTER TABLE toidu_app.ingredient_in_ingredient_group ADD CONSTRAINT ingredient_in_ingredient_group_ingredient
    FOREIGN KEY (ingredient_id)
        REFERENCES toidu_app.ingredient (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: ingredient_in_ingredient_group_ingredient_group (table: ingredient_in_ingredient_group)
ALTER TABLE toidu_app.ingredient_in_ingredient_group ADD CONSTRAINT ingredient_in_ingredient_group_ingredient_group
    FOREIGN KEY (ingredient_group_id)
        REFERENCES toidu_app.ingredient_group (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: ingredient_plan_day_plan (table: ingredient_plan)
ALTER TABLE toidu_app.ingredient_plan ADD CONSTRAINT ingredient_plan_day_plan
    FOREIGN KEY (day_plan_id)
        REFERENCES toidu_app.day_plan (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: ingredient_plan_ingredient (table: ingredient_plan)
ALTER TABLE toidu_app.ingredient_plan ADD CONSTRAINT ingredient_plan_ingredient
    FOREIGN KEY (ingredient_id)
        REFERENCES toidu_app.ingredient (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: ingredient_plan_measure_unit (table: ingredient_plan)
ALTER TABLE toidu_app.ingredient_plan ADD CONSTRAINT ingredient_plan_measure_unit
    FOREIGN KEY (measure_unit_id)
        REFERENCES toidu_app.measure_unit (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: plan_recipe_day_plan (table: plan_recipe)
ALTER TABLE toidu_app.plan_recipe ADD CONSTRAINT plan_recipe_day_plan
    FOREIGN KEY (day_plan_id)
        REFERENCES toidu_app.day_plan (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: plan_recipe_recipe (table: plan_recipe)
ALTER TABLE toidu_app.plan_recipe ADD CONSTRAINT plan_recipe_recipe
    FOREIGN KEY (recipe_id)
        REFERENCES toidu_app.recipe (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: recipe_ingredient_ingredient (table: recipe_ingredient)
ALTER TABLE toidu_app.recipe_ingredient ADD CONSTRAINT recipe_ingredient_ingredient
    FOREIGN KEY (ingredient_id)
        REFERENCES toidu_app.ingredient (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: recipe_ingredient_measure_unit (table: recipe_ingredient)
ALTER TABLE toidu_app.recipe_ingredient ADD CONSTRAINT recipe_ingredient_measure_unit
    FOREIGN KEY (measure_unit_id)
        REFERENCES toidu_app.measure_unit (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: recipe_ingredient_recipe (table: recipe_ingredient)
ALTER TABLE toidu_app.recipe_ingredient ADD CONSTRAINT recipe_ingredient_recipe
    FOREIGN KEY (recipe_id)
        REFERENCES toidu_app.recipe (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: recipe_picture_recipe (table: recipe_picture)
ALTER TABLE toidu_app.recipe_picture ADD CONSTRAINT recipe_picture_recipe
    FOREIGN KEY (recipe_id)
        REFERENCES toidu_app.recipe (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: recipe_tags_recipe (table: recipe_tags)
ALTER TABLE toidu_app.recipe_tags ADD CONSTRAINT recipe_tags_recipe
    FOREIGN KEY (recipe_id)
        REFERENCES toidu_app.recipe (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: recipe_tags_tag (table: recipe_tags)
ALTER TABLE toidu_app.recipe_tags ADD CONSTRAINT recipe_tags_tag
    FOREIGN KEY (tag_id)
        REFERENCES toidu_app.tag (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: recipe_users (table: recipe)
ALTER TABLE toidu_app.recipe ADD CONSTRAINT recipe_users
    FOREIGN KEY (users_id)
        REFERENCES toidu_app.users (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: user_role_role (table: user_role)
ALTER TABLE toidu_app.user_role ADD CONSTRAINT user_role_role
    FOREIGN KEY (role_id)
        REFERENCES toidu_app.role (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: user_role_users (table: user_role)
ALTER TABLE toidu_app.user_role ADD CONSTRAINT user_role_users
    FOREIGN KEY (users_id)
        REFERENCES toidu_app.users (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- End of file.

