import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {

 static AppiumDriver <MobileElement> driver;

	public static void main(String[] args) {
		
		try{
			
			openCalculator();
				
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getStackTrace());
			ex.printStackTrace();
		}
		
	}
	
	public static void openCalculator() throws IOException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("devicename", "Vivo XL4");
		cap.setCapability("udid", "V88LVWSOHYDAWSPN");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformversion", "8.1.0");
		cap.setCapability("appPackage", "com.google.android.calculator");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, cap);
		System.out.println("Application rum");
		
	}

}
