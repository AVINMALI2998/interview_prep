# Common Selenium Exceptions and Handling

Use waits and correct the underlying cause instead of catching and ignoring exceptions.

Examples below assume `driver` and this wait are already initialized:

```java
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
```

Required imports for the examples:

```java
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
```

## 1. NoSuchElementException

**Cause:** The locator did not find an element, often because it has not loaded yet or the locator is incorrect.

**Handling:** Verify the locator and wait for the element.

```java
WebElement username = wait.until(
    ExpectedConditions.presenceOfElementLocated(By.id("username"))
);
```

## 2. StaleElementReferenceException

**Cause:** The page updated or re-rendered after the element was found, making the old reference stale.

**Handling:** Locate the element again after the update instead of reusing the old `WebElement`.

```java
WebElement saveButton = wait.until(
    ExpectedConditions.elementToBeClickable(By.id("save"))
);
saveButton.click();
```

## 3. ElementNotInteractableException

**Cause:** The element is hidden, disabled, or otherwise not ready for the requested action.

**Handling:** Wait until it is visible and enabled; check that the page is in the expected state.

```java
WebElement email = wait.until(
    ExpectedConditions.elementToBeClickable(By.id("email"))
);
email.sendKeys("user@example.com");
```

## 4. ElementClickInterceptedException

**Cause:** Another element, such as a loading overlay or dialog, is covering the target.

**Handling:** Wait for the covering element to disappear, then click the target.

```java
wait.until(ExpectedConditions.invisibilityOfElementLocated(
    By.cssSelector(".loading-overlay")
));
wait.until(ExpectedConditions.elementToBeClickable(By.id("submit"))).click();
```

## 5. TimeoutException

**Cause:** A wait condition did not become true before its timeout.

**Handling:** Check the locator and expected condition. Let the test fail with a useful message if the condition is required.

```java
try {
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
} catch (TimeoutException e) {
    throw new AssertionError("Result did not become visible", e);
}
```

## 6. NoSuchFrameException

**Cause:** The frame does not exist, has not loaded, or the wrong frame was selected.

**Handling:** Use an explicit wait to locate and switch to the frame.

```java
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("payment-frame")));
```

## 7. NoSuchWindowException

**Cause:** The requested window handle is invalid or that window has already closed.

**Handling:** Check that the handle is still open before switching.

```java
if (driver.getWindowHandles().contains(targetHandle)) {
    driver.switchTo().window(targetHandle);
} else {
    throw new NoSuchWindowException("Target window is no longer open");
}
```

## 8. NoAlertPresentException

**Cause:** The code tried to interact with an alert before it appeared, or no alert was opened.

**Handling:** Wait for the alert before accepting or dismissing it.

```java
Alert alert = wait.until(ExpectedConditions.alertIsPresent());
alert.accept();
```

## 9. InvalidSelectorException

**Cause:** The XPath or CSS selector has invalid syntax.

**Handling:** Correct and verify the selector; waiting will not fix invalid syntax.

```java
By emailField = By.xpath("//input[@name='email']");
driver.findElement(emailField).sendKeys("user@example.com");
```

## 10. SessionNotCreatedException

**Cause:** WebDriver could not start a browser session, commonly due to browser and driver incompatibility or a browser setup issue.

**Handling:** Check the browser installation and use a compatible driver. Selenium Manager can manage the driver in supported Selenium versions; a wait cannot fix a session startup problem.

## Best Practices

- Prefer explicit waits for elements and browser conditions.
- Re-find elements after page updates instead of retrying stale references blindly.
- Catch a specific exception only when the test can take a meaningful action; do not silently ignore failures.