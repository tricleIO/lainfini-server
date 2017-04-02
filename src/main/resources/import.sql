INSERT INTO faq (question, answer) VALUES ('How can I comment on a BBC programme or service?', 'We appreciate ');
INSERT INTO faq (question, answer)VALUES ('Where can I obtain my radio or key code, or a new key for my Ford?', 'Firstly, ');

INSERT INTO complaint_reason (name) VALUES ('DEFECT');

INSERT INTO category (id, name, parent_category_id, priority) VALUES (1, 'Scarves', NULL, 1);
INSERT INTO category (id, name, parent_category_id, priority) VALUES (2, 'Shawl', 1, 1);

INSERT INTO category (id, name, parent_category_id, priority) VALUES (3,'Bestselling', NULL, 1);
INSERT INTO category (id, name, parent_category_id, priority) VALUES (4, 'Discounts', NULL, 1);

INSERT INTO currency (id, name, symbol, symbol_placement) VALUES (1, 'CZK', 'Kč', 1);
INSERT INTO currency (id, name, symbol, symbol_placement) VALUES (2, 'USD', '$', 1);
INSERT INTO currency (id, name, symbol, symbol_placement) VALUES (3, 'EUR', '€', 1);

INSERT INTO flash (message, title, type) VALUES ('This product may require professional installation', 'Professional is needed', 'WARNING');
INSERT INTO flash (message, title, type) VALUES ('Goods is used', 'Used', 'WARNING');

INSERT INTO size (id, value) VALUES (1,'90x90 cm');
INSERT INTO size (id, value) VALUES (2,'180x70 cm');

-- INSERT INTO unit (abbr, name) VALUES ('mm', 'milimeter');
-- INSERT INTO unit (abbr, name) VALUES ('cm', 'centimeter');
-- INSERT INTO unit (abbr, name) VALUES ('m', 'meter');
-- INSERT INTO unit (abbr, name) VALUES ('g', 'gram');
INSERT INTO unit (id, abbr, name) VALUES (1, 'pcs', 'pieces');

INSERT INTO material (id, name, composition, slug) VALUES (1,'Twill', '100% Silk', 'twill');
INSERT INTO material (id, name, composition, slug) VALUES (2, 'Satin', '100% Silk', 'satin');
INSERT INTO material (id, name, composition, slug) VALUES (3, 'Triora', '70% Silk 30% Wool', 'triora');

