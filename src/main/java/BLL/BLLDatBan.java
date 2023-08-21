/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.Ban;
import EXTENDED.Caution;
import GUI.DatBan;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author dell 7559
 */
public class BLLDatBan {

    public static ArrayList<DTO.DatBan> layDuLieu(int maBooking) {
        ResultSet rs = DAL.DALDatBan.layDuLieu(maBooking);
        ArrayList<DTO.DatBan> db = new ArrayList<>();
        try {
            while (rs.next()) {
                int maBook = rs.getInt(1);
                int maNhanVien = rs.getInt(2);
                int maBanDat = rs.getInt(3);
                Date ngayDat = rs.getDate(4);
                Date ngayChoi = rs.getDate(5);
                String soDienThoai = rs.getString(6);
                String tinhTrang = rs.getString(7);
                String lyDoHuy = rs.getString(8);
                String tenKhach = rs.getString(9);
                String ghiChu = rs.getString(10);
                DTO.DatBan ban = new DTO.DatBan(maBook, maNhanVien, maBanDat, tenKhach, ngayDat, ngayChoi, soDienThoai, tinhTrang, lyDoHuy, ghiChu);
                db.add(ban);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return db;
    }

    public static ArrayList<DTO.DatBan> layDuLieuTheoBan(int maBan, String tt) {
        ResultSet rs = DAL.DALDatBan.layDuLieuTheoMaBan(maBan, tt);
        ArrayList<DTO.DatBan> db = new ArrayList<>();
        try {
            while (rs.next()) {
                int maBook = rs.getInt(1);
                int maNhanVien = rs.getInt(2);
                int maBanDat = rs.getInt(3);
                Date ngayDat = rs.getDate(4);
                Date ngayChoi = rs.getDate(5);
                String soDienThoai = rs.getString(6);
                String tinhTrang = rs.getString(7);
                String lyDoHuy = rs.getString(8);
                String tenKhach = rs.getString(9);
                String ghiChu = rs.getString(10);
                DTO.DatBan ban = new DTO.DatBan(maBook, maNhanVien, maBanDat, tenKhach, ngayDat, ngayChoi, soDienThoai, tinhTrang, lyDoHuy, ghiChu);
                db.add(ban);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return db;
    }

    public static void doDuLieu(int maBan, JTextField txtSoDienThoai, JDateChooser txtNgayDat, JDateChooser txtNgayChoi, JTextField txtBan, TextArea ghiChu) {
        ArrayList<DTO.DatBan> db = BLLDatBan.layDuLieu(maBan);
        txtSoDienThoai.setText(db.get(0).getSoDienThoai());
        txtNgayDat.setDate(db.get(0).getNgayDat());
        ghiChu.setText(db.get(0).getGhiChu());
        txtNgayChoi.setDate(db.get(0).getNgayChoi());
        int maBanDat = db.get(0).getMaBan();
        ArrayList<Ban> ban = BLLBan.getAllDataById(maBanDat);
        txtBan.setText(ban.get(0).getTenBan());
    }

    public static void insert(DTO.DatBan db) {
        DAL.DALDatBan.insert(db);
    }
    
    public static void updateTinhTrang(int maBook, String tinhTrang){
        DAL.DALDatBan.updateTinhTrang(maBook, tinhTrang);
    }

    // load bàn đã đặt
    public void loadDaDat(JPanel jpanel, JButton btn1, ArrayList<Ban> arr,JTextField txtTenKhach, JTextField txtSoDienThoai, JDateChooser txtNgayChoi, JTextArea ghiChu) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/IMG/icons8-pool-table-96.png"));
        int i = 0;
        for (Ban ban : arr) {
            if (ban.getTinhTrang().equals("2")) {
                JButton button = new JButton();
                button.setFocusPainted(false);
                button.setBorderPainted(false);
                button.setText(ban.getTenBan());
                button.setFont(new Font("Segoe UI", Font.BOLD, 14));
                button.setForeground(Color.white);
                String ten = button.getText();
                button.setPreferredSize(new Dimension(106, 60));
                button.setBackground(new Color(255, 191, 0));
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        btn1.setText(ten);
                        btn1.setBackground(new Color(227, 91, 90));
                        ArrayList<Ban> arrBanCu = BLLOrder.findTableByName(ten);
                        int maBanCu = arrBanCu.get(0).getMaBan();
                        
                        ArrayList<DTO.DatBan> arrBan = BLLDatBan.layDuLieuTheoBan(maBanCu, "1");
                        txtTenKhach.setText(arrBan.get(0).getTenKhach());
                        txtSoDienThoai.setText(arrBan.get(0).getSoDienThoai());
                        txtNgayChoi.setDate(arrBan.get(0).getNgayChoi());
                        ghiChu.setText(arrBan.get(0).getGhiChu());
                    }
                });
                button.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (e.getButton() == MouseEvent.BUTTON1) {

                        }

                        int countClick = e.getClickCount();
                        if (countClick == 2 && e.getButton() == MouseEvent.BUTTON1) {
                            boolean xacNhan = Caution.ThongBao("Ban muon huy dat Ban " + ten);
                            if (xacNhan) {
                                ArrayList<Ban> arrBanCu = BLLOrder.findTableByName(ten);
                                int maBanCu = arrBanCu.get(0).getMaBan();
                                BLLBan.updateTinhTrangBan(maBanCu, "0");
                                DatBan db = new DatBan();
                                db.loadGiaoDien();

                            }

                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                    }
                });
                jpanel.add(button);
                i++;
            }

        }
        if (i == 0) {
            return;
        } else {
            int height = i / 3;
            if (i % 3 == 0) {
                jpanel.setPreferredSize(new Dimension(400, height * 60 + 25));
            } else {
                jpanel.setPreferredSize(new Dimension(400, height * 60 + 85));
            }
        }
    }

    //
    public void loadBanDangTrong(JPanel jpanel, JButton btn1, ArrayList<Ban> arrBan) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/IMG/icons8-pool-table-96.png"));
        int i = 0;
        for (Ban ban : arrBan) {
            if (ban.getTinhTrang().equals("0")) {
                JButton button = new JButton();
                button.setFocusPainted(false);
                button.setBorderPainted(false);
                button.setText(ban.getTenBan());
                button.setFont(new Font("Segoe UI", Font.BOLD, 14));
                button.setForeground(Color.white);
                String ten = button.getText();
                button.setPreferredSize(new Dimension(106, 60));
                button.setBackground(new Color(63, 213, 192));
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        btn1.setText(ten);
                        btn1.setBackground(new Color(63, 213, 192));
                    }
                });
                jpanel.add(button);
                i++;
            }

        }
        if (i == 0) {
            return;
        } else {
            int height = i / 3;
            if (i % 3 == 0) {
                jpanel.setPreferredSize(new Dimension(400, height * 60 + 50));
            } else {
                jpanel.setPreferredSize(new Dimension(400, height * 60 + 125));
            }
        }
    }

}
