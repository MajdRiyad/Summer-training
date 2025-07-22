# First-One - Spring Boot Learning Project

A comprehensive Spring Boot application demonstrating fundamental concepts including RESTful APIs, data persistence, and MVC architecture through a course and user management system.

## 📋 Overview

This Spring Boot project serves as an introduction to enterprise Java development, showcasing core Spring Boot features through a practical course management system with user authentication and CRUD operations.

## 🎯 Learning Objectives

- Master Spring Boot framework fundamentals
- Learn RESTful API development
- Practice MVC architectural pattern
- Understand Spring Data JPA integration
- Explore dependency injection concepts
- Build enterprise-grade Java applications

## 📁 Project Structure

```
first-one/
├── src/
│   ├── main/
│   │   ├── java/com/quizplus/firstone/
│   │   │   ├── FirstOneApplication.java    # Main Spring Boot application
│   │   │   ├── course/
│   │   │   │   ├── Course.java             # Course entity
│   │   │   │   ├── CourseController.java   # REST controller
│   │   │   │   ├── CourseRepository.java   # Data access layer
│   │   │   │   └── CourseService.java      # Business logic layer
│   │   │   └── user/
│   │   │       ├── User.java               # User base entity
│   │   │       ├── Student.java            # Student entity
│   │   │       ├── Teacher.java            # Teacher entity
│   │   │       ├── TeacherController.java  # Teacher REST controller
│   │   │       ├── TeacherRepository.java  # Teacher data access
│   │   │       ├── TeacherService.java     # Teacher business logic
│   │   │       └── StudentRepository.java  # Student data access
│   │   └── resources/
│   │       └── application.properties       # Configuration settings
│   └── test/
│       └── java/                           # Unit tests
├── target/                                 # Compiled classes
├── pom.xml                                 # Maven dependencies
└── README.md                               # This file
```

## 🏗️ Architecture Overview

### MVC Pattern Implementation
- **Model**: Entity classes (Course, User, Student, Teacher)
- **View**: RESTful JSON responses
- **Controller**: REST controllers handling HTTP requests

### Layered Architecture
1. **Controller Layer**: Handles HTTP requests and responses
2. **Service Layer**: Contains business logic
3. **Repository Layer**: Data access and persistence
4. **Entity Layer**: Domain models and data structures

## 🔍 Key Features

### Course Management System
- **Course Entity**: Manages course information
- **CRUD Operations**: Create, Read, Update, Delete courses
- **RESTful APIs**: HTTP endpoints for course operations
- **Data Persistence**: JPA/Hibernate integration

### User Management System
- **User Hierarchy**: Base User class with Student/Teacher extensions
- **Teacher Management**: Complete CRUD operations for teachers
- **Student Management**: Student data handling
- **Repository Pattern**: Data access abstraction

## 🚀 How to Run

### Prerequisites
- Java JDK 17 or higher
- Maven 3.6+
- IDE with Spring Boot support (IntelliJ IDEA, Eclipse, VS Code)

### Running the Application

#### Using Maven Wrapper (Recommended)
```bash
# Navigate to project directory
cd first-one/

# Run the application
./mvnw spring-boot:run

# Or on Windows
mvnw.cmd spring-boot:run
```

#### Using Maven
```bash
# Compile the project
mvn compile

# Run the application
mvn spring-boot:run
```

#### Using IDE
1. Import the project as a Maven project
2. Run `FirstOneApplication.java` as a Java application

### Application Access
- **Application URL**: http://localhost:8080
- **API Base URL**: http://localhost:8080/api
- **Port**: 8080 (default, configurable in application.properties)

## 🌐 API Endpoints

### Teacher Management
```
GET    /api/teachers          # Get all teachers
GET    /api/teachers/{id}     # Get teacher by ID
POST   /api/teachers          # Create new teacher
PUT    /api/teachers/{id}     # Update teacher
DELETE /api/teachers/{id}     # Delete teacher
```

### Course Management
```
GET    /api/courses           # Get all courses
GET    /api/courses/{id}      # Get course by ID
POST   /api/courses           # Create new course
PUT    /api/courses/{id}      # Update course
DELETE /api/courses/{id}      # Delete course
```

## 🎓 Spring Boot Concepts Demonstrated

### Core Features
- **Auto-Configuration**: Automatic Spring configuration
- **Embedded Server**: Built-in Tomcat server
- **Dependency Injection**: IoC container usage
- **Component Scanning**: Automatic bean discovery

### Data Access
- **Spring Data JPA**: Repository pattern implementation
- **Entity Relationships**: User hierarchy modeling
- **Database Integration**: H2/MySQL connectivity
- **Transaction Management**: Declarative transactions

### Web Layer
- **REST Controllers**: RESTful API development
- **Request Mapping**: HTTP method mapping
- **JSON Serialization**: Automatic JSON conversion
- **Exception Handling**: Error response management

## 🔧 Configuration

### Application Properties
```properties
# Server configuration
server.port=8080

# Database configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.jpa.hibernate.ddl-auto=update

# JPA configuration
spring.jpa.show-sql=true
```

## 🎯 Learning Outcomes

After studying this project, you should be able to:
- Create Spring Boot applications from scratch
- Implement RESTful web services
- Design layered architecture applications
- Use Spring Data JPA for data persistence
- Handle HTTP requests and responses
- Configure Spring Boot applications
- Write unit tests for Spring applications
- Deploy Spring Boot applications

## 🔗 Related Concepts

### Design Patterns Used
- **Repository Pattern**: Data access abstraction
- **Service Layer Pattern**: Business logic separation
- **MVC Pattern**: Separation of concerns
- **Dependency Injection**: Inversion of control

### Best Practices Demonstrated
- **Clean Architecture**: Proper layer separation
- **RESTful Design**: Standard HTTP methods and status codes
- **Configuration Management**: External configuration
- **Error Handling**: Graceful error responses

## 📚 Additional Resources

- **Spring Boot Documentation**: https://spring.io/projects/spring-boot
- **Spring Data JPA**: https://spring.io/projects/spring-data-jpa
- **REST API Best Practices**: RESTful service design principles

This project provides a solid foundation for enterprise Java development with Spring Boot and serves as a stepping stone to more complex Spring ecosystem features.
