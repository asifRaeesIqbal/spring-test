DROP TABLE IF EXISTS greeting;
 
CREATE TABLE greeting (
  id INT PRIMARY KEY,
  greeting VARCHAR(250) DEFAULT NULL
);

INSERT INTO Greeting (id, greeting) VALUES (1, 'hello');