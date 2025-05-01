package day11;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class TC_03_AddCart {

	public static void main(String[] args) throws InterruptedException 
	{

/*
	3rd  Test case - TC03_AddToCart
	-------
	1. Launch Browser (chrome)
	2. Open URL https://cloudberrystore.services/
	3. Click on Laptops and NoteBooks
	4. Click on Show all Laptops and NoteBooks
	5. Select an item "HP LP3065"
	6. Set Delivery Date
	7. Click on Add to Cart
	8. Validate Item added to the cart successfully
	9. Close WebDriver
	*/

		// 1) Launch Chrome browser

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// 2) Open URL: https://cloudberrystore.services/
		driver.get("https://cloudberrystore.services/");
		driver.manage().window().maximize();
		
		//3. Click on Laptops and NoteBooks - //a[@class='nav-link dropdown-toggle'][normalize-space()='Laptops & Notebooks']
		
		driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle'][normalize-space()='Laptops & Notebooks']")).click();
		
		//	4. Click on Show all Laptops and NoteBooks - //a[normalize-space()='Show All Laptops & Notebooks']
		
		driver.findElement(By.xpath("//a[normalize-space()='Show All Laptops & Notebooks']")).click();
		
		// 5. Select an item "HP LP3065" - //div[@class='description']//a[contains(text(),'HP LP3065')]
		
		//find the element
		
		 WebElement element = driver.findElement(By.xpath("//div[@class='description']//a[contains(text(),'HP LP3065')]"));
		 
		 //Scroll into view
		 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
		 
		 // Add a small wait
		 Thread.sleep(500);
		 
		 //Now click
		 element.click();
		 
		// 6. Set Delivery Date - //input[@id='input-option-225']
		 
		 LocalDate currentDate = LocalDate.now();  // Gets the current date
	    // System.out.println("Today's date is: " + currentDate);
	     
	     LocalDate deliveryDate = currentDate.plusDays(5); //Add 5 days to current date
	     
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	        String formattedDeliveryDate = deliveryDate.format(formatter);
	        
	       // System.out.println("Today's date is: " + formattedDeliveryDate);
	        
			
			  //find the element
			  
			  WebElement element1 =
			  driver.findElement(By.xpath("//input[@id='input-option-225']"));
			  
			  //Scroll into view
			  
			  ((JavascriptExecutor)driver).executeScript(
			  "arguments[0].scrollIntoView(true);", element1);
			  
			  // Add a small wait 
			  Thread.sleep(500);
			  
			  //Now click 
			  element1.sendKeys(formattedDeliveryDate);
			 
	        
	        //driver.findElement(By.xpath("//input[@id='input-option-225']")).sendKeys(formattedDeliveryDate);
	     
	        //7. Click on Add to Cart - //button[@id='button-cart']
	        
	        driver.findElement(By.xpath("//button[@id='button-cart']")).click();
	        
	       //8. Validate Item added to the cart successfully - //div[@class='alert alert-success alert-dismissible']
	        
	        String actualMessage = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
	        
	       // System.out.println(actualMessage);
	        
	        if(actualMessage.contains("Success"))
	        {
	        	System.out.println("Test Passed");
	        }
	        else
	        	
	        {
	        	System.out.println("Test Failed");
	        }
	        
	        //9. Close WebDriver
	        
	        driver.quit();
	        
	     
	}

}