package Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitAndExplicitCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
//Implicit wait command it is a global command
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Frames.html");
//Explicit wait command it is wait particular element command
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("https://demo.automationtesting.in//Frames.html")));
		
	}

}
