package cn.itcast.demo;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteExcelDemo {

    public static void main(String[] args) throws Exception {

        Workbook workbook = new HSSFWorkbook();

        Sheet sheet = workbook.createSheet("笑傲江湖");
        sheet.setDefaultColumnWidth(50);


        CellStyle cellStyle = workbook.createCellStyle();
        //设置边框
        cellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        cellStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        cellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
        cellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);

        // 设置这些样式
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);//水平居中
        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);//垂直居中

        // 背景色
        cellStyle.setFillForegroundColor(HSSFColor.YELLOW.index);
        cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        cellStyle.setFillBackgroundColor(HSSFColor.YELLOW.index);

        // 自动换行
        cellStyle.setWrapText(true);

        // 生成一个字体
        Font font = workbook.createFont();
        font.setFontHeightInPoints((short) 10);
        font.setColor(HSSFColor.RED.index);
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        font.setFontName("宋体");

        // 把字体 应用到当前样式
        cellStyle.setFont(font);



        Row row = sheet.createRow(0);
        row.setHeight((short)1000);

        Cell cell = row.createCell(0);
        cell.setCellValue("姓名");
        cell.setCellStyle(cellStyle);

        Cell cell1 = row.createCell(1);
        cell1.setCellValue("昵称");
        cell1.setCellStyle(cellStyle);

        Cell cell2 = row.createCell(2);
        cell2.setCellValue("年龄");
        cell2.setCellStyle(cellStyle);

        Cell cell3 = row.createCell(3);
        cell3.setCellValue("等级");
        cell3.setCellStyle(cellStyle);

        workbook.write(new FileOutputStream(new File("D:/1.xls")));
    }

}
