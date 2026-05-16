package excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelHandler {

    public static String readKeyword(String filePath, String sheetName, int rowNum) {
        String keyword = "";
        try {
            FileInputStream file = new FileInputStream(new File(filePath));
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheet(sheetName);

            // Read keyword
            Row row = sheet.getRow(rowNum);
            keyword = row.getCell(0).getStringCellValue();

            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return keyword;
    }

    public static void writeResults(String filePath, String sheetName, int rowNum, String longest, String shortest) {
        try {
            FileInputStream file = new FileInputStream(new File(filePath));
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheet(sheetName);

            // Write results
            Row row = sheet.getRow(rowNum);
            row.createCell(1).setCellValue(longest);  // Column B
            row.createCell(2).setCellValue(shortest); // Column C

            // Save changes
            file.close();
            FileOutputStream outFile = new FileOutputStream(new File(filePath));
            workbook.write(outFile);
            outFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
