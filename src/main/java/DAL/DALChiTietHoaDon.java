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
public class DALChiTietHoaDon {
    
    public static ResultSet getDataByMaHoaDon(int maHoaDon){
        String sql = "select * from ChiTietHoaDon where MaHoaDon = ? ";
        return sqlConnect.executeQuery(sql, maHoaDon);
    }
    public static void insert(int maHoaDon, int maDoDung, int soLuong,double giaban){
        String sql = "INSERT INTO [dbo].[ChiTietHoaDon]([MaHoaDon],[MaDoDung],[SoLuong],[GiaBan])VALUES(?,?,?,?)";
        sqlConnect.executeUpdate(sql,maHoaDon,maDoDung,soLuong, giaban);
    }
    public static void update( int soLuong,int maChiTietHoaDon){
        String sql = "UPDATE [dbo].[ChiTietHoaDon] SET [SoLuong] = ? WHERE [IdChiTietHD] = ?";
        sqlConnect.executeUpdate(sql,soLuong, maChiTietHoaDon);
    }
    public static ResultSet timMaByMaHoaDonVaMaDD(int maHoaDon,int maDoDung){
        String sql = "select * from ChiTietHoaDon where MaHoaDon = ? and MaDoDung = ?";
        return sqlConnect.executeQuery(sql, maHoaDon, maDoDung);
    }

    public static void delete(int maChiTietHoaDon) {
        String sql = "delete ChiTietHoaDon WHERE [IdChiTietHD] = ?";
        sqlConnect.executeUpdate(sql, maChiTietHoaDon);
    }

    public static ResultSet tongTienDoDung(int maHoaDon) {
        String sql = "select sum(GiaBan * SoLuong) from ChiTietHoaDon where MaHoaDon = ?";
        return sqlConnect.executeQuery(sql, maHoaDon);
    }
}
