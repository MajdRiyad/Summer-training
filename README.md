# javaT - Java Programming Projects Collection

This repository contains a comprehensive collection of Java programming projects covering various design patterns, concepts, and practical implementations developed for coursework and practice.

## Table of Contents

| Directory | Description |
|-----------|-------------|
| `abs_and_int/` | Abstract classes and interfaces implementation examples |
| `composite_design/` | Implementation of the Composite design pattern with department hierarchy |
| `creational_singl/` | Creational design patterns including Singleton pattern and factory implementations |
| `first-one/` | Spring Boot project starter template with Maven configuration |
| `performance_report/` | Spring Boot application for performance reporting and analytics |
| `pojo_bean/` | Plain Old Java Objects (POJO) and Java Bean implementation examples |
| `practicePro/` | Practice programming exercises including customer payment processing |
| `reflect/` | Java Reflection API demonstrations and practical examples |
| `streme/` | Java Streams API examples with functional programming concepts |
| `structural_bridge_pattern/` | Bridge design pattern implementation for audio file processing |
| `structural_decorator_pattern/` | Decorator design pattern implementation for coffee ordering system |
| `thread/` | Multithreading and concurrent programming examples |
| `user_management/` | Spring Boot application for user management system |
| `windows_file_system/` | File system component implementation using Composite pattern |

## Getting Started

### Prerequisites
- Java JDK 8 or higher
- Maven 3.6+ (for Spring Boot projects)
- IDE such as IntelliJ IDEA or Eclipse

### Clone the Repository
```bash
git clone https://github.com/yourusername/javaT.git
cd javaT
```

### Project Structure
Each directory contains:
- **Simple Java Projects**: `.iml` files (IntelliJ IDEA modules) with `src/` folders containing Java source files
- **Maven Projects**: `pom.xml`, Maven wrapper scripts (`mvnw`, `mvnw.cmd`), and standard Maven directory structure
- **Compiled Projects**: Some include `bin/` or `target/` directories with compiled classes

### Running the Projects

#### For Simple Java Projects:
1. Navigate to the project directory
2. Compile: `javac -d bin src/*.java`
3. Run: `java -cp bin Main` (or the appropriate main class)

#### For Maven/Spring Boot Projects:
1. Navigate to the project directory
2. Compile: `./mvnw compile`
3. Run: `./mvnw spring-boot:run`

## Project Highlights

### Design Patterns Implemented
- **Composite Pattern**: Used in `composite_design/` and `windows_file_system/`
- **Singleton Pattern**: Demonstrated in `creational_singl/`
- **Bridge Pattern**: Audio processing example in `structural_bridge_pattern/`
- **Decorator Pattern**: Coffee customization in `structural_decorator_pattern/`

### Core Java Concepts
- **Object-Oriented Programming**: Inheritance, polymorphism, encapsulation
- **Java Streams**: Functional programming with streams and lambda expressions
- **Reflection API**: Runtime class manipulation and introspection
- **Multithreading**: Concurrent programming and thread management
- **Spring Boot**: Web applications and enterprise development

## Contributing
This is a learning repository. Feel free to explore, learn from the code, and suggest improvements.

## License
This project is for educational purposes.
