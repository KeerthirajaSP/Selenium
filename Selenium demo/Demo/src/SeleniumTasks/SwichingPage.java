package SeleniumTasks;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwichingPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
	
		//step for maximize browser window
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[10]/div/ul/li[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		Set<String> handle= driver.getWindowHandles();
		for (String i:handle) {
			String t=driver.switchTo().window(i).getTitle();
			System.out.println(t);
			
		}
		//driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div[2]/div[1]/div/div[2]/h2/a")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-home/header/app-hotelsearch/div/div/div/div/form/div/div[1]/searchbox/input")).sendKeys("Oga Perfect Guest House @ Near Chennai Central Railway Station");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		//WebElement list =
		driver.findElement(By.xpath("/html/body/app-root/app-home/header/app-hotelsearch/div/div/div/div/form/div/div[1]/searchbox/div/ul/li/a/div/div[2]/span[1]")).click();
		//WebElement list =driver.findElement(By.xpath("/html/body/app-root/app-home/header/app-hotelsearch/div/div/div/div/form/div/div[1]/searchbox/div/ul/li[2]/a/div/div[2]/span[1]"));
		//Select s= new Select(list);
		//s.selectByVisibleText("Oga Perfect Guest House @ Near Chennai Central Railway Station");
			}
}
