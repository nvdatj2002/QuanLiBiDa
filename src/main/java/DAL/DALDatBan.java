/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.DatBan;
import EXTENDED.sqlConnect;
import java.sql.ResultSet;

/**
 *
 * @author dell 7559
 */
public class DALDatBan {

    public static ResultSet layDuLieu(int maBooking) {
        String sql = "select * from Booking where MaBooking = ?";
        return sqlConnect.executeQuery(sql,maBooking);
    }
    public static ResultSet layDuLieuTheoMaBan(int maBan, String tinhTrang) {
        String sql = "select * from Booking where Ban = ? and TinhTrang = ?";
        return sqlConnect.executeQuery(sql,maBan,tinhTrang);
    }
    public static void insert(DatBan db){
        String sql = "INSERT INTO [dbo].[Booking]([NhanVien],[Ban],[NgayBook],[NgayChoi],[SoDienThoai],[TinhTrang],[LyDoHuy],[TenKhach],[GhiChu]) VALUES (?,?,?,?,?,?,?,?,?)";
        sqlConnect.executeUpdate(sql, db.getMaNhanVien(),
                                      db.getMaBan(),
                                      db.getNgayDat(),
                                      db.getNgayChoi(),
                                      db.getSoDienThoai(),
                                      db.getTinhTrang(),
                                      db.getLiDoHuy(),
                                      db.getTenKhach(),
                                      db.getGhiChu()
        );
    }
    public static void updateTinhTrang(int maBook, String tinhTrang){
        String sql = "Update Booking set tinhTrang = ? Where MaBooking = ?";
        sqlConnect.executeUpdate(sql, tinhTrang, maBook);
    }
    
}
