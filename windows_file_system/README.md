# Windows File System - Composite Pattern Implementation

This project implements a file system structure using the Composite Design Pattern, demonstrating how to model hierarchical file and directory relationships in an object-oriented way.

## 📋 Overview

The Composite Pattern is perfectly suited for representing tree-like structures such as file systems. This implementation models a Windows-style file system where directories can contain both files and other directories, creating a flexible hierarchical structure.

## 🎯 Learning Objectives

- Apply Composite Pattern to real-world file system modeling
- Understand tree structure implementation in object-oriented design
- Learn recursive operations on hierarchical data structures
- Practice uniform treatment of individual and composite objects
- Explore file system abstractions and operations

## 📁 Project Structure

```
windows_file_system/
├── src/
│   ├── FileSystemComponent.java    # Component interface
│   ├── File.java                  # Leaf implementation (individual files)
│   ├── Directory.java             # Composite implementation (containers)
│   └── Main.java                  # Demo and testing
└── README.md                      # This file
```

## 🏗️ Composite Pattern Structure

### Component Interface (`FileSystemComponent.java`)
- Defines common interface for both files and directories
- Declares operations like display, getName, getSize
- Provides default implementations where appropriate

### Leaf Implementation (`File.java`)
- Represents individual files in the file system
- Implements basic file operations (display, size calculation)
- Cannot contain other file system components

### Composite Implementation (`Directory.java`)
- Represents directories that can contain files and subdirectories
- Manages child components (add, remove, get children)
- Implements operations recursively on all children
- Supports nested directory structures

## 🔍 Key Features

### File System Operations
- **Display Structure**: Show hierarchical file system tree
- **Size Calculation**: Recursive size computation for directories
- **Component Management**: Add/remove files and directories
- **Path Operations**: Navigate and display file paths

### Hierarchical Operations
- **Recursive Traversal**: Operations applied to entire subtrees
- **Uniform Interface**: Same operations for files and directories
- **Dynamic Structure**: Runtime modification of file system structure
- **Nested Hierarchies**: Support for deeply nested directory structures

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or higher

### Compilation and Execution
```bash
# Navigate to project directory
cd windows_file_system/

# Compile all Java files
javac -d bin src/*.java

# Run the main program
java -cp bin Main
```

### Example Usage
```java
// Create root directory
Directory root = new Directory("C:\\");

// Create subdirectories
Directory documents = new Directory("Documents");
Directory pictures = new Directory("Pictures");

// Create files
File resume = new File("resume.pdf", 150);
File photo = new File("vacation.jpg", 2048);

// Build directory structure
documents.add(resume);
pictures.add(photo);
root.add(documents);
root.add(pictures);

// Display entire structure
root.display();

// Calculate total size
System.out.println("Total size: " + root.getSize() + " KB");
```

## 🎓 Design Pattern Benefits

### Structural Benefits
1. **Uniform Treatment**: Client code treats files and directories identically
2. **Recursive Composition**: Directories can contain other directories infinitely
3. **Simple Client Code**: No need to distinguish between leaf and composite objects
4. **Flexible Hierarchy**: Easy to restructure and modify file system

### Object-Oriented Advantages
- **Single Responsibility**: Each class has one clear purpose
- **Open/Closed Principle**: Easy to add new file types without modifying existing code
- **Polymorphism**: Operations work uniformly across different component types
- **Encapsulation**: Internal structure hidden from clients

## 💡 Real-World Applications

### File System Implementations
- **Operating Systems**: Windows Explorer, macOS Finder, Linux file managers
- **IDEs**: Project explorers in Eclipse, IntelliJ IDEA, Visual Studio
- **Archive Tools**: ZIP, RAR, TAR file structure representation
- **Version Control**: Git repository structure, SVN working copies

### Other Hierarchical Systems
- **Organization Charts**: Companies, departments, employees
- **Menu Systems**: Application menus and submenus
- **XML/HTML Documents**: Nested element structures
- **GUI Components**: Containers and controls in user interfaces

### Software Architecture
- **Module Systems**: Package and class hierarchies
- **Component Trees**: React components, Angular components
- **Scene Graphs**: 3D graphics and game engines
- **Composite Services**: Microservices composition

## 🔧 Extension Possibilities

### Enhanced File Operations
- **Permissions**: Read, write, execute permissions
- **Timestamps**: Creation, modification, access times
- **File Types**: Executable files, links, special files
- **Metadata**: File attributes, extended properties

### Advanced Directory Features
- **Search Operations**: Find files by name, type, size
- **Filtering**: Show only certain file types
- **Sorting**: Order by name, size, date
- **Statistics**: File count, total size, type distribution

### System Integration
- **I/O Operations**: Actual file system read/write
- **Watch Services**: Monitor file system changes
- **Compression**: Archive creation and extraction
- **Synchronization**: Directory comparison and syncing

## ⚠️ Design Considerations

### Performance Implications
- **Memory Usage**: Large directory structures can consume significant memory
- **Recursive Operations**: Deep nesting can cause stack overflow
- **Caching**: Consider caching computed values like directory sizes

### Error Handling
- **Circular References**: Prevent directories from containing themselves
- **Invalid Operations**: Handle attempts to add files to files
- **Resource Management**: Properly manage file handles and resources

## 🎯 Learning Outcomes

After studying this project, you should be able to:
- Implement the Composite pattern for hierarchical structures
- Design object-oriented file system representations
- Handle recursive operations on tree structures
- Create flexible, extensible hierarchical systems
- Apply the pattern to other domain-specific hierarchies
- Understand the trade-offs between simplicity and functionality

## 🔗 Related Patterns and Concepts

### Complementary Patterns
- **Iterator Pattern**: Traversing composite structures
- **Visitor Pattern**: Operations on composite structures
- **Command Pattern**: File system operations as commands
- **Observer Pattern**: Monitoring file system changes

### Data Structures
- **Tree Structures**: General tree implementations
- **Graph Algorithms**: Traversal and search algorithms
- **Recursive Algorithms**: Processing hierarchical data
- **Path Operations**: Working with hierarchical paths

This project provides a solid foundation for understanding how to model and implement hierarchical structures using object-oriented design principles and the Composite pattern.
