package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		//below x path is refer the calendar icon
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[2]/img")).click();//clicking calendar icon
		
		//choosing previous month year and date
		for (int i= 12; i>=1; i--) {
			//below x path is used to find the previous button and click. 
			//i=12 is referred as how many month and year we move the past and click 12 times previous button 
			driver.findElement(By.xpath("/html/body/div/div/a[1]")).click();
			//Below x path is used to refer month and year column
			String month=driver.findElement(By.xpath("/html/body/div/div/div/span")).getText();
			// Below condition is month is equal to November then click the date
			if(month.equals("November")){
				driver.findElement(By.linkText("15")).click();
				break;
			}
		}
		//choosing future month year and date
		for (int i= 12; i>=1; i--) {
			//below x path is used to find the next button and click. 
			//i=12 is referred as how many month and year we move the future and click 12 times next button
			driver.findElement(By.xpath("/html/body/div/div/a[2]")).click();
			//Below x path is used to refer month and year column
			String month=driver.findElement(By.xpath("/html/body/div/div/div/span")).getText();
			// Below condition is month is equal to November then click the date
			if(month.equals("November")){
				driver.findElement(By.linkText("15")).click();
				break;
			}
		}
		
	}

}
