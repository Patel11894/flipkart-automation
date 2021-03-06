package filpkart_project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Excel_Util 
{

		public String excelPath="userdata.xlsx";
		public String readData( String sheetName, int rowNum, int colNum) throws InvalidFormatException, IOException
		{
			FileInputStream fis=new FileInputStream(excelPath);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetName);
			Row row=sh.getRow(rowNum);
			String data=row.getCell(colNum).getStringCellValue();
			return data;			
		}
		
		
		public static void writeData(String path, String sheetName, int rowNum, int colNum, String data)
		{
			try
			{
			FileInputStream fis = new FileInputStream(path);
			Workbook w1 = WorkbookFactory.create(fis);
			Sheet s1 = w1.getSheet(sheetName);
		    s1.getRow(rowNum).createCell(colNum).setCellValue(data);
			FileOutputStream fos = new FileOutputStream(path);
			w1.write(fos);
			}
			catch(Exception e)
			{
			
			}
			
		}

}
