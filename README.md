# Interview Prep - Comprehensive Learning Framework

A complete Maven-based Java project for interview preparation covering **core algorithms, automation testing, QA methodologies, and Agile practices**.

## 📚 Complete Learning Structure

```
interview_prep/
├── src/main/java/
│   ├── programs/                    # Core Algorithms & Data Structures
│   │   ├── arrays/                  # Array manipulation, searching, sorting
│   │   ├── strings/                 # String operations and manipulations
│   │   ├── collections/             # Collections framework (List, Map, Set)
│   │   └── general/                 # General programming (Fibonacci, Prime, etc.)
│   │
│   ├── selenium/                    # Selenium WebDriver - 60-Day Syllabus
│   │   ├── SYLLABUS.md             # Complete 60-day learning path
│   │   ├── SeleniumBasics.java      # Starter template
│   │   └── overview.md              # Key concepts overview
│   │
│   ├── playwright/                  # Playwright - Modern Browser Automation
│   │   ├── PlaywrightBasics.java    # Starter template
│   │   └── overview.md              # Key concepts overview
│   │
│   ├── soapapi/                     # SOAP Web Services
│   │   ├── SoapClientDemo.java      # SOAP client template
│   │   └── overview.md              # Key concepts overview
│   │
│   ├── agile/                       # Agile Testing - 60-Day Syllabus
│   │   ├── SYLLABUS.md             # Complete Agile framework coverage
│   │   └── overview.md              # Agile principles overview
│   │
│   └── qa/                          # QA Testing - 60-Day Comprehensive Syllabus
│       ├── SYLLABUS.md             # All QA aspects (Functional, Non-Functional, etc.)
│       └── overview.md              # QA overview
│
├── pom.xml                          # Maven configuration
└── README.md
```

## 🎯 Learning Paths

### 1. **Core Java & DSA** (`programs/`)
Master fundamental algorithms and data structures:
- **Arrays**: Searching, sorting, manipulation (8 programs)
- **Strings**: Operations, reversals, transformations (10 programs)
- **Collections**: ArrayList, HashMap, Set operations (4 programs)
- **General**: Fibonacci, Prime numbers, Armstrong, Factorial

### 2. **Selenium WebDriver** (`selenium/`)
**60-Day Complete Course** - Beginner to Advanced
- **Phase 1-2**: Foundations & Locators (Days 1-12)
- **Phase 3-4**: Element Interactions & Actions (Days 13-22)
- **Phase 5-6**: Waits & Window Handling (Days 23-27)
- **Phase 7-11**: Forms, Navigation, Cookies, Testing Framework, POM (Days 28-45)
- **Phase 12-13**: Advanced topics & Real-world projects (Days 46-60)

**Key Topics**: WebDriver, Locators (XPath, CSS), Waits, Actions, POM, TestNG, Assertions, Database Integration, CI/CD

### 3. **Playwright** (`playwright/`)
Modern browser automation library covering:
- Cross-browser automation (Chrome, Firefox, Safari)
- Network request interception
- Screenshot & video recording
- API testing alongside UI
- Performance & reliability

### 4. **SOAP Web Services** (`soapapi/`)
Enterprise web service integration:
- WSDL fundamentals
- SOAP request/response
- Service client creation
- Error handling & SOAP faults

### 5. **Agile Testing** (`agile/`)
**60-Day Complete Course** - Master Agile methodologies
- **Phase 1-2**: Agile Fundamentals & Scrum (Days 1-12)
- **Phase 3-5**: Kanban, Testing in Agile, Team Dynamics (Days 13-30)
- **Phase 6-8**: Agile Testing Practices & Tools (Days 31-45)
- **Phase 9-10**: Certifications & Real-world Projects (Days 46-60)

**Key Topics**: Scrum, Kanban, User Stories, Sprint Planning, TDD, BDD, CI/CD, Agile Metrics, Team Collaboration

