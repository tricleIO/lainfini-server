INSERT INTO faq (question, answer) VALUES ('How can I comment on a BBC programme or service?', 'We appreciate ');
INSERT INTO faq (question, answer)VALUES ('Where can I obtain my radio or key code, or a new key for my Ford?', 'Firstly, ');

INSERT INTO category (id, name, parent_category_id, priority) VALUES (1, 'Scarves', NULL, 1);
INSERT INTO category (id, name, parent_category_id, priority) VALUES (2, 'Silk', 1, 1);
INSERT INTO category (id, name, parent_category_id, priority) VALUES (3, 'Cotton', 1, 1);

INSERT INTO category (name, parent_category_id, priority) VALUES ('Bestselling', NULL, 1);
INSERT INTO category (name, parent_category_id, priority) VALUES ('Discounts', NULL, 1);

INSERT INTO currency (name, symbol, symbol_placement) VALUES ('CZK', 'Kč', 1);
INSERT INTO currency (name, symbol, symbol_placement) VALUES ('USB', '$', 1);
INSERT INTO currency (name, symbol, symbol_placement) VALUES ('EUR', '€', 1);

INSERT INTO flash (message, title, `type`)VALUES ('This product may require professional installation', 'Professional is needed', 'WARNING');
INSERT INTO flash (message, title, `type`) VALUES ('Goods is used', 'Used', 'WARNING');

INSERT INTO `size` (name) VALUES ('S');
INSERT INTO `size` (name) VALUES ('M');
INSERT INTO `size` (name) VALUES ('L');
INSERT INTO `size` (name) VALUES ('XL');
INSERT INTO `size` (name) VALUES ('XXL');

INSERT INTO unit (abbr, name) VALUES ('mm', 'milimeter');
INSERT INTO unit (abbr, name) VALUES ('cm', 'centimeter');
INSERT INTO unit (abbr, name) VALUES ('m', 'meter');
INSERT INTO unit (abbr, name) VALUES ('g', 'gram');

INSERT INTO material (name) VALUES ('Cotton');
INSERT INTO material (name) VALUES ('Silk');
INSERT INTO material (name) VALUES ('Natural');

INSERT INTO address (city, country, house_number, postal_code, state, street)VALUES ('Praha', 'Czechia', '987', '77984', 'Czechia', 'Polabinská');
INSERT INTO address (city, country, house_number, postal_code, state, street)VALUES ('Brno', 'Czechia', '451689'  , '77984', 'Czechia', 'Polabinská');


INSERT INTO `role` (id, role_name) VALUES (1, 'ADMIN');
INSERT INTO `role` (id, role_name) VALUES (2, 'CUSTOMER');

INSERT INTO customer (id, degree_after_name, degree_before_name, first_name, last_name, locale, login, password, phone_code, phone_number, sex, status, currency_id)VALUES (0x66353763616364612D303935612D3131, 'PhD', 'Ing', 'Michal', 'Novák', 'CZECH', '1','$2a$10$ClApxW.jQ.ZhtDzsNB.yeunMPnrA.QiKkjwMEsfPqU5hRtuR2HUwW', '+420','987654987', 'M', 'ACTIVE', 1);
INSERT INTO customer (id, degree_after_name, degree_before_name, first_name, last_name, locale, login, password, phone_code, phone_number, sex, status, currency_id)VALUES (0x66353763616364612D303935612D3130, '', '', 'Petra', 'Andělová', 'CZECH', '2','$2a$10$ClApxW.jQ.ZhtDzsNB.yeunMPnrA.QiKkjwMEsfPqU5hRtuR2HUwW', '+420','555666888', 'F', 'ACTIVE', 1);

INSERT INTO user_role (user_id, role_id) VALUES (0x66353763616364612D303935612D3131, 1);
INSERT INTO user_role (user_id, role_id) VALUES (0x66353763616364612D303935612D3130, 2);

