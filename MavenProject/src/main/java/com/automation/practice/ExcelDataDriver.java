package com.automation.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDriver {
	public static File file;
	public static FileInputStream fis;
	public static Workbook wb;
	public static FileOutputStream fos;

	public static void createExcel() throws IOException {
		file = new File("D:\\Greens Workspace\\MavenProject\\target\\UserInfo.xlsx");
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);

		Sheet createSheet = wb.createSheet("UserInfoSheet1");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("username");
		createCell = createRow.createCell(1);
		createCell.setCellValue("password");

		fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();
		System.out.println("Cell Created Successfully");
	}

	public static void updateSheet() throws IOException {
		file = new File("D:\\Greens Workspace\\MavenProject\\target\\UserInfo.xlsx");
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);

		Sheet createSheet = wb.getSheet("UserInfoSheet1");
		Row createRow = createSheet.createRow(1);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("ragu");
		createCell = createRow.createCell(1);
		createCell.setCellValue("raman");

		Row createRow1 = createSheet.createRow(2);
		Cell createCell1 = createRow1.createCell(0);
		createCell1.setCellValue("admin");
		createCell1 = createRow1.createCell(1);
		createCell1.setCellValue("admin123");

		Row createRow2 = createSheet.createRow(3);
		Cell createCell2 = createRow2.createCell(0);
		createCell2.setCellValue("greens");
		createCell2 = createRow2.createCell(1);
		createCell2.setCellValue("greens123");

		fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();
		System.out.println("Cell Updated Successfully");
	}

	public static void getData() throws IOException {
		file = new File("D:\\Greens Workspace\\MavenProject\\target\\UserInfo.xlsx");
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheet("UserInfoSheet1");

		for (int i = 0; i <  sheetAt.getPhysicalNumberOfRows(); i++) {
			Row row = sheetAt.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();

				if (cellType.equals(cellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();	
					System.out.println(i+" "+stringCellValue);

				} else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					System.out.println(i+" "+numericCellValue);
				}
			}
		}

	}
	
	
	public static void getInfo() throws IOException{
		File file = new File("E:\\Greens Workspace\\MavenProject\\Info.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetName = wb.getSheet("info");
		
		// First Name
		Row firstName = sheetName.getRow(0);
		Cell fName = firstName.getCell(1);
		CellType fnCellType = fName.getCellType();
		
		if (fnCellType.equals(fnCellType.STRING)) {
			String stringCellValue = fName.getStringCellValue();	
			System.out.println("FirstName: "+stringCellValue);

		} else if (fnCellType.equals(fnCellType.NUMERIC)) {
			double numericCellValue = fName.getNumericCellValue();
			System.out.println("FirstName: "+numericCellValue);
		}
		
		// Last Name
		Row lastName = sheetName.getRow(1);
		Cell lname = lastName.getCell(1);
		CellType lnCellType = lname.getCellType();
		
		if (lnCellType.equals(lnCellType.STRING)) {
			String stringCellValue = lname.getStringCellValue();	
			System.out.println("LastName: "+stringCellValue);

		} else if (lnCellType.equals(lnCellType.NUMERIC)) {
			double numericCellValue = lname.getNumericCellValue();
			System.out.println("LastName: "+numericCellValue);
		}
	}

	public static void main(String[] args) throws Exception {
	// createExcel();
	//	updateSheet();
	//	getData();
		getInfo();
	}
}

/*
////// Output Using Empty Space
0 username
0 password
1 ragu
1 raman
2 admin
2 admin123
4 greens
4 greens123

////// Output Using null values
0 username
0 password
1 ragu
1 raman
2 admin
2 admin123
3 null
3 null
4 greens
4 greens123


*/
