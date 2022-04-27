INSERT INTO toidu_app.role (id, name) VALUES (1, 'admin');
INSERT INTO toidu_app.role (id, name) VALUES (2, 'user');

INSERT INTO toidu_app.users (id, username, password) VALUES (1, 'karli', 'karli123');
INSERT INTO toidu_app.users (id, username, password) VALUES (2, 'henri', 'henri123');
INSERT INTO toidu_app.users (id, username, password) VALUES (3, 'jaan', 'jaan123');
INSERT INTO toidu_app.users (id, username, password) VALUES (4, 'rain', 'rain123');

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

