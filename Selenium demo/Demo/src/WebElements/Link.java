package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Link {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/software-testing-tutorial");
		WebElement Link=driver.findElement(By.xpath("/html/body/div/div[1]/div[5]/div[2]/a[3]"));
		Link.click();
	}

}
