# Interview Prep - Java Project

A Java project for interview preparation and practice.

## Project Structure

```
interview_prep/
├── src/
│   ├── main/java/programs/
│   │   ├── Main.java (Entry point)
│   │   ├── strings/
│   │   │   ├── ReverseString.java
│   │   │   ├── PalindromeChecker.java
│   │   │   └── AnagramChecker.java
│   │   ├── arrays/
│   │   │   ├── SortingAlgorithms.java
│   │   │   ├── TwoPointerArray.java
│   │   │   └── ArraySearch.java
│   │   └── collections/
│   │       ├── MapOperations.java
│   │       ├── ListManipulation.java
│   │       └── SetOperations.java
│   └── test/java/programs/
│       ├── strings/
│       ├── arrays/
│       └── collections/
├── pom.xml
└── README.md
```

## Prerequisites

- Java 11 or higher
- Maven 3.6.0 or higher

## Building the Project

To compile the project, run:

```bash
mvn clean compile
```

## Running the Project

To run the application:

```bash
mvn exec:java
```

Or compile and run:

```bash
mvn clean compile exec:java
```

## Testing

To run tests:

```bash
mvn test
```

## Dependencies

- **JUnit 4.13.2** - For unit testing

## Getting Started

1. Open the project in Visual Studio Code
2. Build the project with `mvn clean compile`
3. Run the main application with `mvn exec:java`
4. Run specific programs by their package:
   - `mvn exec:java -Dexec.mainClass=programs.strings.ReverseString`
   - `mvn exec:java -Dexec.mainClass=programs.arrays.SortingAlgorithms`
   - `mvn exec:java -Dexec.mainClass=programs.collections.MapOperations`

## Project Organization

### Strings (`programs.strings`)
String manipulation, pattern matching, and text processing algorithms.
- ReverseString, PalindromeChecker, AnagramChecker

### Arrays (`programs.arrays`)
Array operations, sorting, searching, and two-pointer techniques.
- SortingAlgorithms, TwoPointerArray, ArraySearch

### Collections (`programs.collections`)
Data structures including HashMaps, ArrayLists, Sets, and other Java Collections.
- MapOperations, ListManipulation, SetOperations
