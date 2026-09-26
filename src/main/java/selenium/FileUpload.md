
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Upload file
        driver.findElement(By.id("file-upload")).sendKeys("C:\\path\\to\\your-file.jpeg");

        // Click upload button
        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(4000);
        driver.quit();

    }
}