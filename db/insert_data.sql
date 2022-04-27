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

INSERT INTO toidu_app.recipe (id, users_id, name, description, instructions, public_recipe) VALUES (DEFAULT, 3, 'Pankoogid', 'Õhukesed pannkoogid', null, true);

INSERT INTO toidu_app.recipe_tags (id, recipe_id, tag_id) VALUES (DEFAULT, 1, 4);
INSERT INTO toidu_app.recipe_tags (id, recipe_id, tag_id) VALUES (DEFAULT, 1, 3);

INSERT INTO toidu_app.measure_unit (id, name) VALUES (DEFAULT, 'kg');
INSERT INTO toidu_app.measure_unit (id, name) VALUES (DEFAULT, 'tk');
INSERT INTO toidu_app.measure_unit (id, name) VALUES (DEFAULT, 'l');
INSERT INTO toidu_app.measure_unit (id, name) VALUES (DEFAULT, 'ml');