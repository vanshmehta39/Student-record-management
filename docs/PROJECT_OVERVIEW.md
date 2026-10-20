# Project overview

Meridian is a local administrator portal for creating, viewing, filtering, editing, deleting, reporting on, and exporting student records. Spring Boot exposes the REST API and serves the vanilla HTML/CSS/JS frontend. MySQL is the permanent source of truth. On startup, `StudentService` loads records into an ArrayList and custom BST. Every successful database mutation then updates both in-memory structures.

Scope deliberately excludes authentication and deployment so the project remains reliable for a classroom demo.
