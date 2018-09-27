package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

// Utility class help in achieving reusability
public class TestUtil {
	WebDriver driver = null;

	// Read data from excel
	public static String getCellData(String xlpath, String sheet, int row, int cell) {
		String v = "";
		try {
			FileInputStream fis = new FileInputStream(xlpath);
			Workbook wb = WorkbookFactory.create(fis);
			v = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		} catch (Exception e) {
		}
		return v;
	}

	// Get row count
	public static int getRowCount(String xlpath, String sheet) {
		int rc = 0;
		try {
			FileInputStream fis = new FileInputStream(xlpath);
			Workbook wb = WorkbookFactory.create(fis);
			rc = wb.getSheet(sheet).getLastRowNum();
		} catch (Exception e) {
		}
		return rc;
	}

	// Write data to excel
	public static void writedata(String xlpath, String sheet, String cello, int rr, int cc) throws IOException {
		FileInputStream fis = new FileInputStream(xlpath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheet);
		Row row1 = sh.createRow(rr);
		Cell cell1 = row1.createCell(cc);
		// cell.setCellType(cell.CELL_TYPE_STRING);
		cell1.setCellValue(cello);
		FileOutputStream fos = new FileOutputStream(xlpath);
		wb.write(fos);
		fos.close();
		System.out.println("END OF WRITING DATA IN EXCEL");

	}

	String dir = "C:\\Users\\v.bamdeo.sharma\\";

	// TakeScreenshot
	public String TakeScreenshot(String name) throws Exception {
		File srcs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String img = dir + "\\test-data\\Screenshots\\" + name + ".png";
		FileUtils.copyFile(srcs, new File(img));
		return img;
	}

}
