package cn.itcast.demo;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelParserDemo {

    public static void main(String[] args) throws Exception {

        String filename = "D:\\develop\\excel\\我的报表.xlsx";

        //1. 创建WorkBook对象
        Workbook workbook = null;
        if(filename.endsWith(".xls")){
            workbook = new HSSFWorkbook(new FileInputStream(new File(filename)));
        }else if(filename.endsWith(".xlsx")){
            workbook = new XSSFWorkbook(new FileInputStream(new File(filename)));
        }else{
            System.out.println("不支持");
        }

        parseExcel(workbook);
    }



    private static void parseExcel(Workbook workbook) {
        //2. 构造sheet
        Sheet sheet = workbook.getSheetAt(0);

        //3. 读取行
        int rows = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rows; i++) {
            Row row = sheet.getRow(i);

            String rowMessage = "";
            int cells = row.getPhysicalNumberOfCells();
            for (int j = 0; j < cells; j++) {
                Cell cell = row.getCell(j);
                int cellType = cell.getCellType();

                switch(cellType){
                    case Cell.CELL_TYPE_BLANK:
                        rowMessage += "\t";
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        rowMessage += cell.getBooleanCellValue()+"\t";
                        break;
                    case Cell.CELL_TYPE_ERROR:
                        rowMessage += cell.getErrorCellValue()+"\t";
                        break;
                    case Cell.CELL_TYPE_FORMULA:
                        rowMessage += cell.getNumericCellValue()+"\t";
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        rowMessage += cell.getNumericCellValue()+"\t";
                        break;
                    case Cell.CELL_TYPE_STRING:
                        rowMessage += cell.getStringCellValue()+"\t";
                        break;
                    default:
                        break;
                }

            }

            System.out.println(rowMessage);
        }
    }

}
