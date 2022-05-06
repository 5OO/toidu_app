-- ROLE TABLE CONTENTS
INSERT INTO toidu_app.role (name) VALUES ('admin');
INSERT INTO toidu_app.role (name) VALUES ('user');

-- USER TABLE CONTENTS
INSERT INTO toidu_app.user (username, password) VALUES ('taavi', 'taavi123');
INSERT INTO toidu_app.user (username, password) VALUES ('liisbet', 'liisbet123');
INSERT INTO toidu_app.user (username, password) VALUES ('anna', 'anna123');
INSERT INTO toidu_app.user (username, password) VALUES ('mattias', 'mattias123');

-- USER ROLE TABLE CONTENTS
INSERT INTO toidu_app.user_role (id, user_id, role_id) VALUES (DEFAULT, 1, 1);
INSERT INTO toidu_app.user_role (id, user_id, role_id) VALUES (DEFAULT, 2, 1);
INSERT INTO toidu_app.user_role (id, user_id, role_id) VALUES (DEFAULT, 3, 2);
INSERT INTO toidu_app.user_role (id, user_id, role_id) VALUES (DEFAULT, 4, 2);

-- CONTACT TABLE CONTENTS
INSERT INTO toidu_app.contact (id, user_id, first_name, last_name, address, mobile_number, email) VALUES (DEFAULT, 1, 'Taavi ', 'Tähenärija', 'Kullasepa 10, Tallinn', '+372 50 222 33', 'kk@toiduapp.ee');
INSERT INTO toidu_app.contact (id, user_id, first_name, last_name, address, mobile_number, email) VALUES (DEFAULT, 2, 'Liisbet', 'Kuuäär', 'Saluvälja 20, Tallinn', '+372 51 111 88', 'he@toiduapp.ee');
INSERT INTO toidu_app.contact (id, user_id, first_name, last_name, address, mobile_number, email) VALUES (DEFAULT, 3, 'Anna-Bella', 'Ääremaa', 'Kihvti põik 12, Tallinn', '+372 55 000 99', null);
INSERT INTO toidu_app.contact (id, user_id, first_name, last_name, address, mobile_number, email) VALUES (DEFAULT, 4, 'Mattias', 'Üksväli', 'Hotelli 2, Tallinn', '+372 53 789 789', null);

-- DAY_PLAN TABLE CONTENTS
INSERT INTO toidu_app.day_plan (id, date_added, description, user_id) VALUES (DEFAULT, '2022-05-05', 'tänane toiduplaan', 3);
INSERT INTO toidu_app.day_plan (id, date_added, description, user_id) VALUES (DEFAULT, '2022-05-05', 'lisame tänase toiduplaani', 4);

-- TAG TABLE CONTENTS
INSERT INTO toidu_app.tag (id, description) VALUES (DEFAULT, 'supp');
INSERT INTO toidu_app.tag (id, description) VALUES (DEFAULT, 'praad');
INSERT INTO toidu_app.tag (id, description) VALUES (DEFAULT, 'magustoit');
INSERT INTO toidu_app.tag (id, description) VALUES (DEFAULT, 'hommikusöök');
INSERT INTO toidu_app.tag (id, description) VALUES (DEFAULT, 'õhtusöök');
INSERT INTO toidu_app.tag (id, description) VALUES (DEFAULT, 'lõunasöök');
INSERT INTO toidu_app.tag (id, description) VALUES (DEFAULT, 'eine');
INSERT INTO toidu_app.tag (id, description) VALUES (DEFAULT, 'lõunaoode');
INSERT INTO toidu_app.tag (id, description) VALUES (DEFAULT, 'õhtuoode');
INSERT INTO toidu_app.tag (id, description) VALUES (DEFAULT, 'ööoode');


-- INGREDIENT TABLE CONTENTS
INSERT INTO toidu_app.ingredient (id, name, description, energy, carbs, fat, protein) VALUES (DEFAULT, 'Kartul', 'kooreta, toores', 73.0, 16.0, 0.1, 2.0);
INSERT INTO toidu_app.ingredient (id, name, description, energy, carbs, fat, protein) VALUES (DEFAULT, 'Banaan', 'koorega', 67.6, 15.3, 0.2, 0.8);
INSERT INTO toidu_app.ingredient (id, name, description, energy, carbs, fat, protein) VALUES (DEFAULT, 'Piim', '2.5%', 57.8, 5.3, 2.5, 3.3);
INSERT INTO toidu_app.ingredient (id, name, description, energy, carbs, fat, protein) VALUES (DEFAULT, 'Muna', 'toores', 144.0, 0.3, 10.3, 12.5);
INSERT INTO toidu_app.ingredient (id, name, description, energy, carbs, fat, protein) VALUES (DEFAULT, 'Nisujahu', null, 348.0, 69.9, 1.3, 11.9);

-- INGREDIENT_GROUP TABLE CONTENTS
INSERT INTO toidu_app.ingredient_group (id, name) VALUES (DEFAULT, 'Kala');
INSERT INTO toidu_app.ingredient_group (id, name) VALUES (DEFAULT, 'Liha');
INSERT INTO toidu_app.ingredient_group (id, name) VALUES (DEFAULT, 'Piim');
INSERT INTO toidu_app.ingredient_group (id, name) VALUES (DEFAULT, 'Juust');
INSERT INTO toidu_app.ingredient_group (id, name) VALUES (DEFAULT, 'Köögivili');
INSERT INTO toidu_app.ingredient_group (id, name) VALUES (DEFAULT, 'Puuvili');
INSERT INTO toidu_app.ingredient_group (id, name) VALUES (DEFAULT, 'Kuivaine');
INSERT INTO toidu_app.ingredient_group (id, name) VALUES (DEFAULT, 'Toidurasv');
INSERT INTO toidu_app.ingredient_group (id, name) VALUES (DEFAULT, 'Muna');
INSERT INTO toidu_app.ingredient_group (id, name) VALUES (DEFAULT, 'Leib');
INSERT INTO toidu_app.ingredient_group (id, name) VALUES (DEFAULT, 'Jook');

