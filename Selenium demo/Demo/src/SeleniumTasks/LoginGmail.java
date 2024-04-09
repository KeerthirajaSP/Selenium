package SeleniumTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginGmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://outlook.office.com/mail/");
		//driver.findElement(By.id("hero-banner-sign-in-microsoft-365-link")).click();
		//driver.findElement(By.id("try-different-email")).sendKeys("keerthiraja.sp@hcl.com");
		//driver.findElement(By.id("hero-banner-sign-in-to-office-365-link")).click();
		//driver.findElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[1]/div[1]/div/button/span")).click();
		
	}

}
