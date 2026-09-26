# Scroll Actions in Selenium

**Interview definition:** `JavascriptExecutor` is a Selenium interface that runs JavaScript in the browser. It can scroll the page when you need to move the viewport programmatically, such as to bring an off-screen element into view.

Use `JavascriptExecutor` to scroll the browser window. `scrollBy(x, y)` applies a relative horizontal (`x`) and vertical (`y`) offset in pixels.

```java
JavascriptExecutor js = (JavascriptExecutor) driver;

js.executeScript("window.scrollBy(0, 500)");   // Scroll down
js.executeScript("window.scrollBy(0, -500)");  // Scroll up
js.executeScript("window.scrollBy(500, 0)");   // Scroll right
js.executeScript("window.scrollBy(-500, 0)");  // Scroll left
```