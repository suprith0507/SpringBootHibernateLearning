INSERT INTO watches
(brand,model,collection,reference_number,price,currency,discount_percentage,case_diameter,case_thickness,lug_width,weight,case_material,bezel_material,strap_material,crystal_material,movement_type,caliber,power_reserve,dial_color,dial_type,water_resistance,created_date,updated_date)
VALUES
    ('Rolex','Submariner','Professional','RLX001',12500.00,'USD',5.00,41.0,12.5,21.0,155.0,'Steel','Ceramic','Steel','Sapphire','Automatic','3235',70,'Black','Analog',300,NOW(),NOW()),
    ('Rolex','Datejust','Classic','RLX002',10500.00,'USD',4.00,41.0,11.7,20.0,145.0,'Steel','Steel','Steel','Sapphire','Automatic','3235',70,'Blue','Analog',100,NOW(),NOW()),
    ('Rolex','Day-Date','Classic','RLX003',22000.00,'USD',3.00,40.0,12.0,20.0,160.0,'Gold','Gold','Gold','Sapphire','Automatic','3255',70,'Gold','Analog',100,NOW(),NOW()),
    ('Rolex','GMT-Master II','Professional','RLX004',15500.00,'USD',2.00,40.0,12.1,20.0,150.0,'Steel','Ceramic','Steel','Sapphire','Automatic','3285',70,'Black','Analog',100,NOW(),NOW()),
    ('Rolex','Explorer','Professional','RLX005',8500.00,'USD',6.00,36.0,11.5,19.0,130.0,'Steel','Steel','Steel','Sapphire','Automatic','3230',70,'Black','Analog',100,NOW(),NOW()),

    ('Omega','Seamaster Diver 300M','Seamaster','OMG001',6500.00,'USD',10.00,42.0,13.5,20.0,190.0,'Steel','Ceramic','Steel','Sapphire','Automatic','8800',55,'Blue','Analog',300,NOW(),NOW()),
    ('Omega','Speedmaster Moonwatch','Speedmaster','OMG002',7200.00,'USD',5.00,42.0,13.2,20.0,180.0,'Steel','Steel','Steel','Sapphire','Manual','3861',50,'Black','Chronograph',50,NOW(),NOW()),
    ('Omega','Constellation','Constellation','OMG003',5800.00,'USD',7.00,39.0,12.0,20.0,165.0,'Steel','Steel','Steel','Sapphire','Automatic','8900',60,'Silver','Analog',50,NOW(),NOW()),
    ('Omega','Aqua Terra','Seamaster','OMG004',6100.00,'USD',8.00,41.0,13.0,20.0,170.0,'Steel','Steel','Steel','Sapphire','Automatic','8900',60,'Green','Analog',150,NOW(),NOW()),
    ('Omega','Planet Ocean','Seamaster','OMG005',8500.00,'USD',4.50,43.5,14.0,21.0,205.0,'Steel','Ceramic','Steel','Sapphire','Automatic','8900',60,'Black','Analog',600,NOW(),NOW()),

    ('Casio','GA2100','G-Shock','CAS001',99.99,'USD',15.00,45.4,11.8,24.0,51.0,'Resin','Resin','Resin','Mineral','Quartz','5611',NULL,'Black','Digital',200,NOW(),NOW()),
    ('Casio','DW5600','G-Shock','CAS002',85.00,'USD',12.00,42.8,13.4,24.0,55.0,'Resin','Resin','Resin','Mineral','Quartz','3229',NULL,'Black','Digital',200,NOW(),NOW()),
    ('Casio','Mudmaster','G-Shock','CAS003',320.00,'USD',5.00,53.0,18.0,26.0,120.0,'Resin','Steel','Resin','Sapphire','Quartz','5678',NULL,'Green','Digital',200,NOW(),NOW()),
    ('Casio','Rangeman','G-Shock','CAS004',450.00,'USD',6.00,55.0,18.2,26.0,115.0,'Resin','Steel','Resin','Sapphire','Solar','9400',NULL,'Black','Digital',200,NOW(),NOW()),
    ('Casio','Edifice','Edifice','CAS005',220.00,'USD',8.00,44.0,12.0,22.0,155.0,'Steel','Steel','Steel','Mineral','Quartz','ECB900',NULL,'Blue','Chronograph',100,NOW(),NOW()),

    ('Seiko','Prospex Diver','Prospex','SEK001',950.00,'USD',8.50,40.5,13.2,20.0,170.0,'Steel','Steel','Silicone','Hardlex','Automatic','6R35',70,'Green','Analog',200,NOW(),NOW()),
    ('Seiko','Alpinist','Prospex','SEK002',875.00,'USD',7.00,39.5,13.0,20.0,155.0,'Steel','Steel','Leather','Sapphire','Automatic','6R35',70,'Green','Analog',200,NOW(),NOW()),
    ('Seiko','Turtle','Prospex','SEK003',650.00,'USD',10.00,45.0,14.0,22.0,180.0,'Steel','Steel','Rubber','Hardlex','Automatic','4R36',41,'Black','Analog',200,NOW(),NOW()),
    ('Seiko','Samurai','Prospex','SEK004',550.00,'USD',9.00,43.8,13.4,22.0,175.0,'Steel','Steel','Steel','Hardlex','Automatic','4R35',41,'Blue','Analog',200,NOW(),NOW()),
    ('Seiko','Presage Cocktail','Presage','SEK005',495.00,'USD',6.00,40.5,11.8,20.0,145.0,'Steel','Steel','Leather','Hardlex','Automatic','4R35',41,'Blue','Analog',50,NOW(),NOW());