### 6. **QA Testing** (`qa/`)
**60-Day Comprehensive Course** - All QA aspects
- **Phase 1-2**: Testing Fundamentals & Design (Days 1-15)
- **Phase 3-5**: Functional & Non-Functional Testing (Days 16-40)
- **Phase 6-7**: Test Planning, Management & Environment (Days 41-55)
- **Phase 8-9**: Tools, Best Practices & Career (Days 56-60)

**Key Topics**: 
- Testing Principles & SDLC/STLC
- Test Design Techniques (EP, BVA, Decision Tables)
- Functional Testing (Login, Registration, Payment, Search)
- Non-Functional Testing (Performance, Security, Usability, Compatibility)
- Defect Management & Reporting
- Test Planning & Estimation
- Quality Metrics & Reporting

## Prerequisites

- **Java**: 11 or higher
- **Maven**: 3.6+
- **Git**: For version control
- **IDE**: VS Code or IntelliJ IDEA recommended

## Build Commands

```bash
# Compile the project
mvn clean compile

# Run main program
mvn exec:java

# Run tests
mvn test

# Clean build
mvn clean
```

## How to Use This Repository

### For Learning
1. **Start with `programs/`** - Build DSA foundation
2. **Pick a skill path**:
   - Want automation? → Learn **Selenium** (60 days)
   - Want modern automation? → Learn **Playwright** (Optional)
   - Want testing concepts? → Learn **QA** (60 days)
   - Want Agile knowledge? → Learn **Agile** (60 days)
   - Want web services? → Learn **SOAP API**

3. **Follow the SYLLABUS.md** in each folder for structured learning
4. **Create daily notes** as `DayX_Topic.md` in each folder
5. **Push progress to GitHub** regularly

### For Interview Prep
- Review **Interview Preparation** sections in each SYLLABUS
- Master **key topics** listed in each folder
- Study **sample interview questions**
- Work through **real-world projects** at the end of each course

### For Practice
```bash
# Navigate to specific folder
cd src/main/java/selenium

# Create your daily practice notes
# Example: Day1_Introduction.md

# Write practice code in provided templates
# (SeleniumBasics.java, PlaywrightBasics.java, etc.)
```

## Project Configuration

- **Language**: Java 11
- **Build System**: Maven
- **Main Class**: programs.Main
- **Test Framework**: JUnit 4, TestNG
- **Dependencies**: Selenium, Playwright, TestNG

## Resources & Documentation

Each folder contains:
- `SYLLABUS.md` - Complete 60-day structured course
- `overview.md` - Key concepts and learning objectives
- Starter Java files with examples and TODOs

### Official Resources
- [Selenium Docs](https://www.selenium.dev/documentation/)
- [Playwright Docs](https://playwright.dev/)
- [ISTQB QA Certification](https://www.istqb.org/)
- [Scrum.org](https://www.scrum.org/)
- [Agile Manifesto](https://agilemanifesto.org/)

## Study Schedule

Recommended daily schedule:
- **Core Programs**: 1-2 hours (practice algorithms)
- **Skill Course**: 2-3 hours (follow SYLLABUS)
- **Total**: 3-5 hours daily

**Timeline**:
- Week 1: Setup + Fundamentals
- Weeks 2-12: Intensive learning (Each course = 60 days)
- Ongoing: Practice & interview prep

## Git Workflow

```bash
# Add daily progress
git add .

# Commit with meaningful message
git commit -m "Day X - Topic: Add notes and practice code"

# Push to remote
git push origin main
```

## Next Steps

1. ✅ Clone/fork this repository
2. ✅ Choose your learning path
3. ✅ Start with core `programs/` folder
4. ✅ Pick a skill (Selenium, QA, Agile, etc.)
5. ✅ Follow the 60-day SYLLABUS
6. ✅ Create daily learning notes
7. ✅ Push progress to GitHub
8. ✅ Track your growth!

---

**Total Learning Content**: 240+ hours of structured learning
**Interview Ready**: Yes, with comprehensive coverage
**Real-world Projects**: Included in each syllabus

Happy Learning! 🚀
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
