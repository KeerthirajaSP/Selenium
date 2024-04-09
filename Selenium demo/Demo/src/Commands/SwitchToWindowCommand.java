package Commands;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchToWindowCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
//Get the driver window handle and store to the set(windowIds)
		//set is only store unique values it dose not allow duplicate values 
		Set<String> parantWindow = driver.getWindowHandles();
		
//the stored set (windowIds) is give to the iterator
		Iterator<String>itr = parantWindow.iterator();
//default window is iterated to next window 
		String defaultWindowId = itr.next();
//the window control moved to parent window to child window
		String childWindowId = itr.next();
		driver.switchTo().window(childWindowId);
//After control is successfully moved and get the title of the child window 
		System.out.println(driver.getTitle());
		driver.switchTo().window(defaultWindowId);
		System.out.println(driver.getTitle());
	}

}
