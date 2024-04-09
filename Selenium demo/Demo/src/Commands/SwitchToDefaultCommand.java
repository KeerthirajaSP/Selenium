package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchToDefaultCommand {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		//x path is mention first name box of the page
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input"));
		Thread.sleep(3000);
//Default command is used to come out of the previous web element
		driver.switchTo().defaultContent();
		//Below x path is mention that email address box
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys("Keerthiraja1999@gmail.com");
	}

}
