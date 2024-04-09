package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement Checkbox=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[6]/div/div[1]/input"));
		Checkbox.click();
		System.out.println(Checkbox.isEnabled());
		System.out.println(Checkbox.isDisplayed());
		System.out.println(Checkbox.isSelected());
	}

}
