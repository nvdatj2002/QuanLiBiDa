/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DALChiTietHoaDon;
import DTO.ChiTietHoaDon;
import DTO.HoaDon;
import EXTENDED.Render;
import GUI.Order;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell 7559
 */
public class BLLChiTietHoaDon {

    public static void themVaoHoaDon(int maHoaDon, int maDoDung, int soLuong, double giaban) {
        DAL.DALChiTietHoaDon.insert(maHoaDon, maDoDung, soLuong, giaban);
    }

    public static void updateSoLuong(int soLuong, int maChiTietHoaDon) {
        System.out.println("update");
        DAL.DALChiTietHoaDon.update(soLuong, maChiTietHoaDon);
    }

    public static ArrayList<ChiTietHoaDon> getData(int maHoaDon) {
        ResultSet rs = DAL.DALChiTietHoaDon.getDataByMaHoaDon(maHoaDon);
        ArrayList<ChiTietHoaDon> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon();
                cthd.setMaChiTietHoaDon(rs.getInt(1));
                cthd.setMaHoaDon(rs.getInt(2));
                cthd.setMaDoDung(rs.getInt(3));
                cthd.setSoLuong(rs.getInt(4));
                cthd.setGiaBan(rs.getDouble(5));
                arr.add(cthd);
            }
        } catch (Exception e) {
            return null;
        }
        return arr;
    }

    public static ArrayList<ChiTietHoaDon> finData(int maHoaDon, int maDoDung) {
        ResultSet rs = DAL.DALChiTietHoaDon.timMaByMaHoaDonVaMaDD(maHoaDon, maDoDung);
        ArrayList<ChiTietHoaDon> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon();
                cthd.setMaChiTietHoaDon(rs.getInt(1));
                cthd.setMaHoaDon(rs.getInt(2));
                cthd.setMaDoDung(rs.getInt(3));
                cthd.setSoLuong(rs.getInt(4));
                cthd.setGiaBan(rs.getDouble(5));
                arr.add(cthd);
            }
        } catch (Exception e) {
            return null;
        }
        return arr;
    }

    public static void loadTable(JTable table) {
        int maHoaDon = BLLOrder.maHoaDon;
        ArrayList<ChiTietHoaDon> arr = BLLChiTietHoaDon.getData(maHoaDon);
        if (arr == null) {
            return;
        }
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        table.setModel(model);

        Icon addIcon = new ImageIcon("D:\\DuAnMau 2\\DuAnMau\\DA_Billiards\\src\\main\\resources\\IMG\\icons8-plus-16.png");
        Icon truIcon = new ImageIcon("D:\\DuAnMau 2\\DuAnMau\\DA_Billiards\\src\\main\\resources\\IMG\\icons8-minus-16.png");
        Icon xoaIcon = new ImageIcon("D:\\DuAnMau 2\\DuAnMau\\DA_Billiards\\src\\main\\resources\\IMG\\icons8-trash-bin-16.png");

        table.setDefaultRenderer(Object.class, new Render());

        JButton btnThem = new JButton();
        JButton btnTru = new JButton();
        JButton btnXoa = new JButton();

        btnThem.setIcon(addIcon);
        btnThem.setOpaque(true);
        btnThem.setBackground(Color.white);
        btnThem.setFocusPainted(false);
        btnThem.setFocusable(false);
        btnThem.setBorder(null);
        btnThem.setBorderPainted(false);

        btnTru.setOpaque(true);
        btnTru.setIcon(truIcon);
        btnTru.setBackground(Color.white);
        btnTru.setFocusPainted(false);
        btnTru.setFocusable(false);
        btnTru.setBorder(null);
        btnTru.setBorderPainted(false);

        btnXoa.setOpaque(true);
        btnXoa.setIcon(xoaIcon);
        btnXoa.setBackground(Color.white);
        btnXoa.setFocusPainted(false);
        btnXoa.setFocusable(false);
        btnXoa.setBorder(null);
        btnXoa.setBorderPainted(false);

        model.setColumnIdentifiers(new Object[]{
            "Ten", "", "So luong", "", "Gia", ""
        });

        model.setRowCount(0);
        for (ChiTietHoaDon chiTietHoaDon : arr) {
            String tenDoDung = BLLDoDung.loadTenDoDung(chiTietHoaDon.getMaDoDung());
            model.addRow(new Object[]{
                tenDoDung, btnTru, chiTietHoaDon.getSoLuong(), btnThem, chiTietHoaDon.getGiaBan(), btnXoa
            });

        }

        table.setModel(model);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(10);
        table.getColumnModel().getColumn(2).setPreferredWidth(60);
        table.getColumnModel().getColumn(3).setPreferredWidth(10);
        table.getColumnModel().getColumn(4).setPreferredWidth(80);
        table.getColumnModel().getColumn(5).setPreferredWidth(30);

//
        table.setRowHeight(60);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        table.getColumnModel().getColumn(0).setHeaderRenderer(centerRenderer);
        table.getColumnModel().getColumn(2).setHeaderRenderer(centerRenderer);
        table.getColumnModel().getColumn(4).setHeaderRenderer(centerRenderer);

        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);

        table.setShowGrid(false);
    }

    public static void loadTBL(JTable table) {

    }

    public static void xoaChiTietHoaDon(ArrayList<HoaDon> arrHoaDon, int maChiTietHoaDon) {
        for (HoaDon hoaDon : arrHoaDon) {
            if (hoaDon.getMaNhanVien() != maChiTietHoaDon) {
                DAL.DALChiTietHoaDon.delete(maChiTietHoaDon);
            }
        }
    }

    public static double tongTienDoDung(int maHoaDon) {
        double tongtien = 0;
        ResultSet rs = DALChiTietHoaDon.tongTienDoDung(maHoaDon);
        try {
            while (rs.next()) {
                tongtien = rs.getDouble(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tongtien;
    }
}
