package read.exceldata;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws Exception {
		

		File  src = new File("/Users/meenal/Downloads/ExcelData.xlsx");
		
		/*
		 * FileInputStream will load file into bytes.
		 */
		FileInputStream fis = new FileInputStream(src);
		
		/*
		 *Excel workbook will be loaded by XSSFWorkbook for xlsx file
		 *if having xls file, use HSSFWorkbook 
		 */
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowcount = sheet1.getLastRowNum();
		rowcount++;
		
		System.out.println("Total rows are: "+rowcount);
		
		for(int i=0; i<rowcount; i++){
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Test data from Row "+i+"is "+data0);
			
			String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Test data from Row "+i+"is "+data1);
		}
		
		/*
		 * It will create object in memory, shud be closed else memory leak in future
		 */
		wb.close();
		
	}

}
