package CookiesHandling;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class cookiesTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
	//get cookies method:
		Set<Cookie> cookies=driver.manage().getCookies(); // capture all the cookies from the browser
		System.out.println("Size of cookies : "+cookies.size()); // print size of cookies
		
		for(Cookie cookie:cookies){ // Read and print all the cookies
			System.out.println(cookie.getName()+" : "+ cookie.getValue());// Print name and value of the cookies
		}
		
	//get cookie named method:
		System.out.println(driver.manage().getCookieNamed("__gpi : UID"));// it will print specific cookie according to name
	
	//add new cookies by using add cookie method:
		Cookie cobj = new Cookie("mycookie","1234567890");
		driver.manage().addCookie(cobj); // add new cookie to the browser
		cookies=driver.manage().getCookies();
		System.out.println("Size of cookies : "+cookies.size()); // print size of cookies
		for(Cookie cookie:cookies){ // Read and print all the cookies
			System.out.println(cookie.getName()+" : "+ cookie.getValue());// Print name and value of the cookies
		}
	// Delete specific cookie by using delete cookie method:
		driver.manage().deleteCookie(cobj);
		cookies=driver.manage().getCookies();
		for(Cookie cookie:cookies){ // Read and print all the cookies
			System.out.println(cookie.getName()+" : "+ cookie.getValue());// Print name and value of the cookies
		}
	// Delete all the cookies by using delete all cookies method:
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("Size of cookies : "+cookies.size());
		driver.close();
	}

}
