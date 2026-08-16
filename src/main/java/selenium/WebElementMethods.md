# WebElement Methods in Selenium

## Basic WebElement Methods

```java
WebElement element = driver.findElement(By.id(""));
element.click();                       // Click the element
element.clear();                       // Clear text from input
element.sendKeys("text");              // Type text into element
element.doubleClick();                 // Double click element
element.getText();                     // Get visible text
element.getTagName();                  // Get HTML tag name
element.getAttribute("attribute");     // Get attribute value
element.getSize();                     // Get element dimensions
element.isDisplayed();                 // Check if element is visible
element.isEnabled();                   // Check if element is enabled
element.isSelected();                  // Check if element is selected
```

## Action Methods

| Method | Description |
|--------|-------------|
| `element.click()` | Click the element |
| `element.clear()` | Clear text from input field |
| `element.sendKeys("text")` | Type text into element |
| `element.submit()` | Submit the form |
| `element.doubleClick()` | Double click (requires Actions class) |

## Information Methods

| Method | Description |
|--------|-------------|
| `element.getText()` | Get visible text |
| `element.getAttribute("attr")` | Get attribute value |
| `element.getTagName()` | Get HTML tag name |
| `element.getSize()` | Get element dimensions |
| `element.getLocation()` | Get element position |
| `element.getCssValue("property")` | Get CSS property value |

## State Methods

| Method | Description |
|--------|-------------|
| `element.isDisplayed()` | Check if element is visible |
| `element.isEnabled()` | Check if element is enabled |
| `element.isSelected()` | Check if element is selected |

## Navigation Methods

```java
element.findElement(By.id(""));        // Find child element
element.findElements(By.id(""));       // Find multiple child elements
```

## Code Examples

### Example 1: Filling a Form
```java
WebElement element = driver.findElement(By.id("username"));
element.sendKeys("testuser");

WebElement passwordField = driver.findElement(By.id("password"));
passwordField.sendKeys("password123");

WebElement submitBtn = driver.findElement(By.id("submit"));
submitBtn.click();
```

### Example 2: Getting Element Information
```java
WebElement element = driver.findElement(By.id("username"));
String text = element.getText();
String value = element.getAttribute("value");
String tag = element.getTagName();
boolean displayed = element.isDisplayed();
boolean enabled = element.isEnabled();
```

### Example 3: Element Validation
```java
WebElement element = driver.findElement(By.id("checkbox"));
if (element.isDisplayed() && element.isEnabled()) {
    if (!element.isSelected()) {
        element.click();  // Check the checkbox
    }
}
```

### Example 4: Finding Child Elements
```java
WebElement parent = driver.findElement(By.id("parent"));
WebElement child = parent.findElement(By.className("child"));
```

## Interview Tips
- ✅ Know `click()`, `sendKeys()`, `getText()`, `getAttribute()` - most common
- ✅ Difference between `getText()` and `getAttribute("value")`
- ✅ `isDisplayed()` checks CSS visibility, not in DOM
- ✅ `isEnabled()` for disabled form elements
- ✅ `isSelected()` for checkboxes and radio buttons
- ✅ Use specific locators to avoid stale element exceptions

## Common Scenarios

| Scenario | Method |
|----------|--------|
| Get input field value | `element.getAttribute("value")` |
| Get button text | `element.getText()` |
| Check checkbox status | `element.isSelected()` |
| Verify element visible | `element.isDisplayed()` |
| Clear input field | `element.clear()` |
| Type into field | `element.sendKeys()` |
