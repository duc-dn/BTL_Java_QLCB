/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlcb.dao;

import com.mycompany.qlcb.helpers.DatabaseHelper;
import com.mycompany.qlcb.model.Congnhan;
import com.mycompany.qlcb.model.Kysu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Duc
 */
public class CongNhanDao {
    public ArrayList<Congnhan> getAllCongNhan() throws SQLException, Exception {
        String sql = "select * from tbl_canbo cb inner join tbl_congnhan cn on cb.macb = cn.macn";

        try 
        (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ) 
        {
            try (ResultSet rs = pstmt.executeQuery();) {
                ArrayList<Congnhan> listcn = new ArrayList<Congnhan>();
                while (rs.next()) {
                    Congnhan cn = new Congnhan();
                    cn.setTencb(rs.getString("tencb"));
                    cn.setNamsinh(rs.getInt("namsinh"));
                    cn.setGioitinh(rs.getString("gioitinh"));
                    cn.setDiachi(rs.getString("diachi"));
                    cn.setBac(rs.getInt("bac"));
                    listcn.add(cn);
                }
                return listcn;
            }
        }
    }
}
