package JsExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twoplugs.com/");
	//Flashing 
		WebElement joinfree=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
		ExecutorDemo.flash(joinfree, driver);
	// Drawing border it is used to highlight the defects and tack screenshot
		WebElement login=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a"));
		ExecutorDemo.DrawBorder(login,driver);

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dst = new File("C:/Users/keerthiraja.sp/OneDrive - HCL Technologies Ltd/Desktop/Keerthiraja Selenium tasks/Demo.png");
		FileUtils.copyFile(src,dst);
	// Capture title of the page
		//System.out.println(driver.getTitle());
		String title=ExecutorDemo.getTitleByJs(driver);
		System.out.println(title);
	// Click method by using Executor
		//WebElement loginBtn=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a/span"));
		//loginBtn.click();
		//ExecutorDemo.clickElementByJs(loginBtn, driver);
	// Generate the alert message by using executor method
		//ExecutorDemo.generateAlert("You clicked on login button...",driver);
		
	//refreshing the page by using executor
		//ExecutorDemo.refreshBrowserByJs(driver);
	//scroll down to the page till we found element
		WebElement image= driver.findElement(By.xpath("/html/body/div/section[3]/ul[1]/li[1]/img"));
		ExecutorDemo.ScrollIntoView(image, driver);
	// scroll down the page till end of page
		//ExecutorDemo.ScrollIntoPageDown(driver);
		
	}

}
