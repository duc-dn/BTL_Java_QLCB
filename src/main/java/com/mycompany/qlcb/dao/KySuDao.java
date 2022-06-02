/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlcb.dao;

import com.mycompany.qlcb.helpers.DatabaseHelper;
import com.mycompany.qlcb.model.Kysu;
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
public class KySuDao {
    public ArrayList<Kysu> getAllKysu() throws SQLException, Exception {
        String sql = "select * from tbl_canbo cb inner join tbl_kysu ks on cb.macb = ks.maks";

        try 
        (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ) 
        {
            try (ResultSet rs = pstmt.executeQuery();) {
                ArrayList<Kysu> listks = new ArrayList<Kysu>();
                while (rs.next()) {
                    Kysu ks = new Kysu();
                    ks.setTencb(rs.getString("tencb"));
                    ks.setNamsinh(rs.getInt("namsinh"));
                    ks.setGioitinh(rs.getString("gioitinh"));
                    ks.setDiachi(rs.getString("diachi"));
                    ks.setNganhdt(rs.getString("nganhdt"));
                    ks.setLoaibang(rs.getString("loaibang"));
                    listks.add(ks);
                }
                return listks;
            }
        }
    }
}
