/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class LoaiBan {
    int MaLoaiBan;
    String TenLoaiBan;
    double GiaTien;

    public LoaiBan(int MaLoaiBan, String TenLoaiBan, double GiaTien) {
        this.MaLoaiBan = MaLoaiBan;
        this.TenLoaiBan = TenLoaiBan;
        this.GiaTien = GiaTien;
    }

    public LoaiBan(String TenLoaiBan, double GiaTien) {
        this.TenLoaiBan = TenLoaiBan;
        this.GiaTien = GiaTien;
    }

    public void setMaLoaiBan(int MaLoaiBan) {
        this.MaLoaiBan = MaLoaiBan;
    }

    public int getMaLoaiBan() {
        return MaLoaiBan;
    }

    public LoaiBan() {
    }

    public void setTenLoaiBan(String TenLoaiBan) {
        this.TenLoaiBan = TenLoaiBan;
    }

    public void setGiaTien(double GiaTien) {
        this.GiaTien = GiaTien;
    }

    public String getTenLoaiBan() {
        return TenLoaiBan;
    }

    public double getGiaTien() {
        return GiaTien;
    }
}
