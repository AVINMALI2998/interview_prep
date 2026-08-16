# Taking Screenshots in Selenium

## Code Example

```java
TakesScreenshot ts = (TakesScreenshot)driver;
File src = ts.getScreenshotAs(OutputType.FILE);
String path = System.getProperty("user.dir")+"\\screenshot\\google.png";
File file = new File(path);
FileHandler.copy(src,file);
```

## Short & Simple Explanation

This code **captures and saves a screenshot** of the web application:

1. **Cast driver to TakesScreenshot** - Enables screenshot capability
2. **Capture screenshot** - Get the image as a file
3. **Define save path** - Set where to store the screenshot (project folder/screenshot/google.png)
4. **Create File object** - Represent the destination file
5. **Copy screenshot** - Move the screenshot from temp to the final location

## One Sentence Summary
*"We're converting the WebDriver to TakesScreenshot, capturing the current screen image, and saving it to a specific folder path using FileHandler."*

## Step-by-Step Breakdown

### Line 1: Type Casting
```java
TakesScreenshot ts = (TakesScreenshot)driver;
```
- We're **casting the WebDriver object** to the `TakesScreenshot` interface
- This interface provides the method to capture screenshots
- TypeCasting is required because WebDriver doesn't directly have screenshot capability

### Line 2: Capture Screenshot
```java
File src = ts.getScreenshotAs(OutputType.FILE);
```
- We're calling `getScreenshotAs()` method to capture the screenshot
- `OutputType.FILE` specifies we want the screenshot as a File object
- The screenshot is temporarily stored in the system's temp folder

### Line 3: Define Save Path
```java
String path = System.getProperty("user.dir")+"\\screenshot\\google.png";
```
- `System.getProperty("user.dir")` gets the current project directory
- We're creating a **file path** where the screenshot will be permanently saved
- The `\\screenshot\\` is the folder name and `google.png` is the filename

### Line 4: Create File Object
```java
File file = new File(path);
```
- We're creating a **File object** representing the destination
- This doesn't create the actual file yet—just represents the path

### Line 5: Copy Screenshot
```java
FileHandler.copy(src,file);
```
- `FileHandler` is a Selenium utility class (from `org.openqa.selenium.io`)
- `.copy()` method copies the screenshot from temp to permanent location
- This is safer than using Java's standard file copy

## Interview Key Points
- ✅ **TypeCasting requirement** - Why we cast to TakesScreenshot
- ✅ **Temporary vs Permanent** - Screenshot is initially in temp, then moved
- ✅ **Cross-browser** - This approach works with any WebDriver implementation
- ✅ **Error Handling** - Add try-catch blocks for production code
- ✅ **Use Case** - Used for test failures, reporting, or evidence collection

## Alternative Methods

```java
// Using Base64 (for reports)
String screenshot = ts.getScreenshotAs(OutputType.BASE64);

// Using Bytes
byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
```

## Important Notes
- Always check if the screenshot directory exists before saving
- Use cross-platform paths (avoid hard-coding backslashes)
- Take screenshots on test failures for better debugging
