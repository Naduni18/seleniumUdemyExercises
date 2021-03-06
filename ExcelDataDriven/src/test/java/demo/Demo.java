package demo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Naduni
 *
 */
public class Demo {
	static String currentDirectory = System.getProperty("user.dir");
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException  {
	
		getArow("Sheet2","buy");
		
		
   
	}
public static ArrayList<String> getArow(String sheet,String testCaseName) throws IOException {
	ArrayList<String> a = new ArrayList();
	FileInputStream fin = new FileInputStream(currentDirectory+"\\dataSets\\data.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fin);
	
	int sheets = wb.getNumberOfSheets();
	int testCaseColumnIndex=0;
	int neededRowIndex =0;
	for(int i=0;i<sheets;i++) {
		XSSFSheet sh = wb.getSheetAt(i);
		if(sh.getSheetName().equalsIgnoreCase(sheet)) {
			System.out.println(sh.getSheetName());
			Iterator<Row> row = sh.iterator();
			Row firstrow = row.next();
			Iterator<Cell> cell = firstrow.cellIterator();
			
			
			while(cell.hasNext()) {
				Cell c = cell.next();
				if(c.getStringCellValue().equalsIgnoreCase("TestCase")) {
					
					testCaseColumnIndex = c.getColumnIndex();
					System.out.println(testCaseColumnIndex);
					a.add(c.getStringCellValue());
					break;
				}
			}
			
			
			while(row.hasNext()) {
				Row r = row.next();
				Cell c1 = r.getCell(testCaseColumnIndex);
				if(c1.getStringCellValue().equalsIgnoreCase(testCaseName)) {
					 neededRowIndex = r.getRowNum();
					 Iterator<Cell> cells = r.cellIterator();
					 while(cells.hasNext()) {
						 Cell cv = cells.next();
						 if(cv.getCellType() == CellType.STRING) {
						 a.add(cv.getStringCellValue());
						 }else {
							 double scv =cv.getNumericCellValue();
							 a.add(Double.toString(scv)); 
						 }
					 }
					 System.out.println(neededRowIndex);
					 break;
				}
			}
			
			
		}
	}
	return a;
}
}
