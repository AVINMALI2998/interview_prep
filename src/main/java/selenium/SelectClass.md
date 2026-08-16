# Select Class - Dropdown Handling in Selenium

## How to Handle DropDown in Selenium

```java
WebElement dropDown = driver.findElement(By.xpath());
Select s = new Select(dropDown);
```

## Select Methods

### Select Options

```java
s.selectByValue("India");           // Select by value attribute
s.selectByVisibleText("Hello");     // Select by visible text
s.selectByIndex(2);                 // Select by index (0-based)
```

## Deselect Methods

```java
s.deselectByValue("hello");         // Deselect by value
s.deselectByVisibleText("demo");    // Deselect by visible text
s.deselectByIndex(2);               // Deselect by index
s.deselectAll();                    // Deselect all options
```

## Other Useful Methods

```java
s.getOptions();                     // Get all options
s.getAllSelectedOptions();          // Get all selected options
s.getFirstSelectedOption();         // Get first selected option
s.isMultiple();                     // Check if multiple select
```

## Code Examples

### Example 1: Simple Dropdown Selection
```java
WebElement dropDown = driver.findElement(By.id("countryDropdown"));
Select select = new Select(dropDown);
select.selectByVisibleText("India");
```

### Example 2: Multiple Selection
```java
WebElement multiSelect = driver.findElement(By.id("colors"));
Select select = new Select(multiSelect);
select.selectByValue("red");
select.selectByValue("blue");
select.selectByValue("green");
```

### Example 3: Get All Options
```java
Select select = new Select(dropDown);
List<WebElement> options = select.getOptions();
for (WebElement option : options) {
    System.out.println(option.getText());
}
```

## Interview Tips
- ✅ Use `Select` class only for HTML `<select>` tags
- ✅ `selectByValue()` for option's value attribute
- ✅ `selectByVisibleText()` for text visible on page
- ✅ `selectByIndex()` for position (0-based indexing)
- ✅ `isMultiple()` to check if dropdown allows multiple selections
- ✅ For custom dropdowns (div-based), use regular click and select methods
