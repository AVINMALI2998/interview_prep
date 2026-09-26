WebDriver driver = new ChromeDriver();
driver.get("url");

WebElement element = driver.findElement(By.xpath("path"));
element.click();

String mainWindow = driver.getWindowHandle();
System.out.println(mainWindow);

Set<String> allWindows = driver.getWindowHandles();
Iterator<String> it = allWindows.iterator();
String  mainWindow = it.next();
String childWindow = it.next();




/*
✅ Correct version

getWindowHandle() → returns ONLY the current (parent) window ID
String parent = driver.getWindowHandle();

getWindowHandles() → returns ALL open window IDs
Set<String> allWindows = driver.getWindowHandles();

What Iterator Does
Iterator → an interface in Java -> Iterator helps us to traverse window IDs one by one
next() → a method of the Iterator interface -> retrieves the next window ID.



To handle multiple windows, Selenium gets the unique IDs of all open windows using getWindowHandles() and uses switchTo().window() to move Selenium's focus to the required window.



 */