/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlcb.dao;

import com.mycompany.qlcb.helpers.DatabaseHelper;
import com.mycompany.qlcb.model.Canbo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Duc
 */
public class CanBoDao {
    public boolean insertCB(Canbo cb, int manghe) throws SQLException, Exception{
        String sql = "insert into tbl_canbo (tencb, namsinh, gioitinh, diachi, manghe) "
                + "values(?, ?, ?, ?, ?)";
        
        try
        (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);  
        ) 
        {
            pstmt.setString(1, cb.getTencb());
            pstmt.setString(2, cb.getNamsinh());
            pstmt.setString(3, cb.getGioitinh());
            pstmt.setString(4, cb.getDiachi());
            pstmt.setInt(5, manghe);
            return pstmt.executeUpdate() > 0;
        }
        
    }
    
    public int getLastIdCB() throws SQLException, Exception{
        String sql = "SELECT macb FROM tbl_canbo ORDER BY macb DESC LIMIT 1;";
        
        try
        (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);  
        ) 
        {
            try(ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    return rs.getInt("macb");
                }
            }
        }
        return -1;
    }
    
    public boolean insertTable(String table, int macb, String filed1, String filed2) 
            throws SQLException, Exception {

        if (table.equalsIgnoreCase("tbl_kysu")) {
            String sql = "Insert into " + table + " values (?,?, ?)";

            try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
                    pstmt.setInt(1, macb);
                    pstmt.setString(2, filed1);
                    pstmt.setString(3, filed2);
                    return pstmt.executeUpdate() > 0;
                }

        } 
        else 
        {
            String sql = "Insert into " + table + " values (?,?)";

            try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
                    pstmt.setInt(1, macb);
                    if (table.equalsIgnoreCase("tbl_congnhan")) {
                        pstmt.setInt(2, Integer.parseInt(filed1));
                    }
                    else {
                        pstmt.setString(2, filed1);
                    }
                    return pstmt.executeUpdate() > 0;
                }
        }

    }
}
