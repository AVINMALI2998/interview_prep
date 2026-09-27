# Hybrid Selenium Framework with Maven and TestNG

## 1. What Is a Test Automation Framework?

A test automation framework is an organized way to write, run, and maintain automated tests. It provides a common structure and reusable code, so each test does not need to repeat tasks like opening the browser, finding elements, waiting, and reporting results.

Think of it as a set of project folders and shared rules that helps keep automation code consistent and easier to update.

## 2. What Is a Hybrid Framework?

A hybrid framework combines useful approaches in one test project. A common Selenium example combines:

- **Page Object Model (POM):** keeps page locators and browser actions in page classes, separate from the test steps.
- **Data-driven testing:** runs a test with different input values, often supplied by TestNG `@DataProvider`.
- **Reusable utilities:** hold shared tasks such as browser setup, waits, reading configuration, and taking screenshots.

The exact combination depends on the project. Excel-based data and keyword-driven testing are optional; they are not required in every hybrid framework.

## 3. Tools Used

- **Selenium** controls the browser and interacts with the web application.
- **TestNG** organizes and runs tests, provides annotations and assertions, and supports data providers and reports.
- **Maven** manages project dependencies and runs the test build.

Each tool has a separate job; together they support the test framework.

## 4. Example Project Structure

```text
hybrid-selenium-framework/                 # Project root
|-- pom.xml                                # Maven dependencies and build settings
|-- src/test/java/com/example/framework/   # Java test and framework code
|   |-- base/BaseTest.java                 # Shared browser setup and cleanup for tests
|   |-- driver/DriverFactory.java          # Creates browser drivers
|   |-- pages/LoginPage.java               # Login page locators and actions
|   |-- tests/LoginTest.java               # Login test scenarios and checks
|   |-- data/TestDataProvider.java         # Supplies test data to TestNG
|   |-- utils/ConfigReader.java            # Reads configuration settings
|   |-- utils/WaitUtils.java               # Reusable browser wait helpers
|   |-- listeners/TestListener.java        # Handles test events and failure screenshots
|-- src/test/resources/                    # Test configuration and data files
|   |-- config.properties                  # Browser and application settings
|   |-- testng.xml                          # Selects tests and suite options
|   |-- testdata/login-data.xlsx           # Optional Excel test data
|-- target/surefire-reports/               # Generated Maven test reports
```

The folders under `src/test/java` contain Java test code. The files under `src/test/resources` contain settings and test-run configuration. Maven creates `target` output when the project is built; it is not usually written by hand.

## 5. What Each Part Does

- `pom.xml`: lists libraries such as Selenium and TestNG; Maven uses it to build and run the project.
- `DriverFactory`: creates a browser driver, for example ChromeDriver.
- `BaseTest`: starts the browser before a test and closes it afterward.
- `pages`: contains page classes, such as `LoginPage`, with locators and actions for that page.
- `tests`: contains test scenarios and checks the expected results with assertions.
- `data`: supplies test inputs, for example through a TestNG `@DataProvider`.
- `utils`: contains shared helper code, such as waits and reading settings.
- `config.properties`: stores settings such as the browser or application URL.
- `testng.xml`: selects which tests or groups TestNG should run.
- `TestListener`: observes test results and can capture a screenshot when a test fails.
- `target/surefire-reports`: contains test result reports created by Maven Surefire.

## 6. How a Test Runs

Example: testing a login page.

1. Maven starts the test run and TestNG selects the login test.
2. `BaseTest` and `DriverFactory` start the browser and open the application.
3. The test gets input data and calls methods in `LoginPage` to enter credentials and submit the form.
4. Assertions check whether the expected result appears.
5. The listener can record the result and take a screenshot if the test fails.
6. Cleanup closes the browser, and Maven stores the test results.

Keeping the test steps separate from page locators means that if a locator changes, it can usually be updated in `LoginPage` without changing every test.

## 7. Running and Reporting

- Run the tests with `mvn test` after TestNG and the Maven Surefire plugin are configured in `pom.xml`.
- Surefire writes test results to `target/surefire-reports/`.
- ExtentReports is an optional library for a richer HTML report with steps and screenshots; it is not required to run tests.

## 8. Simple Interview Answer

> A test automation framework is an organized structure for writing and running tests. My Selenium hybrid framework combines Page Object Model and data-driven testing, with reusable setup and utility code. Selenium controls the browser, TestNG runs the tests and checks results, and Maven manages dependencies and the test run. Reports show which tests passed or failed, and a listener can capture screenshots for failures.

## Good Practices

- Keep page locators and actions in page classes instead of duplicating them across tests.
- Keep tests independent and give each parallel test its own WebDriver.
- Store changeable settings outside the test code.
- Always close the browser during cleanup, including when a test fails.