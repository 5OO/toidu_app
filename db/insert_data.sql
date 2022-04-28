
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