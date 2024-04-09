package SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		
		//step for maximize browser window
		driver.manage().window().maximize();
		
		 driver.get("http://demo.guru99.com/test/drag_drop.html");	
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollTo(0),document.body.scrollHeight");
		 //Using Action class for drag and drop.		
         Actions act=new Actions(driver);	
         
			//Element which needs to drag.    		
	        	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
	         
	         //Element on which need to drop.		
	         WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));	
	         
	       //Dragged and dropped.		
	         act.dragAndDrop(From, To).build().perform();
	         
	       //Element which needs to drag.    		
	        	WebElement From1=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[2]/a"));
	         
	       //Element on which need to drop.		
		        WebElement To1=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol/li"));			
	        		
		   //Dragged and dropped.		
		        act.dragAndDrop(From1, To1).build().perform();
	}

}
