package SeleniumTasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class VerticalScroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		
		//step for maximize browser window
		driver.manage().window().maximize();
		driver.get("https://flagpedia.net/index");
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		//Step for scrolling the web page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Step for scrolling down to pixel the web page
		js.executeScript("window.scrollBy(0,3000)","");
		
		//Step for scrolling to the web page till we find element
		//WebElement scroll=driver.findElement(By.xpath("/html/body/div[2]/main/div/ul[2]/li[104]/a/img"));
		//js.executeScript("arguments[0].scrollIntoView();",scroll);
		
		//Step for scrolling to the web page till bottom
		//js.executeScript("window.scrollTo(0),document.body.scrollHeight");
	}

}
