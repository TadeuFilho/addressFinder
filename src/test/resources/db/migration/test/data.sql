CREATE TABLE customer (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(255),
                          email VARCHAR(255),
                          phone VARCHAR(50),
                          address_id BIGINT
);

CREATE TABLE address (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         street VARCHAR(255),
                         city VARCHAR(255),
                         state VARCHAR(100),
                         zip VARCHAR(20)
);

-- Reiniciar AUTO_INCREMENT no H2
ALTER TABLE customer ALTER COLUMN id RESTART WITH 1;
ALTER TABLE address ALTER COLUMN id RESTART WITH 1;

INSERT INTO address (id, street, city, state, zip) VALUES
                                                       (1, '123 Cherry Lane', 'Springfield', 'IL', '62701'),
                                                       (2, '456 Maple Ave', 'Lincoln', 'NE', '68508'),
                                                       (3, '789 Oak Blvd', 'Madison', 'WI', '53703');

INSERT INTO customer (id, name, email, phone, address_id) VALUES
                                                              (1, 'Mike Portnoy', 'mike.portnoy@example.com', '555-1234', 1),
                                                              (2, 'John Petrucci', 'john.petrucci@example.com', '555-5678', 2),
                                                              (3, 'Jordan Rudess', 'jordan.rudess@example.com', '555-8765', 3);