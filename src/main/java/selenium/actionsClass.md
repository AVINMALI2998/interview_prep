How to perform mouse action in selenium

WebElement loginButton = driver.findElement(By.xpath());

Actions act = new Actions(driver);

// Basics mouse action

act.click(loginButton).perform();  // click the WebElement
act.doubleClick(loginButton).perform(); // doubleClick
act.contextClick(loginButton).perform();  // right click
act.moveToElement(loginButton).perform(); // moveToElement

// dragDrop

act.dragAndDrop(source , target).perform();


