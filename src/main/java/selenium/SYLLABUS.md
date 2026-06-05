# Selenium WebDriver - Complete Learning Syllabus

## Course Overview
Complete journey from beginner to advanced Selenium automation testing

---

## **PHASE 1: FOUNDATIONS (Days 1-5)**

### Day 1: Introduction to Selenium
- What is Selenium?
- History and Evolution
- Selenium Suite (IDE, RC, WebDriver, Grid)
- Why WebDriver?
- Use cases and limitations
- **Practice:** Understand concepts

### Day 2: Environment Setup
- Java installation and configuration
- Maven setup
- IDE setup (VS Code/IntelliJ)
- Adding Selenium dependency to pom.xml
- Browser driver setup (ChromeDriver, FirefoxDriver)
- **Practice:** Create first Maven project

### Day 3: WebDriver Introduction
- WebDriver interface
- Creating WebDriver instances
- Browser initialization (Chrome, Firefox, Edge, Safari)
- Basic browser operations
  - get()
  - navigate()
  - quit() vs close()
- **Practice:** Launch and close different browsers

### Day 4: Browser Navigation & Window Management
- navigate().to()
- navigate().back()
- navigate().forward()
- navigate().refresh()
- get() vs navigate().to()
- Window/Tab management
- **Practice:** Create navigation demo

### Day 5: Implicit & Explicit Waits
- Why waits are needed
- Implicit wait
- Explicit wait (WebDriverWait)
- Expected conditions
- Thread.sleep() vs WebDriverWait
- **Practice:** Implement waits in scripts

---

## **PHASE 2: LOCATORS & ELEMENTS (Days 6-12)**

### Day 6: Locator Strategies - Part 1
- ID locator (By.id())
- Name locator (By.name())
- Class name locator (By.className())
- Tag name locator (By.tagName())
- **Practice:** Identify locators on real websites

### Day 7: Locator Strategies - Part 2
- CSS Selector (By.cssSelector())
- CSS selector syntax
- Common CSS patterns
- Advantages over XPath
- **Practice:** Write CSS selectors for elements

### Day 8: XPath - Part 1
- XPath basics
- Absolute XPath
- Relative XPath
- XPath syntax
- Simple XPath expressions
- **Practice:** Write XPath for elements

### Day 9: XPath - Part 2
- XPath with attributes
- XPath with text()
- XPath with contains()
- XPath with starts-with()
- XPath wildcards
- **Practice:** Complex XPath expressions

### Day 10: Link Text Locator
- By.linkText()
- By.partialLinkText()
- Finding links on page
- **Practice:** Locate links

### Day 11: Finding Multiple Elements
- findElements() vs findElement()
- Handling collections
- Iterating through elements
- Handling NoSuchElementException
- **Practice:** Find and interact with multiple elements

### Day 12: Advanced Locator Techniques
- Handling dynamic elements
- XPath with following-sibling
- XPath with preceding-sibling
- XPath with ancestor
- Best practices for locators
- **Practice:** Handle dynamic elements

---

## **PHASE 3: ELEMENT INTERACTIONS (Days 13-18)**

### Day 13: WebElement Methods - Part 1
- click()
- sendKeys()
- clear()
- getText()
- **Practice:** Interact with basic elements

### Day 14: WebElement Methods - Part 2
- submit()
- isDisplayed()
- isEnabled()
- isSelected()
- getTagName()
- **Practice:** Check element properties

### Day 15: WebElement Methods - Part 3
- getAttribute()
- getCssValue()
- getSize()
- getLocation()
- getRect()
- **Practice:** Get element attributes and properties

### Day 16: Select Class for Dropdowns - Part 1
- Select class introduction
- selectByValue()
- selectByVisibleText()
- selectByIndex()
- **Practice:** Select dropdown options

### Day 17: Select Class for Dropdowns - Part 2
- deselectByValue()
- deselectByVisibleText()
- deselectByIndex()
- deselectAll()
- getAllSelectedOptions()
- getOptions()
- Multi-select handling
- **Practice:** Handle multi-select dropdowns

### Day 18: Handling Special Elements
- File upload (sendKeys for input[type=file])
- Alerts (accept, dismiss, getText, sendKeys)
- Handling iframes (switchTo().frame())
- Window/Tab switching (switchTo().window())
- **Practice:** Handle alerts and iframes

---