INSERT INTO product_table
(id, product_price, created_date, updated_date, product_name)
VALUES
    (1, 999.99,  '2026-11-01 10:00:00', '2026-11-01 10:00:00', 'Laptop'),
    (2, 499.50,  '2026-11-02 11:15:00', '2026-11-02 11:15:00', 'Monitor'),
    (3, 79.99,   '2026-11-03 09:30:00', '2026-11-03 09:30:00', 'Keyboard'),
    (4, 39.99,   '2026-11-04 14:20:00', '2026-11-04 14:20:00', 'Mouse'),
    (5, 129.99,  '2026-11-05 16:45:00', '2026-11-05 16:45:00', 'Headphones');

-- =========================================
-- AADHAR_CARD_ENTITY
-- =========================================

INSERT INTO aadhar_card_entity(aadhar_id,aadhar_number,address,city,state) VALUES (1,'123456789001','MG Road','Bangalore','Karnataka');
INSERT INTO aadhar_card_entity(aadhar_id,aadhar_number,address,city,state) VALUES (2,'123456789002','BTM Layout','Bangalore','Karnataka');
INSERT INTO aadhar_card_entity(aadhar_id,aadhar_number,address,city,state) VALUES (3,'123456789003','Jubilee Hills','Hyderabad','Telangana');
INSERT INTO aadhar_card_entity(aadhar_id,aadhar_number,address,city,state) VALUES (4,'123456789004','Anna Nagar','Chennai','Tamil Nadu');
INSERT INTO aadhar_card_entity(aadhar_id,aadhar_number,address,city,state) VALUES (5,'123456789005','Sector 21','Delhi','Delhi');
INSERT INTO aadhar_card_entity(aadhar_id,aadhar_number,address,city,state) VALUES (6,'123456789006','Baner','Pune','Maharashtra');
INSERT INTO aadhar_card_entity(aadhar_id,aadhar_number,address,city,state) VALUES (7,'123456789007','Kukatpally','Hyderabad','Telangana');
INSERT INTO aadhar_card_entity(aadhar_id,aadhar_number,address,city,state) VALUES (8,'123456789008','Indiranagar','Bangalore','Karnataka');
INSERT INTO aadhar_card_entity(aadhar_id,aadhar_number,address,city,state) VALUES (9,'123456789009','Whitefield','Bangalore','Karnataka');
INSERT INTO aadhar_card_entity(aadhar_id,aadhar_number,address,city,state) VALUES (10,'123456789010','Madhapur','Hyderabad','Telangana');

-- =========================================
-- PATIENT_ENTITY
-- =========================================

