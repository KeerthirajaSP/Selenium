package AuthendicationPopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AuthendicationPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokapp.com/basic_auth");
		
		//https://username:password@test.com
		
		driver.get("https://admin:admin@the-internet.herokapp.com/basic_auth");
		System.out.println(driver.getTitle());

	}

}
