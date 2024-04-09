package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchToFrameCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe");
		WebElement Iframe=driver.findElement(By.xpath("/html/body/section/div/h5"));
        System.out.println(Iframe.getText());
	}
}
