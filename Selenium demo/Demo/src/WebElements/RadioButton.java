package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement male=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input"));
		WebElement female=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input"));
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		if(male.isSelected()==false){
			male.click();
		}
		
	}

}
