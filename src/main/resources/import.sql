INSERT INTO faq (question, answer) VALUES ('How can I comment on a BBC programme or service?', 'We appreciate ');
INSERT INTO faq (question, answer)VALUES ('Where can I obtain my radio or key code, or a new key for my Ford?', 'Firstly, ');

INSERT INTO complaint_reason (name) VALUES ('DEFECT');

INSERT INTO category (id, name, parent_category_id, priority) VALUES (1, 'Scarves', NULL, 1);
INSERT INTO category (id, name, parent_category_id, priority) VALUES (2, 'Shawl', 1, 1);

INSERT INTO category (name, parent_category_id, priority) VALUES ('Bestselling', NULL, 1);
INSERT INTO category (name, parent_category_id, priority) VALUES ('Discounts', NULL, 1);

INSERT INTO currency (name, symbol, symbol_placement) VALUES ('CZK', 'Kč', 1);
INSERT INTO currency (name, symbol, symbol_placement) VALUES ('USD', '$', 1);
INSERT INTO currency (name, symbol, symbol_placement) VALUES ('EUR', '€', 1);

INSERT INTO flash (message, title, `type`) VALUES ('This product may require professional installation', 'Professional is needed', 'WARNING');
INSERT INTO flash (message, title, `type`) VALUES ('Goods is used', 'Used', 'WARNING');

INSERT INTO `size` (value) VALUES ('90x90 cm');
INSERT INTO `size` (value) VALUES ('180x70 cm');
INSERT INTO `size` (value) VALUES ('S');
INSERT INTO `size` (value) VALUES ('M');
INSERT INTO `size` (value) VALUES ('L');
INSERT INTO `size` (value) VALUES ('XL');
INSERT INTO `size` (value) VALUES ('XXL');

-- INSERT INTO unit (abbr, name) VALUES ('mm', 'milimeter');
-- INSERT INTO unit (abbr, name) VALUES ('cm', 'centimeter');
-- INSERT INTO unit (abbr, name) VALUES ('m', 'meter');
-- INSERT INTO unit (abbr, name) VALUES ('g', 'gram');
INSERT INTO unit (abbr, name) VALUES ('pcs', 'pieces');

INSERT INTO material (name, composition, slug) VALUES ('Twill', '100% Silk', 'twill');
INSERT INTO material (name, composition, slug) VALUES ('Satin', '100% Silk', 'satin');
INSERT INTO material (name, composition, slug) VALUES ('Triora', '70% Silk 30% Wool', 'triora');

