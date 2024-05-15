package Test_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.spi.FileSystemProvider;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcel {
//	@DataProvider(name="dynamicfetchData")

		/*
		 * XSSFWorkbook wb=new XSSFWorkbook(
		 * "C:\\Users\\sarankumar.balaji\\eclipse-workspace\\selenium_testng\\data\\CreateLead.xlsx"
		 * ); XSSFSheet ws=wb.getSheetAt(0);
		 * 
		 * int rowCount =ws.getLastRowNum(); System.out.println(rowCount);
		 * 
		 * // int totalRowsCount=ws.getPhysicalNumberOfRows(); //
		 * System.out.println(totalRowsCount);
		 * 
		 * int cellCount = ws.getRow(0).getLastCellNum(); System.out.println(cellCount);
		 * 
		 * String[][] data=new String[rowCount][cellCount]; for (int i =1; i < rowCount
		 * ; i++) { XSSFRow row=ws.getRow(i); for (int j = 0; j < cellCount; j++) {
		 * XSSFCell cell=row.getCell(j);
		 * 
		 * String cellvalue=cell.getStringCellValue(); data[i-1][j]=cellvalue; } }
		 * wb.close();
		 * 
		 * return data;
		 */
	@DataProvider(name="dynamicfetchData")
	public static String[][] readExcel() throws IOException
	{
		File file=new File("./data/CreateLead.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();//3
		int col=sheet.getRow(1).getLastCellNum();//3
		System.out.println(rows+" "+col);
		String[][] data =new String[rows][col];

		for(int i=1;i<=rows;i++) {
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<col;j++) {
				XSSFCell Cell=row.getCell(j);
				DataFormatter dataformat=new DataFormatter();
				String Value=dataformat.formatCellValue(Cell);
				data[i-1][j]=Value;

			}
		}
		return data;
	
	}
	/*
	 * public static void main(String[] args) throws IOException { String[][] excel
	 * = readExcel(); for (String[] strings : excel) { System.out.println(strings);
	 * } }
	 */
		
} 

 