INSERT INTO patient_entity(patient_id,patient_name,age,gender,mobile_number,aadhar_id) VALUES (1,'Rohan Sharma',32,'Male','9876543210',1);
INSERT INTO patient_entity(patient_id,patient_name,age,gender,mobile_number,aadhar_id) VALUES (2,'Priya Reddy',28,'Female','9876543211',2);
INSERT INTO patient_entity(patient_id,patient_name,age,gender,mobile_number,aadhar_id) VALUES (3,'Arjun Kumar',45,'Male','9876543212',3);
INSERT INTO patient_entity(patient_id,patient_name,age,gender,mobile_number,aadhar_id) VALUES (4,'Sneha Patel',35,'Female','9876543213',4);
INSERT INTO patient_entity(patient_id,patient_name,age,gender,mobile_number,aadhar_id) VALUES (5,'Rahul Verma',40,'Male','9876543214',5);
INSERT INTO patient_entity(patient_id,patient_name,age,gender,mobile_number,aadhar_id) VALUES (6,'Meera Singh',30,'Female','9876543215',6);
INSERT INTO patient_entity(patient_id,patient_name,age,gender,mobile_number,aadhar_id) VALUES (7,'Kiran Rao',55,'Male','9876543216',7);
INSERT INTO patient_entity(patient_id,patient_name,age,gender,mobile_number,aadhar_id) VALUES (8,'Anjali Gupta',26,'Female','9876543217',8);
INSERT INTO patient_entity(patient_id,patient_name,age,gender,mobile_number,aadhar_id) VALUES (9,'Vikram Joshi',48,'Male','9876543218',9);
INSERT INTO patient_entity(patient_id,patient_name,age,gender,mobile_number,aadhar_id) VALUES (10,'Pooja Nair',38,'Female','9876543219',10);

-- =========================================
-- DEPARTMENT_ENTITY
-- =========================================

INSERT INTO department_entity(department_id,department_name,location,block_name,department_code) VALUES (1,'Cardiology','Block-A','A1','CARD');
INSERT INTO department_entity(department_id,department_name,location,block_name,department_code) VALUES (2,'Neurology','Block-B','B1','NEUR');
INSERT INTO department_entity(department_id,department_name,location,block_name,department_code) VALUES (3,'Orthopedics','Block-C','C1','ORTH');
INSERT INTO department_entity(department_id,department_name,location,block_name,department_code) VALUES (4,'Dermatology','Block-D','D1','DERM');
INSERT INTO department_entity(department_id,department_name,location,block_name,department_code) VALUES (5,'ENT','Block-E','E1','ENT');
INSERT INTO department_entity(department_id,department_name,location,block_name,department_code) VALUES (6,'Pediatrics','Block-F','F1','PED');
INSERT INTO department_entity(department_id,department_name,location,block_name,department_code) VALUES (7,'Oncology','Block-G','G1','ONCO');
INSERT INTO department_entity(department_id,department_name,location,block_name,department_code) VALUES (8,'Radiology','Block-H','H1','RAD');
INSERT INTO department_entity(department_id,department_name,location,block_name,department_code) VALUES (9,'Emergency','Block-I','I1','EMER');
INSERT INTO department_entity(department_id,department_name,location,block_name,department_code) VALUES (10,'General Medicine','Block-J','J1','GMED');

-- =========================================
-- DOCTOR_ENTITY
-- =========================================

INSERT INTO doctor_entity(doctor_id,doctor_name,specialization,experience,mobile_number) VALUES (1,'Dr. Amit Sharma',12,'9000000001','Cardiology');
INSERT INTO doctor_entity(doctor_id,doctor_name,specialization,experience,mobile_number) VALUES (2,'Dr. Neha Rao',10,'9000000002','Neurology');
INSERT INTO doctor_entity(doctor_id,doctor_name,specialization,experience,mobile_number) VALUES (3,'Dr. Karthik Reddy',15,'9000000003','Orthopedics');
INSERT INTO doctor_entity(doctor_id,doctor_name,specialization,experience,mobile_number) VALUES (4,'Dr. Priya Singh',8,'9000000004','Dermatology');
INSERT INTO doctor_entity(doctor_id,doctor_name,specialization,experience,mobile_number) VALUES (5,'Dr. Vikram Patel',11,'9000000005','ENT');
INSERT INTO doctor_entity(doctor_id,doctor_name,specialization,experience,mobile_number) VALUES (6,'Dr. Ananya Gupta',9,'9000000006','Pediatrics');
INSERT INTO doctor_entity(doctor_id,doctor_name,specialization,experience,mobile_number) VALUES (7,'Dr. Arjun Mehta',13,'9000000007','Oncology');
INSERT INTO doctor_entity(doctor_id,doctor_name,specialization,experience,mobile_number) VALUES (8,'Dr. Rakesh Kumar',14,'9000000008','Radiology');
INSERT INTO doctor_entity(doctor_id,doctor_name,specialization,experience,mobile_number) VALUES (9,'Dr. Swetha Nair',7,'9000000009','Emergency');
INSERT INTO doctor_entity(doctor_id,doctor_name,specialization,experience,mobile_number) VALUES (10,'Dr. Rahul Verma',16,'9000000010','General Medicine');

