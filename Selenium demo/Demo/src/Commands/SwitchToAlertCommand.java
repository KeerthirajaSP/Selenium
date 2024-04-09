package Commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchToAlertCommand {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
// Alert command
		Alert alert=driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(4000);
//Accept command
		alert.accept();
//Dismiss command
		alert.dismiss();
		

	}

}
