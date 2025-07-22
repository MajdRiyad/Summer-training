# Abstract Classes vs Interfaces

This project demonstrates the practical differences between abstract classes and interfaces in Java through comprehensive examples and use cases.

## 📋 Overview

This educational project explores when to use abstract classes versus interfaces, providing real-world scenarios and implementation examples for each approach.

## 🎯 Learning Objectives

- Understand the fundamental differences between abstract classes and interfaces
- Learn when to use abstract classes vs interfaces
- Explore practical implementation scenarios
- Master OOP concepts through hands-on examples

## 📁 Project Structure

```
abs_and_int/
├── src/
│   └── Main.java    # All examples and implementations
└── README.md        # This file
```

## 🔍 Code Examples

### Abstract Class Scenarios

#### 1. **Shape Display System**
- **Use Case**: When you know something about the behavior
- **Classes**: `Shape` (abstract), `Circle` (concrete)
- **Demonstrates**: Template methods with shared behavior

#### 2. **Vehicle Management**
- **Use Case**: Sharing state and behavior among subclasses
- **Classes**: `Vehicle` (abstract), `Car` (concrete)
- **Demonstrates**: Shared state (type field) and behavior

#### 3. **Game Template Pattern**
- **Use Case**: Template Method Pattern implementation
- **Classes**: `Game` (abstract), `Chess` (concrete)
- **Demonstrates**: Algorithm structure with customizable steps

#### 4. **Employee Salary System**
- **Use Case**: Sharing state with concrete methods
- **Classes**: `Employee` (abstract), `HourlyEmployee`, `SalaryEmployee`
- **Demonstrates**: Shared state with different calculation methods

### Interface Scenarios

#### 1. **Eating Behavior**
- **Use Case**: When you know nothing about specific behavior
- **Classes**: `edible` (interface), `IslamicPerson`, `ChinesePerson`
- **Demonstrates**: Contract without implementation assumptions

#### 2. **Duck Multiple Inheritance**
- **Use Case**: Multiple inheritance of behavior
- **Interfaces**: `Flyable`, `Swimmable`
- **Class**: `Duck`
- **Demonstrates**: Implementing multiple contracts

#### 3. **Sound Making System**
- **Use Case**: Unrelated classes sharing functionality
- **Interface**: `Audible`
- **Classes**: `Dog`, `AlarmClock`
- **Demonstrates**: Common behavior across unrelated classes

#### 4. **Animal Contract**
- **Use Case**: Defining a strict contract
- **Interface**: `Animal`
- **Classes**: `Wolf`, `Bird`
- **Demonstrates**: Standardized behavior contract

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or higher
- Any Java IDE or text editor

### Compilation and Execution
```bash
# Navigate to the project directory
cd abs_and_int/

# Compile the Java file
javac -d bin src/Main.java

# Run the program
java -cp bin Main
```

### Expected Output
The program demonstrates various implementations of abstract classes and interfaces, showing how different patterns work in practice.

## 🎓 Key Concepts Covered

### When to Use Abstract Classes:
1. **Known Behavior**: When you have some idea about implementation
2. **Shared State**: Need to share fields among subclasses
3. **Template Methods**: Define algorithm structure
4. **Concrete Methods**: Need to provide default implementations

### When to Use Interfaces:
1. **Unknown Behavior**: No assumptions about implementation
2. **Multiple Inheritance**: Class needs multiple contracts
3. **Unrelated Classes**: Common functionality across different hierarchies
4. **Contract Definition**: Strict behavioral contracts

## 🔗 Related Materials

This project complements the theoretical material found in:
- `docs/Abstract Class vs Interface.pdf` - Detailed theoretical comparison

## 💡 Best Practices Demonstrated

- Proper use of abstract methods vs concrete methods
- Interface default methods (Java 8+)
- Template Method Pattern implementation
- Multiple interface inheritance handling
- Naming conventions for interfaces and abstract classes

## 🎯 Learning Outcomes

After studying this project, you should be able to:
- Choose between abstract classes and interfaces appropriately
- Implement template method patterns
- Handle multiple inheritance scenarios
- Design proper OOP hierarchies
- Apply interface segregation principles
