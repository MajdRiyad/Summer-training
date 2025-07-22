# User Management System - Spring Boot Enterprise Application

A comprehensive Spring Boot application implementing a full-featured user management system with authentication, authorization, role-based access control, and enterprise-grade security features.

## 📋 Overview

This enterprise-level Spring Boot application demonstrates modern web application development with complete user management capabilities, JWT authentication, role-based security, and RESTful API design following industry best practices.

## 🎯 Learning Objectives

- Master enterprise Spring Boot application development
- Learn JWT-based authentication and authorization
- Practice Spring Security integration and configuration
- Understand role-based access control (RBAC) systems
- Explore RESTful API design and implementation

## 📁 Project Structure

```
user_management/
├── src/main/java/com/quizplus/user_management/
│   ├── UserManagementApplication.java      # Main Spring Boot application
│   ├── HomeController.java                 # Home page controller
│   ├── config/
│   │   └── SecurityConfig.java             # Spring Security configuration
│   ├── controller/
│   │   ├── AdminController.java            # Admin-specific operations
│   │   ├── AuthController.java             # Authentication endpoints
│   │   └── UserController.java             # User management operations
│   ├── controller/dto/
│   │   ├── AdminRegistrationRequest.java   # Admin registration DTO
│   │   ├── JwtResponse.java                # JWT token response
│   │   └── LoginRequest.java               # Login request DTO
│   ├── enums/
│   │   └── RoleType.java                   # Role enumeration
│   ├── filter/
│   │   └── JwtAuthenticationFilter.java    # JWT token filter
│   ├── model/
│   │   ├── Branch.java                     # Branch entity
│   │   ├── Company.java                    # Company entity
│   │   ├── Department.java                 # Department entity
│   │   ├── Role.java                       # Role entity
│   │   ├── UserDetailsImpl.java            # Spring Security user details
│   │   └── Users.java                      # User entity
│   ├── repository/
│   │   ├── BranchRepository.java           # Branch data access
│   │   ├── CompanyRepository.java          # Company data access
│   │   ├── DepartmentRepository.java       # Department data access
│   │   ├── RoleRepository.java             # Role data access
│   │   └── UsersRepository.java            # User data access
│   ├── service/
│   │   ├── BranchService.java              # Branch business logic
│   │   ├── CompanyService.java             # Company business logic
│   │   ├── CustomUserDetailsService.java  # User details service
│   │   ├── DepartmentService.java          # Department business logic
│   │   ├── RoleService.java                # Role business logic
│   │   └── UserService.java                # User business logic
│   └── utils/
│       └── JwtUtils.java                   # JWT utility functions
├── src/main/resources/
│   └── application.properties              # Application configuration
├── src/test/                               # Unit and integration tests
├── target/                                 # Build artifacts
└── README.md                               # This file
```

## 🏗️ Architecture Overview

### Layered Architecture
- **Controller Layer**: REST API endpoints and request handling
- **Service Layer**: Business logic and transaction management
- **Repository Layer**: Data access and persistence
- **Model Layer**: JPA entities and domain objects
- **Security Layer**: Authentication and authorization

### Key Components
- **JWT Authentication**: Stateless token-based authentication
- **Role-Based Access Control**: Hierarchical permission system
- **Entity Relationships**: Company → Branch → Department → Users
- **RESTful APIs**: Complete CRUD operations with proper HTTP methods

## 🔍 Key Features

### Authentication & Authorization
- **JWT Token Authentication**: Secure, stateless authentication
- **Role-Based Access Control**: Admin, Manager, User roles
- **Login/Logout**: Secure session management
- **Password Security**: Encrypted password storage

### User Management
- **User Registration**: Admin and user registration workflows
- **Profile Management**: User profile updates and management
- **Role Assignment**: Dynamic role assignment and management
- **User Hierarchy**: Organization-based user structure

### Organizational Structure
- **Company Management**: Multi-company support
- **Branch Operations**: Branch-based organization
- **Department Handling**: Departmental user grouping
- **Hierarchical Access**: Role-based data access

