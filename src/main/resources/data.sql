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