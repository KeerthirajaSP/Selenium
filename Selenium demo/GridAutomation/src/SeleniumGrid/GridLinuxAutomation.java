package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class GridLinuxAutomation {
	static WebDriver driver;
	
	void setup() throws MalformedURLException{
		String  nodeURL="http://10.157.217.243:5555/wd/hub";
		DesiredCapabilities cap= DesiredCapabilities.edge();
		cap.setBrowserName("edge");
		cap.setPlatform(Platform.LINUX);
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		driver =new RemoteWebDriver(new URL(nodeURL),cap);
	}
	
	void login(){
		driver.get("https://practice.automationtesting.in/my-account/");
		driver.findElement(By.id("username")).sendKeys("test@123");
		driver.findElement(By.id("password")).sendKeys("test@selenium123");
		driver.findElement(By.name("login")).click();
	}


}