### API Endpoints
- **Authentication**: `/api/auth/**` - Login, register, refresh
- **User Operations**: `/api/users/**` - User CRUD operations
- **Admin Functions**: `/api/admin/**` - Administrative operations
- **Organization**: `/api/companies/**`, `/api/branches/**`, `/api/departments/**`

## 🚀 How to Run

### Prerequisites
- Java JDK 17 or higher
- Maven 3.6+
- Database (H2 for development, MySQL/PostgreSQL for production)

### Running the Application
```bash
# Navigate to project directory
cd user_management/

# Run using Maven wrapper
./mvnw spring-boot:run

# Or compile and run
./mvnw clean compile
./mvnw spring-boot:run
```

### Application Access
- **Application URL**: http://localhost:8080
- **API Documentation**: http://localhost:8080/swagger-ui.html (if Swagger configured)
- **H2 Console**: http://localhost:8080/h2-console (for development)

## 🔧 Configuration

### Application Properties
```properties
# Server configuration
server.port=8080

# Database configuration
spring.datasource.url=jdbc:h2:mem:userdb
spring.jpa.hibernate.ddl-auto=create-drop

# JWT configuration
app.jwt.secret=mySecretKey
app.jwt.expiration=86400000

# Security configuration
spring.security.user.name=admin
spring.security.user.password=admin123
```

## 🎓 Spring Boot Concepts Demonstrated

### Core Features
- **Auto-Configuration**: Automatic Spring configuration
- **Starter Dependencies**: Spring Boot starters for web, security, data
- **Embedded Server**: Built-in Tomcat server
- **Profile Management**: Environment-specific configurations

### Security Features
- **Spring Security**: Comprehensive security framework
- **JWT Integration**: Custom JWT authentication filter
- **Method Security**: Method-level access control
- **CORS Configuration**: Cross-origin request handling

### Data Access
- **Spring Data JPA**: Repository pattern implementation
- **Entity Relationships**: JPA entity associations
- **Query Methods**: Derived and custom queries
- **Transaction Management**: Declarative transactions

### Web Layer
- **REST Controllers**: RESTful API development
- **DTO Pattern**: Data transfer objects for API
- **Exception Handling**: Global exception handling
- **Validation**: Request validation and error handling

## 💡 Enterprise Patterns

### Security Patterns
- **JWT Authentication**: Token-based stateless authentication
- **Role-Based Access Control**: Hierarchical permission system
- **Filter Chain**: Custom security filter integration
- **Password Encoding**: Secure password hashing

### Data Patterns
- **Repository Pattern**: Data access abstraction
- **Service Layer**: Business logic encapsulation
- **DTO Pattern**: Data transfer and API contracts
- **Entity Mapping**: JPA entity relationships

### API Design
- **RESTful Principles**: Resource-based URL design
- **HTTP Status Codes**: Proper status code usage
- **Request/Response DTOs**: Clean API contracts
- **Error Handling**: Consistent error responses

## 🎯 Learning Outcomes

After studying this project, you should be able to:
- Build enterprise-grade Spring Boot applications
- Implement JWT-based authentication systems
- Design role-based access control systems
- Create RESTful APIs with proper security
- Handle complex entity relationships with JPA
- Apply Spring Security best practices
- Design scalable multi-tenant applications
- Implement comprehensive user management systems

## 🔗 Related Technologies

### Spring Ecosystem
- **Spring Boot**: Framework foundation
- **Spring Security**: Authentication and authorization
- **Spring Data JPA**: Data access layer
- **Spring Web**: RESTful web services

### Security & Authentication
- **JWT (JSON Web Tokens)**: Stateless authentication
- **BCrypt**: Password hashing
- **CORS**: Cross-origin resource sharing
- **OAuth2**: External authentication (extensible)

### Database & Persistence
- **JPA/Hibernate**: Object-relational mapping
- **H2 Database**: In-memory database for development
- **MySQL/PostgreSQL**: Production database options
- **Connection Pooling**: Database connection management

This project serves as a comprehensive example of modern enterprise application development with Spring Boot, demonstrating industry best practices for security, data management, and API design.
