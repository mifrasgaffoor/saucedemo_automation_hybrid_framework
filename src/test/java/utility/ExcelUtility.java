package utility;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtility {


    public  static Object[][] readExcel(String sheetName) throws IOException {
        String path = "testData\\Book1.xlsx";
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workBook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workBook.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum() + 1; // Includes the header row
        System.out.println(rowCount);


        Row headerRow = sheet.getRow(0); // Assuming the first row contains headers
        int cellCount = headerRow.getLastCellNum();
        System.out.println("Total Columns: " + cellCount);


        // Create a 2D Object array to store the Excel data
        Object[][] data = new Object[rowCount - 1][cellCount]; // Exclude header row from data


        // Loop through the rows
        for (int i = 1; i < rowCount; i++) { // Include all rows
            Row row = sheet.getRow(i);
            if (row != null) {
                // Loop through the cells in the current row
                for (int j = 0; j < cellCount; j++) {
                    Cell cell = row.getCell(j);
                    if (cell != null) {
                        // Print the cell value
                        System.out.print(cell.toString() + "\t");
                        data[i - 1][j] = cell.toString();
                    } else {
                        data[i - 1][j] = null; // Handle empty cells
                        System.out.print("null\t");

                    }
                }
                System.out.println();
            }
        }    // Close resources
        workBook.close();
        fileInputStream.close();

        return data;


    }
    // Method to get the username and password from the Excel file
    public static String[] getUsernameAndPassword(String sheetName) throws IOException {
        String path = "testData\\Book1.xlsx";
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workBook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workBook.getSheet(sheetName);

        // Assuming the first row contains the headers, and the username and password are in the first two columns
        Row row = sheet.getRow(1); // Row 1 should contain the credentials, adjust if needed

        String username = row.getCell(0).getStringCellValue(); // Assuming username is in the first column
        String password = row.getCell(1).getStringCellValue(); // Assuming password is in the second column

        // Close resources
        workBook.close();
        fileInputStream.close();

        return new String[] {username, password};
    }


}
