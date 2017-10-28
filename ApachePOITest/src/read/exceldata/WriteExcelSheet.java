package read.exceldata;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet {

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
		
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		
		sheet1.getRow(1).createCell(2).setCellValue("Fail");
		
		FileOutputStream fout = new FileOutputStream(src);
		
		wb.write(fout);
		
		/*
		 * It will create object in memory, shud be closed else memory leak in future
		 */
		wb.close();
		
	}

}
