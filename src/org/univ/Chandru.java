package org.univ;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Chandru {
	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\UniversityInfromation\\drive\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    
		
	    WebElement search = driver.findElement(By.name("q"));
	    search.sendKeys("realme mobiles");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("(//div[contains(@class,'_4rR01T')])[1]")).click();
	    String parentWindow = driver.getWindowHandle();
	    Set<String> allWindows = driver.getWindowHandles();
	    for(String x : allWindows) {
	    	if(!parentWindow.equals(x)) {
	    	driver.switchTo().window(x);
	    	
	    }
	    
	    
	    
	
		
	}
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));


	}  

}