INSERT INTO role (id, role_name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO role (id, role_name) VALUES (2, 'ROLE_CUSTOMER');

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
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (13,'F','13.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE62322,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (14,'F','14.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE62222,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (15,'F','15.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE63221,'image/png','2017-03-16 11:08:01');

INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (16,'F','16.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE6A1A1,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (17,'F','17.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE6A1A2,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (18,'F','18.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE6A1A3,'image/png','2017-03-16 11:08:01');

INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (19,'F','19.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE6A1A4,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (20,'F','20.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE6A1A5,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (21,'F','21.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE6B1A1,'image/png','2017-03-16 11:08:01');

INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (22,'F','22.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE6B1A2,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (23,'F','23.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE6B1A3,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (24,'F','24.png','UPLOADED',0xCF03CE9A7BE24201BF006B4C4CE6B1A4,'image/png','2017-03-16 11:08:01');

INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (25,'F','25.png','UPLOADED',0x0103CE9A7BE24201BF006B4C4CE6B1A2,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (26,'F','26.png','UPLOADED',0x0203CE9A7BE24201BF006B4C4CE6B1A3,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (27,'F','27.png','UPLOADED',0x0303CE9A7BE24201BF006B4C4CE6B1A4,'image/png','2017-03-16 11:08:01');

INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (28,'F','28.png','UPLOADED',0x0403CE9A7BE24201BF006B4C4CE6B1A2,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (29,'F','29.png','UPLOADED',0x0503CE9A7BE24201BF006B4C4CE6B1A3,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (30,'F','30.png','UPLOADED',0x0603CE9A7BE24201BF006B4C4CE6B1A4,'image/png','2017-03-16 11:08:01');

INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (31,'F','31.png','UPLOADED',0x0703CE9A7BE24201BF006B4C4CE6B1A2,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (32,'F','32.png','UPLOADED',0x0803CE9A7BE24201BF006B4C4CE6B1A3,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (33,'F','33.png','UPLOADED',0x0903CE9A7BE24201BF006B4C4CE6B1A4,'image/png','2017-03-16 11:08:01');

INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (34,'F','34.png','UPLOADED',0x1003CE9A7BE24201BF006B4C4CE6B1A2,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (35,'F','35.png','UPLOADED',0x1103CE9A7BE24201BF006B4C4CE6B1A3,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (36,'F','36.png','UPLOADED',0x1203CE9A7BE24201BF006B4C4CE6B1A4,'image/png','2017-03-16 11:08:01');

INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (37,'F','37.png','UPLOADED',0x1303CE9A7BE24201BF006B4C4CE6B1A2,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (38,'F','38.png','UPLOADED',0x1403CE9A7BE24201BF006B4C4CE6B1A3,'image/png','2017-03-16 11:08:01');

INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (39,'F','39.png','UPLOADED',0x1503CE9A7BE24201BF006B4C4CE6B1A4,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (40,'F','40.png','UPLOADED',0x1603CE9A7BE24201BF006B4C4CE6B1A4,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (41,'F','41.png','UPLOADED',0x1703CE9A7BE24201BF006B4C4CE6B1A4,'image/png','2017-03-16 11:08:01');

INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (42,'F','42.png','UPLOADED',0x1803CE9A7BE24201BF006B4C4CE6B1A4,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (43,'F','43.png','UPLOADED',0x1903CE9A7BE24201BF006B4C4CE6B1A4,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (44,'F','44.png','UPLOADED',0x2003CE9A7BE24201BF006B4C4CE6B1A4,'image/png','2017-03-16 11:08:01');

INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (45,'F','45.png','UPLOADED',0x2103CE9A7BE24201BF006B4C4CE6B1A4,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (46,'F','46.png','UPLOADED',0x2203CE9A7BE24201BF006B4C4CE6B1A4,'image/png','2017-03-16 11:08:01');

INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (47,'F','47.png','UPLOADED',0x2303CE9A7BE24201BF006B4C4CE6B1A4,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (48,'F','48.png','UPLOADED',0x2403CE9A7BE24201BF006B4C4CE6B1A4,'image/png','2017-03-16 11:08:01');

INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (49,'F','49.png','UPLOADED',0x104EDA8D0F3F4F33A5C3706C55A248C5,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (50,'F','50.png','UPLOADED',0x114EDA8D0F3F4F33A5C3706C55A248C5,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (51,'F','51.png','UPLOADED',0x124EDA8D0F3F4F33A5C3706C55A248C5,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (52,'F','52.png','UPLOADED',0x134EDA8D0F3F4F33A5C3706C55A248C5,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (53,'F','53.png','UPLOADED',0x144EDA8D0F3F4F33A5C3706C55A248C5,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (54,'F','54.png','UPLOADED',0x154EDA8D0F3F4F33A5C3706C55A248C5,'image/png','2017-03-16 11:08:01');

INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (55,'F','55.png','UPLOADED',0x115E361C9F0947CDA93AE0E34A2B23FB,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (56,'F','56.png','UPLOADED',0x125E361C9F0947CDA93AE0E34A2B23FB,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (57,'F','57.png','UPLOADED',0x135E361C9F0947CDA93AE0E34A2B23FB,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (58,'F','58.png','UPLOADED',0x145E361C9F0947CDA93AE0E34A2B23FB,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (59,'F','59.png','UPLOADED',0x155E361C9F0947CDA93AE0E34A2B23FB,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (60,'F','60.png','UPLOADED',0x165E361C9F0947CDA93AE0E34A2B23FB,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (61,'F','61.png','UPLOADED',0xA15E361C9F0947CDA93AE0E34A2B23FB,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (62,'F','62.png','UPLOADED',0xA25E361C9F0947CDA93AE0E34A2B23FB,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (63,'F','63.png','UPLOADED',0xA35E361C9F0947CDA93AE0E34A2B23FB,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (64,'F','64.png','UPLOADED',0xA45E361C9F0947CDA93AE0E34A2B23FB,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (65,'F','65.png','UPLOADED',0xA55E361C9F0947CDA93AE0E34A2B23FB,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (66,'F','66.png','UPLOADED',0xA65E361C9F0947CDA93AE0E34A2B23FB,'image/png','2017-03-16 11:08:01');
INSERT INTO base_file (id, dtype,file_name,file_status,file_index,mime_type,valid_from)  VALUES (67,'F','67.png','UPLOADED',0xA75E361C9F0947CDA93AE0E34A2B23FB,'image/png','2017-03-16 11:08:01');

INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0x66353763616364612D303935612D3131, 0, 'ST012010101_17001015', 'BUTTERFLY SCARF', 795, 'butterfly-scarf', 1, 3, 1, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0xCF03CE9A7BE24201BF006B4C4CE623F5, 0, 'ST012010103_17002015', 'PLAY OF BLUE SCARF', 795, 'play-of-blue-scarf', 1, 6, 1, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0xFA800FA1F9A24BCAB53B3736B67E0C1F, 0, 'SS012010104_17003015', 'MOONBOW', 795, 'moonbow', 1, 1, 2, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0x004EDA8D0F3F4F33A5C3706C55A248C5, 0, 'ST012010105_17004015', 'SHIFT ROUND', 795, 'shift-round', 1, 5, 1, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0xCA0B32B2F0694B74A17E74AFAC3DCDF5, 0, 'ST012010105_17005015', 'SHIFT SQUARES', 795, 'shift-squares', 1, 7, 1, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0xBF5E361C9F0947CDA93AE0E34A2B23FB, 0, 'ST012010105_17006015', 'SHIFT BORDER', 795, 'shift-border', 1, 13, 1, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0xDE33C69DF2BD43BFB5E27B648C0E056B, 0, 'SS012010106_17007015', 'CERTAINTY RED', 795, 'certainty-red', 1, 2, 2, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0x6ACf72A1D9B5462ABB90D05D6A87D61C, 0, 'ST012010106_17008015', 'CERTAINTY YELLOW', 795, 'certainty-yellow', 1, 4, 1, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0x1D470BBF8E654CAC852B9A02E04F45FF, 0, 'ST012010106_17009015', 'CERTAINTY BLUE', 795, 'certainty-blue', 1, 15, 1, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0x2D947E4844AD439E8C71B11A106D6B81, 0, 'ST012010107_17010015', 'MOVEMENT', 795, 'movement', 1, 14, 1, 1, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0x8EA1D8FD01DB4982AEEC30EBCDE88843, 0, 'MT012020201_17011012', 'BUTTERFLY SHAWL', 995, 'butterfly-shawl', 2, 10, 3, 2, 1, 0);
INSERT INTO product (id, status, code, name, price, slug, category_id, main_image_id, material_id, size_id, unit_id, product_status) VALUES (0x991DC5AB44744538849059A613EECC70, 0, 'MT012020203_17012012', 'PLAY OF BLUE SHAWL', 995, 'play-of-blue-shawl', 2, 11, 3, 2, 1, 0);


INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (1,16,0xBF5E361C9F0947CDA93AE0E34A2B23FB);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (2,17,0xBF5E361C9F0947CDA93AE0E34A2B23FB);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (3,18,0xBF5E361C9F0947CDA93AE0E34A2B23FB);

INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (1,19,0x2D947E4844AD439E8C71B11A106D6B81);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (2,20,0x2D947E4844AD439E8C71B11A106D6B81);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (3,21,0x2D947E4844AD439E8C71B11A106D6B81);

INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (1,22,0x1D470BBF8E654CAC852B9A02E04F45FF);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (2,23,0x1D470BBF8E654CAC852B9A02E04F45FF);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (3,24,0x1D470BBF8E654CAC852B9A02E04F45FF);

INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (1,25,0xFA800FA1F9A24BCAB53B3736B67E0C1F);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (2,26,0xFA800FA1F9A24BCAB53B3736B67E0C1F);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (3,27,0xFA800FA1F9A24BCAB53B3736B67E0C1F);

INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (1,28,0xDE33C69DF2BD43BFB5E27B648C0E056B);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (2,29,0xDE33C69DF2BD43BFB5E27B648C0E056B);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (3,30,0xDE33C69DF2BD43BFB5E27B648C0E056B);

INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (1,31,0x66353763616364612D303935612D3131);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (2,32,0x66353763616364612D303935612D3131);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (3,33,0x66353763616364612D303935612D3131);

INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (1,34,0x6ACf72A1D9B5462ABB90D05D6A87D61C);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (2,35,0x6ACf72A1D9B5462ABB90D05D6A87D61C);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (3,36,0x6ACf72A1D9B5462ABB90D05D6A87D61C);

INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (1,37,0x004EDA8D0F3F4F33A5C3706C55A248C5);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (2,38,0x004EDA8D0F3F4F33A5C3706C55A248C5);

INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (1,39,0xCF03CE9A7BE24201BF006B4C4CE623F5);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (2,40,0xCF03CE9A7BE24201BF006B4C4CE623F5);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (3,41,0xCF03CE9A7BE24201BF006B4C4CE623F5);

INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (1,42,0xCA0B32B2F0694B74A17E74AFAC3DCDF5);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (2,43,0xCA0B32B2F0694B74A17E74AFAC3DCDF5);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (3,44,0xCA0B32B2F0694B74A17E74AFAC3DCDF5);

INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (1,45,0x8EA1D8FD01DB4982AEEC30EBCDE88843);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (2,46,0x8EA1D8FD01DB4982AEEC30EBCDE88843);

INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (1,47,0x991DC5AB44744538849059A613EECC70);
INSERT INTO product_has_file (sequence_number,file_id,product_id) VALUES (2,48,0x991DC5AB44744538849059A613EECC70);


INSERT INTO file_collection (id,description,title,url_slug, valid_from) VALUES (1,'New collection for year 2017','Collection 2017','collection-2017','2017-01-01');
INSERT INTO file_collection (id,description,title,url_slug, valid_from, valid_to) VALUES (2,'Sales description','Sales 2017','sales-2017', '2017-01-01', '2018-01-01');
INSERT INTO file_collection (id,description,title,url_slug, valid_from) VALUES (3,'Carousel 2017','Carousel 2017','carousel-2017', '2017-01-01');
INSERT INTO file_collection (id,description,title,url_slug, valid_from) VALUES (4,'Mirka works','Mirka works','mirka-works', '2017-01-01');
INSERT INTO file_collection (id,description,title,url_slug, valid_from) VALUES (5,'Mirka carousel','Mirka carousel','mirka-carousel', '2017-01-01');

INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (5,1,1);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (2,2,1);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,3,1);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (3,4,1);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (4,5,1);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,1,2);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (2,6,2);

INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,49,3);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (2,50,3);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (3,51,3);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (4,52,3);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (5,53,3);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (6,54,3);

INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,56,4);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,57,4);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,58,4);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,59,4);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,60,4);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,61,4);

INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,62,5);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,63,5);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,64,5);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,65,5);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,66,5);
INSERT INTO file_collection_has_file (sequence_number,file_id,collection_id) VALUES (1,67,5);



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

INSERT INTO shipping_region (id, code, name) VALUES (1, 'NA', 'North America');

INSERT INTO carrier (id, name, slug, tracking_endpoint, logo_image_id) VALUES (1, 'DHL', 'dhl', 'www.track-it.com/dhl', NULL);

INSERT INTO shipping_tariff (id, code, name, slug, carrier_id, price, currency_id, icon_image_id) VALUES (1, 'EABC', 'DHL Express', 'dhl-express', 1, 130, 2, NULL);

INSERT INTO country (id, code, name) VALUES (1, 'US', 'USA');
INSERT INTO country (id, code, name) VALUES (2, 'CAN', 'Canada');

INSERT INTO region_country (region_id, country_id) VALUES (1, 1);
INSERT INTO region_country (region_id, country_id) VALUES (1, 2);

INSERT INTO shipping_availability (id, shipping_region_id, shipping_tariff_id) VALUES (1, 1, 1);

-- INSERT INTO delivery (id, name) VALUES (1, 'DHL');
-- INSERT INTO payment_method (id, name) VALUES (1, 'CARD');

INSERT INTO delivery (id, tracking_number, shipping_tariff_id) VALUES (1, 'AES_34', 1);

INSERT INTO customer_order (id, created_at, status, billing_address_id, cart_id, customer_id, delivery_address_id, delivery_id, shipping_region_id, payment_method) VALUES (0x3C1DCA6C1B9A48BAAD1AC7231B4607EE, '2017-03-21 13:20:29', 1, NULL, 0xF888EE4007D94A08B6D3A3F7F2F1CC6D, 0x66353763616364612D303935612D3130, 2, 1, 1, 1);
--
-- INSERT INTO order_item (added_at, price, quantity, order_id, product_id) VALUES ('2017-03-21 13:16:24', 995, 2, 0x3C1DCA6C1B9A48BAAD1AC7231B4607EE, 0x991DC5AB44744538849059A613EECC70);
-- INSERT INTO order_item (added_at, price, quantity, order_id, product_id) VALUES ('2017-03-21 13:15:45', 795, 1, 0x3C1DCA6C1B9A48BAAD1AC7231B4607EE, 0x004EDA8D0F3F4F33A5C3706C55A248C5);

INSERT INTO complaint (id, created_at, message, type, customer_id, order_id, product_id, reason_id) VALUES (0x86573AC0E3164E4F9143D5FD6DD7E891, '2017-03-21 13:08:16', 'It is not i wanted.', 1, 0x66353763616364612D303935612D3130, 0x3C1DCA6C1B9A48BAAD1AC7231B4607EE, 0x991DC5AB44744538849059A613EECC70, 1);

