# Interview Prep - Java Project

A comprehensive Java project for interview preparation with algorithms and data structures practice.

## Project Structure

```
interview_prep/
├── src/
│   ├── main/java/programs/
│   │   ├── arrays/
│   │   │   ├── DuplicateIntegerInArray.java
│   │   │   ├── DuplicateStringInArray.java
│   │   │   ├── FindMaximum.java
│   │   │   ├── FindMinimum.java
│   │   │   ├── reversearray.java
│   │   │   ├── secondlargeNumber.java
│   │   │   ├── SumOfArray.java
│   │   │   └── TwoPointerArray.java
│   │   ├── strings/
│   │   │   ├── DuplicateCharacterCounter.java
│   │   │   ├── ReverseString.java
│   │   │   ├── ReverseWords.java
│   │   │   ├── StringDemo.java
│   │   │   ├── StringReplace.java
│   │   │   ├── StringReversal.java
│   │   │   ├── StringTrim.java
│   │   │   ├── SubstringChecker.java
│   │   │   ├── SwapWords.java
│   │   │   └── WordReversal.java
│   │   ├── collections/
│   │   │   ├── ArrayListCode.java
│   │   │   ├── HashMapCode.java
│   │   │   ├── MapOperations.java
│   │   │   └── SetOperations.java
│   │   └── general/
│   │       ├── Armstrong.java
│   │       ├── Factorial.java
│   │       ├── Fibonacci.java
│   │       ├── Palindrome.java
│   │       ├── PrimeNo.java
│   │       └── PrintPrimeNumbers.java
│   └── test/java/programs/
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
3. Run specific programs:
   ```bash
   mvn exec:java -Dexec.mainClass=programs.arrays.DuplicateIntegerInArray
   mvn exec:java -Dexec.mainClass=programs.strings.ReverseString
   mvn exec:java -Dexec.mainClass=programs.collections.MapOperations
   ```

## Program Categories

### Arrays (`programs.arrays`)
Array manipulation, duplicate detection, searching, and sorting.
- **DuplicateIntegerInArray** - Find duplicate integers in array
- **DuplicateStringInArray** - Find duplicate strings in array
- **FindMaximum** - Find maximum element
- **FindMinimum** - Find minimum element
- **reversearray** - Reverse array elements
- **secondlargeNumber** - Find second largest number
- **SumOfArray** - Calculate array sum
- **TwoPointerArray** - Two-pointer technique

### Strings (`programs.strings`)
String manipulation, pattern matching, and text processing.
- **DuplicateCharacterCounter** - Count duplicate characters
- **ReverseString** - Reverse a string
- **ReverseWords** - Reverse words in a string
- **StringDemo** - String demonstrations
- **StringReplace** - Replace characters/strings
- **StringReversal** - String reversal techniques
- **StringTrim** - Trim whitespace
- **SubstringChecker** - Check for substrings
- **SwapWords** - Swap words in strings
- **WordReversal** - Reverse individual words

### Collections (`programs.collections`)
Data structures and Java Collections Framework.
- **ArrayListCode** - ArrayList operations
- **HashMapCode** - HashMap operations
- **MapOperations** - Map interface operations
- **SetOperations** - Set interface operations

### General (`programs.general`)
Mathematical and algorithmic problems.
- **Armstrong** - Armstrong number checker
- **Factorial** - Factorial calculation
- **Fibonacci** - Fibonacci sequence
- **Palindrome** - Palindrome checker
- **PrimeNo** - Prime number checker
- **PrintPrimeNumbers** - Generate prime numbers
