package comm.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelDataProvider {
	public ExcelDataProvider() throws FileNotFoundException {
		File src = new File("./TestData/Testdata.xlsx");
		FileInputStream fi = new FileInputStream(src);
		
	}
}
