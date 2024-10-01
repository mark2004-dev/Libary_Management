/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lib.dao;

import com.mycompany.lib.entity.nguoidung;
import com.mycompany.lib.jdbcUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class nguoidungDAO implements DAOinterfacee<nguoidung> {

    @Override
    public nguoidung findByIdAndPassWork(nguoidung t) {
        nguoidung ketQua = null;
        try {
            // Bước 1: tạo kết nối đến CSDL
            Connection con = jdbcUtil.getConnection();

            // Bước 2: tạo ra đối tượng statement
            String sql = "SELECT * FROM nguoidung WHERE tentk=? and matkhau=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, t.getTentk());
            st.setString(2, t.getMatkhau());

            // Bước 3: thực thi câu lệnh SQL
            System.out.println(sql);
            ResultSet rs = st.executeQuery();

            // Bước 4:
            while (rs.next()) {

                String tenDangNhap = rs.getString("tentk");
                String matKhau = rs.getString("matkhau");
                String email = rs.getString("email");
                String sdt = rs.getString("sodienthoai");

                ketQua = new nguoidung(tenDangNhap, email, matKhau, sdt);
            }

            // Bước 5:
            jdbcUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return ketQua;
    }

}
