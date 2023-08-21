/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author dell 7559
 */
public class ChiTietHoaDon {
    int  maChiTietHoaDon;
    int maHoaDon;
    int maDoDung;
    int soLuong;
    double giaBan;

    public ChiTietHoaDon( int maHoaDon, int maDoDung, int soLuong, double giaBan) {
        this.maHoaDon = maHoaDon;
        this.maDoDung = maDoDung;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }
    
    public ChiTietHoaDon() {
    }
    
    public int getMaChiTietHoaDon() {
        return maChiTietHoaDon;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public int getMaDoDung() {
        return maDoDung;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setMaChiTietHoaDon(int maChiTietHoaDon) {
        this.maChiTietHoaDon = maChiTietHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setMaDoDung(int maDoDung) {
        this.maDoDung = maDoDung;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    
    
}
