package WebElements;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EncodeAndDecodeMain {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/login");
		
		driver.findElement(By.className("username")).sendKeys("keerthiraja1999@gmail.com");
		driver.findElement(By.xpath("/html/body/div[7]/section/div/div/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[2]/input")).sendKeys(decodeString("S2VlcnRoaXJhamFANw=="));
		//driver.findElement(By.xpath("/html/body/div[7]/section/div/div/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[4]/input")).click();
	}
static String decodeString(String password){
	
	byte[] decodedString=Base64.decodeBase64(password);
	return (new String(decodedString));
	
}
}
