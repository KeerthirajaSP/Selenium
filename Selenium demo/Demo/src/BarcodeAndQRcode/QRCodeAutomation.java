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

public class QRCodeAutomation {

	public static void main(String[] args) throws IOException, NotFoundException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.codereadr.com/demo/");
		String QRcodeURL=driver.findElement(By.xpath("/html/body/div[1]/div/main/div/section/div/div/div/div/div[4]/div/div[1]/div/span/img")).getAttribute("src");
		System.out.println(QRcodeURL);
		// create the URL object for bar code site
			URL url = new URL(QRcodeURL);
			
		// Read the image URL by using buffered Image class
			BufferedImage bufferImage = ImageIO.read(url);
			
			LuminanceSource luminanceSource= new BufferedImageLuminanceSource(bufferImage);
			BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
			Result result=new MultiFormatReader().decode(bitmap);
			
			System.out.println(result.getText());
			
	}

}
