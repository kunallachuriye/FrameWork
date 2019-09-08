package comm.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;

	public ExcelDataProvider() {
		File src = new File("./TestData/Testdata.xlsx");
		try {
			FileInputStream fi = new FileInputStream(src);
			wb = new XSSFWorkbook(fi);
		} catch (Exception e) {
			System.out.println("Not able to read Excel " + e.getMessage());
		}

	}

	public String getStringData(String sheetName, int rowNo, int colNo) {
		return wb.getSheet(sheetName).getRow(rowNo).getCell(colNo).getStringCellValue();
	}

	public String getStringData(int sheetindex, int rowNo, int colNo) {
		return wb.getSheetAt(sheetindex).getRow(rowNo).getCell(colNo).getStringCellValue();
	}

	public double getIntData(String sheetName, int rowNo, int colNo) {
		return wb.getSheet(sheetName).getRow(rowNo).getCell(colNo).getNumericCellValue();
	}

	public double getIntData(int sheetindex, int rowNo, int colNo) {
		return wb.getSheetAt(sheetindex).getRow(rowNo).getCell(colNo).getNumericCellValue();
	}
}
