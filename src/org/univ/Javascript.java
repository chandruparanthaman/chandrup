package org.univ;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
		public static void main(String[] args) throws Throwable {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\UniversityInfromation\\drive\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String url =("https://www.facebook.com/");
	 driver.get(url);
	driver.manage().window().maximize();
	WebElement user =  driver.findElement(By.id("email"));
	WebElement pass = driver.findElement(By.id("pass"));
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','chandru')",user);
	js.executeScript("arguments[0].setAttribute('value','123456789')",pass);
	
	Object executeScript = js.executeScript("return arguments[0].getAttribute('value')",user);
	System.out.println(executeScript);
	
	//Thread.sleep(5000);
	//js.executeScript("arguments[0].click()",login);
	
	WebElement down = driver.findElement(By.linkText("Careers"));
	Thread.sleep(5000);
	js.executeScript("arguments[0].scrollIntoView(true)",down);
	Thread.sleep(5000);
	js.executeScript("arguments[0].scrollIntoView(false)",user);
	
	js.executeScript("arguments[0].click()",login);


	

	 
		
	}

}
