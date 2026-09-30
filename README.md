# ☕ Java Learning

<div align="center">

### A practical Java learning repository focused on programming fundamentals, problem solving, OOP, patterns and DSA foundations.

![Java](https://img.shields.io/badge/Java-Programming-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Learning](https://img.shields.io/badge/Focus-Learning%20%26%20Practice-blue?style=for-the-badge)
![DSA](https://img.shields.io/badge/DSA-Fundamentals-green?style=for-the-badge)
![GitHub](https://img.shields.io/badge/GitHub-Version%20Control-black?style=for-the-badge&logo=github)

</div>

---

## 📌 About This Repository

**Java Learning** is a collection of Java programs created while learning and practicing **Core Java, programming logic, Object-Oriented Programming, arrays, strings, loops, functions, pattern printing, recursion, and DSA fundamentals**.

Instead of keeping everything in one large project, the repository contains many small programs. Each program focuses on a particular concept or problem, making it easier to understand, run, modify, and revise later.

The repository represents a gradual learning path:

```text
Java Basics
     ↓
Conditions & Loops
     ↓
Functions & Methods
     ↓
Arrays & Strings
     ↓
Pattern Printing
     ↓
OOP Fundamentals
     ↓
Recursion
     ↓
DSA Foundations
     ↓
Problem Solving
     ↓
Advanced DSA & Projects
```

---

# 🎯 Purpose

The main purpose of this repository is to build a strong foundation in Java before moving toward more advanced programming, DSA, backend development, and software engineering.

### Main objectives

- Learn Java syntax and fundamentals
- Improve programming logic
- Practice problem solving
- Understand arrays and strings
- Become comfortable with loops and nested loops
- Learn Object-Oriented Programming
- Practice recursion
- Build DSA fundamentals
- Maintain a record of learning progress
- Prepare for larger Java and DSA projects

> **Learn the concept → write the code → solve problems → repeat.**

---

# 📚 Topics Covered

## 1. Java Basics

The repository contains beginner-level programs for understanding the basic building blocks of Java.

Topics include:

- Variables
- Data types
- Input and output
- Type conversion
- Type casting
- Arithmetic operators
- Relational operators
- Logical operators
- Assignment operators
- Basic expressions
- Simple mathematical programs

Example:

```java
public class Demo {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int sum = a + b;

        System.out.println("Sum = " + sum);
    }
}
```

---

## 2. Conditional Statements

Decision-making is practiced using:

```text
if
if-else
else-if
nested if
```

Common practice includes:

- Even / odd numbers
- Greatest number
- Positive / negative numbers
- Comparisons
- Multiple conditions
- Basic decision-making problems

Example:

```java
if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

---

## 3. Loops

Loops are an important part of the repository because they are used heavily in pattern printing and problem solving.

### Covered concepts

- `for`
- `while`
- `do-while`
- Nested loops
- Loop control
- Repetition
- Number-based problems

Example:

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

---

# 🔢 4. Arrays

The `Array` directory contains dedicated practice programs for working with Java arrays.

Examples include:

- Array input/output
- Sum of elements
- Product of elements
- Maximum element
- Minimum element
- Negative elements
- Sorting
- Index-based operations
- Basic array manipulation

Example:

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int number : numbers) {
    System.out.println(number);
}
```

### Array folder

```text
Array/
├── AddAndMultiplyInIndexes.java
├── ArrayInputOutput.java
├── Arraybasic.java
├── MaximumElement.java
├── MinimumElement.java
├── NegativeElementsOnly.java
├── ProductOfElements.java
├── SortArrayBuildIn.java
└── SumOfElements.java
```

---

# 🧮 5. Two-Dimensional Arrays

The repository also contains programs for working with 2D arrays / matrices.

Basic concepts include:

- Matrix representation
- Rows and columns
- Nested loops
- Accessing elements
- Traversing matrices

Example structure:

```text
[ 1  2  3 ]
[ 4  5  6 ]
[ 7  8  9 ]
```

2D arrays are an important foundation for matrix-based DSA problems.

---

# 🔤 6. Strings

String-related programs are included to practice text processing in Java.

Topics include:

- String creation
- String input
- String indexing
- String manipulation
- String comparison
- Basic string operations

Example:

```java
String name = "Java";

System.out.println(name);
System.out.println(name.length());
```

---

# ⚙️ 7. Functions & Methods

The `Functions` directory contains programs for understanding methods and reusable code.

Topics include:

- Method declaration
- Method calling
- Parameters
- Return types
- Passing values
- Reusable logic
- Mathematical functions

Example:

```java
static int add(int a, int b) {
    return a + b;
}
```

---

# 🔺 8. Pattern Printing

One of the larger sections of this repository is **pattern printing**.

Pattern problems are useful for improving:

- Nested loops
- Conditions
- Row/column thinking
- Number manipulation
- Character manipulation
- Logical reasoning

### Pattern categories

#### ⭐ Star Patterns

- Square
- Rectangle
- Triangle
- Pyramid
- Diamond
- Hollow rectangle
- Plus pattern
- Cross pattern

#### 🔢 Number Patterns

- Number triangle
- Number rectangle
- Flipped number triangle
- Floyd's triangle
- Binary triangle
- Vertical number patterns
- Zoom number pattern

#### 🔤 Alphabet Patterns

- Alphabet triangle
- Alphabet pyramid
- Flipped alphabet triangle
- Vertical alphabet patterns
- Alpha-number patterns

### Pattern directory

```text
pattern_Printing/
├── AlphaNumTriangle.java
├── AlphaPattern.java
├── AlphaPattern1.java
├── AlphaPattern2.java
├── AlphaTriangle.java
├── BinaryTriangle.java
├── CrossStarPattern.java
├── Diamond.java
├── FloydsTriangle.java
├── HollowRectangle.java
├── NumPattern.java
├── NumRectangle.java
├── NumTriangle.java
├── Pyramid.java
├── RhombusPattern.java
├── StarPlusPattern.java
├── StarRectangle.java
├── StarSquare.java
├── Triangle.java
└── ...
```

---

# 🧱 9. Object-Oriented Programming

The repository includes foundational OOP concepts that are important for writing larger Java applications.

### Concepts practiced

- Classes
- Objects
- Constructors
- Methods
- Static members
- `final` keyword
- Method overloading
- Method chaining
- Encapsulation fundamentals
- Parameter passing

Example:

```java
class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }
}
```

---

# 🔁 10. Recursion

Recursion is introduced through dedicated practice programs.

Basic idea:

```text
Function
   ↓
Calls itself
   ↓
Smaller problem
   ↓
Base condition
   ↓
Return
```

Example:

```java
static int factorial(int n) {

    if (n == 0) {
        return 1;
    }

    return n * factorial(n - 1);
}
```

Recursion is an important stepping stone toward more advanced DSA topics.

---

# 🧠 11. DSA Foundations

The `dsa fundamation` directory contains foundational concepts needed before moving into advanced Data Structures and Algorithms.

Current practice includes topics such as:

- Recursion
- Constructors
- Static keyword
- Final keyword
- Method overloading
- Method chaining
- Call by value
- Call by reference concepts
- Basic problem solving

### DSA learning direction

```text
Programming Fundamentals
          ↓
Arrays
          ↓
Strings
          ↓
Recursion
          ↓
Searching
          ↓
Sorting
          ↓
Linked Lists
          ↓
Stacks & Queues
          ↓
Trees
          ↓
Graphs
          ↓
Advanced Algorithms
```

---

# 📂 Repository Structure

```text
java-learning/
│
├── Array/
│   ├── AddAndMultiplyInIndexes.java
│   ├── ArrayInputOutput.java
│   ├── Arraybasic.java
│   ├── MaximumElement.java
│   ├── MinimumElement.java
│   ├── NegativeElementsOnly.java
│   ├── ProductOfElements.java
│   ├── SortArrayBuildIn.java
│   └── SumOfElements.java
│
├── Functions/
│   ├── GreatestNum.java
│   └── ReturnType.java
│
├── basic/
│   └── Basic Java programs
│
├── basic+/
│   └── Additional Java practice
│
├── dsa fundamation/
│   ├── CollegeData.java
│   ├── Constructor.java
│   ├── FinalKeyword.java
│   ├── FunOverloading.java
│   ├── Recursion.java
│   ├── StaticKeyword.java
│   ├── callByRef.java
│   ├── callByValue.java
│   └── chaining.java
│
├── pattern_Printing/
│   └── Pattern practice programs
│
├── Arrays.java
├── TwoDArrays.java
├── Strings.java
├── String.java
├── Stringinput.java
├── loops.java
├── pattern.java
├── StaticMembers.java
├── Greater.java
├── Oddsum.java
├── avg.java
├── Injmam.java
└── README.md
```

---

# 📊 Repository Snapshot

| Area | Practice |
|---|---|
| ☕ Core Java | ✅ |
| 🔀 Conditions | ✅ |
| 🔁 Loops | ✅ |
| ⚙️ Functions | ✅ |
| 🔢 Arrays | ✅ |
| 🧮 2D Arrays | ✅ |
| 🔤 Strings | ✅ |
| 🔺 Pattern Printing | ✅ |
| 🧱 OOP Fundamentals | ✅ |
| 🔁 Recursion | ✅ |
| 🧠 DSA Foundations | ✅ |
| 🧩 Problem Solving | ✅ |

The repository currently contains **100+ Java source files**, providing a broad collection of small practice programs.

---

# 🛠️ Technologies & Tools

| Tool / Technology | Purpose |
|---|---|
| ☕ Java | Main programming language |
| 🧠 OOP | Object-oriented programming |
| 🧩 DSA | Problem-solving foundation |
| 🌿 Git | Version control |
| 🐙 GitHub | Code hosting |
| 💻 VS Code | Development environment |

---

# ⚙️ Getting Started

## 1. Clone the repository

```bash
git clone https://github.com/injmam089/java-learning.git
```

## 2. Move into the repository

```bash
cd java-learning
```

## 3. Check Java installation

```bash
java --version
```

and:

```bash
javac --version
```

If both commands return a Java version, the environment is ready.

---

## ▶️ Running a Java Program

For a simple Java file:

```bash
javac Example.java
java Example
```

For a file inside a folder:

```bash
javac Array/Arraybasic.java
```

Then run it according to the declared class name.

> **Important:** Java requires the filename and public class name to match when a class is declared `public`.

---

# 💻 Recommended Development Setup

You can use any Java-compatible IDE or editor.

### Recommended

- Visual Studio Code
- IntelliJ IDEA
- Eclipse
- Any Java-supported terminal environment

For VS Code, install:

**Extension:** Extension Pack for Java

This provides Java support, debugging, code completion, and project tools.

---

# 🧪 Learning Workflow

The repository follows a simple practice cycle:

```text
        ┌───────────────┐
        │ Learn Concept │
        └───────┬───────┘
                ↓
        ┌───────────────┐
        │ Write Program │
        └───────┬───────┘
                ↓
        ┌───────────────┐
        │ Test / Debug  │
        └───────┬───────┘
                ↓
        ┌───────────────┐
        │ Solve Similar │
        │    Problems   │
        └───────┬───────┘
                ↓
        ┌───────────────┐
        │ Build Stronger│
        │   Foundation  │
        └───────────────┘
```

---

# 📈 Learning Roadmap

### Phase 01 — Fundamentals

- [x] Variables
- [x] Data types
- [x] Operators
- [x] Input / Output
- [x] Conditions
- [x] Loops

### Phase 02 — Core Programming

- [x] Functions
- [x] Arrays
- [x] 2D Arrays
- [x] Strings
- [x] Pattern Printing

### Phase 03 — OOP

- [x] Classes & Objects
- [x] Constructors
- [x] Static members
- [x] Final keyword
- [x] Method overloading
- [x] Method chaining

### Phase 04 — DSA Foundation

- [x] Recursion
- [x] Array problem solving
- [x] Basic searching concepts
- [x] Basic sorting concepts

### Next Direction

- [ ] Advanced arrays
- [ ] Searching algorithms
- [ ] Sorting algorithms
- [ ] Linked Lists
- [ ] Stacks
- [ ] Queues
- [ ] Trees
- [ ] Graphs
- [ ] Dynamic Programming
- [ ] Competitive programming practice

---

# 🎯 Why Practice With Small Programs?

Small programs may look simple, but they help develop the fundamentals required for larger applications.

For example:

```text
Loops
  ↓
Nested Loops
  ↓
Patterns
  ↓
Arrays
  ↓
Algorithms
  ↓
Data Structures
  ↓
Real Applications
```

Understanding the fundamentals makes advanced topics easier to learn and debug.

---

# 🔐 Future Applications

Java fundamentals can later be applied to:

```text
Java
 │
 ├── 🌐 Backend Development
 │      ├── Spring Boot
 │      ├── REST APIs
 │      └── Microservices
 │
 ├── 🧠 DSA
 │      ├── Problem Solving
 │      ├── Competitive Programming
 │      └── Interview Preparation
 │
 ├── 🏢 Enterprise Applications
 │      ├── Databases
 │      ├── APIs
 │      └── Business Logic
 │
 └── 🔐 Security & Software Development
        ├── Secure APIs
        ├── Authentication
        └── Application Security
```

This repository focuses on the **Java foundation** required before moving into those areas.

---

# 🤝 Contributing

This repository is mainly a personal learning project.

However, suggestions, corrections, and improvements are welcome.

### Basic workflow

```bash
git clone https://github.com/injmam089/java-learning.git

cd java-learning

git checkout -b feature/improvement

git add .

git commit -m "Improve Java practice"

git push origin feature/improvement
```

Then create a Pull Request on GitHub.

---

# 📌 Notes

Some filenames and folder names are intentionally kept as they were created during the learning process.

The repository is focused on **learning and practice**, so not every program is designed as production-ready software.

The best way to use this repository is to read the concept, run the program, understand the logic, and then try writing the same solution independently.

---

# 👨‍💻 Author

<div align="center">

## Injmam Ansari

**BCA Student | Java | Python | Full-Stack Web Development | Cybersecurity**

[GitHub Profile](https://github.com/injmam-ansarii)

[Java Learning Repository](https://github.com/injmam089/java-learning)

</div>

---

# ⭐ Support

If this repository is useful for your own Java learning journey, consider giving it a **⭐ Star** on GitHub.

It helps keep the learning journey documented and encourages continued development.

---

<div align="center">

### ☕ Learn Java.  
### 🧠 Build Logic.  
### 💻 Solve Problems.  
### 🚀 Keep Building.

**Made with Java and consistent practice.**

</div>
