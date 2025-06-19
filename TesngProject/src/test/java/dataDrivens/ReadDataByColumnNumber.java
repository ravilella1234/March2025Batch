package dataDrivens;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataByColumnNumber
{

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\testdata1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(1);
		String value = cell.getStringCellValue();
		
		System.out.println(value);
		
		wb.close();
		fis.close();
	}

}
