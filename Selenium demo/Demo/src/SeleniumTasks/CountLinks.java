package SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CountLinks {
   public static void main(String[] args) {
	   System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver(); //driver constructor used to invoke the browser
      driver.get("https://www.tutorialspoint.com/index.htm");
      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
      //Using tag name with anchor
      List<WebElement> links = driver.findElements(By.tagName("a"));
      System.out.println("The number of links is "  + links.size());
      driver.close();
   }
}
