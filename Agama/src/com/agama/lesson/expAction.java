package com.agama.lesson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class expAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		WebElement feature =driver.findElement(By.xpath("/html/body/section[1]/header/div/nav/ul[2]/li[4]/div/button"));
		Actions act = new Actions(driver);
		act.moveToElement(feature).click().build().perform();
		act.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();;
		
		
		
	}

}
