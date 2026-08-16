# Explicit Wait in Selenium

## Code Example

```java
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
element.sendKeys("testuser");
```

## What is Explicit Wait?

- A specific wait for a particular element or condition
- Applies only to the element you're waiting for (not global like implicit wait)
- More flexible and recommended over implicit wait

## How It Works

### Step 1: Create WebDriverWait Object
```java
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
```
- Specify driver and maximum wait time (10 seconds)

### Step 2: Wait Until Condition
```java
wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")))
```
- Polls the condition every 500ms (default)
- Returns immediately when condition is met
- Throws TimeoutException if condition not met within 10 seconds

## Common Expected Conditions

```java
// Element is visible
ExpectedConditions.visibilityOfElementLocated(By.id("username"));

// Element is clickable
ExpectedConditions.elementToBeClickable(By.id("button"));

// Element text contains value
ExpectedConditions.textToBePresentInElement(element, "text");

// Alert is present
ExpectedConditions.alertIsPresent();

// Title contains text
ExpectedConditions.titleContains("Login");
```

## Implicit vs Explicit Wait

| Feature | Implicit Wait | Explicit Wait |
|---------|---------------|---------------|
| Scope | Global (all elements) | Specific element |
| Flexibility | Low | High |
| Recommended | Older code | Modern approach ✅ |
| Condition | Generic wait | Specific conditions |

## Interview Tips
- ✅ Explicit wait is **better than implicit** (more control)
- ✅ Can check for **specific conditions** (visible, clickable, text)
- ✅ Returns **immediately** when condition is met (faster)
- ✅ Can be used **multiple times** for different elements
