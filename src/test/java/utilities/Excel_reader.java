package utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_reader {

	public static Object[][] read_from_ui_login_excel_file(String sheet_name) {

		String file_path = "./datas/ui-login.xlsx";
		Object data[][] = null;
		try {
			FileInputStream file = new FileInputStream(file_path);

			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet(sheet_name);
			int last_row_num = sheet.getLastRowNum();
			int last_cell_num = sheet.getRow(0).getLastCellNum();
			data = new String[last_row_num][last_cell_num];
			for (int row = 1; row <= last_row_num; row++) {
				for (int cell = 0; cell < last_cell_num; cell++) {
					data[row - 1][cell] = sheet.getRow(row).getCell(cell).getStringCellValue();
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

}
