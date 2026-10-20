INSERT INTO students (full_name,email,phone_number,gender,date_of_birth,department,course,academic_year,semester,enrollment_date,attendance_percentage,cgpa,status,created_at)
SELECT 'Aarav Mehta','aarav.mehta@example.edu','9876543210','Male','2004-08-14','Computer Science','B.Tech CSE','Third Year',5,'2024-08-01',91.00,8.72,'ACTIVE',CURRENT_TIMESTAMP
WHERE NOT EXISTS (SELECT 1 FROM students WHERE email='aarav.mehta@example.edu');
INSERT INTO students (full_name,email,phone_number,gender,date_of_birth,department,course,academic_year,semester,enrollment_date,attendance_percentage,cgpa,status,created_at)
SELECT 'Ishita Sharma','ishita.sharma@example.edu','9876543211','Female','2005-02-19','Electronics','B.Tech ECE','Second Year',3,'2025-08-01',87.00,8.36,'ACTIVE',CURRENT_TIMESTAMP
WHERE NOT EXISTS (SELECT 1 FROM students WHERE email='ishita.sharma@example.edu');
INSERT INTO students (full_name,email,phone_number,gender,date_of_birth,department,course,academic_year,semester,enrollment_date,attendance_percentage,cgpa,status,created_at)
SELECT 'Kabir Singh','kabir.singh@example.edu','9876543212','Male','2004-11-03','Business Administration','BBA','Third Year',5,'2024-08-01',68.00,7.94,'ACTIVE',CURRENT_TIMESTAMP
WHERE NOT EXISTS (SELECT 1 FROM students WHERE email='kabir.singh@example.edu');
INSERT INTO students (full_name,email,phone_number,gender,date_of_birth,department,course,academic_year,semester,enrollment_date,attendance_percentage,cgpa,status,created_at)
SELECT 'Ananya Iyer','ananya.iyer@example.edu','9876543213','Female','2003-06-25','Computer Science','B.Tech CSE','Fourth Year',7,'2023-08-01',95.00,9.12,'ACTIVE',CURRENT_TIMESTAMP
WHERE NOT EXISTS (SELECT 1 FROM students WHERE email='ananya.iyer@example.edu');
INSERT INTO students (full_name,email,phone_number,gender,date_of_birth,department,course,academic_year,semester,enrollment_date,attendance_percentage,cgpa,status,created_at)
SELECT 'Rohan Kapoor','rohan.kapoor@example.edu','9876543214','Male','2005-09-10','Mechanical Engineering','B.Tech ME','Second Year',3,'2025-08-01',72.00,7.68,'ACTIVE',CURRENT_TIMESTAMP
WHERE NOT EXISTS (SELECT 1 FROM students WHERE email='rohan.kapoor@example.edu');
INSERT INTO students (full_name,email,phone_number,gender,date_of_birth,department,course,academic_year,semester,enrollment_date,attendance_percentage,cgpa,status,created_at)
SELECT 'Meera Nair','meera.nair@example.edu','9876543215','Female','2004-04-17','Liberal Arts','BA Psychology','Third Year',5,'2024-08-01',89.00,8.48,'ACTIVE',CURRENT_TIMESTAMP
WHERE NOT EXISTS (SELECT 1 FROM students WHERE email='meera.nair@example.edu');
INSERT INTO students (full_name,email,phone_number,gender,date_of_birth,department,course,academic_year,semester,enrollment_date,attendance_percentage,cgpa,status,created_at)
SELECT 'Dev Patel','dev.patel@example.edu','9876543216','Male','2003-12-29','Electronics','B.Tech ECE','Fourth Year',7,'2023-08-01',77.00,8.01,'ACTIVE',CURRENT_TIMESTAMP
WHERE NOT EXISTS (SELECT 1 FROM students WHERE email='dev.patel@example.edu');
INSERT INTO students (full_name,email,phone_number,gender,date_of_birth,department,course,academic_year,semester,enrollment_date,attendance_percentage,cgpa,status,created_at)
SELECT 'Zoya Khan','zoya.khan@example.edu','9876543217','Female','2005-01-08','Business Administration','BBA','Second Year',3,'2025-08-01',82.00,8.21,'ACTIVE',CURRENT_TIMESTAMP
WHERE NOT EXISTS (SELECT 1 FROM students WHERE email='zoya.khan@example.edu');
