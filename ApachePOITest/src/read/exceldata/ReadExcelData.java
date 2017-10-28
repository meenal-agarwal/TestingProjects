package read.exceldata;

import lib.ExceldataConfig;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ExceldataConfig excel = new ExceldataConfig("/Users/meenal/Downloads/ExcelData.xlsx");
		
		System.out.println(excel.getData(1, 1, 1));
	}

}
