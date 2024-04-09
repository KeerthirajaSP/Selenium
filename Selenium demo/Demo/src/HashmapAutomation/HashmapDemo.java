package HashmapAutomation;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HashmapDemo {

	static HashMap<String, String>logindata(){
		HashMap<String, String>hm=new HashMap<String, String>();
		hm.put("x", "Keerthiraja@Keerthi");
		hm.put("y", "Keerthiraja@12345");
		hm.put("z", "Keerthi@raja777");
		return hm;
		
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twoplugs.com/login");
		
		//login as X
		String credentials= logindata().get("x"); 
		String ar[]=credentials.split("@"); // Keerthiraja  Keerthi
		
		driver.findElement(By.xpath("/html/body/div[7]/div/form/div[3]/div/input[2]")).sendKeys(ar[0]);//
		driver.findElement(By.xpath("/html/body/div[7]/div/form/div[4]/div/input")).sendKeys(ar[1]);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[7]/div/form/div[5]/ul/li[2]/button")).click();
		
	}

}
