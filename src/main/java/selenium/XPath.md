Absolute XPath starts at the document root with a single slash:
/html/body/div[1]/input

Relative XPath locates an element without spelling out its full path:
//input[@id="email"]

Relative to a WebElement context, use .// to search its descendants:
.//input[@id="email"]

Interview answer: Absolute XPath starts at the root and follows the full DOM path, so it can break when the page structure changes. Relative XPath finds an element using attributes or text, making it shorter and more flexible. In Selenium, prefer relative XPath when possible.

//TagName[@AttributeName="AttributeValue"]
//TagName[text()="Exact text"]
//TagName[contains(@AttributeName, "AttributeValue")]
//TagName[contains(text(), "value")]

XPath indexes are 1-based:
(//TagName)[1]     Selects the first matching TagName in the document
//Parent/Child[1]  Selects the first Child under each Parent
//TagName[@AttributeName="AttributeValue"][2]
				   Selects the second matching TagName under each parent
(//TagName[@AttributeName="AttributeValue"])[2]
				   Selects the second matching TagName in the document

