# Reading Excel Files in Selenium

## Code Example

```java
FileInputStream file = new FileInputStream("C:\\testdata\\Excel.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(file);
XSSFSheet sheet = workbook.getSheet("SheetName");
String output = sheet.getRow(2).getCell(3).getStringCellValue();
System.out.println(output);
```

## Step-by-Step Explanation

1. **Open Excel file** - Create FileInputStream to access the file
2. **Create workbook** - Load the Excel file (XSSFWorkbook for .xlsx)
3. **Get sheet** - Access the specific sheet by name
4. **Get cell value** - Extract data from row 2, column 3 as a string
5. **Print output** - Display the data

## One Sentence Summary
*"We're opening an Excel file, navigating to a specific sheet, getting a cell value from row 2 column 3, and printing it."*

## Interview Key Point
This is used in test automation for **data-driven testing**—reading test data from Excel files.

## Important Notes
- Use Apache POI library for Excel handling
- XSSF is for .xlsx files (newer Excel format)
- HSSFWorkbook is for .xls files (older Excel format)
