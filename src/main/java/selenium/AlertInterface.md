# Alert Interface in Selenium

## How to Handle Alert Pop-ups in Selenium

```java
Alert alt = driver.switchTo().alert();
alt.accept();
alt.dismiss();
alt.sendKeys("hello");
alt.getText(); // read alert message
```

## Alert Methods

| Method | Description |
|--------|-------------|
| `alt.accept()` | Clicks OK button on alert |
| `alt.dismiss()` | Clicks Cancel button on alert |
| `alt.sendKeys()` | Types text into alert input field |
| `alt.getText()` | Reads alert message text |

## Interview Tips
- Use `switchTo().alert()` to handle alerts
- `accept()` for OK/Yes actions
- `dismiss()` for Cancel/No actions
- `sendKeys()` for entering data in alerts
