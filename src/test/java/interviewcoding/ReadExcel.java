package interviewcoding;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel extends WriteExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh = wb.getSheet(sheetName);

		for (Row row : sh) {

			for (Cell cell : row) {

				switch (cell.getCellType()) {

				case STRING:
					System.out.print(cell.getStringCellValue() + "\t");
					break;

				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + "\t");
					break;

				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue() + "\t");
					break;

				case FORMULA:
					System.out.print(cell.getCellFormula() + "\t");
					break;

				default:
					System.out.println("unknown type\t");

				}

			}

			System.out.println();

		}

	}

}
