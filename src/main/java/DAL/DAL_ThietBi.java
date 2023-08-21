/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.ThietBi;
import EXTENDED.sqlConnect;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class DAL_ThietBi {

    public static ResultSet GetAllThietbi() {
        String sql = "select *from ThietBi";
        return sqlConnect.executeQuery(sql);
    }

    public static void AddThietBi(ThietBi tb) {
        String sql = "SET DATEFORMAT DMY INSERT INTO [dbo].[ThietBi]([TenThietBi],[GiaNhap],[SoLuong],[DonViTinh],[NgayTao],[HinhAnh])VALUES(?,?,?,?,GETDATE(),?)";
        sqlConnect.executeUpdate(sql, tb.getTenThietBi(), tb.getGiaNhap(), tb.getSoLuong(),tb.getDVT(), tb.getHinhAnh());
    }

    public static void UpdateThietBi(ThietBi tb, int ma) {
        String sql = "UPDATE [dbo].[ThietBi] SET [TenThietBi] = ?,[GiaNhap] = ?,[SoLuong] = ?,[DonViTinh]=?,[HinhAnh] = ? WHERE [MaThietBi] =?";
        sqlConnect.executeUpdate(sql, tb.getTenThietBi(), tb.getGiaNhap(), tb.getSoLuong(),tb.getDVT(), tb.getHinhAnh(), ma);
    }

    public static void DeleteThietBi(int ma) {
        String sql = "Delete from ThietBi where MaThietBi=? ";
        sqlConnect.executeUpdate(sql, ma);
    }

    public static ResultSet FindThietbibyMaorTen(String ten, String ma) {
        String sql = "SELECT * FROM ThietBi where TenThietBi like ? or MaThietBi like ?";
        return sqlConnect.executeQuery(sql, "%" + ten + "%", "%" + ma + "%");
    }

    public static ResultSet FindThietbibyMa(int ma) {
        String sql = "SELECT * FROM ThietBi where  MaThietBi = ?";
        return sqlConnect.executeQuery(sql,  ma );
    }

}
