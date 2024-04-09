package SeleniumTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
public static void main(String[]args){
	System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tutorialspoint.com/index.htm");
}
}