-- INGREDIENT_IN_INGREDIENT_GROUP TABLE CONTENTS
INSERT INTO toidu_app.ingredient_in_ingredient_group (id, ingredient_id, ingredient_group_id) VALUES (DEFAULT, 1, 5);
INSERT INTO toidu_app.ingredient_in_ingredient_group (id, ingredient_id, ingredient_group_id) VALUES (DEFAULT, 2, 6);
INSERT INTO toidu_app.ingredient_in_ingredient_group (id, ingredient_id, ingredient_group_id) VALUES (DEFAULT, 3, 3);
INSERT INTO toidu_app.ingredient_in_ingredient_group (id, ingredient_id, ingredient_group_id) VALUES (DEFAULT, 4, 9);
INSERT INTO toidu_app.ingredient_in_ingredient_group (id, ingredient_id, ingredient_group_id) VALUES (DEFAULT, 5, 7);

-- MEASURE_UNIT TABLE CONTENTS
INSERT INTO toidu_app.measure_unit (id, name) VALUES (DEFAULT, 'g');
INSERT INTO toidu_app.measure_unit (id, name) VALUES (DEFAULT, 'kg');
INSERT INTO toidu_app.measure_unit (id, name) VALUES (DEFAULT, 'tk');
INSERT INTO toidu_app.measure_unit (id, name) VALUES (DEFAULT, 'l');
INSERT INTO toidu_app.measure_unit (id, name) VALUES (DEFAULT, 'ml');

-- RECIPE TABLE CONTENTS
INSERT INTO toidu_app.recipe (id, user_id, name, description, instructions, public_recipe) VALUES (DEFAULT, 3, 'Pankoogid', 'Õhukesed pannkoogid', null, true);

-- RECIPE_TAGS TABLE CONTENTS
INSERT INTO toidu_app.recipe_tags (id, recipe_id, tag_id) VALUES (DEFAULT, 1, 4);
INSERT INTO toidu_app.recipe_tags (id, recipe_id, tag_id) VALUES (DEFAULT, 1, 3);

-- RECIPE_INGREDIENT TABLE CONTENTS
INSERT INTO toidu_app.recipe_ingredient (id, recipe_id, ingredient_id, measure_unit_id, quantity, date_from, date_to) VALUES (DEFAULT, 1, 3, 5, 100.00, '2022-04-28', null);
INSERT INTO toidu_app.recipe_ingredient (id, recipe_id, ingredient_id, measure_unit_id, quantity, date_from, date_to) VALUES (DEFAULT, 1, 4, 3, 3.00, '2022-04-28', null);
INSERT INTO toidu_app.recipe_ingredient (id, recipe_id, ingredient_id, measure_unit_id, quantity, date_from, date_to) VALUES (DEFAULT, 1, 5, 1, 75.00, '2022-04-28', null);

-- ALLOWED_MEASURE_UNIT TABLE CONTENTS
INSERT INTO toidu_app.allowed_measure_unit (id, ingredient_id, measure_unit_id, conversion_multiplier, conversion_description) VALUES (DEFAULT, 3, 5, 1.025, 'teeme piima ml grammideks');
INSERT INTO toidu_app.allowed_measure_unit (id, ingredient_id, measure_unit_id, conversion_multiplier, conversion_description) VALUES (DEFAULT, 3, 4, 1025.000, 'muudame piima liitrid milliliitriteks');
INSERT INTO toidu_app.allowed_measure_unit (id, ingredient_id, measure_unit_id, conversion_multiplier, conversion_description) VALUES (DEFAULT, 4, 3, 60.000, '1 muna on 60 gr.');
INSERT INTO toidu_app.allowed_measure_unit (id, ingredient_id, measure_unit_id, conversion_multiplier, conversion_description) VALUES (DEFAULT, 5, 1, 1.000, 'grammid jahu jaoks');
INSERT INTO toidu_app.allowed_measure_unit (id, ingredient_id, measure_unit_id, conversion_multiplier, conversion_description) VALUES (DEFAULT, 5, 2, 1000.000, 'teeme kg grammideks');
INSERT INTO toidu_app.allowed_measure_unit (id, ingredient_id, measure_unit_id, conversion_multiplier, conversion_description) VALUES (DEFAULT, 1, 1, 1.000, 'kartul grammides');
INSERT INTO toidu_app.allowed_measure_unit (id, ingredient_id, measure_unit_id, conversion_multiplier, conversion_description) VALUES (DEFAULT, 1, 2, 1000.000, 'teeme kartuli kg grammideks');
INSERT INTO toidu_app.allowed_measure_unit (id, ingredient_id, measure_unit_id, conversion_multiplier, conversion_description) VALUES (DEFAULT, 2, 1, 1.000, 'banaan, grammides');
INSERT INTO toidu_app.allowed_measure_unit (id, ingredient_id, measure_unit_id, conversion_multiplier, conversion_description) VALUES (DEFAULT, 2, 2, 1000.000, 'banaan, kilodes');
INSERT INTO toidu_app.allowed_measure_unit (id, ingredient_id, measure_unit_id, conversion_multiplier, conversion_description) VALUES (DEFAULT, 2, 3, 118.000, 'ühe banaani kaal');
