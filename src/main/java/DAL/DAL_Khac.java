/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.ChucVu;
import DTO.DonViTinh;
import DTO.KhuVuc;
import DTO.KhuyenMai;
import DTO.LoaiBan;
import DTO.LoaiDoDung;

import EXTENDED.sqlConnect;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class DAL_Khac {

    public DAL_Khac() {
    }

    public static ResultSet GetKhac() {
        String sql = "select *from LoaiDoDung";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet GetAllDataLoaiDoDung() {
        String sql = "select *from LoaiDoDung";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet GetAllDataLoaiDoDungbyMa(int tukhoa) {
        String sql = "select TenLoaiDoDung from LoaiDoDung where MaLoaiDoDung=?";
        return sqlConnect.executeQuery(sql, tukhoa);
    }

    public static ResultSet GetAllDataDVTDoDung() {
        String sql = "select *from DonViTinh";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet GetAllDataDVTbyMa(int tukhoa) {
        String sql = "select Ten from DonViTinh where MaDonViTinh=?";
        return sqlConnect.executeQuery(sql, tukhoa);
    }

    public static ResultSet GetAllDataChucVubyMa(int tukhoa) {
        String sql = "select TenChucVu from ChucVu where MaChucVu=?";
        return sqlConnect.executeQuery(sql, tukhoa);
    }

    public static ResultSet GetAllDataChucvu() {
        String sql = "select *from ChucVu";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet GetAllDataKhuVuc() {
        String sql = "select *from KhuVuc";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet GetAllDataKhuVucbyID(int id) {
        String sql = "select *from KhuVuc where MaKhuVuc=?";
        return sqlConnect.executeQuery(sql, id);
    }

    public static ResultSet GetAllDataLoaiBan() {
        String sql = "select *from LoaiBan";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet getDataLBByID(int tuKhoa) {
        String sql = "select * from LoaiBan where MaLoaiBan = ?";
        return sqlConnect.executeQuery(sql, tuKhoa);
    }

    public static void AddLoaiDoDung(LoaiDoDung ldd) {
        String sql = "Insert into LoaiDoDung (TenLoaiDoDung) values (?)";
        sqlConnect.executeUpdate(sql, ldd.getTenLoaiDoDung());
    }

    public static void AddDonViTinh(DonViTinh dvt) {
        String sql = "INSERT INTO [dbo].[DonViTinh]([Ten])VALUES (?)";
        sqlConnect.executeUpdate(sql, dvt.getTen());
    }

    public static void AddChucVu(ChucVu cv) {
        String sql = "INSERT INTO [dbo].[ChucVu]([TenChucVu])VALUES (?)";
        sqlConnect.executeUpdate(sql, cv.getTenChucVu());
    }

    public static void AddKhuVuc(KhuVuc kv) {
        String sql = "INSERT INTO [dbo].[KhuVuc]([TenKhuVuc])VALUES (?)";
        sqlConnect.executeUpdate(sql, kv.getTenKhuvuc());
    }

    public static void AddLoaiBan(LoaiBan lb) {
        String sql = "INSERT INTO [dbo].[LoaiBan]([TenLoaiBan],[GiaTien])VALUES (?,?)";
        sqlConnect.executeUpdate(sql, lb.getTenLoaiBan(), lb.getGiaTien());
    }

    public static void UpdateLoaiDoDung(LoaiDoDung ldd, String Tencu) {
        String sql = "update LoaiDoDung set TenLoaiDoDung=? where TenLoaiDoDung=?";
        sqlConnect.executeUpdate(sql, ldd.getTenLoaiDoDung(), Tencu);
    }

    public static void UpdateDonViTinh(DonViTinh dvt, String Tencu) {
        String sql = "update DonViTinh set Ten=? where Ten=?";
        sqlConnect.executeUpdate(sql, dvt.getTen(), Tencu);
    }

    public static void UpdateChucVu(ChucVu cv, String Tencu) {
        String sql = "update ChucVu set TenChucVu=? where TenChucVu=?";
        sqlConnect.executeUpdate(sql, cv.getTenChucVu(), Tencu);
    }

    public static void UpdateKhuVuc(KhuVuc kv, String Tencu) {
        String sql = "update KhuVuc set TenKhuVuc=? where TenKhuVuc=?";
        sqlConnect.executeUpdate(sql, kv.getTenKhuvuc(), Tencu);
    }

    public static void UpdateLoaiBan(LoaiBan lb, String TenCu) {
        String sql = "update LoaiBan set TenLoaiBan=?,GiaTien=? where TenLoaiBan=?";
        sqlConnect.executeUpdate(sql, lb.getTenLoaiBan(), lb.getGiaTien(), TenCu);
    }

    public static void DeleteLoaiDoDung(String Ten) {
        String sql = "delete from LoaiDoDung where TenLoaiDoDung=?";
        sqlConnect.executeUpdate(sql, Ten);
    }

    public static void DeleteDonViTinh(String Ten) {
        String sql = "delete from DonViTinh where Ten=?";
        sqlConnect.executeUpdate(sql, Ten);
    }

    public static void DeleteChucVu(String Ten) {
        String sql = "delete from ChucVu where TenChucVu=?";
        sqlConnect.executeUpdate(sql, Ten);
    }

    public static void DeleteKhuVuc(String Ten) {
        String sql = "delete from KhuVuc where TenKhuVuc=?";
        sqlConnect.executeUpdate(sql, Ten);
    }

    public static void DeleteLoaiBan(String Ten) {
        String sql = "delete from LoaiBan where TenLoaiBan=?";
        sqlConnect.executeUpdate(sql, Ten);
    }

    public static ResultSet getAllKhuyenMai() {
        String sql = "select *from KhuyenMai";
        return sqlConnect.executeQuery(sql);
    }

    public static void AddKhuyenMai(KhuyenMai tb) {
        String sql = "INSERT INTO [dbo].[KhuyenMai]([TenKhuyenMai],[GiaTriKhuyenMai],[TinhTrang])VALUES(?,?,?)";
        sqlConnect.executeUpdate(sql, tb.getTenKhuyenMai(), tb.getGiaTri(), tb.isTinhTrang());
    }

    public static void UpdateKhuyenMai(KhuyenMai tb, int ma) {
        String sql = "UPDATE [dbo].[KhuyenMai] SET [TenKhuyenMai] = ?,[GiaTriKhuyenMai]=?,[TinhTrang] = ? WHERE [MaKhuyenMai] =?";
        sqlConnect.executeUpdate(sql, tb.getTenKhuyenMai(), tb.getGiaTri(), tb.isTinhTrang(), ma);
    }

    public static void UpdateTinhTrangKhuyenMai(KhuyenMai tb, int ma) {
        String sql = "UPDATE [dbo].[KhuyenMai] SET [TinhTrang] = ? WHERE [MaKhuyenMai] =?";
        sqlConnect.executeUpdate(sql, tb.isTinhTrang(), ma);
    }

    public static void DeleteKhuyenMai(int ma) {
        String sql = "Delete from KhuyenMai where MaKhuyenMai=? ";
        sqlConnect.executeUpdate(sql, ma);
    }

    public static ResultSet FindKhuyenMaibyMaorTen(String ten, String ma) {
        String sql = "SELECT * FROM KhuyenMai where TenKhuyenMai like ? or MaKhuyenMai like ?";
        return sqlConnect.executeQuery(sql, "%" + ten + "%", "%" + ma + "%");
    }

    public static ResultSet FindKhuyenMaibyMa(int ma) {
        String sql = "SELECT * FROM KhuyenMai where  MaKhuyenMai = ?";
        return sqlConnect.executeQuery(sql, ma);
    }

}
