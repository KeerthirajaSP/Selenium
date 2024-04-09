package SeleniumTasks;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class goibiboBooking {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		
		//step for maximize browser window
		driver.manage().window().maximize();
		
		//step for open the browser by using google and go to goibibo website 
		driver.get("https://www.goibibo.com/bus/");
		
		//step for select the enter source name text bar and select the source place name 
		driver.findElement(By.name("autosuggestBusSRPSrcHomeName")).sendKeys("Mattuthavani, Madurai");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/section/section/section[1]/section/div[1]/section/ul/div/div/li[1]/span")).click();
		driver.findElement(By.name("autosuggest")).sendKeys("Salem New Bus Stand, Salem");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/section/section/section[1]/section/div[2]/section/ul/div/div/li[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/section/section/section[1]/section/div[3]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/section/section/section[1]/section/div[3]/div/div[1]/div/div/div[2]/div/div/ul[2]/li[25]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/section/section/section[1]/section/div[5]/button")).click();
	}

}
