package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public  String[][] readData(String Sheet) throws IOException{
		XSSFWorkbook wb = new XSSFWorkbook("./Excel/CompanyName.xlsx");
		XSSFSheet sheet = wb.getSheet(Sheet);
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(1).getLastCellNum();
		String[][] data = new String[rowcount][colcount];
		for (int i = 1; i <=rowcount ; i++) {
			for (int j = 0; j < colcount; j++) {
				String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellValue );
				data[i-1][j] = cellValue;
			}
			
		}
		
		
		wb.close();
		
		return data;

	}

}
