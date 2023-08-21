/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.Ban;
import EXTENDED.sqlConnect;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class DAL_Ban {

    public static void UpdateStatusAll(int maBan, String tinhTrang) {
        String sql = "Update Ban set TinhTrang = ? where MaBan=?";
        sqlConnect.executeUpdate(sql, tinhTrang, maBan);
    }


    public static ResultSet GetDataDangchoi() {
        String sql = "select count(*)from Ban where tinhtrang='1'";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet GetDataDaDat() {
        String sql = "select count(*)from Ban where tinhtrang='2'";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet GetAllData() {
        String sql = "select *from Ban";
        return sqlConnect.executeQuery(sql);
    }
    public static ResultSet GetAllDataId(int maBan) {
        String sql = "select *from Ban where MaBan = ?";
        return sqlConnect.executeQuery(sql,maBan);
    }

    public static ResultSet GetAllData(int tukhoa) {
        String sql = "select *from Ban where KhuVuc=?";
        return sqlConnect.executeQuery(sql, tukhoa);
    }

    public static ResultSet GetAllDatabyKhuVucandName(int tukhoa, String ip) {
        String sql = "select *from Ban where KhuVuc=? and TenBan like ?";
        return sqlConnect.executeQuery(sql, tukhoa, "%" + ip + "%");
    }

    public static ResultSet GetDatabyName(String tukhoa) {
        String sql = "select *from Ban where TenBan=?";
        return sqlConnect.executeQuery(sql, tukhoa);
    }

    public static ResultSet Count() {
        String sql = "select count(*)from Ban";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet timBanTheoMaLoaiVaKhuVuc(int maKhuVuc, int maLoaiBan) {
        String sql = "select * from Ban where KhuVuc = ? and LoaiBan = ?";
        return sqlConnect.executeQuery(sql, maKhuVuc, maLoaiBan);
    }

    public static ResultSet timBanTheoMaLoai(int maLoaiBan) {
        String sql = "select * from Ban where and LoaiBan = ?";
        return sqlConnect.executeQuery(sql, maLoaiBan);
    }

    public static void Add(Ban tb) {
        String sql = "INSERT INTO Ban VALUES (?,?,?,1,'0')";
        sqlConnect.executeUpdate(sql, tb.getTenBan(), tb.getLoaiBan(), tb.getKhuVuc());
    }

    public static void Update(Ban tb) {
        String sql = "UPDATE Ban SET LoaiBan=?,KhuVuc=?,TinhTrang=? WHERE TenBan=?";
        sqlConnect.executeUpdate(sql, tb.getLoaiBan(), tb.getKhuVuc(), tb.getTinhTrang(), tb.getTenBan());
    }

    public static void Updatesttbyname(String name) {
        String sql = "UPDATE Ban SET TinhTrang=1 WHERE TenBan=?";
        sqlConnect.executeUpdate(sql, name);
    }

    public static void Updatesttis0byname(String name) {
        String sql = "UPDATE Ban SET TinhTrang=0 WHERE TenBan=?";
        sqlConnect.executeUpdate(sql, name);
    }

    public static void Delete(int id, boolean status) {
        String sql = "Delete from Ban where MaBan=? and TinhTrang=?";
        sqlConnect.executeUpdate(sql, id, status);
    }

    public static void DeletebyName(String name, String status) {
        String sql = "Delete from Ban where TenBan=? and TinhTrang=?";
        sqlConnect.executeUpdate(sql, name, status);
    }

    public static ResultSet FindByMaLSP(int tukhoa) {
        String sql = "select *from Ban where LoaiBan=?";
        return sqlConnect.executeQuery(sql, tukhoa);
    }

    public static ResultSet FindByName(String tukhoa) {
        String sql = "select *from Ban where TenBan=?";
        return sqlConnect.executeQuery(sql, tukhoa);
    }

    public static void UpdateStatus(int tukhoa) {
        String sql = "Update Ban set TinhTrang = 0 where MaBan=?";
        sqlConnect.executeUpdate(sql, tukhoa);
    }

}
