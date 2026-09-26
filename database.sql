CREATE DATABASE IF NOT EXISTS employee_db;
USE employee_db;

CREATE TABLE IF NOT EXISTS employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    department VARCHAR(100),
    salary DOUBLE
);

-- Optional sample data:
INSERT INTO employees (name, email, department, salary)
VALUES ('Nilesh Jadhav', 'nilesh@example.com', 'IT', 45000);
