package com.automation.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Greens Workspace\\MavenProject\\login.xlsx");
		FileInputStream fis = new FileInputStream(file);

		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		for (int i = 0; i <= 1; i++) {
			for (int j = 1; j <= 10; j++) {
				Row row = sheetAt.getRow(j);
				Cell cell = row.getCell(i);
				String stringCellValue = cell.getStringCellValue();

				System.out.print(j + ":" + stringCellValue + ", ");
			}
			System.out.println();
		}
		System.out.println("**********************************");
	}
}
