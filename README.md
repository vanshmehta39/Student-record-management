# Student Records

A web-based Student Record Management System built with Spring Boot, MySQL, and vanilla JavaScript. The application provides a focused administrator interface for maintaining student information, monitoring academic performance, and generating basic reports.

## Features

- Student registration, viewing, editing, and deletion
- Server-side and client-side validation
- Search by name, email, department, or course
- Student ID lookup using a custom Java Binary Search Tree (BST)
- BST search-path and visited-node details for DSA demonstration
- Department, year, and status filters with sorting
- Dashboard with student totals, average attendance, average CGPA, recent registrations, and department distribution
- Low-attendance report and CSV export
- MySQL persistence with an automatically generated student ID and unique email constraint
- Responsive administrator interface with a local login screen
- Fictional sample records seeded into an empty database for demonstration

## Technology Stack

| Layer | Technology |
|---|---|
| Frontend | HTML5, CSS3, Vanilla JavaScript |
| Backend | Java, Spring Boot, Spring Web, Spring Data JPA |
| Database | MySQL 8+ |
| Build Tool | Maven |
| Data Structures | Custom Binary Search Tree and `ArrayList` |

## Project Structure

```text
src/main/java/com/meridian/
├── dsa/                 # Custom StudentBST implementation
├── report/              # Dashboard and reporting API
└── student/             # Entity, repository, service, and controller

src/main/resources/
├── static/              # Frontend files
├── application.properties
└── data.sql             # Fictional starter records

database/
└── schema.sql           # MySQL schema

docs/                    # Project, DSA, database, API, and viva documentation
```

## Prerequisites

- Java 21 or later
- Maven 3.9 or later
- MySQL 8 or later

## Installation and Setup

### 1. Start MySQL

Ensure that your local MySQL server is running. The application uses a database named `student_management_db`.

You may create it manually by running [database/schema.sql](database/schema.sql) in MySQL Workbench, or allow Spring Boot to create it automatically if the configured MySQL user has permission.

### 2. Configure database credentials

Set the credentials as environment variables before starting the application.

```powershell
$env:DB_USERNAME="root"
$env:DB_PASSWORD="your_mysql_password"
```

Optional connection URL override:

```powershell
$env:DB_URL="jdbc:mysql://localhost:3306/student_management_db?useSSL=false&serverTimezone=UTC"
```

### 3. Run the application

```powershell
mvn spring-boot:run
```

Open [http://localhost:8080](http://localhost:8080) in a browser.

The local login screen is presentation-only; enter any valid email address and password to continue.

## API Overview

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/students` | List students with optional filters and sorting |
| POST | `/api/students` | Create a student record |
| GET | `/api/students/{id}` | Get one student |
| PUT | `/api/students/{id}` | Update a student record |
| DELETE | `/api/students/{id}` | Delete a student record |
| GET | `/api/students/search-by-id/{id}` | Search through the custom BST |
| GET | `/api/dashboard/stats` | Dashboard statistics |
| GET | `/api/reports/department-distribution` | Department-wise counts |
| GET | `/api/reports/low-attendance?threshold=75` | Students below an attendance threshold |

See [docs/API_REFERENCE.md](docs/API_REFERENCE.md) for additional details.

## Data Structures

`StudentBST` is a manually implemented, unbalanced Binary Search Tree keyed by student ID. It supports insertion, search, deletion, inorder traversal, and rebuild from database records. Numeric ID searches from the website use this structure and return actual search metrics.

`ArrayList<Student>` is used for record iteration, filtering, sorting, dashboard calculations, and report generation.

| Operation | Complexity |
|---|---|
| BST search / insert / delete | Average O(log n), worst-case O(n) |
| BST inorder traversal | O(n) |
| ArrayList index access | O(1) |
| ArrayList search / middle removal | O(n) |
| ArrayList append | Amortized O(1) |
| Sorting | Typically O(n log n) |

## Documentation

- [Project Overview](docs/PROJECT_OVERVIEW.md)
- [DSA Explanation](docs/DSA_EXPLANATION.md)
- [Database Schema](docs/DATABASE_SCHEMA.md)
- [API Reference](docs/API_REFERENCE.md)
- [Viva Questions](docs/VIVA_QUESTIONS.md)

## Troubleshooting

- **`Communications link failure`**: Confirm MySQL is running and listening on port 3306.
- **`Access denied`**: Check `DB_USERNAME`, `DB_PASSWORD`, and database permissions.
- **Port already in use**: Set another port before starting the application, for example: `$env:PORT="8081"`.
- **Stop the application**: Press `Ctrl + C` in the terminal.

## License

This project is intended for educational use.
