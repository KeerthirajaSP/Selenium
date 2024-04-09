package WebElements;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindingBrokenImageLink {
	public static void main(String[] args) throws Exception {
		VerifyBrokenImageUsingSelinium();
		//VerifyBrokenImageUsingJsoup();
	}
	public static void VerifyBrokenImageUsingSelinium() throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);
		List<WebElement> images =driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		for(WebElement image:images ){
			String imagesrc = image.getAttribute("src");
			try{
				URL url = new URL(imagesrc);
				URLConnection urlconnection = url.openConnection();
				HttpsURLConnection httpURLConnection=(HttpsURLConnection)urlconnection;
				httpURLConnection.setConnectTimeout(5000);
				httpURLConnection.connect();
				
				if(httpURLConnection.getResponseCode()==200){
					System.out.println(imagesrc +" >> "+ httpURLConnection.getResponseCode() +" >> "+ httpURLConnection.getResponseMessage());	
				}
				else{
					System.out.println(imagesrc +" >> "+ httpURLConnection.getResponseCode() +" >> "+ httpURLConnection.getResponseMessage());
					httpURLConnection.disconnect();
				}
			}catch(Exception e){
				System.err.println(imagesrc);
			}
		}
	}


}
