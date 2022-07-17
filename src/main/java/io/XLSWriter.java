package io;

import org.apache.poi.xssf.usermodel.*;
import util.Statistic;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;


public class XLSWriter {

    private static XSSFCellStyle createCellStyleMethod(XSSFWorkbook workbook) {
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        XSSFCellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFont(font);
        return cellStyle;
    }

    public void createBook() throws IOException {
        XSSFWorkbook writerBook = new XSSFWorkbook();
        XSSFSheet firstSheet = writerBook.createSheet("FirstPage");
        List<Statistic> statList = Statistic.createNewList();
        XSSFCellStyle superStyle = createCellStyleMethod(writerBook);

        int rowNum = 0;
        Row row;
        Cell cell;

        row = firstSheet.createRow(rowNum);
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("Main Profile");
        cell.setCellStyle(superStyle);// Main profile

        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("AVG");
        cell.setCellStyle(superStyle);// AVG Level

        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Student count");
        cell.setCellStyle(superStyle);// Students count

        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("University count");
        cell.setCellStyle(superStyle);// University count

        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("University name");
        cell.setCellStyle(superStyle);// University name

        for (Statistic statistic : statList) {
            rowNum++;
            row = firstSheet.createRow(rowNum);

            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue(String.valueOf(statistic.getMainProfile()));

            cell = row.createCell(1, CellType.NUMERIC);{
            cell.setCellValue(statistic.getAvgLevel());
            }

            cell = row.createCell(2, CellType.NUMERIC);
            cell.setCellValue(statistic.getStudentCount());

            cell = row.createCell(3, CellType.NUMERIC);
            cell.setCellValue(statistic.getUniversityCount());

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue(statistic.getUniversityName());
        }
        File firstPancake = new File("C:\\Statistic.xlsx");

        FileOutputStream pancakeStream = new FileOutputStream(firstPancake);
        writerBook.write(pancakeStream);
        System.out.println("Book was created");

    }
}
