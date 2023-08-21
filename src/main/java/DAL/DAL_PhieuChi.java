/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.ChiTietPhieuChi;
import DTO.PhieuChi;
import EXTENDED.sqlConnect;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class DAL_PhieuChi {

    public static ResultSet GetAllPhieuChi() {
        String sql = "select *from PhieuChi";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet GetTinhTrangPhieuChi() {
        String sql = "select TinhTrang from PhieuChi";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet GetTinhTrangPhieuChibyMa(int ma) {
        String sql = "select TinhTrang from PhieuChi where MaPhieuChi=?";
        return sqlConnect.executeQuery(sql, ma);
    }

    public static ResultSet FindPhieuChibyMaorten(String ten, String ma) {
        String sql = "select *from PhieuChi where TenPhieuChi like ? or MaPhieuChi like ?";
        return sqlConnect.executeQuery(sql, "%" + ten + "%", "%" + ma + "%");
    }

    public static ResultSet FindPhieuChibyMa(int ma) {
        String sql = "select *from PhieuChi where MaPhieuChi = ?";
        return sqlConnect.executeQuery(sql, ma);
    }

    public static ResultSet GetAllCTPhieuChi() {
        String sql = "select * from ChiTietPhieuChi";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet GetCTPNbyMa(int ma) {
        String sql = "select * from ChiTietPhieuChi where MaPhieuChi=?";
        return sqlConnect.executeQuery(sql, ma);
    }

    public static ResultSet TongTien(int ma) {
        String sql = "select sum(SoLuong)*sum(DonGia)  as tongtien from ChiTietPhieuChi where MaPhieuChi=?";
        return sqlConnect.executeQuery(sql, ma);
    }

    public static void AddPhieuChi(PhieuChi pn) {
        String sql = "SET DATEFORMAT DMY INSERT INTO [dbo].[PhieuChi]([TenPhieuChi],[NgayTao],[NguoiTao],[TongTien],[TinhTrang])VALUES(?,GETDATE(),?,?,?)";
        sqlConnect.executeUpdate(sql, pn.getTenPhieuChi(), pn.getNguoiTao(), pn.getTongTien(), pn.isTinhTrang());
    }

    public static void AddChiTietPhieuChi(ChiTietPhieuChi ctpn) {
        String sql = "INSERT INTO [dbo].[ChiTietPhieuChi]([MaPhieuChi],[TenHangChi],[SoLuong],[DonGia],[DonViTinh])VALUES(?,?,?,?,?)";
        sqlConnect.executeUpdate(sql, ctpn.getMaPhieuChi(), ctpn.getTenhangChi(), ctpn.getSoLuong(), ctpn.getDonGia(), ctpn.getDonViTinh());
    }

    public static void UpdatePhieuChi(double tongtien, boolean tinhtrang, int ma) {
        String sql = "UPDATE [dbo].[PhieuChi] SET TongTien=?,TinhTrang=? WHERE [MaPhieuChi] =?";
        sqlConnect.executeUpdate(sql, tongtien, tinhtrang, ma);
    }

    public static void DeletePhieuChi(int ma) {
        String sql = "Delete from ThietBi where MaThietBi=? ";
        sqlConnect.executeUpdate(sql, ma);
    }

    public static ResultSet GetMaPhieuChi() {
        String sql = "select MaPhieuChi from PhieuChi where TinhTrang=0";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet DemPhieuChi(boolean tinhtrang) {
        String sql = "select count(MaPhieuChi) as tongphieu from PhieuChi where TinhTrang=?";
        return sqlConnect.executeQuery(sql,tinhtrang);
    }

    public static ResultSet FindThietbibyMa(int ma) {
        String sql = "SELECT * FROM ThietBi where  MaThietBi = ?";
        return sqlConnect.executeQuery(sql, ma);
    }

}
