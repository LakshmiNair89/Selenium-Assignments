package com.agama.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTesting {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wellsfargo.com/");
		
//to verify all the links displayed at the bottom page are valid	
		
//implicitly wait		
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
//find the bottom panel where all links are displayed
		WebElement bottomLink = driver.findElement(By.xpath("/html/body/div/footer/div/div[1]/nav/div/ul"));
		
// find all the links(using tagname a)
		List<WebElement> links = bottomLink.findElements(By.tagName("a"));
	
//get the no:of links in the bottom panel		
		int count =links.size(); 
		System.out.println("No:of links in bottom panel  " + count);
		
// To click on all the links
		for(int i=0;i<=count-1;i++) {
			links.get(i).click();
			WebElement sign = driver.findElement(By.xpath("//*[@id=\"topSearch\"]/ul/li[1]/a"));
			boolean b =sign.isDisplayed();
			
//To check on clicking the links it navigates to corresponding pages
			if (b==true) {
			System.out.println("Success  - " + driver.getCurrentUrl()); 
						
		} else {
			System.out.println("Link is broken");
		}
			driver.navigate().back();
			
// to get the control again to bottom panel links	
			//Thread.sleep(7000);
			//driver.navigate().refresh();
			bottomLink = driver.findElement(By.xpath("/html/body/div/footer/div/div[1]/nav/div/ul"));
			links = bottomLink.findElements(By.tagName("a"));
		}
		
		driver.close();
}
}
