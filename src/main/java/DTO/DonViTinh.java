/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class DonViTinh {
    int MaDonViTinh;
    String Ten;

    public DonViTinh(int MaDonViTinh, String Ten) {
        this.MaDonViTinh = MaDonViTinh;
        this.Ten = Ten;
    }

    public void setMaDonViTinh(int MaDonViTinh) {
        this.MaDonViTinh = MaDonViTinh;
    }

    public int getMaDonViTinh() {
        return MaDonViTinh;
    }

    public DonViTinh(String Ten) {
        this.Ten = Ten;
    }

    public DonViTinh() {
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getTen() {
        return Ten;
    }
}
