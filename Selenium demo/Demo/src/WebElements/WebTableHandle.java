package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTableHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		int numofrow=driver.findElements(By.xpath("/html/body/div[2]/div/div[1]/main/article/div/div/table/tbody/tr")).size();
		System.out.println("Number of Rows : "+numofrow);
		int tableData=driver.findElements(By.xpath("/html/body/div[2]/div/div[1]/main/article/div/div/table/tbody/tr/td")).size();
		System.out.println("Number of Data : "+tableData);
			for (int i = 2; i <= numofrow; i++) {
				for (int j = 2; j <= 5; j++) {
					System.out.print(driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/article/div/div/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"  ");
				}
				System.out.println();
			}
	}

}
