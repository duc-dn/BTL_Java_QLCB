
package com.mycompany.qlcb.filehelpers;

import com.mycompany.qlcb.model.Congnhan;
import com.mycompany.qlcb.model.Kysu;
import com.mycompany.qlcb.model.Nhanvien;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;


public class ExportBase {

    private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook) {
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    }

    /**
     *
     * @param list
     * @throws IOException
     */
    public static void NhanVienExport(List<Nhanvien> list) throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Employees sheet");


        int rownum = 0;
        Cell cell;
        Row row;
        //
        HSSFCellStyle style = createStyleForTitle(workbook);

        row = sheet.createRow(rownum);

        // EmpNo
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("Mã NV");
        cell.setCellStyle(style);
        // EmpName
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Tên NV");
        cell.setCellStyle(style);
        
        cell = row.createCell(2, CellType.NUMERIC);
        cell.setCellValue("Năm sinh");
        cell.setCellStyle(style);
        
        // Salary
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Giới tính");
        cell.setCellStyle(style);
        // Grade
        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("Địa chỉ");
        cell.setCellStyle(style);
        // Bonus
        cell = row.createCell(5, CellType.STRING);
        cell.setCellValue("Công việc");
        cell.setCellStyle(style);

        // Data
        for (Nhanvien emp : list) {
            rownum++;
            row = sheet.createRow(rownum);

            // EmpNo (A)
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue(emp.getMacb());
            // EmpName (B)
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(emp.getTencb());
            
            cell = row.createCell(2, CellType.NUMERIC);
            cell.setCellValue(emp.getNamsinh());
            
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue(emp.getGioitinh());
            // Grade (D)
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue(emp.getDiachi());
            
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue(emp.getCongviec());

         
        }
        File file = new File("D:/employee.xls");
        file.getParentFile().mkdirs();

        FileOutputStream outFile = new FileOutputStream(file);
        workbook.write(outFile);
        System.out.println("Created file: " + file.getAbsolutePath());

    }
    
    public static void KySuExport(List<Kysu> list) throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Employees sheet");


        int rownum = 0;
        Cell cell;
        Row row;
        //
        HSSFCellStyle style = createStyleForTitle(workbook);

        row = sheet.createRow(rownum);

        // EmpNo
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("Mã NV");
        cell.setCellStyle(style);
        // EmpName
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Tên NV");
        cell.setCellStyle(style);
        
        cell = row.createCell(2, CellType.NUMERIC);
        cell.setCellValue("Năm sinh");
        cell.setCellStyle(style);
        
        // Salary
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Giới tính");
        cell.setCellStyle(style);
        // Grade
        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("Địa chỉ");
        cell.setCellStyle(style);
        // Bonus
        cell = row.createCell(5, CellType.STRING);
        cell.setCellValue("Ngành đào tạo");
        cell.setCellStyle(style);
        
        cell = row.createCell(5, CellType.STRING);
        cell.setCellValue("Loại bằng");
        cell.setCellStyle(style);

        // Data
        for (Kysu emp : list) {
            rownum++;
            row = sheet.createRow(rownum);

            // EmpNo (A)
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue(emp.getMacb());
            // EmpName (B)
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(emp.getTencb());
            
            cell = row.createCell(2, CellType.NUMERIC);
            cell.setCellValue(emp.getNamsinh());
            
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue(emp.getGioitinh());
            // Grade (D)
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue(emp.getDiachi());
            
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue(emp.getNganhdt());

            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue(emp.getLoaibang());
         
        }
        File file = new File("D:/engineer.xls");
        file.getParentFile().mkdirs();

        FileOutputStream outFile = new FileOutputStream(file);
        workbook.write(outFile);
        System.out.println("Created file: " + file.getAbsolutePath());

    }
    public static void WorkerExport(List<Congnhan> list) throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Employees sheet");


        int rownum = 0;
        Cell cell;
        Row row;
        //
        HSSFCellStyle style = createStyleForTitle(workbook);

        row = sheet.createRow(rownum);

        // EmpNo
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("Mã NV");
        cell.setCellStyle(style);
        // EmpName
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Tên NV");
        cell.setCellStyle(style);
        
        cell = row.createCell(2, CellType.NUMERIC);
        cell.setCellValue("Năm sinh");
        cell.setCellStyle(style);
        
        // Salary
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Giới tính");
        cell.setCellStyle(style);
        // Grade
        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("Địa chỉ");
        cell.setCellStyle(style);
        // Bonus
        cell = row.createCell(5, CellType.STRING);
        cell.setCellValue("Bậc");
        cell.setCellStyle(style);
        
        // Data
        for (Congnhan emp : list) {
            rownum++;
            row = sheet.createRow(rownum);

            // EmpNo (A)
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue(emp.getMacb());
            // EmpName (B)
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(emp.getTencb());
            
            cell = row.createCell(2, CellType.NUMERIC);
            cell.setCellValue(emp.getNamsinh());
            
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue(emp.getGioitinh());
            // Grade (D)
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue(emp.getDiachi());
            
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue(emp.getBac());
         
        }
        File file = new File("D:/worker.xls");
        file.getParentFile().mkdirs();

        FileOutputStream outFile = new FileOutputStream(file);
        workbook.write(outFile);
        System.out.println("Created file: " + file.getAbsolutePath());

    }

}
