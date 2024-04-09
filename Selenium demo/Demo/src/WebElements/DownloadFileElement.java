package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DownloadFileElement {

	public static void main(String[] args) {
		
		//Additional settings for fire fox browser
		/*FirefoxProfile profile= new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/plain,sapplication/pdf");//mime type
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("pdfjs.disabled", true);//only for pdf file
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver =new FirefoxDriver(option);*/
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
//Downloading text file
		driver.findElement(By.id("textbox")).sendKeys("testing files");//text box
		driver.findElement(By.id("createTxt")).click();//generate button
		driver.findElement(By.id("link-to-download")).click();//click on the download link
//Downloading text file
		driver.findElement(By.id("pdfbox")).sendKeys("testing pdf files");//text box
		driver.findElement(By.id("createPdf")).click();//generate button
		driver.findElement(By.id("pdf-link-to-download")).click();//click on the download link
	}
}
