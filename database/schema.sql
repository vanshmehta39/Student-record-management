CREATE DATABASE IF NOT EXISTS student_management_db;
USE student_management_db;
CREATE TABLE IF NOT EXISTS students (
  id BIGINT AUTO_INCREMENT PRIMARY KEY, full_name VARCHAR(255) NOT NULL, email VARCHAR(255) NOT NULL UNIQUE,
  phone_number VARCHAR(20) NOT NULL, gender VARCHAR(30), date_of_birth DATE NOT NULL, department VARCHAR(120) NOT NULL,
  course VARCHAR(120) NOT NULL, academic_year VARCHAR(30) NOT NULL, semester INT NOT NULL, enrollment_date DATE NOT NULL,
  attendance_percentage DECIMAL(5,2) NOT NULL, cgpa DECIMAL(3,2) NOT NULL, status VARCHAR(20) NOT NULL,
  created_at DATETIME NOT NULL
);
