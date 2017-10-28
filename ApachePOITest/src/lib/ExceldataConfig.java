package lib;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceldataConfig {
	
	XSSFWorkbook wb;
	
	XSSFSheet sheet1;
	
	public ExceldataConfig(String excelPath) throws Exception{
		
		try{
		File  src = new File(excelPath);
		
		/*
		 * FileInputStream will load file into bytes.
		 */
		FileInputStream fis = new FileInputStream(src);
		
		/*
		 *Excel workbook will be loaded by XSSFWorkbook for xlsx file
		 *if having xls file, use HSSFWorkbook 
		 */
		 wb = new XSSFWorkbook(fis);
	
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

	public String getData(int sheetNumber, int row, int column){
		
		sheet1 = wb.getSheetAt(sheetNumber);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}
	
	
}
