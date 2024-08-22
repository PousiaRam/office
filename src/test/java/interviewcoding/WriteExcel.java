package interviewcoding;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String sheetName = "Data";

	static File file = new File("C:\\Users\\r186\\Desktop\\ReadExcel.xlsx");

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		List<Integer> in = new ArrayList<Integer>();

		for (int k = 0; k <= 10; k++) {

			in.add(k);
		}

		wb = new XSSFWorkbook();
		ws = wb.createSheet(sheetName);

		for (int i = 0; i < 2; i++) {

			row = ws.createRow(i);

			for (int j = 0; j < 2; j++) {

				cell = row.createCell(j);

				if (i * 2 + j < in.size()) {
					cell.setCellValue(in.get(i * 2 + j)); // 0,1,2,3,
				} else {
					cell.setCellValue(""); // Set empty value if the list is exhausted
				}

			}

		}

		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();

	}

}
