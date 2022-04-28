INSERT INTO toidu_app.role (name) VALUES ('admin');
INSERT INTO toidu_app.role (name) VALUES ('user');

INSERT INTO toidu_app.users (username, password) VALUES ('karli', 'karli123');
INSERT INTO toidu_app.users (username, password) VALUES ('henri', 'henri123');
INSERT INTO toidu_app.users (username, password) VALUES ('jaan', 'jaan123');
INSERT INTO toidu_app.users (username, password) VALUES ('rain', 'rain123');

INSERT INTO toidu_app.user_role (id, users_id, role_id) VALUES (DEFAULT, 1, 1);
INSERT INTO toidu_app.user_role (id, users_id, role_id) VALUES (DEFAULT, 1, 2);
INSERT INTO toidu_app.user_role (id, users_id, role_id) VALUES (DEFAULT, 2, 1);
INSERT INTO toidu_app.user_role (id, users_id, role_id) VALUES (DEFAULT, 2, 2);
INSERT INTO toidu_app.user_role (id, users_id, role_id) VALUES (DEFAULT, 3, 1);
INSERT INTO toidu_app.user_role (id, users_id, role_id) VALUES (DEFAULT, 3, 2);
INSERT INTO toidu_app.user_role (id, users_id, role_id) VALUES (DEFAULT, 4, 1);
INSERT INTO toidu_app.user_role (id, users_id, role_id) VALUES (DEFAULT, 4, 2);

INSERT INTO toidu_app.contact (id, users_id, first_name, last_name, address, mobile_number, email) VALUES (DEFAULT, 1, 'Karli ', 'Kullasepp', 'Kullasepa 10, Tallinn', '+372 50 222 33', 'kk@toiduapp.ee');
INSERT INTO toidu_app.contact (id, users_id, first_name, last_name, address, mobile_number, email) VALUES (DEFAULT, 2, 'Henri', 'Eessalu', 'Saluvälja 20, Tallinn', '+372 51 111 88', 'he@toiduapp.ee');
INSERT INTO toidu_app.contact (id, users_id, first_name, last_name, address, mobile_number, email) VALUES (DEFAULT, 3, 'Jaan', 'Mürk', 'Kihvti põik 12, Tallinn', '+372 55 000 99', null);
INSERT INTO toidu_app.contact (id, users_id, first_name, last_name, address, mobile_number, email) VALUES (DEFAULT, 4, 'Rain', 'Külaline', 'Hotelli 2, Tallinn', '+372 53 789 789', null);

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

INSERT INTO toidu_app.measure_unit (id, name) VALUES (DEFAULT, 'kg');
INSERT INTO toidu_app.measure_unit (id, name) VALUES (DEFAULT, 'tk');
INSERT INTO toidu_app.measure_unit (id, name) VALUES (DEFAULT, 'l');
INSERT INTO toidu_app.measure_unit (id, name) VALUES (DEFAULT, 'ml');