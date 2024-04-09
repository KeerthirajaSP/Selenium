package Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/index.htm");
		System.out.println(driver.getTitle());
//Navigate.To command
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");//it used to navigate to the page provided in the function.
		System.out.println(driver.getTitle());
//navigate.back command
		driver.navigate().back();// it is used to navigate current page to previous page
		System.out.println(driver.getTitle());
//navigate.forward command
		driver.navigate().forward();// it is used to navigate to forward direction of page
		System.out.println(driver.getTitle());
//navigate.refresh command
		driver.navigate().refresh();// it is used to refresh the current page
		System.out.println(driver.getTitle());
		
	}

}
