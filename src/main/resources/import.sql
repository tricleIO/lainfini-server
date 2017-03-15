INSERT INTO faq (question, answer) VALUES ('How can I comment on a BBC programme or service?', 'We appreciate ');

INSERT INTO faq (question, answer)VALUES ('Where can I obtain my radio or key code, or a new key for my Ford?', 'Firstly, ');

INSERT INTO category (id, name, parent_id, priority) VALUES (1, 'Scarves', NULL, 1);
INSERT INTO category (id, name, parent_id, priority) VALUES (2, 'Silk', 1, 1);
INSERT INTO category (id, name, parent_id, priority) VALUES (3, 'Cotton', 1, 1);

INSERT INTO category (name, parent_id, priority) VALUES ('Bestselling', NULL, 1);
INSERT INTO category (name, parent_id, priority) VALUES ('Discounts', NULL, 1);

INSERT INTO currency (name, symbol, symbol_placement) VALUES ('CZK', 'Kč', 2);
INSERT INTO currency (name, symbol, symbol_placement) VALUES ('USB', '$', 2);
INSERT INTO currency (name, symbol, symbol_placement) VALUES ('EUR', '€', 2);


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

INSERT INTO product (id, status, description, ean, name, price, short_description, url_slug, category_id, material_id, size_id, unit_id)VALUES (0x66353763616364612D303935612D3131, 1, 'Logitech Marathon Mouse M720 Triathlon','15616515', 'Logitech Marathon Mouse M720 Triathlon', 1899.0,'Mouse Wireless, Optical, 1000 dpi, battery life of up to 2 years,1 AA battery, can be paired with up to 3 computers simultaneously, nano Unifying USB receiver','logitech-marathon-mouse-m720-triathlon-d4460766',1, 1, 1, 1);

INSERT INTO address (city, country, house_number, postal_code, state, street)VALUES ('Praha', 'Czechia', '987', '77984', 'Czechia', 'Polabinská');
INSERT INTO address (city, country, house_number, postal_code, state, street)VALUES ('Brno', 'Czechia', '451689'  , '77984', 'Czechia', 'Polabinská');


INSERT INTO `role` (id, role_name)VALUES (1, 'ADMIN');
INSERT INTO `role` (id, role_name)VALUES (2, 'CUSTOMER');

INSERT INTO customer (id, degree_after_name, degree_before_name, first_name, last_name, locale, login, password, phone_code, phone_number, sex, status, currency_id)VALUES (0x66353763616364612D303935612D3131, 'PhD', 'Ing', 'Michal', 'Novák', 'CZECH', '1','$2a$10$ClApxW.jQ.ZhtDzsNB.yeunMPnrA.QiKkjwMEsfPqU5hRtuR2HUwW', '+420','987654987', 'M', 'ACTIVE', 1);
INSERT INTO customer (id, degree_after_name, degree_before_name, first_name, last_name, locale, login, password, phone_code, phone_number, sex, status, currency_id)VALUES (0x66353763616364612D303935612D3130, '', '', 'Petra', 'Andělová', 'CZECH', '2','$2a$10$ClApxW.jQ.ZhtDzsNB.yeunMPnrA.QiKkjwMEsfPqU5hRtuR2HUwW', '+420','555666888', 'F', 'ACTIVE', 2);


