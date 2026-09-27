# TestNG in Selenium

## Interview Definition

TestNG is a Java testing framework used to organize, run, and report automated tests. In Selenium, it provides test annotations, setup and cleanup methods, assertions, grouping, parameterization, and parallel execution.

**Parameterization** means running the same test logic with different input values instead of writing a separate test for each value. In TestNG, `@DataProvider` commonly supplies those inputs to a test method.

## Key Points

- TestNG tests are Java methods marked with `@Test`.
- Lifecycle annotations run setup and cleanup code around tests.
- Assertions verify the expected result; a failed assertion fails the test.
- `@DataProvider` runs the same test with multiple sets of data.
- Groups can organize tests, such as `smoke` and `regression`.
- `testng.xml` can select suites, tests, classes, and groups to run.

## Common Annotations

| Annotation | Purpose |
|---|---|
| `@Test` | Marks a method as a test |
| `@BeforeMethod` | Runs before each test method |
| `@AfterMethod` | Runs after each test method |
| `@BeforeClass` | Runs once before the first test method in a class |
| `@AfterClass` | Runs once after all test methods in a class |
| `@BeforeSuite` | Runs once before the suite |
| `@AfterSuite` | Runs once after the suite |
| `@DataProvider` | Supplies multiple data sets to a test |

## Selenium Example

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTitleTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://example.com");
    }

    @Test
    public void pageShouldHaveExpectedTitle() {
        Assert.assertEquals(driver.getTitle(), "Example Domain");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
```

`@BeforeMethod` creates a fresh browser for each test. `@AfterMethod(alwaysRun = true)` closes it even when a test fails.

## Common `@Test` Attributes

| Attribute | Purpose |
|---|---|
| `priority` | Controls ordering among tests; lower values run first (default is `0`). Prefer dependencies when order is a real requirement. |
| `enabled` | Enables or disables a test; `false` skips it. |
| `dependsOnMethods` | Runs a test only after the named method succeeds. |
| `dependsOnGroups` | Runs a test only after the named group succeeds. |
| `groups` | Assigns a test to groups such as `smoke` or `regression`. |
| `dataProvider` | Supplies test inputs from a method annotated with `@DataProvider`. |
| `invocationCount` | Runs the same test a specified number of times. |
| `timeOut` | Sets the maximum test duration in milliseconds. |
| `expectedExceptions` | Passes the test when the specified exception is thrown. |
| `alwaysRun` | Runs a dependent test even if a dependency failed; use carefully. |
| `description` | Adds a readable description to the test. |
| `retryAnalyzer` | Selects a retry analyzer for failed tests. |

```java
@Test(priority = 1, groups = { "smoke" }, timeOut = 5000)
public void homePageShouldLoad() {
    // Test steps and assertions
}

@Test(dependsOnMethods = "homePageShouldLoad", enabled = true)
public void loginShouldWork() {
    // This test runs after homePageShouldLoad succeeds
}
```

`enabled = false` is useful for temporarily disabling a test, but avoid leaving tests disabled unnoticed. `dependsOnMethods` creates a hard dependency: if the prerequisite fails, the dependent test is skipped.

## Parallel Execution

**Parallel execution** means running multiple tests at the same time on separate threads. It can reduce the overall test run time.

Configure parallel execution in `testng.xml` with a `parallel` mode and `thread-count`:

```xml
<suite name="SeleniumSuite" parallel="tests" thread-count="2">
    <test name="SmokeTests">
        <classes>
            <class name="selenium.LoginTest"/>
        </classes>
    </test>
    <test name="SearchTests">
        <classes>
            <class name="selenium.SearchTest"/>
        </classes>
    </test>
</suite>
```

Common `parallel` modes are `tests`, `classes`, `methods`, and `instances`. `thread-count` sets the maximum number of worker threads. A data provider can also run its rows in parallel with `@DataProvider(parallel = true)`.

**Selenium caution:** Do not share one `WebDriver` instance between tests running at the same time. Give each concurrent test its own driver and quit it during cleanup.

## DataProvider Example

**Definition:** `@DataProvider` marks a method that supplies input data to a TestNG test. TestNG runs the test once for each data set returned by the provider.

```java
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchTest {
    @DataProvider(name = "searchTerms")
    public Object[][] searchTerms() {
        return new Object[][] {
            { "Selenium" },
            { "TestNG" }
        };
    }

    @Test(dataProvider = "searchTerms")
    public void searchShouldUseEachTerm(String term) {
        System.out.println("Searching for: " + term);
    }
}
```

## Interview Points

- `@BeforeMethod` and `@AfterMethod` run around every test method; `@BeforeClass` and `@AfterClass` run once per class.
- `Assert.assertEquals(actual, expected)` compares values; `Assert.assertTrue(condition)` checks a condition.
- Use `@DataProvider` when the same test needs to run with multiple inputs.
- Use groups to select related tests, for example smoke tests without running the full regression suite.
- Use `testng.xml` to select tests and groups, define parameters with `<parameter>`, or configure suite-level settings such as parallel execution.
- Keep browser setup and cleanup in lifecycle methods so each test is easier to maintain.

## Setup Note

The Selenium example requires TestNG and Selenium dependencies in `pom.xml`. Add them with test scope before running the example with Maven.