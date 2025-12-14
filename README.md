# 🍬 Sweet Shop Management System

This repository contains the backend implementation of a **Sweet Shop Management System** developed using **Spring Boot** as part of the **AI Kata Assignment**.

The project demonstrates authentication, CRUD operations, security configuration, and proper Git usage with AI assistance disclosure.

---

## 📌 Project Objective

To build a backend system that allows:
- User registration and login with secure password handling
- Managing sweets (Add, View, Update, Delete)
- Secure access using Spring Security
- Version control using Git with meaningful commits

---

## 🛠 Technology Stack

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- H2 In-Memory Database
- Maven
- Git & GitHub

---

## 🚀 Features Implemented

### 🔐 Authentication
- User Registration API
- User Login API
- Password encryption using **BCryptPasswordEncoder**

### 🍭 Sweet Management (CRUD)
- Add Sweet
- View All Sweets
- Update Sweet
- Delete Sweet

### 🗄 Database
- H2 In-Memory Database
- H2 Console enabled for verification

---

## ▶️ How to Run the Project

### 1️⃣ Clone Repository
2️⃣ Run Application
.\mvnw spring-boot:run


Application runs on:

http://localhost:8081

🔐 API Endpoints
User Registration
POST /api/auth/register

{
  "email": "test@gmail.com",
  "password": "123456"
}

User Login
POST /api/auth/login

{
  "email": "test@gmail.com",
  "password": "123456"
}

🍬 Sweet APIs
Method	Endpoint	Description
GET	/api/sweets	Get all sweets
POST	/api/sweets	Add a sweet
PUT	/api/sweets/{id}	Update sweet
DELETE	/api/sweets/{id}	Delete sweet
🗃 H2 Database Console

URL: http://localhost:8081/h2-console

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (leave empty)

🧠 How AI Helped in This Project

This project was developed with assistance from ChatGPT (OpenAI).

AI was used for:

Understanding Spring Boot and Spring Security concepts

Debugging runtime and configuration errors

Guidance on BCrypt password encoding

Helping structure authentication and CRUD logic

Explaining Git commands and proper commit practices

Assisting in preparing this README documentation

All design decisions, code writing, testing, and debugging were performed by the developer, with AI acting as a learning and guidance tool, not an automatic code generator.

🧾 AI Co-Author Declaration (Git Commits)

For commits where AI assistance was used, the following footer was added:

Co-authored-by: ChatGPT <chatgpt@openai.com>

📂 Git Workflow Used
git init
git add .
git commit -m "Initial Spring Boot project setup"

git commit -m "Add user registration with BCrypt password encoding"
git commit -m "Implement login API"
git commit -m "Add sweet CRUD operations"
git commit -m "Configure Spring Security"

git commit -m "Add README and AI usage declaration

Co-authored-by: ChatGPT <chatgpt@openai.com>"

👤 Author

Yuvraj Tyagi

📄 Note

This project is developed strictly for academic and learning purposes as part of the AI Kata Assignment.


---

## ✅ FINAL STEP (DO THIS NOW)

git clone https://github.com/<your-username>/sweet-shop-management-system.git
cd sweet-shop-management-system
