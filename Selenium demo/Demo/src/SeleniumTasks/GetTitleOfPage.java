package SeleniumTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitleOfPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/index.htm");
		String ExpTitle = "Online Tutorials, Courses, and eBooks Library | Tutorialspoint";
		String ActTitle = driver.getTitle();
		//System.out.println(ActTitle);
		if(ExpTitle.equals(ActTitle)){
			System.out.println("Test is passed");
			
		}else{
			System.out.println("Test is failed");
		}
		
		driver.close();
	}

}
