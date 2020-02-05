import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		WebElement draggable = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement droppable =driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions action = new Actions(driver);
		//action.dragAndDrop(draggable, droppable).build().perform();
		
		//second 
		action.clickAndHold(draggable).moveToElement(droppable).build().perform();
		driver.switchTo().defaultContent();
		driver.close();
		
		
		

	}

}
