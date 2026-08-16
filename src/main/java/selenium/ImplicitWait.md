# Implicit Wait in Selenium

## Code Example

```java
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
```

## What is Implicit Wait?

- A global wait that applies to ALL element searches
- Tells WebDriver to wait up to 10 seconds for an element to appear before throwing an exception
- Remains effective throughout the entire test execution

## How It Works

```java
driver.manage()           // Access WebDriver settings
  .timeouts()             // Set timeout configurations
  .implicitlyWait()       // Set implicit wait duration
    (Duration.ofSeconds(10))  // Wait maximum 10 seconds
```

## Key Interview Points

- ✅ **Applies globally** - Works for all `findElement()` and `findElements()` calls
- ✅ **Default is 0** - If not set, WebDriver doesn't wait
- ✅ **Once set** - Remains effective throughout the test
- ✅ **No need to repeat** - Set it once at the start of test
- ✅ **Used with Selenium 4+** - `Duration` is the newer approach
- ✅ **Less flexible** - No control over specific conditions

## Usage Example

```java
// Set once at the beginning of test
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// Now every findElement call will wait up to 10 seconds
WebElement element = driver.findElement(By.id("username")); // Waits up to 10 seconds
element.sendKeys("testuser");
```

## Implicit vs Explicit Wait

| Feature | Implicit Wait | Explicit Wait |
|---------|---------------|---------------|
| Scope | Global (all elements) | Specific element |
| Flexibility | Low | High |
| Recommended | Older code | Modern approach |
| Setup | Once per test | Multiple times |

## Best Practice
- Use **Explicit Wait** for better control and modern practices
- Implicit Wait can be used as a fallback/safety net
- Don't mix Implicit and Explicit waits extensively (can cause issues)
