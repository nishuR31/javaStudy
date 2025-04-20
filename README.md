# Java Basics: Complete Learning Repo

Welcome to a personal Java reference project. This repository is a compact, all-in-one **Java revision toolkit** covering key concepts with practical examples, deep explanations, and clean formatting. Ideal for revising fundamentals that i learnt so far.

---

## Table of Contents
1. [Java Origins & Ecosystem](#1-java-origins--ecosystem)
2. [Java Syntax & Structure](#2-java-syntax--structure)
3. [Object-Oriented Programming (OOP)](#3-object-oriented-programming-oop)
4. [Data Types & Variables](#4-data-types--variables)
5. [Methods and Return Types](#5-methods-and-return-types)
6. [Access Specifiers](#6-access-specifiers)
7. [Control Flow: Loops & Conditionals](#7-control-flow-loops--conditionals)
8. [Arrays, Lists & Collections](#8-arrays-lists--collections)
9. [String Handling](#9-string-handling)
10. [Exception Handling](#10-exception-handling)
11. [User Input with Scanner](#11-user-input-with-scanner)
12. [Streams API](#12-streams-api)
13. [JVM, JDK, JRE, JIT & Compilation](#13-jvm-jdk-jre-jit--compilation)
14. [Project Setup & Run](#14-project-setup--run)

---

## 1. Java Origins & Ecosystem
- Created by **James Gosling** at **Sun Microsystems**.
- Originally named **Oak**.
- Now maintained by **Oracle**.
- Java follows **WORA** (Write Once, Run Anywhere).

---

## 2. Java Syntax & Structure
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```
### Key Keywords:
- `public`: access modifier
- `static`: method belongs to the class, not instance
- `void`: no return type
- `main`: JVM looks for this entry point

---

## 3. Object-Oriented Programming (OOP)
### Concepts:
- **Class**: template/blueprint
- **Object**: instance of a class
- **Constructor**: initializes object
- **this**: refers to current instance

#### 4 Pillars of OOP
- Polymorphism
- Inheritance
- Abstraction
- encapsulation 


```java
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}
```

---

## 4. Data Types & Variables
### Primitive Types:
- `int`, `float`, `double`, `char`, `boolean`
### Reference Types:
- `String`, `Array`, `Object`, `Class`
### Wrapper Classes:
- `Integer`,`Float`,`Double`,`Boolean`, etc


```java
int age = 20;
String college = "IIT";
```

### Variable Types:
- **Instance**: declared in class
- **Local**: inside method
- **Static**: shared across all instances

---

## 5. Methods and Return Types
```java
public int sum(int a, int b) {
    return a + b;
}
```
- `return` ends method execution
- Return type must match method declaration

---

## 6. Access Specifiers
| Modifier | Scope |
|----------|-------|
| public   | Everywhere |
| private  | Same class only |
| protected| Same package + subclasses |
| default  | Same package only |

---

## 7. Control Flow: Loops & Conditionals
### Conditionals:
```java
if (x > 0) { ... }
else if (x == 0) { ... }
else { ... }
```
### Loops:
```java
for (int i = 0; i < 5; i++) {}
while (true) {}
do { ... } while (condition);
```
### For-each:
```java
for (String item : list) {
    System.out.println(item);
}
```

---

## 8. Arrays, Lists & Collections
```java
int[] arr = {1, 2, 3};
List<String> list = Arrays.asList("Java", "Python");
Vector<Integer> v = new Vector<>();
```
- `Arrays.asList()` makes fixed-size list from array
- `Vector` is synchronized (thread-safe)

---

## 9. String Handling
### StringBuilder (mutable, efficient)
```java
StringBuilder sb = new StringBuilder();
sb.append("Hello ").append("Java");
```
### String methods:
```java
String str = "Java";
str.toUpperCase();
str.length();
```

---

## 10. Exception Handling
```java
try {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage());
} finally {
    System.out.println("Always runs");
}
```
- **try**: risky code
- **catch**: handle exception
- **finally**: executes always

---

## 11. User Input with Scanner
```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = sc.nextLine();
```
- Close Scanner after use: `sc.close();`

---

## 12. Streams API
```java
List<String> items = Arrays.asList("Apple", "Banana", "Cherry");
items.stream()
     .filter(i -> i.startsWith("B"))
     .forEach(System.out::println);
```
- Functional-style operations: `map()`, `filter()`, `collect()`

---

## 13. JVM, JDK, JRE, JIT & Compilation
- **JDK** (Java Development Kit): Tools + Compiler + JRE
- **JRE** (Java Runtime Environment): For running bytecode
- **JVM** (Java Virtual Machine): Executes bytecode
- **JIT** (Just-In-Time compiler): Converts bytecode to native machine code at runtime for faster execution

### Compilation Process:
```bash
javac MyClass.java   # Compiles to MyClass.class (bytecode)
java MyClass          # Runs via JVM
```

---

## 14. Project Setup & Run
### Compile & Run:
```bash
javac pathToMain.java
java PathtoMain
```

---

## Final Notes
This project is:
- A full Java revision toolkit
- Beginner-friendly, practical
- Easy to extend in future

> Made by a curious learner who loves code, chai, and clean syntax.