-- =========================================
-- DOCTOR_DEPARTMENT
-- =========================================

INSERT INTO doctor_department(doctor_id,department_id) VALUES (1,1);
INSERT INTO doctor_department(doctor_id,department_id) VALUES (1,9);

INSERT INTO doctor_department(doctor_id,department_id) VALUES (2,2);
INSERT INTO doctor_department(doctor_id,department_id) VALUES (2,10);

INSERT INTO doctor_department(doctor_id,department_id) VALUES (3,3);
INSERT INTO doctor_department(doctor_id,department_id) VALUES (3,9);

INSERT INTO doctor_department(doctor_id,department_id) VALUES (4,4);
INSERT INTO doctor_department(doctor_id,department_id) VALUES (4,10);

INSERT INTO doctor_department(doctor_id,department_id) VALUES (5,5);
INSERT INTO doctor_department(doctor_id,department_id) VALUES (5,9);

INSERT INTO doctor_department(doctor_id,department_id) VALUES (6,6);
INSERT INTO doctor_department(doctor_id,department_id) VALUES (6,10);

INSERT INTO doctor_department(doctor_id,department_id) VALUES (7,7);
INSERT INTO doctor_department(doctor_id,department_id) VALUES (7,9);

INSERT INTO doctor_department(doctor_id,department_id) VALUES (8,8);
INSERT INTO doctor_department(doctor_id,department_id) VALUES (8,10);

INSERT INTO doctor_department(doctor_id,department_id) VALUES (9,9);
INSERT INTO doctor_department(doctor_id,department_id) VALUES (9,1);

INSERT INTO doctor_department(doctor_id,department_id) VALUES (10,10);
INSERT INTO doctor_department(doctor_id,department_id) VALUES (10,2);

-- =========================================
-- APPOINTMENT_ENTITY
-- =========================================

INSERT INTO appointment_entity(appointment_id,appointment_date,appointment_time,status,consultation_fee,patient_id) VALUES (1,'2026-12-01','10:00','CONFIRMED',500,1);
INSERT INTO appointment_entity(appointment_id,appointment_date,appointment_time,status,consultation_fee,patient_id) VALUES (2,'2026-12-01','11:00','CONFIRMED',550,1);
INSERT INTO appointment_entity(appointment_id,appointment_date,appointment_time,status,consultation_fee,patient_id) VALUES (3,'2026-12-02','09:30','CONFIRMED',600,2);
INSERT INTO appointment_entity(appointment_id,appointment_date,appointment_time,status,consultation_fee,patient_id) VALUES (4,'2026-12-03','12:00','PENDING',700,3);
INSERT INTO appointment_entity(appointment_id,appointment_date,appointment_time,status,consultation_fee,patient_id) VALUES (5,'2026-12-05','03:00','CONFIRMED',700,3);
INSERT INTO appointment_entity(appointment_id,appointment_date,appointment_time,status,consultation_fee,patient_id) VALUES (6,'2026-12-04','10:00','CONFIRMED',450,4);
INSERT INTO appointment_entity(appointment_id,appointment_date,appointment_time,status,consultation_fee,patient_id) VALUES (7,'2026-12-04','04:00','PENDING',550,5);
INSERT INTO appointment_entity(appointment_id,appointment_date,appointment_time,status,consultation_fee,patient_id) VALUES (8,'2026-12-06','02:00','CONFIRMED',500,6);
INSERT INTO appointment_entity(appointment_id,appointment_date,appointment_time,status,consultation_fee,patient_id) VALUES (9,'2026-12-07','11:00','CONFIRMED',650,7);
INSERT INTO appointment_entity(appointment_id,appointment_date,appointment_time,status,consultation_fee,patient_id) VALUES (10,'2026-12-08','05:00','CONFIRMED',800,8);
INSERT INTO appointment_entity(appointment_id,appointment_date,appointment_time,status,consultation_fee,patient_id) VALUES (11,'2026-12-09','10:30','PENDING',550,9);
INSERT INTO appointment_entity(appointment_id,appointment_date,appointment_time,status,consultation_fee,patient_id) VALUES (12,'2026-12-10','09:00','CONFIRMED',600,10);