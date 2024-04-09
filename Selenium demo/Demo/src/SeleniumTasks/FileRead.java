package SeleniumTasks;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class FileRead {
public static void main (String [] args) throws IOException{
//Path of the excel file
FileInputStream fs = new FileInputStream("C:\\Users\\keerthiraja.sp\\OneDrive - HCL Technologies Ltd\\Desktop\\File.xlsx");
//Creating a workbooks
XSSFWorkbook workbook = new XSSFWorkbook(fs); //creating work book for excel sheet
//XSSFSheet sheet = workbook.getSheet("sheet1");// providing sheet name 
XSSFSheet sheet = workbook.getSheetAt(0); // providing index of sheet
Row row = sheet.getRow(0);//Providing 0th row 
Cell cell = row.getCell(0);//Providing 0th cell
System.out.println(sheet.getRow(0).getCell(0));//printing 0th row 0th cell value
Row row1 = sheet.getRow(1);
row1.getCell(1);
System.out.println(sheet.getRow(0).getCell(1));
Row row2 = sheet.getRow(1);
row2.getCell(1);
System.out.println(sheet.getRow(1).getCell(0));
Row row3 = sheet.getRow(1);
row3.getCell(1);
System.out.println(sheet.getRow(1).getCell(1));
String cellval = cell.getStringCellValue();
System.out.println(cellval);
}
}