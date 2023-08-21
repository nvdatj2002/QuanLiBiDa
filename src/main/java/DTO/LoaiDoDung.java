/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class LoaiDoDung {
    int LoaiDoDung;
    String TenLoaiDoDung;

    public LoaiDoDung(int LoaiDoDung, String TenLoaiDoDung) {
        this.LoaiDoDung = LoaiDoDung;
        this.TenLoaiDoDung = TenLoaiDoDung;
    }

    public LoaiDoDung(String TenLoaiDoDung) {
        this.TenLoaiDoDung = TenLoaiDoDung;
    }

    public LoaiDoDung() {
    }

    public void setTenLoaiDoDung(String TenLoaiDoDung) {
        this.TenLoaiDoDung = TenLoaiDoDung;
    }

    public void setLoaiDoDung(int LoaiDoDung) {
        this.LoaiDoDung = LoaiDoDung;
    }

    public int getLoaiDoDung() {
        return LoaiDoDung;
    }



    public String getTenLoaiDoDung() {
        return TenLoaiDoDung;
    }


}
