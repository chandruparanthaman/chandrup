package org.univ;

import javax.lang.model.element.Element;
import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.internal.ThreadLocalRandom;

public class Iframes {
	public static void main(String[] args) throws Throwable {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\UniversityInfromation\\drive\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 String url =("https://chercher.tech/practice/frames");
		 driver.get(url);
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		WebElement findElement = driver.findElement(By.xpath("//b[text()='Topic :']/following-sibling::input"));
		findElement.sendKeys("chandru");
		driver.switchTo().frame("frame3");
		WebElement Element = driver.findElement(By.xpath("//input[@id='a']"));
		Element.click();
		WebElement findElement2 = driver.findElement(By.xpath("//select[@id='animals']"));
		Element.click();
		
		
	}

	}


