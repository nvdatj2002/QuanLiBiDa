/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.HoaDon;
import EXTENDED.Caution;
import EXTENDED.Transform;
import EXTENDED.handleTime;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell 7559
 */
public class BLLHoaDon {

    public static int demhddangphucvu() {
        int i = 0;
        ResultSet rs = DAL.DALHoaDon.getDataByTinhTrangtrue();
        try {
            while (rs.next()) {
                i = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    public static int demhddathanhtoan() {
        int i = 0;
        ResultSet rs = DAL.DALHoaDon.getDataByTinhTrangfalse();
        try {
            while (rs.next()) {
                i = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    public static Double tongdoanhthutheongay(int ngay) {
        double i = 0;
        ResultSet rs = DAL.DALHoaDon.getdoanhthu(ngay);
        try {
            while (rs.next()) {
                i = rs.getDouble(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    public static void themHoaDon(HoaDon hd) {
        DAL.DALHoaDon.insert(hd);
    }

    public static void thanhToan(Date ngayRa, double tongTien, boolean tinhTrang, int MaHoaDon,Object maKhuyenMai) {
        DAL.DALHoaDon.thanhToan(ngayRa, tongTien, tinhTrang, MaHoaDon,maKhuyenMai);
    }

    public static ArrayList<HoaDon> getAllDataByTinhTrang(int MaBan) {
        ResultSet rs = DAL.DALHoaDon.getDataByTinhTrang(MaBan);
        ArrayList<HoaDon> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon(rs.getInt("MaHoaDon"));
                hd.setNgayVao(rs.getDate("NgayVao"));
                hd.setNgayRa(rs.getDate("NgayRa"));
                hd.setMaNhanVien(rs.getInt("MaNhanVien"));
                hd.setMaBan(rs.getInt("MaBan"));
                hd.setGiaTienGio(rs.getDouble("GiaTienGio"));
                hd.setKhachHang(rs.getInt("KhachHang"));
                hd.setTongTien(rs.getDouble("TongTien"));
                hd.setTinhTrang(rs.getBoolean("TinhTrang"));
                arr.add(hd);
            }
        } catch (Exception e) {
            return null;
        }
        return arr;
    }

    public static ArrayList<HoaDon> GetDatabyMaBan(int MaBan) {
        ResultSet rs = DAL.DALHoaDon.GetHistory(MaBan);
        ArrayList<HoaDon> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon(rs.getInt("MaHoaDon"));
                hd.setNgayVao(rs.getDate("NgayVao"));
                hd.setNgayRa(rs.getDate("NgayRa"));
                hd.setTongTien(rs.getDouble("TongTien"));
                arr.add(hd);
            }
        } catch (Exception e) {
            return null;
        }
        return arr;
    }

    public static ArrayList<HoaDon> getAllDataByMa(int maHD) {
        ResultSet rs = DAL.DALHoaDon.getDataByMa(maHD);
        ArrayList<HoaDon> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon(rs.getInt("MaHoaDon"));
                hd.setNgayVao(rs.getDate("NgayVao"));
                hd.setNgayRa(rs.getDate("NgayRa"));
                hd.setMaNhanVien(rs.getInt("MaNhanVien"));
                hd.setMaBan(rs.getInt("MaBan"));
                hd.setGiaTienGio(rs.getDouble("GiaTienGio"));
                hd.setKhachHang(rs.getInt("KhachHang"));
                hd.setTongTien(rs.getDouble("TongTien"));
                hd.setTinhTrang(rs.getBoolean("TinhTrang"));
                arr.add(hd);
            }
        } catch (Exception e) {
            return null;
        }
        return arr;
    }

    public static void DoVaoTable(int ma, JTable tbl) {
        ResultSet rs = DAL.DALHoaDon.GetHistory(ma);
        String[] headerTable = {"Mã hóa đơn", "Giờ vào", "Giờ ra", "Tổng tiền"};
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        tbModel.setColumnIdentifiers(headerTable);
        try {
            while (rs.next()) {
                Object obj[] = new Object[4];
                obj[0] = rs.getString(1);
                obj[1] = rs.getString(2);
                obj[2] = rs.getString(3);
                obj[3] = rs.getString(4);
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DALHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    public static String SoHoaDon() {
//        String soHoaDon = "";
//        try {
//
//            DateFormat dateFormat = new SimpleDateFormat("yyMMdd");
//
//            Date d = new Date();
//
//            soHoaDon = dateFormat.format(d);
//            System.out.println("soHoaDon: " + soHoaDon);
//            
//            ResultSet rs = DAL.DALHoaDon.CountSoHoaDon(soHoaDon);
//            int rowCount = 0;
//            if (rs.next()) {
//                rowCount = rs.getInt(1);
//            }
//            boolean dup = false;
//            do {
//                if (rowCount > 98) {
//                    soHoaDon = "HD"+ soHoaDon + (rowCount + 1);
//                } else if (rowCount > 9) {
//                    soHoaDon =  "HD"+ soHoaDon + "0" + (rowCount + 1);
//                } else {
//                    soHoaDon =  "HD"+ soHoaDon + "00" + (rowCount + 1);
//                }
//                System.out.println("soHoaDon: " + soHoaDon);
//                ResultSet rs2 = DAL.DALHoaDon.GetHoaDonBySo(soHoaDon);
//                if (rs2.next()) {
//                    dup = true;
//                    rowCount++;
//                    soHoaDon = dateFormat.format(d);
//                } else {
//                    dup = false;
//                }
//            } while (dup);
//
//        } catch (SQLException ex) {
//            System.out.println("Lỗi số hóa đơn");
//        }
//
//        return soHoaDon;
//    }

    public static String ngayVao(int maHoaDon) {
        ResultSet rs = DAL.DALHoaDon.loadNgayVao(maHoaDon);
        try {
            if (rs.next()) {
                return rs.getString("NgayVao");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void chuyenBan(int maHoaDon, int maBan){
        DAL.DALHoaDon.chuyenBan(maHoaDon, maBan);
    }
}
