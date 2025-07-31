# Shopping-System
🛍️ Shopping System - Backend eCommerce Platform
This project is a Dockerized, role-based eCommerce backend built using Java Spring Boot and MySQL. It supports a multi-vendor architecture with role-based access for Admins, Sellers, and Customers. The application provides full CRUD functionality for shops, products, and orders, along with secure user authentication using JWT.

🚀 Key Features
🔐 Authentication & Authorization

Register and login with Spring Security + JWT

Role-based access control (Admin, Seller, Customer)

🏬 Shop & Product Management

Sellers can create shops and manage their product listings

Customers can browse and purchase products

🧾 Order Processing

Customers place orders

System checks product stock, updates inventory, and generates orders

🐳 Dockerized Deployment

Docker support for easy setup and environment consistency

MySQL containerized with Spring Boot backend

🧹 Clean Code Practices

Feature-based Git branches

Pull requests reviewed by team

Static code analysis with SonarLint

⚙️ Tech Stack
Java 17 + Spring Boot

Spring Security + JWT

MySQL

Maven

Docker & Docker Compose

📦 Database Entities
User, Role, Shop, Product, Order

📌 Example API Endpoints
POST /auth/register – Register as Customer/Seller

POST /auth/login – Login & receive JWT

POST /shops – Seller creates a shop

GET /products – Customers browse products

POST /orders – Customers place orders
