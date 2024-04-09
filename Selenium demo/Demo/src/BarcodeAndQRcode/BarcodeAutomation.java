package BarcodeAndQRcode;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarcodeAutomation {

	public static void main(String[] args) throws IOException, NotFoundException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.codereadr.com/demo/");
		String Barcode=driver.findElement(By.xpath("/html/body/div[1]/div/main/div/section/div/div/div/div/div[27]/div/div[1]/div/span/img")).getAttribute("src");
		System.out.println(Barcode);
		
		// create the URL object for bar code site
			URL url = new URL(Barcode);
		// Read the image URL by using buffered Image class
			BufferedImage bufferImage = ImageIO.read(url);
		//the read buffer image stored variable was give in to the luminanSource class from zxing file
			LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferImage);
		// create binary bitmap is used to extract the bar code and it used to store the luminunSource
			BinaryBitmap binaryBitmap= new BinaryBitmap(new HybridBinarizer(luminanceSource));
		// below code used to decode the the binary bit map object and store the decoded value in result object
			Result result = new MultiFormatReader().decode(binaryBitmap);
		// print the result of bar code 
			System.out.println(result.getText());
	}

}
