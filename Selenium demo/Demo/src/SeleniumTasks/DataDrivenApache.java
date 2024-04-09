package SeleniumTasks;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataDrivenApache {

	public static void main(String[] args) throws IOException {
		
			System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://cleartax.in/s/simple-compound-interest-calculator");
		//Path of the excel file and getting data from excel sheet
				FileInputStream fs = new FileInputStream("C:\\Users\\keerthiraja.sp\\OneDrive - HCL Technologies Ltd\\Desktop\\Keerthiraja Selenium tasks\\Intrest.xlsx");
				//Creating a workbooks
				XSSFWorkbook workbook = new XSSFWorkbook(fs); //creating work book for excel sheet
				
				XSSFSheet sheet = workbook.getSheet("sheet1");// providing sheet name 
				int rewcount = sheet.getLastRowNum();
				for(int i=1;i<=rewcount;i++){
					XSSFRow row=sheet.getRow(i);
					String intresttype= row.getCell(0).getStringCellValue();
					XSSFCell principleAmount=row.getCell(1);
					int princ=(int)principleAmount.getNumericCellValue();
					XSSFCell AnnvalRate=row.getCell(2);
					int rateOfIntrest=(int)AnnvalRate.getNumericCellValue();
					String periodUnit=row.getCell(3).getStringCellValue();
					
					String period = row.getCell(4).getStringCellValue();
					
					Select ity=new Select(driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[1]/div/div[1]/div/fieldset/select")));
					ity.selectByVisibleText(intresttype);
					driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[1]/div/div[2]/div/fieldset/input")).sendKeys(String.valueOf(princ));
					driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[1]/div/div[3]/div/fieldset/input")).sendKeys(String.valueOf(rateOfIntrest));
					Select unit=new Select(driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[1]/div/div[4]/div/fieldset/select")));
					unit.selectByVisibleText(periodUnit);
					driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[1]/div/div[5]/div/fieldset/input")).sendKeys(period);
					
				}
	}

}