INSERT INTO product (id, status, description, ean, name, price, short_description, url_slug, category_id, material_id, size_id, unit_id)VALUES (0x66353763616364612D303935612D3131, 0, 'Logitech Marathon Mouse M720 Triathlon long descrition','15616515', 'Logitech Marathon Mouse M720 Triathlon', 1899.0,'Mouse Wireless, Optical, 1000 dpi, battery life of up to 2 years,1 AA battery, can be paired with up to 3 computers simultaneously, nano Unifying USB receiver','logitech-marathon-mouse-m720-triathlon-d4460766',1, 1, 1, 1);
INSERT INTO product (id, status, description, ean, name, price, short_description, url_slug, category_id, material_id, size_id, unit_id)VALUES (0xCF03CE9A7BE24201BF006B4C4CE6232E, 0, 'Dell E1234 long description','2221', 'Dell E1234', 59999.0,'Short description','dell-e51234-new',1, 1, 1, 1);
INSERT INTO product (id, status, description, ean, name, price, short_description, url_slug, category_id, material_id, size_id, unit_id)VALUES (0xCF03CE9A7BE24201BF006B4C4CE623F5, 0, 'With the advent of Batman LEGO Movie comes a new range of its kits, which will resemble characters and scenes from the film. Discover the world of all those superheroes with LEGO Batman Movie! The kit is suitable for children aged 8 to 14 years, and besides, it provides an endless source of entertainment, it helps to develop creativity, fantasy and imagination.','787989', 'LEGO Batmobile', 59999.0,'Building Kit 581 pieces, the recommended age 8-14 years','lego-batmobile',2, 1, 1, 1);


INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (1,'F','Obrázek1.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE623F5,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (2,'F','Obrázek2.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE6232E,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (3,'F','Obrázek3.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE62331,'image/png','2017-03-16 11:08:01');

INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (4,'F','batmobile1.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE62364,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (5,'F','batmobile2.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE62366,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (6,'F','batmobile3.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE6236E,'image/png','2017-03-16 11:08:01');

INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (1,1,0x66353763616364612D303935612D3131);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (3,2,0x66353763616364612D303935612D3131);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (2,3,0x66353763616364612D303935612D3131);

INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (0,3,0xCF03CE9A7BE24201BF006B4C4CE623F5);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (1,4,0xCF03CE9A7BE24201BF006B4C4CE623F5);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (3,5,0xCF03CE9A7BE24201BF006B4C4CE623F5);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (5,6,0xCF03CE9A7BE24201BF006B4C4CE623F5);

INSERT INTO file_collection (id,description,title,url_slug) VALUES (1,'New collection for year 2017','Collection 2017','collection-2017');
INSERT INTO file_collection (id,description,title,url_slug) VALUES (2,'Sales description','Sales 2017','sales-2017');

INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (5,1,1);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (2,2,1);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,3,1);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (3,4,1);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (4,5,1);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,1,2);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (2,6,2);

INSERT INTO product_collection (id, name,url_slug) VALUES (1,'new year eve collection 2017','new_year_eve_collection_2017');
INSERT INTO product_collection (id, name,url_slug) VALUES (2,'best toys ever','best_toys_ever');
INSERT INTO product_collection (id, name,url_slug) VALUES (3,'hallowen wishes','hallowen_wishes');

INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (1, 0x66353763616364612D303935612D3131,1);
INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (2, 0xCF03CE9A7BE24201BF006B4C4CE6232E,1);
INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (1, 0x66353763616364612D303935612D3131,2);
INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (2, 0xCF03CE9A7BE24201BF006B4C4CE6232E,2);
INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (3, 0xCF03CE9A7BE24201BF006B4C4CE623F5,2);
INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (2, 0x66353763616364612D303935612D3131,3);
INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (3, 0xCF03CE9A7BE24201BF006B4C4CE6232E,3);
INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (1, 0xCF03CE9A7BE24201BF006B4C4CE623F5,3);
