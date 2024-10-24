package com.qa.AutomationExercise.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_utils {
	
	
    private static final String TEST_DATA_SHEET_PATH = "./src/test/resource/Testdata/Datasheet.xlsx";
    private static Workbook wbook;
    private static Sheet sheet;
    
    public static Object[][] getTestData(String sheetname) {
    
    Object object[][] = null; 	
    	
        try {
            FileInputStream ip = new FileInputStream(TEST_DATA_SHEET_PATH);
            wbook = WorkbookFactory.create(ip); // This can throw IOException and InvalidFormatException
            sheet = wbook.getSheet(sheetname);
            object = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
            
            for(int i=0; i<sheet.getLastRowNum();i++) {
            	for(int j=0; j<sheet.getRow(0).getLastCellNum(); j++) {
            		object[i][j] = sheet.getRow(i+1).getCell(j).toString();
            		
            	}
           }
            
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found at the given path: " + TEST_DATA_SHEET_PATH);
            e.printStackTrace();
        }  catch (IOException e) {
            System.out.println("I/O error occurred while reading the Excel file.");
            e.printStackTrace();
            
        }
        return object;

    }
}
