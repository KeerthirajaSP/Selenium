package SeleniumTasks;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FileReadSelenium {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		//Path of the excel file and getting data from excel sheet
				FileInputStream fs = new FileInputStream("C:\\Users\\keerthiraja.sp\\OneDrive - HCL Technologies Ltd\\Desktop\\Keerthiraja Selenium tasks\\Registration.xlsx");
				//Creating a workbooks
				XSSFWorkbook workbook = new XSSFWorkbook(fs); //creating work book for excel sheet
				
				XSSFSheet sheet = workbook.getSheet("sheet1");// providing sheet name 
				
				int noofrow=sheet.getLastRowNum();// return the row count
				int noofcolumn=sheet.getRow(0).getLastCellNum(); //returns column/cell count
				System.out.println("Number of records in excel sheet : "+ noofrow);
				System.out.println("Number of records in excel sheet : "+ noofcolumn);
				
				for(int i=1; i<= noofrow; i++){
					XSSFRow currentrow=sheet.getRow(i); // it is focus on current row based on i value.
					String Firstname= currentrow.getCell(0).getStringCellValue();
					String Lastname= currentrow.getCell(1).getStringCellValue();
					String Address= currentrow.getCell(2).getStringCellValue();
					String Email= currentrow.getCell(3).getStringCellValue();
					long Phone=(long)currentrow.getCell(4).getNumericCellValue();
					//String Language= currentrow.getCell(5).getStringCellValue();
					String Skills= currentrow.getCell(6).getStringCellValue();
					String Country= currentrow.getCell(7).getStringCellValue();
					
				//Registration process
				//Entering contact information
					driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys(Firstname);
					driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys(Lastname);
					driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys(Address);
					driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys(Email);
				//Send keys method not allow the numeric values so, we are using string.valueof();
					driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input")).sendKeys(String.valueOf(Phone));
				//Entering the language by selecting drop down method
					//Select dropLanguage=new Select(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li")));
					//dropLanguage.selectByVisibleText(Language);
				//Entering the Skills by select drop down method
					Select dropSkill=new Select(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[8]/div/select")));
					dropSkill.selectByVisibleText(Skills);
				//Entering the country by select drop down method
					Select ctry=new Select(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/select")));
					ctry.selectByVisibleText(Country);
				
				}
				}

	}


