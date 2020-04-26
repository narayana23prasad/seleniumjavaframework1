package utils;

public class excelutilsdemo {
public static void main(String[] args) {
	String projectpath = System.getProperty("user.dir");
	String excelpath = projectpath + "\\excel\\data.xlsx";
	String sheetname = "Sheet1";
	excelutils excel = new excelutils(excelpath, sheetname);
	excelutils.getrowcount();
	excelutils.getcelldatastring(0, 0);
	excelutils.getcelldatanumeric(1, 1);
}
}
