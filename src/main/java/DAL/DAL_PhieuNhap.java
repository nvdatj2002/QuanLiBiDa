/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.ChiTietPhieuNhap;
import DTO.PhieuNhap;
import EXTENDED.sqlConnect;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class DAL_PhieuNhap {

    public static ResultSet GetAllPhieuNhap() {
        String sql = "select *from PhieuNhap";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet GetTinhTrangPhieuNhap() {
        String sql = "select TinhTrang from PhieuNhap";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet GetTinhTrangPhieuNhapbyMa(int ma) {
        String sql = "select TinhTrang from PhieuNhap where MaPhieuNhap=?";
        return sqlConnect.executeQuery(sql, ma);
    }

    public static ResultSet FindPhieuNhapbyMaorten(String ten, String ma) {
        String sql = "select *from PhieuNhap where TenPhieuNhap like ? or MaPhieuNhap like ?";
        return sqlConnect.executeQuery(sql, "%" + ten + "%", "%" + ma + "%");
    }

    public static ResultSet FindPhieuNhapbyMa(int ma) {
        String sql = "select *from PhieuNhap where MaPhieuNhap = ?";
        return sqlConnect.executeQuery(sql, ma);
    }

    public static ResultSet GetAllCTPhieuNhap() {
        String sql = "select * from ChiTietPhieuNhap";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet GetCTPNbyMa(int ma) {
        String sql = "select * from ChiTietPhieuNhap where MaPhieuNhap=?";
        return sqlConnect.executeQuery(sql, ma);
    }

    public static ResultSet TongTien(int ma) {
        String sql = "select sum(SoLuong)*sum(DonGia)  as tongtien from ChiTietPhieuNhap where MaPhieuNhap=?";
        return sqlConnect.executeQuery(sql, ma);
    }

    public static void AddPhieuNhap(PhieuNhap pn) {
        String sql = "SET DATEFORMAT DMY INSERT INTO [dbo].[PhieuNhap]([TenPhieuNhap],[NgayTao],[NguoiTao],[TongTien],[TinhTrang])VALUES(?,GETDATE(),?,?,?)";
        sqlConnect.executeUpdate(sql, pn.getTenPhieuNhap(), pn.getNguoiTao(), pn.getTongTien(), pn.isTinhTrang());
    }

    public static void AddChiTietPhieuNhap(ChiTietPhieuNhap ctpn) {
        String sql = "INSERT INTO [dbo].[ChiTietPhieuNhap]([MaPhieuNhap],[TenHangNhap],[SoLuong],[DonGia],[DonViTinh])VALUES(?,?,?,?,?)";
        sqlConnect.executeUpdate(sql, ctpn.getMaPhieuNhap(), ctpn.getTenhangNhap(), ctpn.getSoLuong(), ctpn.getDonGia(), ctpn.getDonViTinh());
    }

    public static void UpdatePhieuNhap(double tongtien, boolean tinhtrang, int ma) {
        String sql = "UPDATE [dbo].[PhieuNhap] SET TongTien=?,TinhTrang=? WHERE [MaPhieuNhap] =?";
        sqlConnect.executeUpdate(sql, tongtien, tinhtrang, ma);
    }

    public static void DeletePhieuNhap(int ma) {
        String sql = "Delete from ThietBi where MaThietBi=? ";
        sqlConnect.executeUpdate(sql, ma);
    }

    public static ResultSet GetMaPhieuNhap() {
        String sql = "select MaPhieuNhap from PhieuNhap where TinhTrang=0";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet DemPhieuNhap(boolean tinhtrang) {
        String sql = "select count(MaPhieuNhap) as tongphieu from PhieuNhap where TinhTrang=?";
        return sqlConnect.executeQuery(sql,tinhtrang);
    }

    public static ResultSet FindThietbibyMa(int ma) {
        String sql = "SELECT * FROM ThietBi where  MaThietBi = ?";
        return sqlConnect.executeQuery(sql, ma);
    }

}
