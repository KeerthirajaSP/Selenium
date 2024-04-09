package SeleniumTasks;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		
		//step for maximize browser window
		driver.manage().window().maximize();
		
		//step for open the browser by using google and go to goibibo website
		driver.get("https://www.goibibo.com/bus/");
		
		//step for tacking screenshot 
		TakesScreenshot ts =(TakesScreenshot) driver;
		File ss=ts.getScreenshotAs(OutputType.FILE);
		
		//step for where to store after tacking screenshot 
		String path = "C:\\Users\\keerthiraja.sp\\OneDrive - HCL Technologies Ltd\\Pictures\\Screenshots\\ss.png";
		File des =new File(path);
		try{
			FileUtils.copyFile(ss, des);
		}catch(Exception e){
			e.printStackTrace();
		}
		driver.close();
		}
	}
