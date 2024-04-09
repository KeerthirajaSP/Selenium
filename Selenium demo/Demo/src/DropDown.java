import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement Dropdown=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[8]/div/select"));
		Select menu=new Select(Dropdown);
// select by value is used to select the menu based on mentioned value
		menu.selectByValue("Engineering");
//select by visible text is used to not sure about index position or not have a value on the list
		menu.selectByVisibleText("HTML");
// select by index value is mention exact index position of the list
		menu.selectByIndex(5);
	}

}
