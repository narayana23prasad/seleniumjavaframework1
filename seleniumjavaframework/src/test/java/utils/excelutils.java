package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutils {
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public excelutils(String excelpath, String sheetname) {
		
		try {
		String projectpath = System.getProperty("user.dir");
		workbook = new XSSFWorkbook(excelpath);
		sheet = workbook.getSheet(sheetname);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		getrowcount();	
		getcelldatastring(0,0);
		getcelldatanumeric(1,1);
	}

	public static int getrowcount() {
		int rowcount = 0;
		try {
			rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("Row count: " + rowcount);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowcount;
	}

	
	public static int getcolcount() {
		int colcount = 0;

		try {
			colcount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Col count: " + colcount);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return colcount;
	}

	
	public static String getcelldatastring(int rownum,int colnum) {
		String celldata = null;
		//projectpath = System.getProperty("user.dir");
		try {
			//workbook = new XSSFWorkbook(projectpath + "\\excel\\data.xlsx");
			//sheet = workbook.getSheet("Sheet1");
			celldata = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			//System.out.println("Cell data: " +celldata);
			
		} 
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return celldata;
	}
		public static void getcelldatanumeric(int rownum,int colnum) {
			//projectpath = System.getProperty("user.dir");
			try {
				//workbook = new XSSFWorkbook(projectpath + "\\excel\\data.xlsx");
				//sheet = workbook.getSheet("Sheet1");
				Double celldata = sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
				//.out.println("Cell data: " +celldata);
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
			}		
	}

}
