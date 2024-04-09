package WebElements;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrockenLink {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {
			
			//by using href attribute we can get URL of requIred link
			WebElement element =links.get(i);
			String url=element.getAttribute("href");
			try{
				URL link= new URL(url);
				//Create a connection using url object 'link'
				HttpURLConnection httpconn= (HttpURLConnection)link.openConnection();
				//wait time 2 second
				httpconn.setConnectTimeout(5000);
				//Establish connection
				httpconn.connect();
				// return response code. if res code is above 400: broken
				int rescode=httpconn.getResponseCode();
				if(rescode>=400){
					System.out.println(url +" is broken link");
				}else{
					System.out.println(url +" is valid link");
					httpconn.disconnect();
				}
			}
			catch(Exception e){
				System.err.println(e);
			}
		}
	}

}
