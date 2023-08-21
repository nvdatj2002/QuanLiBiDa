/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author dell 7559
 */
public class DatBan {
    int maDat;
    int maNhanVien;
    int maBan;
    String tenKhach;
    Date ngayDat;
    Date ngayChoi;
    String soDienThoai;
    String tinhTrang;
    String liDoHuy;
    String ghiChu;
    
    
    public DatBan() {
    }

    public DatBan(int maDat, int maNhanVien, int maBan, String tenKhach, Date ngayDat, Date ngayChoi, String soDienThoai, String tinhTrang, String liDoHuy, String ghiChu) {
        this.maDat = maDat;
        this.maNhanVien = maNhanVien;
        this.maBan = maBan;
        this.tenKhach = tenKhach;
        this.ngayDat = ngayDat;
        this.ngayChoi = ngayChoi;
        this.soDienThoai = soDienThoai;
        this.tinhTrang = tinhTrang;
        this.liDoHuy = liDoHuy;
        this.ghiChu = ghiChu;
    }
    
    public int getMaDat() {
        return maDat;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public int getMaBan() {
        return maBan;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public Date getNgayChoi() {
        return ngayChoi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public String getLiDoHuy() {
        return liDoHuy;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setMaDat(int maDat) {
        this.maDat = maDat;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setMaBan(int maBan) {
        this.maBan = maBan;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public void setNgayChoi(Date ngayChoi) {
        this.ngayChoi = ngayChoi;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void setLiDoHuy(String liDoHuy) {
        this.liDoHuy = liDoHuy;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    

}