INSERT INTO `role` (id, role_name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO `role` (id, role_name) VALUES (2, 'ROLE_CUSTOMER');

INSERT INTO customer (id, degree_after_name, degree_before_name, first_name, last_name, locale, email, password, phone_code, phone_number, sex, status, currency_id, register_status) VALUES (0x66353763616364612D303935612D3131, 'PhD', 'Ing', 'Michal', 'Novák', 'CZECH', '1','$2a$10$ClApxW.jQ.ZhtDzsNB.yeunMPnrA.QiKkjwMEsfPqU5hRtuR2HUwW', '+420','987654987', 'M', 'ACTIVE', 1, 0);
INSERT INTO customer (id, degree_after_name, degree_before_name, first_name, last_name, locale, email, password, phone_code, phone_number, sex, status, currency_id, register_status) VALUES (0x66353763616364612D303935612D3130, '', '', 'Petra', 'Andělová', 'CZECH', '2','$2a$10$ClApxW.jQ.ZhtDzsNB.yeunMPnrA.QiKkjwMEsfPqU5hRtuR2HUwW', '+420','555666888', 'F', 'ACTIVE', 1, 0);
INSERT INTO customer (id, degree_after_name, degree_before_name, first_name, last_name, locale, email, password, phone_code, phone_number, sex, status, currency_id, register_status) VALUES (0x66353763616364612D303935612D3113, '', '', 'Milan', 'Předregistrovaný', 'CZECH', '3','$2a$10$ClApxW.jQ.ZhtDzsNB.yeunMPnrA.QiKkjwMEsfPqU5hRtuR2HUwW', '+420','555666888', 'F', 'ACTIVE', 1, 1);

INSERT INTO customer_email_verification_token (id,expiry_date,verification_token,customer_id) VALUES (1,'2020-03-03 20:20:20','1',0x66353763616364612D303935612D3113);

INSERT INTO address (city, country, house_number, postal_code, state, street, customer_id) VALUES ('Praha', 'Czechia', '987', '77984', 'Czechia', 'Polabinská', 0x66353763616364612D303935612D3131);
INSERT INTO address (city, country, house_number, postal_code, state, street, customer_id) VALUES ('Brno', 'Czechia', '451689'  , '77984', 'Czechia', 'Polabinská', 0x66353763616364612D303935612D3130);

INSERT INTO user_role (user_id, role_id) VALUES (0x66353763616364612D303935612D3131, 1);
INSERT INTO user_role (user_id, role_id) VALUES (0x66353763616364612D303935612D3130, 2);

INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (1,'F','1.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE623F5,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (2,'F','2.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE6232E,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (3,'F','3.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE62331,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (4,'F','4.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE62364,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (5,'F','5.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE62366,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (6,'F','6.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE6236E,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (7,'F','7.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE6F56E,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (8,'F','8.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE6F5F5,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (9,'F','9.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE66E6E,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (10,'F','10.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE62323,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (11,'F','11.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE60323,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (12,'F','12.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE62303,'image/png','2017-03-16 11:08:01');

INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0x66353763616364612D303935612D3131, 0, 'ST012010101_17001015', 'BUTTERFLY SCARF', 795, 'butterfly-scarf', 1, 1, 1, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0xCF03CE9A7BE24201BF006B4C4CE623F5, 0, 'ST012010103_17002015', 'PLAY OF BLUE SCARF', 795, 'play-of-blue-scarf', 1, 2, 1, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0xFA800FA1F9A24BCAB53B3736B67E0C1F, 0, 'SS012010104_17003015', 'MOONBOW', 795, 'moonbow', 1, 3, 2, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0x004EDA8D0F3F4F33A5C3706C55A248C5, 0, 'ST012010105_17004015', 'SHIFT ROUND', 795, 'shift-round', 1, 4, 1, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0xCA0B32B2F0694B74A17E74AFAC3DCDF5, 0, 'ST012010105_17005015', 'SHIFT SQUARES', 795, 'shift-squares', 1, 5, 1, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0xBF5E361C9F0947CDA93AE0E34A2B23FB, 0, 'ST012010105_17006015', 'SHIFT BORDER', 795, 'shift-border', 1, 6, 1, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0xDE33C69DF2BD43BFB5E27B648C0E056B, 0, 'SS012010106_17007015', 'CERTAINTY RED', 795, 'certainty-red', 1, 7, 2, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0x6ACf72A1D9B5462ABB90D05D6A87D61C, 0, 'ST012010106_17008015', 'CERTAINTY YELLOW', 795, 'certainty-yellow', 1, 8, 1, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0x1D470BBF8E654CAC852B9A02E04F45FF, 0, 'ST012010106_17009015', 'CERTAINTY BLUE', 795, 'certainty-blue', 1, 9, 1, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0x2D947E4844AD439E8C71B11A106D6B81, 0, 'ST012010107_17010015', 'MOVEMENT', 795, 'movement', 1, 10, 1, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0x8EA1D8FD01DB4982AEEC30EBCDE88843, 0, 'MT012020201_17011012', 'BUTTERFLY SHAWL', 995, 'butterfly-shawl', 2, 11, 3, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0x991DC5AB44744538849059A613EECC70, 0, 'MT012020203_17012012', 'PLAY OF BLUE SHAWL', 995, 'play-of-blue-shawl', 2, 12, 3, 1, 1, 0);



INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (1,1,0x66353763616364612D303935612D3131);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (3,2,0x66353763616364612D303935612D3131);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (2,3,0x66353763616364612D303935612D3131);

INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (0,3,0xCF03CE9A7BE24201BF006B4C4CE623F5);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (1,4,0xCF03CE9A7BE24201BF006B4C4CE623F5);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (3,5,0xCF03CE9A7BE24201BF006B4C4CE623F5);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (5,6,0xCF03CE9A7BE24201BF006B4C4CE623F5);

INSERT INTO file_collection (id,description,title,url_slug, valid_from) VALUES (1,'New collection for year 2017','Collection 2017','collection-2017','2017-01-01');
INSERT INTO file_collection (id,description,title,url_slug, valid_from, valid_to) VALUES (2,'Sales description','Sales 2017','sales-2017', '2017-01-01', '2018-01-01');

INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (5,1,1);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (2,2,1);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,3,1);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (3,4,1);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (4,5,1);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,1,2);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (2,6,2);

INSERT INTO product_collection (id, name, slug) VALUES (1,'New Arrivals','new-arrivals');
-- INSERT INTO product_collection (id, name,slug) VALUES (2,'best toys ever','best_toys_ever');
-- INSERT INTO product_collection (id, name,slug) VALUES (3,'hallowen wishes','hallowen_wishes');

INSERT INTO product_collection_item (position, product_id, product_collection_id) VALUES (1, 0x66353763616364612D303935612D3131,1);
INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (2, 0x004EDA8D0F3F4F33A5C3706C55A248C5,1);
INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (3, 0x6ACf72A1D9B5462ABB90D05D6A87D61C,1);
INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (4, 0x991DC5AB44744538849059A613EECC70,1);
INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (5, 0x1D470BBF8E654CAC852B9A02E04F45FF,1);
-- INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (2, 0xCF03CE9A7BE24201BF006B4C4CE6232E,1);
-- INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (1, 0x66353763616364612D303935612D3131,2);
-- INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (2, 0xCF03CE9A7BE24201BF006B4C4CE6232E,2);
-- INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (3, 0xCF03CE9A7BE24201BF006B4C4CE623F5,2);
-- INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (2, 0x66353763616364612D303935612D3131,3);
-- INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (3, 0xCF03CE9A7BE24201BF006B4C4CE6232E,3);
-- INSERT INTO product_collection_item (position, product_id,product_collection_id) VALUES (1, 0xCF03CE9A7BE24201BF006B4C4CE623F5,3);

INSERT INTO cart (id, created_at, created_from, status, customer_id) VALUES (0xF888EE4007D94A08B6D3A3F7F2F1CC6D, '2017-03-21 13:14:52', NULL, 1, 0x66353763616364612D303935612D3130);

INSERT INTO cart_item (added_at, quantity, cart_id, product_id) VALUES ('2017-03-21 13:15:45', 1, 0xF888EE4007D94A08B6D3A3F7F2F1CC6D, 0x004EDA8D0F3F4F33A5C3706C55A248C5);
INSERT INTO cart_item (added_at, quantity, cart_id, product_id) VALUES ('2017-03-21 13:16:24', 2, 0xF888EE4007D94A08B6D3A3F7F2F1CC6D, 0x991DC5AB44744538849059A613EECC70);

INSERT INTO delivery (id, name) VALUES (1, 'DHL');
INSERT INTO payment_method (id, name) VALUES (1, 'CARD');

INSERT INTO customer_order (id, created_at, status, billing_address_id, cart_id, customer_id, delivery_address_id, delivery_id, payment_id) VALUES (0x3C1DCA6C1B9A48BAAD1AC7231B4607EE, '2017-03-21 13:20:29', 1, NULL, 0xF888EE4007D94A08B6D3A3F7F2F1CC6D, 0x66353763616364612D303935612D3130, 2, 1, 1);

INSERT INTO order_item (added_at, price, quantity, order_id, product_id) VALUES ('2017-03-21 13:16:24', 995, 2, 0x3C1DCA6C1B9A48BAAD1AC7231B4607EE, 0x991DC5AB44744538849059A613EECC70);
INSERT INTO order_item (added_at, price, quantity, order_id, product_id) VALUES ('2017-03-21 13:15:45', 795, 1, 0x3C1DCA6C1B9A48BAAD1AC7231B4607EE, 0x004EDA8D0F3F4F33A5C3706C55A248C5);

INSERT INTO complaint (id, created_at, message, type, customer_id, order_id, product_id, reason_id) VALUES (0x86573AC0E3164E4F9143D5FD6DD7E891, '2017-03-21 13:08:16', 'It is not i wanted.', 1, 0x66353763616364612D303935612D3130, 0x3C1DCA6C1B9A48BAAD1AC7231B4607EE, 0x991DC5AB44744538849059A613EECC70, 1);

