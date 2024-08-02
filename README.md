# Student-Subject Management System

## Overview

The Student-Subject Management System is a Spring Boot application designed to manage students and subjects with secure API access using JWT authentication. This application includes both public and protected endpoints.

## Features

- **Public Endpoints:**
  - User registration
  - User login
- **Protected Endpoints:**
  - CRUD operations for students
  - CRUD operations for subjects
- **JWT Authentication:** Secure access to protected endpoints

## Prerequisites

Ensure you have the following installed:

- **Java 19+**: [Download Java](https://www.oracle.com/java/technologies/javase-jdk19-downloads.html)
- **Maven**: [Install Maven](https://maven.apache.org/install.html)
- **Git**: [Install Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)

## Installation

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/your-username/student-subject-management.git
cd student-subject-management
mvn clean install
mvn spring-boot:run


The application will start on http://localhost:8080 by default.

2.Navigate to the Project Directory:

bash
Copy code
cd student-subject-management
Build the Project:

bash
Copy code
mvn clean install
Running the Application
Start the Application:

bash
Copy code
mvn spring-boot:run
The application will start on http://localhost:8080 by default.

3.API Endpoints
Public Endpoints
Health Check:

GET /public/health-check
Response: "Ok"
Signup:

POST /public/signup
Request Body:
json
Copy code
{
  "username": "user",
  "password": "pass"
}
Login:

POST /public/login
Request Body:
json
Copy code
{
  "username": "user",
  "password": "pass"
}
Response: JWT token in the body
Protected Endpoints
These endpoints require JWT authentication. Include the JWT token in the Authorization header as Bearer <jwt>.

3.Students:

GET /api/students - Retrieve all students
POST /api/students - Create a new student
Request Body:
json
Copy code
{
  "name": "John Doe",
  "age": 21
}
4.Subjects:

GET /api/subjects - Retrieve all subjects
POST /api/subjects - Create a new subject
Request Body:
json
Copy code
{
  "name": "Mathematics",
  "code": "MATH101"
}
5.Testing
To run tests, use Maven:

bash
Copy code
mvn test
License
This project is licensed under the MIT License - see the LICENSE file for details.

Contributing
Contributions are welcome! If you find any issues or want to suggest improvements, please open an issue or submit a pull request.
