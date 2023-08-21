/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import EXTENDED.sqlConnect;
import java.sql.ResultSet;

/**
 *
 * @author dell 7559
 */
public class DALKhuyenMai {

    public static ResultSet getdata() {
        String sql = "select * from KhuyenMai where tinhTrang = 1";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet layMaKhuyenMaiBangMa(Object maKhuyenMai) {
        String sql = "select * from KhuyenMai where maKhuyenMai = ?";
        return sqlConnect.executeQuery(sql, maKhuyenMai);
    }
    
    
}
