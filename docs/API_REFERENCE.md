# API reference

| Method | Endpoint | Purpose |
|---|---|---|
| GET | `/api/students` | List/filter (`q`, `department`, `year`, `status`, `sort`) |
| POST | `/api/students` | Create validated student |
| GET/PUT/DELETE | `/api/students/{id}` | Read, update, delete |
| GET | `/api/students/search-by-id/{id}` | Custom BST search with metrics |
| GET | `/api/dashboard/stats` | Totals and averages |
| GET | `/api/reports/department-distribution` | Department counts |
| GET | `/api/reports/status-distribution` | Status counts |
| GET | `/api/reports/low-attendance?threshold=75` | Alert list |

POST/PUT accept a JSON Student body with all required form fields. Validation errors return HTTP 400 as `{ "error": "..." }`; absent records return 404.
