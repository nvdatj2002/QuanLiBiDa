/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhanVien;
import EXTENDED.Transform;
import EXTENDED.sqlConnect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TRI
 */
public class DAL_NhanVien {

    private static DAL_NhanVien instance;

    public DAL_NhanVien() {
    }

    public static DAL_NhanVien getInstance() {
        if (instance == null) {
            instance = new DAL_NhanVien();
        }
        return instance;
    }

    public static void setInstance(DAL_NhanVien instance) {
        DAL_NhanVien.instance = instance;
    }

    public static ResultSet GetAllData() {
        String sql = "SELECT * FROM NhanVien ";
        return sqlConnect.executeQuery(sql);
    }
    
        public static ResultSet GetTenNV(int ma) {
        String sql = "SELECT TenNhanVien FROM NhanVien where MaNhanVien=?";
        return sqlConnect.executeQuery(sql,ma);
    }

    public static ResultSet GetTenDNMatKhau(String TenDN, String MatKhau) {
        String sql = "SELECT * FROM NhanVien where TenDangNhap=? and MatKhau=?";
        return sqlConnect.executeQuery(sql, TenDN, MatKhau);
    }

    public static int DoiMatKhau(int manv, String MatKhau) {
        int i = 0;
        try {
            PreparedStatement pstmt = sqlConnect.prepareStatement("UPDATE NhanVien SET MatKhau=? WHERE MaNhanVien=?");
            pstmt.setString(1, MatKhau);
            pstmt.setInt(2, manv);
            i = pstmt.executeUpdate();
        } catch (Exception e) {
        }

        return i;
    }
    
    public static int DoiMatKhauByEmail(String email, String MatKhau) {
        int i=0;
        try {
            PreparedStatement pstmt = sqlConnect.prepareStatement("UPDATE NhanVien SET MatKhau=? WHERE email=?");
            pstmt.setString(1, MatKhau);
            pstmt.setString(2, email);
            i = pstmt.executeUpdate();
        } catch (Exception e) {
        }
        
        return i;
    }

    public static ResultSet GetAllDatabyMa(int ma) {
        String sql = "SELECT * FROM NhanVien where MaNhanVien=?";
        return sqlConnect.executeQuery(sql, ma);
    }

    public static ResultSet FindNVBytinhTrang(boolean tt) {
        String sql = "SELECT * FROM NhanVien where TinhTrang=?";
        return sqlConnect.executeQuery(sql, tt);
    }


    public static ResultSet GetAllDatabyTen(String ten, String ma) {
        String sql = "SELECT * FROM NhanVien where TenNhanVien like ? or MaNhanVien like ?";
        return sqlConnect.executeQuery(sql, "%" + ten + "%", "%" + ma + "%");
    }

    public static void Add(NhanVien nv) {
        String sql = "set dateformat dmy INSERT INTO [dbo].[NhanVien]([TenNhanVien] ,[NgaySinh] ,[NgayVaoLam],[ChucVu],[SoDienThoai],[Email],[DiaChi] ,[GioiTinh] ,[Luong] ,[TenDangNhap] ,[MatKhau] ,[TinhTrang],[HinhAnh] ) VALUES(?,?,GETDATE(),?,?,?,?,?,?,?,?,?,?)";
        sqlConnect.executeUpdate(sql, nv.getTenNhanvien(), Transform.LayNgayString(nv.getNgaySinh()), nv.getChucVu(), nv.getSoDienThoai(), nv.getEmail(), nv.getDiaChi(), nv.isGioiTinh(), nv.getLuong(), nv.getTenDangNhap(), nv.getMatKhau(), nv.isTinhTrang(), nv.getHinhAnh());
    }

    public static void Update(NhanVien nv, int mnv) {
        String sql = "set dateformat dmy update [NhanVien]set [TenNhanVien]=? ,[NgaySinh]=?,[ChucVu]=?,[SoDienThoai]=?,[Email]=?,[DiaChi] =?,[GioiTinh] =?,[Luong] =?,[TenDangNhap]=? ,[MatKhau] =?,[TinhTrang]=? ,[HinhAnh] =? where MaNhanVien=? ";
        sqlConnect.executeUpdate(sql, nv.getTenNhanvien(), Transform.LayNgayString(nv.getNgaySinh()), nv.getChucVu(), nv.getSoDienThoai(), nv.getEmail(), nv.getDiaChi(), nv.isGioiTinh(), nv.getLuong(), nv.getTenDangNhap(), nv.getMatKhau(), nv.isTinhTrang(), nv.getHinhAnh(), mnv);
    }

    public static void Delete(int id) {
        String sql = "Delete from NhanVien where MaNhanVien=?";
        sqlConnect.executeUpdate(sql, id);
    }
    //ham them loai san pham

}