## **PHASE 4: ACTIONS & ADVANCED INTERACTIONS (Days 19-22)**

### Day 19: Actions Class - Part 1
- Introduction to Actions
- Hover (moveToElement())
- Mouse operations
- **Practice:** Hover on elements

### Day 20: Actions Class - Part 2
- Double-click (doubleClick())
- Right-click (contextClick())
- Drag and drop (dragAndDrop())
- **Practice:** Advanced mouse actions

### Day 21: Actions Class - Part 3
- Key combinations (keyDown, keyUp)
- Modifier keys (Shift, Ctrl, Alt)
- Building action chains
- perform()
- **Practice:** Key combinations and chains

### Day 22: JavaScript Executor
- executeScript()
- executeAsyncScript()
- Scroll operations
- Click hidden elements
- Set/Get element values
- **Practice:** JavaScript execution

---

## **PHASE 5: WAITS & SYNCHRONIZATION (Days 23-25)**

### Day 23: Explicit Waits - Advanced
- WebDriverWait with timeout
- All ExpectedConditions
- Fluent waits
- Custom expected conditions
- **Practice:** Complex wait scenarios

### Day 24: Wait Strategies
- When to use implicit vs explicit
- Handling stale elements
- Waits best practices
- **Practice:** Different wait scenarios

### Day 25: Handling Timeouts & Exceptions
- TimeoutException
- NoSuchElementException
- StaleElementReferenceException
- ElementNotInteractableException
- Recovery strategies
- **Practice:** Exception handling

---

## **PHASE 6: FRAME & WINDOW HANDLING (Days 26-27)**

### Day 26: iFrames & Frames
- Frame vs iFrame
- switchTo().frame() by index
- switchTo().frame() by name
- switchTo().frame() by WebElement
- switchTo().parentFrame()
- switchTo().defaultContent()
- **Practice:** Navigate iframes

### Day 27: Multiple Windows & Tabs
- Opening new windows
- Switching between windows
- getWindowHandle()
- getWindowHandles()
- Window switching logic
- **Practice:** Handle multiple windows

---

## **PHASE 7: FORM HANDLING (Days 28-30)**

### Day 28: Form Input
- Text input (sendKeys)
- Radio buttons (click, select)
- Checkboxes (click, isSelected)
- Clear vs clear()
- **Practice:** Fill complex forms

### Day 29: Dropdown Handling
- Single select dropdown
- Multi-select dropdown
- Custom dropdowns (div/span based)
- Handling dynamic dropdowns
- **Practice:** Different dropdown types

### Day 30: Form Submission
- submit() method
- Click submit button
- Form validation
- Error messages
- **Practice:** Complete form workflows

---

## **PHASE 8: NAVIGATION & URL (Days 31-33)**

### Day 31: Browser Navigation
- navigate().to()
- navigate().back()
- navigate().forward()
- navigate().refresh()
- getCurrentUrl()
- getTitle()
- getPageSource()
- **Practice:** Navigation scenarios

### Day 32: URL Handling
- Getting current URL
- URL validation
- Parameter extraction
- Relative vs Absolute URLs
- **Practice:** URL operations

### Day 33: Browser History
- Managing browser history
- Back/Forward operations
- Refresh operations
- **Practice:** History scenarios

---

## **PHASE 9: COOKIES & STORAGE (Days 34-35)**

### Day 34: Cookie Management
- addCookie()
- getCookie()
- getCookies()
- deleteCookie()
- deleteAllCookies()
- Cookie attributes
- **Practice:** Cookie operations

### Day 35: Local & Session Storage
- JavaScript for localStorage
- JavaScript for sessionStorage
- Data persistence
- **Practice:** Storage operations

---

## **PHASE 10: TESTING FRAMEWORK INTEGRATION (Days 36-40)**

### Day 36: TestNG Integration - Part 1
- TestNG basics
- @Test, @BeforeMethod, @AfterMethod
- @BeforeClass, @AfterClass
- @BeforeSuite, @AfterSuite
- **Practice:** Create TestNG tests

### Day 37: TestNG Integration - Part 2
- Assertions
- Expected vs Actual
- Soft assertions vs Hard assertions
- Assert methods
- **Practice:** Add assertions

### Day 38: Test Execution & Reporting
- Running tests
- Test reports generation
- Parameterization (@Parameters)
- **Practice:** Run parameterized tests

### Day 39: Test Organization
- Test suites
- Test groups
- Priorities
- Dependencies
- **Practice:** Organize tests

