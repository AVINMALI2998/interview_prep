package selenium;

/**
 * Selenium WebDriver - Basic Examples
 * 
 * Key Concepts:
 * - WebDriver initialization
 * - Finding elements
 * - Interacting with elements
 * - Navigation
 * - Waits (Implicit, Explicit)
 */
public class SeleniumBasics {

    /**
     * TODO: Add Selenium dependency to pom.xml first
     * <dependency>
     * <groupId>org.seleniumhq.selenium</groupId>
     * <artifactId>selenium-java</artifactId>
     * <version>4.x.x</version>
     * </dependency>
     */

    public static void main(String[] args) {
        System.out.println("Selenium WebDriver Examples");
        System.out.println("---------------------------");
        System.out.println("Add your Selenium automation code here...");
    }

    // Example: Open browser
    public void openBrowser() {
        // WebDriver driver = new ChromeDriver();
        // driver.get("https://www.example.com");
    }

    // Example: Find element by ID
    public void findElementByID() {
        // WebElement element = driver.findElement(By.id("elementId"));
    }

    // Example: Explicit wait
    public void explicitWait() {
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // WebElement element =
        // wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id")));
    }

    // Example: Click element
    public void clickElement() {
        // WebElement element = driver.findElement(By.xpath("//button"));
        // element.click();
    }
}
