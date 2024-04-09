package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
//get command
		driver.get("https://www.tutorialspoint.com/index.htm");//open the url
//getTitle command
		System.out.println(driver.getTitle());//return the title of the page
//getUrl command
		System.out.println(driver.getCurrentUrl());//return the url of the page
//getText command
		System.out.println(driver.findElement(By.xpath("/html/body/main/section[1]/div/div[2]/h1")).getText());// return the text by the elements
		
		driver.close();//close current window
		//driver.quit();//closes multiple windows
}
}

