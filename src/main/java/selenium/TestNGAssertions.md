# TestNG Assertions in Selenium

Assertions compare an actual result with an expected result. They determine whether a test passes or fails.

## Hard Assertions

**Definition:** A hard assertion stops the current test method as soon as an assertion fails. TestNG marks the test as failed and does not execute the remaining statements in that test method.

Hard assertions are provided by `org.testng.Assert`.

```java
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionTest {
    @Test
    public void pageShouldShowExpectedTitle() {
        String actualTitle = "Home Page";

        Assert.assertEquals(actualTitle, "Home Page", "Unexpected page title");
        Assert.assertTrue(actualTitle.contains("Home"), "Title should contain Home");

        // This statement runs only if the assertions above pass.
        System.out.println("All hard assertions passed");
    }
}
```

If the first assertion fails, the second assertion and remaining test statements are skipped. TestNG lifecycle methods such as `@AfterMethod` are still used for cleanup.

## Soft Assertions

**Definition:** A soft assertion records a failure but allows the test method to continue, so multiple checks can be reported together.

Soft assertions are provided by `org.testng.asserts.SoftAssert`. Call `assertAll()` at the end of the test to report any recorded failures.

```java
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class SoftAssertionTest {
    @Test
    public void pageShouldShowExpectedDetails() {
        SoftAssert softAssert = new SoftAssert();

        String actualTitle = "Home Page";
        boolean logoIsDisplayed = true;
        String actualHeading = "Welcome";

        softAssert.assertEquals(actualTitle, "Dashboard", "Unexpected page title");
        softAssert.assertTrue(logoIsDisplayed, "Logo should be displayed");
        softAssert.assertEquals(actualHeading, "Welcome", "Unexpected heading");

        // Required: reports all failures collected by this SoftAssert.
        softAssert.assertAll();
    }
}
```

In this example, all three checks execute. At `assertAll()`, TestNG fails the test if one or more soft assertions failed and reports the collected failures.

## Selenium Example

```java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public void verifyPage(WebDriver driver) {
    SoftAssert softAssert = new SoftAssert();

    softAssert.assertEquals(driver.getTitle(), "Example Domain", "Wrong page title");
    softAssert.assertTrue(
        driver.findElement(By.tagName("h1")).isDisplayed(),
        "Page heading should be visible"
    );
    softAssert.assertEquals(
        driver.findElement(By.tagName("h1")).getText(),
        "Example Domain",
        "Wrong page heading"
    );

    softAssert.assertAll();
}
```

This method assumes the driver is already on the page and the heading exists. In a test, perform navigation and wait for the page or element before checking it.

## Common Assertion Methods

| Method | Purpose |
|---|---|
| `assertEquals(actual, expected)` | Checks that two values are equal |
| `assertNotEquals(actual, expected)` | Checks that two values are different |
| `assertTrue(condition)` | Checks that a condition is `true` |
| `assertFalse(condition)` | Checks that a condition is `false` |
| `assertNull(value)` | Checks that a value is `null` |
| `assertNotNull(value)` | Checks that a value is not `null` |
| `assertSame(actual, expected)` | Checks that two references point to the same object |
| `assertNotSame(actual, expected)` | Checks that two references point to different objects |
| `fail(message)` | Fails the test immediately with a message |

Both `Assert` and `SoftAssert` provide assertion methods. Prefer overloads with a message so failures are easier to diagnose.

## Hard vs. Soft Assertions

| Feature | Hard assertion (`Assert`) | Soft assertion (`SoftAssert`) |
|---|---|---|
| On failure | Stops the current test method | Records the failure and continues |
| Reporting | Fails at the assertion that breaks | Reports collected failures at `assertAll()` |
| Best for | Checks that must pass before continuing | Independent checks where one report is useful |
| Required final call | No | Yes, call `assertAll()` |

## Best Practices

- Use hard assertions when later steps depend on the check passing, such as verifying that a page loaded before interacting with it.
- Use soft assertions for independent checks where it is useful to see several failures in one run.
- Always call `assertAll()` after soft assertions. Without it, recorded failures may not fail the test.
- Create a fresh `SoftAssert` for each test method; do not reuse one across tests.
- Include a helpful failure message that says what was expected.
- Avoid checking the same condition repeatedly without adding diagnostic value.

## Interview Answer

**Question:** What is the difference between hard and soft assertions in TestNG?

**Answer:** A hard assertion stops the current test method immediately when it fails. A soft assertion records the failure and continues with later checks; `assertAll()` must be called at the end to report the failures and fail the test.
