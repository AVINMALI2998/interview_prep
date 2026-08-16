# WebDriver Methods in Selenium

## Basic Navigation Methods

```java
driver.get("url");                    // Navigate to URL
driver.navigate().forward();           // Go forward in browser history
driver.navigate().back();              // Go back in browser history
driver.navigate().refresh();           // Refresh the page
```

## Window/Browser Methods

```java
driver.manage().window().maximize();   // Maximize window
driver.manage().window().minimize();   // Minimize window
driver.manage().window().setSize(width, height);  // Set window size
driver.manage().window().getPosition();           // Get window position
driver.manage().window().getSize();               // Get window size
```

## Browser Control

```java
driver.close();                        // Close current tab/window
driver.quit();                         // Close all tabs and quit browser
```

## Page Methods

```java
driver.getTitle();                     // Get page title
driver.getCurrentUrl();                // Get current URL
```

## Element Methods

```java
driver.findElement(By.id(""));         // Find single element
driver.findElements(By.id(""));        // Find multiple elements
```

## Complete Method Reference

| Method | Description |
|--------|-------------|
| `driver.get(url)` | Navigate to URL |
| `driver.navigate().to(url)` | Navigate to URL |
| `driver.navigate().forward()` | Go forward |
| `driver.navigate().back()` | Go back |
| `driver.navigate().refresh()` | Refresh page |
| `driver.manage().window().maximize()` | Maximize window |
| `driver.manage().window().minimize()` | Minimize window |
| `driver.manage().window().setSize(w,h)` | Set size |
| `driver.manage().window().getSize()` | Get size |
| `driver.manage().window().getPosition()` | Get position |
| `driver.close()` | Close current tab |
| `driver.quit()` | Quit browser |
| `driver.getTitle()` | Get page title |
| `driver.getCurrentUrl()` | Get current URL |
| `driver.getPageSource()` | Get HTML source |
| `driver.findElement()` | Find element |
| `driver.findElements()` | Find elements |

## Interview Tips
- ✅ Difference between `close()` and `quit()`
- ✅ `close()` closes current tab, `quit()` closes entire browser
- ✅ `navigate()` vs `get()` - navigate has history methods
- ✅ Always call `quit()` at the end of test for cleanup
- ✅ Use appropriate locators with `findElement()`

## Usage Examples

### Example 1: Basic Navigation
```java
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
```

### Example 2: Window Management
```java
driver.manage().window().maximize();
driver.manage().window().setSize(1920, 1080);
String title = driver.getTitle();
String url = driver.getCurrentUrl();
```

### Example 3: Finding Elements
```java
WebElement element = driver.findElement(By.id("username"));
List<WebElement> elements = driver.findElements(By.tagName("input"));
```
