# Handling Frames in Selenium

## Simple Definition

An `iframe` is a web page embedded inside another page. Selenium interacts with the current page context, so switch into a frame before locating or using elements inside it.

## Switch Through Nested Frames

Switch into nested frames one at a time, starting from the main page:

```java
driver.switchTo().frame(driver.findElement(By.id("iFrame1")));
driver.switchTo().frame(driver.findElement(By.id("iFrame2")));
driver.switchTo().frame(driver.findElement(By.id("iFrame3")));

// Move up one level: from iFrame3 to its parent, iFrame2.
driver.switchTo().parentFrame();

// Return directly to the main page, outside all frames.
driver.switchTo().defaultContent();
```

Each frame lookup is performed in the current context. For example, locate `iFrame2` after switching into `iFrame1` if it is nested inside it.

## Frame Switching Methods

```java
driver.switchTo().frame(0);                         // Switch by index
driver.switchTo().frame("frameNameOrId");           // Switch by name or ID
driver.switchTo().frame(driver.findElement(By.id("frameId"))); // Switch by WebElement
```

## `parentFrame()` vs. `defaultContent()`

| Method | Result |
|---|---|
| `parentFrame()` | Moves up one frame level to the immediate parent. |
| `defaultContent()` | Returns to the top-level page, outside every frame. |

## Wait for a Frame

If a frame is not available immediately, use an explicit wait to wait for it and switch into it:

```java
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iFrame1")));
```

## Interview Answer

**Question:** What is the difference between `parentFrame()` and `defaultContent()`?

**Answer:** `parentFrame()` moves Selenium up exactly one level in a nested frame hierarchy. `defaultContent()` switches directly back to the main page, regardless of the current nesting depth.