package PageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RegintrationMain {

	public static void main(String[] args) {
		

				System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
				WebDriver driver =new EdgeDriver();
				driver.manage().window().maximize();
				driver.get("https://demo.guru99.com/selenium/newtours/register.php");
				RegistrationPage RgPage= new RegistrationPage(driver);
				RgPage.clickRegLink();
				RgPage.setFirstname("test123" );
				RgPage.setLastname("S");
				RgPage.setPhone("1234567890");
				RgPage.setEmail("demo123456@gmail.com");
				RgPage.setaddress1("pattai");
				RgPage.setcity("Chennai");
				RgPage.setstate("TamilNadu");
				RgPage.setpostalcode("637429");
				RgPage.setCountry("INDIA");
				RgPage.setUserName("Test@123");
				RgPage.setPassword("Test@712");
				RgPage.setConfirmPassword("Test@712");
				RgPage.clickRegBtn();
			// Validation
				if(driver.getTitle().contains("Register: Mercury Tours")){
					
					System.out.println("you are registered successfully");
					
				}else{
					
					System.out.println("you are registion failed");
					
				}
	}

}