### Day 40: Screenshots & Logs
- Taking screenshots
- Screenshot naming
- Logging
- Attaching to reports
- **Practice:** Add logging & screenshots

---

## **PHASE 11: PAGE OBJECT MODEL (Days 41-45)**

### Day 41: POM Introduction
- What is Page Object Model?
- Advantages
- Structure
- **Practice:** Understand POM

### Day 42: Creating Page Objects
- Locators in POM
- Page methods
- Page initialization
- Constructor
- **Practice:** Create first page object

### Day 43: POM Best Practices
- Naming conventions
- Method design
- Data separation
- Reusability
- **Practice:** POM design patterns

### Day 44: Test Cases with POM
- Writing test classes
- Using page objects
- Test organization
- **Practice:** Write POM tests

### Day 45: Advanced POM
- PageFactory
- FindBy annotations
- Lazy initialization
- Custom annotations
- **Practice:** Advanced POM techniques

---

## **PHASE 12: ADVANCED TOPICS (Days 46-50)**

### Day 46: Database Integration
- JDBC connection
- Query execution
- Data validation
- **Practice:** DB integration

### Day 47: API Testing with Selenium
- HttpClient/RestAssured basics
- API validation
- Database vs API validation
- **Practice:** API testing

### Day 48: Parallel Execution
- TestNG parallel execution
- Thread safety
- Shared vs Independent resources
- **Practice:** Parallel tests

### Day 49: CI/CD Integration
- Jenkins setup
- Git integration
- Build triggers
- Test reports in Jenkins
- **Practice:** Run tests in CI/CD

### Day 50: Performance & Best Practices
- Script optimization
- Waits optimization
- Memory management
- Common mistakes
- **Practice:** Optimize scripts

---

## **PHASE 13: REAL-WORLD SCENARIOS (Days 51-60)**

### Day 51-55: Project 1 - E-commerce Testing
- Login/Registration
- Product search
- Add to cart
- Checkout process
- Order confirmation
- **Deliverable:** Complete test suite

### Day 56-60: Project 2 - Complex Application Testing
- Multi-page workflow
- Database validation
- API integration
- Advanced reporting
- **Deliverable:** Enterprise-level tests

---

## **ADVANCED TOPICS (Optional)**

### Selenium Grid
- Grid setup
- Remote execution
- Cross-browser testing
- Parallel execution on Grid

### Mobile Testing with Appium
- Appium basics
- Android testing
- iOS testing
- Switching from Web to Mobile

### Visual Testing
- Visual regression
- Screenshot comparison
- Percy/Applitools

### Performance Testing
- Lighthouse
- Web Vitals
- Performance metrics

---

## **Interview Preparation (60+ days)**

### Key Topics to Master:
- WebDriver architecture
- Locator strategies pros/cons
- Wait mechanisms
- Exception handling
- POM design
- Test data management
- Assertion strategies
- Debugging techniques
- Real-world challenges

### Sample Interview Questions:
1. Difference between implicit and explicit wait
2. When would you use each wait type?
3. How to handle dynamic elements?
4. Explain Page Object Model
5. How to handle StaleElementReferenceException?
6. Difference between quit() and close()
7. How to handle alerts?
8. How to switch between iframes?
9. Best practices for locators
10. How to organize test cases?

---

## **Assessment Checkpoints**

- [ ] **Day 5:** Can launch/close browsers
- [ ] **Day 12:** Can locate any element
- [ ] **Day 18:** Can interact with elements
- [ ] **Day 25:** Can handle waits properly
- [ ] **Day 35:** Can manage navigation & storage
- [ ] **Day 40:** Can write testable code
- [ ] **Day 45:** Can implement POM
- [ ] **Day 50:** Can optimize scripts
- [ ] **Day 60:** Can build enterprise tests

---

## **Resources**

### Official Documentation
- [Selenium Official Docs](https://www.selenium.dev/documentation/)
- [WebDriver API](https://www.selenium.dev/documentation/webdriver/)

### Practice Websites
- automationpractice.com
- letskodeit.com
- orangehrmlive.com
- swaglab.com

### Tools & Libraries
- Selenium WebDriver
- TestNG
- Maven
- Git/GitHub

---

**Total Duration:** 60 days (with practice)  
**Daily Effort:** 2-3 hours  
**Difficulty:** Beginner → Advanced
