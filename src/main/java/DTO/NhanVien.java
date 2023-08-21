/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class NhanVien {
    int MaNhanVien;
    String TenNhanvien;
    Date NgaySinh;
    Date NgayVaoLam;
    int ChucVu;
    String SoDienThoai;
    String Email;
    String DiaChi;
    boolean GioiTinh;
    Double Luong;
    String TenDangNhap;
    String MatKhau;
    byte[] HinhAnh;
    boolean TinhTrang;

    public NhanVien(String TenNhanvien, Date NgaySinh, int ChucVu, String SoDienThoai, String Email, String DiaChi, boolean GioiTinh, Double Luong, String TenDangNhap, String MatKhau, byte[] HinhAnh, boolean TinhTrang) {
        this.TenNhanvien = TenNhanvien;
        this.NgaySinh = NgaySinh;
        this.ChucVu = ChucVu;
        this.SoDienThoai = SoDienThoai;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.Luong = Luong;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.HinhAnh = HinhAnh;
        this.TinhTrang = TinhTrang;
    }

    public NhanVien(int MaNhanVien, String TenNhanvien, Date NgaySinh, Date NgayVaoLam, int ChucVu, String SoDienThoai, String Email, String DiaChi, boolean GioiTinh, Double Luong, String TenDangNhap, String MatKhau, byte[] HinhAnh, boolean TinhTrang) {
        this.MaNhanVien = MaNhanVien;
        this.TenNhanvien = TenNhanvien;
        this.NgaySinh = NgaySinh;
        this.NgayVaoLam = NgayVaoLam;
        this.ChucVu = ChucVu;
        this.SoDienThoai = SoDienThoai;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.Luong = Luong;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.HinhAnh = HinhAnh;
        this.TinhTrang = TinhTrang;
    }

    public NhanVien(String TenNhanvien, Date NgaySinh, Date NgayVaoLam, int ChucVu, String SoDienThoai, String Email, String DiaChi, boolean GioiTinh, Double Luong, String TenDangNhap, String MatKhau, byte[] HinhAnh, boolean TinhTrang) {
        this.TenNhanvien = TenNhanvien;
        this.NgaySinh = NgaySinh;
        this.NgayVaoLam = NgayVaoLam;
        this.ChucVu = ChucVu;
        this.SoDienThoai = SoDienThoai;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.Luong = Luong;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.HinhAnh = HinhAnh;
        this.TinhTrang = TinhTrang;
    }

    public NhanVien() {
    }

    public void setTenNhanvien(String TenNhanvien) {
        this.TenNhanvien = TenNhanvien;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public void setNgayVaoLam(Date NgayVaoLam) {
        this.NgayVaoLam = NgayVaoLam;
    }

    public void setChucVu(int ChucVu) {
        this.ChucVu = ChucVu;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setLuong(Double Luong) {
        this.Luong = Luong;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public void setHinhAnh(byte[] HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getTenNhanvien() {
        return TenNhanvien;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public Date getNgayVaoLam() {
        return NgayVaoLam;
    }

    public int getChucVu() {
        return ChucVu;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public Double getLuong() {
        return Luong;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public byte[] getHinhAnh() {
        return HinhAnh;
    }

    public boolean isTinhTrang() {
        return TinhTrang;
    }

    public int getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(int MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }
    
}
