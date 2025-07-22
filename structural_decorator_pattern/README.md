# Decorator Design Pattern - Coffee Ordering System

This project demonstrates the Decorator Design Pattern through a flexible coffee ordering system that allows dynamic addition of features to coffee orders without modifying existing code.

## 📋 Overview

The Decorator Pattern allows behavior to be added to objects dynamically without altering their structure. This coffee shop implementation shows how to add various ingredients and modifications to coffee orders in a flexible, composable way.

## 🎯 Learning Objectives

- Master the Decorator Design Pattern implementation
- Learn dynamic object behavior modification
- Practice open/closed principle (open for extension, closed for modification)
- Understand composition-based design
- Explore real-world e-commerce and customization scenarios

## 📁 Project Structure

```
structural_decorator_pattern/
├── src/
│   ├── Coffee.java           # Component interface
│   ├── Espresso.java         # Concrete component (base coffee)
│   ├── CoffeeDecorator.java  # Abstract decorator
│   ├── WithMilk.java         # Concrete decorator for milk
│   ├── WithSuger.java        # Concrete decorator for sugar
│   ├── Mocha.java            # Concrete decorator for mocha
│   └── Main.java             # Demo and testing
└── README.md                 # This file
```

## 🏗️ Decorator Pattern Structure

### Component (`Coffee.java`)
- Defines interface for objects that can have responsibilities added dynamically
- Declares methods for getting description and cost

### Concrete Component (`Espresso.java`)
- Base implementation of the component interface
- Represents the core object to which decorators can be added

### Abstract Decorator (`CoffeeDecorator.java`)
- Maintains reference to a Component object
- Defines interface conforming to Component's interface

### Concrete Decorators
- **`WithMilk.java`**: Adds milk to coffee orders
- **`WithSuger.java`**: Adds sugar to coffee orders  
- **`Mocha.java`**: Adds mocha flavor to coffee orders

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or higher

### Compilation and Execution
```bash
# Navigate to project directory
cd structural_decorator_pattern/

# Compile all Java files
javac -d bin src/*.java

# Run the main program
java -cp bin Main
```

### Usage Examples
```java
// Start with base coffee
Coffee coffee = new Espresso();

// Add decorators dynamically
coffee = new WithMilk(coffee);
coffee = new WithSuger(coffee);
coffee = new Mocha(coffee);

// Get final description and cost
System.out.println(coffee.getDescription());
System.out.println("Cost: $" + coffee.getCost());
```

## 🎓 Pattern Benefits

### Key Advantages
1. **Runtime Composition**: Add features dynamically
2. **Flexible Extension**: Easy to add new decorators
3. **Single Responsibility**: Each decorator has one purpose
4. **Open/Closed Principle**: Open for extension, closed for modification

### Real-World Applications
- **GUI Components**: Adding scrollbars, borders to windows
- **Text Processing**: Adding formatting, encryption to streams
- **E-commerce**: Adding features to products
- **Web Frameworks**: Adding middleware layers

## 🎯 Learning Outcomes

- Implement flexible object enhancement systems
- Master composition over inheritance
- Create extensible software architectures
- Apply SOLID principles in practice

This project showcases how the Decorator pattern enables flexible, runtime object customization in real-world scenarios.
