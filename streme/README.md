# Java Streams API - Functional Programming

This project demonstrates the powerful Java 8+ Streams API, showcasing functional programming concepts, lambda expressions, and efficient data processing techniques for modern Java development.

## 📋 Overview

Java Streams API revolutionized data processing in Java by introducing functional programming paradigms. This project explores stream operations, lambda expressions, and functional interfaces through practical examples and real-world scenarios.

## 🎯 Learning Objectives

- Master Java Streams API and functional programming concepts
- Learn lambda expressions and method references
- Practice stream operations (map, filter, reduce, collect)
- Understand parallel processing with streams
- Explore functional interfaces and their applications

## 📁 Project Structure

```
streme/
├── src/streme/
│   ├── Main.java        # Stream operations and examples
│   ├── Person.java      # Data model for stream operations
│   ├── Cat.java         # Animal model for demonstrations
│   └── Printeable.java  # Functional interface example
├── bin/streme/          # Compiled class files
└── README.md            # This file
```

## 🔍 Key Features

### Stream Operations
- **Intermediate Operations**: map, filter, sorted, distinct, limit
- **Terminal Operations**: forEach, collect, reduce, count, min/max
- **Parallel Streams**: Concurrent data processing
- **Stream Sources**: Collections, arrays, I/O channels

### Lambda Expressions
- **Syntax**: Arrow notation and expression forms
- **Functional Interfaces**: Predicate, Function, Consumer, Supplier
- **Method References**: Static, instance, and constructor references
- **Closure Behavior**: Variable capture and scope

### Functional Programming Concepts
- **Immutability**: Non-modifying operations
- **Higher-Order Functions**: Functions as parameters and return values
- **Function Composition**: Chaining operations
- **Lazy Evaluation**: Deferred execution until terminal operation

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or higher (Streams introduced in Java 8)

### Compilation and Execution
```bash
# Navigate to project directory
cd streme/

# Compile Java files (if not already compiled)
javac -d bin src/streme/*.java

# Run the main program
java -cp bin streme.Main
```

## 🎓 Stream API Examples

### Basic Stream Operations
```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

// Filter and transform
List<String> result = names.stream()
    .filter(name -> name.length() > 3)
    .map(String::toUpperCase)
    .collect(Collectors.toList());

// Aggregation operations
int totalLength = names.stream()
    .mapToInt(String::length)
    .sum();
```

### Advanced Stream Processing
```java
// Group by operations
Map<Integer, List<Person>> peopleByAge = people.stream()
    .collect(Collectors.groupingBy(Person::getAge));

// Parallel processing
List<String> parallelResult = largeList.parallelStream()
    .filter(item -> expensiveOperation(item))
    .collect(Collectors.toList());
```

## 💡 Functional Programming Concepts

### Lambda Expressions
- **Anonymous Functions**: Concise way to represent single-method interfaces
- **Syntax**: `(parameters) -> expression` or `(parameters) -> { statements }`
- **Type Inference**: Compiler infers types from context

### Functional Interfaces
- **`Predicate<T>`**: Boolean-valued function (`test(T)`)
- **`Function<T,R>`**: Function from T to R (`apply(T)`)
- **`Consumer<T>`**: Operation on T (`accept(T)`)
- **`Supplier<T>`**: Supplier of T (`get()`)

### Stream Benefits
1. **Declarative**: Focus on what, not how
2. **Composable**: Chain operations together
3. **Parallel**: Easy parallel processing
4. **Lazy**: Evaluation deferred until needed

## 🔧 Performance Considerations

### When to Use Streams
- **Large Datasets**: Parallel processing benefits
- **Complex Transformations**: Multiple chained operations
- **Readability**: Declarative code is clearer
- **Functional Style**: When functional approach fits

### When to Avoid Streams
- **Simple Iterations**: Traditional loops might be clearer
- **Performance Critical**: Measure overhead for small datasets
- **Side Effects**: Streams work best with pure functions
- **Debugging**: Traditional loops easier to debug

## 💡 Real-World Applications

### Data Processing
- **Analytics**: Processing large datasets
- **ETL Operations**: Extract, transform, load operations
- **Report Generation**: Aggregating and summarizing data
- **API Responses**: Transforming data for client consumption

### Business Logic
- **Filtering**: Customer segments, product categories
- **Calculations**: Financial computations, statistics
- **Validation**: Data quality checks
- **Formatting**: Preparing data for display

### Modern Java Development
- **Microservices**: Processing API responses
- **Database Queries**: Post-processing query results
- **File Processing**: Reading and transforming file contents
- **Reactive Programming**: Working with reactive streams

## 🎯 Learning Outcomes

After studying this project, you should be able to:
- Write efficient stream-based data processing code
- Use lambda expressions and method references effectively
- Choose appropriate stream operations for different scenarios
- Apply functional programming principles in Java
- Understand parallel stream processing capabilities
- Debug and optimize stream-based code
- Integrate streams with existing Java applications

## 🔗 Related Technologies

### Java 8+ Features
- **Optional**: Handling null values functionally
- **CompletableFuture**: Asynchronous programming
- **Time API**: Modern date/time handling
- **Interface Default Methods**: Functional interface evolution

### Frameworks and Libraries
- **Spring Framework**: Reactive programming support
- **RxJava**: Reactive extensions for Java
- **Apache Commons**: Functional utilities
- **Google Guava**: Functional programming helpers

This project provides comprehensive coverage of Java Streams API and functional programming concepts essential for modern Java development.
