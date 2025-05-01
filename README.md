# TC_03_AddCart - Selenium Automation Script

## Overview

This Java program automates the process of adding a laptop item to the shopping cart on [CloudBerry Store](https://cloudberrystore.services/) using Selenium WebDriver. The test verifies that the item "HP LP3065" can be successfully added to the cart with a specified delivery date.

### Test Case: TC_03_AddToCart

#### Test Steps:

1. Launch Chrome browser
2. Navigate to `https://cloudberrystore.services/`
3. Click on **Laptops & Notebooks**
4. Click on **Show All Laptops & Notebooks**
5. Select the item **HP LP3065**
6. Set delivery date (current date + 5 days)
7. Click **Add to Cart**
8. Validate item was added to cart successfully
9. Close the browser

---

## Prerequisites

- Java JDK 11 or higher
- Maven or any Java build tool
- Chrome Browser
- [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/) (Ensure it's in your system `PATH`)
- Selenium Java dependency (version 4.x)

Example Maven dependency:
```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.15.0</version>
</dependency>
Running the Test
Clone or download this project.

Make sure ChromeDriver is correctly set up and compatible with your browser version.

Run the TC_03_AddCart.java file from your IDE or terminal.

bash
Copy
Edit
javac TC_03_AddCart.java
java TC_03_AddCart
Expected Output
If the product is added to the cart successfully, the console should display:


Test Passed
Otherwise:

Test Failed

