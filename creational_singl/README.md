# Creational Design Patterns - Singleton & Factory

This project demonstrates two fundamental creational design patterns: **Singleton Pattern** and **Factory Pattern** through a comprehensive login system and UI management implementation.

## 📋 Overview

This project showcases how creational patterns solve object creation problems. The Singleton pattern ensures single instance management, while the Factory pattern handles object creation logic, all demonstrated through a practical login and user interface system.

## 🎯 Learning Objectives

- Master the Singleton Design Pattern implementation
- Understand Factory Method Pattern concepts
- Learn object creation best practices
- Practice combining multiple design patterns
- Explore user authentication system design

## 📁 Project Structure

```
creational_singl/
├── src/
│   ├── LoginSystem.java      # Singleton Pattern implementation
│   ├── FactoryUi.java        # Factory Pattern implementation
│   ├── User.java             # Abstract user base class
│   ├── Students.java         # Student user implementation
│   ├── Teacher.java          # Teacher user implementation
│   ├── Ui.java               # Abstract UI base class
│   ├── StudentUi.java        # Student UI implementation
│   ├── TeacherUi.java        # Teacher UI implementation
│   └── Main.java             # Demo and testing
└── README.md                 # This file
```

## 🏗️ Design Patterns Implemented

### 1. Singleton Pattern (`LoginSystem.java`)

#### Purpose
Ensures only one instance of the login system exists throughout the application lifecycle.

#### Key Features
- **Private Constructor**: Prevents external instantiation
- **Static Instance**: Single instance management
- **Thread-Safe Access**: getInstance() method for controlled access
- **User Management**: Handles login/logout operations

#### Implementation Details
```java
private static LoginSystem instance;
private LoginSystem() { /* Private constructor */ }
public static LoginSystem getInstance() {
    if(instance == null) {
        instance = new LoginSystem();
    }
    return instance;
}
```

### 2. Factory Pattern (`FactoryUi.java`)

#### Purpose
Creates appropriate UI objects based on user credentials without exposing creation logic.

#### Key Features
- **Dynamic Creation**: Creates UI based on password length
- **Encapsulated Logic**: Hides object creation complexity
- **Type Safety**: Returns appropriate UI type
- **Extensible Design**: Easy to add new UI types

#### Creation Logic
- **Password length = 3**: Teacher UI
- **Password length > 3**: Student UI
- **Invalid length**: Returns null

## 🔍 Class Hierarchy

### User System
```
User (Abstract)
├── Students.java    # Student user implementation
└── Teacher.java     # Teacher user implementation
```

### UI System
```
Ui (Abstract)
├── StudentUi.java   # Student interface
└── TeacherUi.java   # Teacher interface
```

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or higher
- Any Java IDE or text editor

### Compilation and Execution
```bash
# Navigate to the project directory
cd creational_singl/

# Compile all Java files
javac -d bin src/*.java

# Run the main program
java -cp bin Main
```

### Usage Example
```java
// Get singleton instance
LoginSystem loginSystem = LoginSystem.getInstance();

// Attempt login
boolean success = loginSystem.login("majd", "1202923");

if (success) {
    // Create appropriate UI using factory
    Ui userInterface = FactoryUi.factoryMethod("1202923");
    userInterface.displayInterface();
}
```

## 🎓 Design Pattern Concepts

### Singleton Pattern Benefits
1. **Controlled Access**: Single point of access to the instance
2. **Resource Conservation**: Reduces memory usage
3. **Global State**: Maintains consistent state across application
4. **Lazy Initialization**: Creates instance only when needed

### Factory Pattern Benefits
1. **Loose Coupling**: Client doesn't need to know concrete classes
2. **Centralized Creation**: All creation logic in one place
3. **Easy Extension**: Adding new types requires minimal changes
4. **Type Safety**: Returns appropriate object types

## 💡 Real-World Applications

### Singleton Pattern
- **Database Connections**: Connection pool management
- **Logging Systems**: Single log file handler
- **Configuration Managers**: Application settings
- **Cache Systems**: Shared cache instances

### Factory Pattern
- **GUI Frameworks**: Creating platform-specific components
- **Database Drivers**: Creating connection objects
- **Plugin Systems**: Loading appropriate plugins
- **Document Processors**: Creating format-specific processors

## 🔗 Pattern Interactions

This project demonstrates how patterns work together:
1. **Singleton** manages the login system instance
2. **Factory** creates appropriate UI based on user type
3. Both patterns collaborate to provide a complete authentication system

## 🎯 Learning Outcomes

After studying this project, you should be able to:
- Implement thread-safe Singleton patterns
- Design and implement Factory methods
- Combine multiple design patterns effectively
- Create flexible object creation systems
- Handle user authentication scenarios
- Apply creational patterns to real-world problems

## 🔍 Code Analysis Points

1. **Singleton Implementation**: Thread safety considerations
2. **Factory Logic**: Decision-making based on parameters
3. **Inheritance Hierarchy**: Abstract classes and implementations
4. **Pattern Collaboration**: How Singleton and Factory work together

## ⚠️ Important Notes

- **Thread Safety**: Current Singleton implementation is not thread-safe for multi-threaded environments
- **Extension Points**: Easy to add new user types and UI implementations
- **Security**: Basic authentication for demonstration purposes

This project provides a solid foundation for understanding creational patterns and their practical applications in software design.
