/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.DoDung;
import DTO.DonViTinh;
import DTO.LoaiDoDung;
import EXTENDED.sqlConnect;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class DAL_DoDung {

    public static ResultSet GetNameById(int maDoDung) {
        String sql = "select TenDoDung from DoDung where MaDoDung = ?";
        return sqlConnect.executeQuery(sql, maDoDung);

    }

    public static ResultSet GetIdByName(String tenDoDung) {
        String sql = "select MaDoDung from DoDung where TenDoDung = ?";
        return sqlConnect.executeQuery(sql, tenDoDung);
    }

    public DAL_DoDung() {
    }

    public static ResultSet GetAllDataDoDung() {
        String sql = "select *from DoDung";
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

    public static ResultSet GetAllDataDVTbyMa(int tukhoa) {
        String sql = "select Ten from DonViTinh where MaDonViTinh=?";
        return sqlConnect.executeQuery(sql, tukhoa);
    }

    public static ResultSet TimHinhAnh(String ten) {
        String sql = "select HinhAnh from DoDung where TenDoDung = ?";
        return sqlConnect.executeQuery(sql, ten);
    }

    public static ResultSet GetAllDataDVTDoDung() {
        String sql = "select *from DonViTinh";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet Count() {
        String sql = "select count(*)from DoDung";
        return sqlConnect.executeQuery(sql);
    }

    public static void AddDoDung(DoDung dd) {
        String sql = "SET DATEFORMAT DMY INSERT INTO [dbo].[DoDung]([TenDoDung],[LoaiDoDung],[GiaNhap],[GiaBan],[SoLuong],[DonViTinh],[NgayTao],[TinhTrang],[HinhAnh])VALUES(?,?,?,?,?,?,GETDATE(),?,?)";
        sqlConnect.executeUpdate(sql, dd.getTenDoDung(), dd.getLoaiDoDung(), dd.getGiaNhap(), dd.getGiaBan(), dd.getSoLuong(), dd.getDonViTinh(), dd.isTinhTrang(), dd.getHinhAnh());
    }

    public static void AddLoaiDoDung(LoaiDoDung ldd) {
        String sql = "Insert into LoaiDoDung (TenLoaiDoDung) values (?,?)";
        sqlConnect.executeUpdate(sql, ldd.getTenLoaiDoDung());
    }

    public static void AddDonViTinh(DonViTinh dvt) {
        String sql = "INSERT INTO [dbo].[DonViTinh]([Ten])VALUES (?)";
        sqlConnect.executeUpdate(sql, dvt.getTen());
    }

    public static void Update(DoDung dd, int ma) {
        String sql = "UPDATE [dbo].[DoDung] SET [TenDoDung] = ?,[LoaiDoDung] = ?,[GiaNhap] = ?,[GiaBan] = ?,[SoLuong] = ?,[DonViTinh] = ?,[TinhTrang] = ?,[HinhAnh] = ? WHERE [MaDoDung] =?";
        sqlConnect.executeUpdate(sql, dd.getTenDoDung(), dd.getLoaiDoDung(), dd.getGiaNhap(), dd.getGiaBan(), dd.getSoLuong(), dd.getDonViTinh(), dd.isTinhTrang(), dd.getHinhAnh(), ma);
    }

    public static void UpdateTinhTrang(DoDung dd, String ten) {
        String sql = "UPDATE [dbo].[DoDung] SET [TinhTrang] = 1 WHERE TenDoDung=? and [SoLuong] <1";
        sqlConnect.executeUpdate(sql, dd.isTinhTrang(), ten, dd.getSoLuong());
    }

    public static void DeletebyMa(int id, boolean status) {
        String sql = "Delete from DoDung where MaDoDung=? and TinhTrang=?";
        sqlConnect.executeUpdate(sql, id, status);
    }

    public static void Delete(String name, boolean status) {
        String sql = "Delete from Ban where TenBan=? and TinhTrang=?";
        sqlConnect.executeUpdate(sql, name, status);
    }

    public static ResultSet FindByMaLSP(int tukhoa) {
        String sql = "select *from DoDung where LoaiDoDung = ?";
        return sqlConnect.executeQuery(sql, tukhoa);
    }

    public static ResultSet FindByName(String tukhoa) {
        String sql = "select *from DoDung where TenDoDung like ?";
        return sqlConnect.executeQuery(sql, "%" + tukhoa + "%");
    }

    public static ResultSet FindByMa(int tukhoa) {
        String sql = "select *from DoDung where MaDoDung =?";
        return sqlConnect.executeQuery(sql, tukhoa);
    }

    public static ResultSet FindBySoLuong() {
        String sql = "select MaDoDung,TenDoDung,SoLuong from DoDung where SoLuong<10";
        return sqlConnect.executeQuery(sql);
    }

}
