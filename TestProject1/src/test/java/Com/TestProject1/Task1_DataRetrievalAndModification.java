package Com.TestProject1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task1_DataRetrievalAndModification {
	 public static void dataRetrieval() throws IOException
	  {
		File f=new File("C:\\Users\\vivekrajan\\eclipse-workspace\\Excel\\2017.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fi);
		Sheet sheetAt = wb.getSheetAt(0);
		int noOfRows = sheetAt.getPhysicalNumberOfRows();
		Set <String> ListOfDogBreeds = new LinkedHashSet<String>();
		for (int i = 1;i<noOfRows;i++)
		{
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(1);
			String CellValue = cell.getStringCellValue();
			String trimmedValue = CellValue.replaceAll(" ","");
			String lowerCaseValue = trimmedValue.toLowerCase();
			ListOfDogBreeds.add(lowerCaseValue);
		}
		
		System.out.println(ListOfDogBreeds);
		
	  }
	  
		public static void main(String[] args) throws Exception {
			dataRetrieval();
			
		}
	}
