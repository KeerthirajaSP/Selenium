package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RobotClassAPI {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://spteadsheetpage.com/index.php/site/file/yearly_calender_workbook");
		driver.findElement(By.xpath("/html/body/div/selection/div/div[1]/ul/li[3]/a")).click();
		Robot robot= new Robot();
		Thread.sleep(2000);
		/*Down arrow
		 * 3 time tab
		 * enter*/
		robot.keyPress(KeyEvent.VK_DOWN);// press down arrow 
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);// press TAB Button
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);//press Enter Button
		Thread.sleep(2000);
	}

}
