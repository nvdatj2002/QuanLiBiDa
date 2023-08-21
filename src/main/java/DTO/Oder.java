/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class Oder {
    int MaHoaDon;
    int MaDoDung;
    int SoLuong;
    Double GiaBan;

    public Oder(int MaHoaDon, int MaDoDung, int SoLuong, Double GiaBan) {
        this.MaHoaDon = MaHoaDon;
        this.MaDoDung = MaDoDung;
        this.SoLuong = SoLuong;
        this.GiaBan = GiaBan;
    }

    public Oder() {
    }

    public void setMaHoaDon(int MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public void setMaDoDung(int MaDoDung) {
        this.MaDoDung = MaDoDung;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setGiaBan(Double GiaBan) {
        this.GiaBan = GiaBan;
    }

    public int getMaHoaDon() {
        return MaHoaDon;
    }

    public int getMaDoDung() {
        return MaDoDung;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public Double getGiaBan() {
        return GiaBan;
    }
}
