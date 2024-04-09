package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement email= driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input"));
		WebElement phone= driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input"));
// isDisplayed command
		//It is used to display the particular web element present or not in the given web element
		//It gives true or false boolean value
		System.out.println("Email box is displayed : "+email.isDisplayed());
// isEnabled command
		//It is used to check the condition about it is enabled or not in the given web element 
		//It gives true or false boolean value
		System.out.println("Email box is enabled : "+email.isEnabled());
		
		System.out.println("Phone textbox is displayed : "+phone.isDisplayed());
		System.out.println("Phone textbox is enabled : "+phone.isEnabled());
        if(email.isDisplayed() && email.isEnabled()){
        	email.sendKeys("keerthiraja1999@gamil.com");
        }
        if(email.isDisplayed() && email.isEnabled()){
        	phone.sendKeys("9578631352");
        }
// isSelected command
        //It is used to check the condition about radio button or check box is selected or not in the given web element 
      	//It gives true or false boolean value
        WebElement male = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input"));
        System.out.println(male.isSelected());
        WebElement female = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input"));
        System.out.println(female.isSelected());
    
        if(male.isSelected()==false){
        	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input")).click();
        }
	}

}
