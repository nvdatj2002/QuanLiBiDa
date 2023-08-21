/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.Ban;
import DTO.LoaiBan;
import EXTENDED.Caution;
import EXTENDED.MyComboBox;
import GUI.QLBan.jdlChiTietBan;
import static GUI.QLBan.pnlQLBan.pnlLoadban;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author ADMIN
 */
public class BLLBan {

    public static ArrayList<Ban> listTables() {
        //lay tat ca du lieu loai san pham tu sql
        ResultSet rs = DAL.DAL_Ban.GetAllData();
        ArrayList<Ban> arr = new ArrayList();
        try {
            while (rs.next()) {
                Ban table = new Ban();
                table.setMaBan(rs.getByte("MaBan"));
                table.setTenBan(rs.getString("TenBan"));
                table.setLoaiBan(rs.getInt("LoaiBan"));
                table.setKhuVuc(rs.getInt("KhuVuc"));
                table.setTinhTrang(rs.getString("TinhTrang"));
                arr.add(table);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    public static ArrayList<Ban> listTabless(int tukhoa) {
        //lay tat ca du lieu loai san pham tu sql
        ResultSet rs = DAL.DAL_Ban.GetAllData(tukhoa);
        ArrayList<Ban> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                Ban table = new Ban();
                table.setMaBan(rs.getByte("MaBan"));
                table.setTenBan(rs.getString("TenBan"));
                table.setLoaiBan(rs.getInt("LoaiBan"));
                table.setKhuVuc(rs.getInt("KhuVuc"));
                table.setTinhTrang(rs.getString("TinhTrang"));
                arr.add(table);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    public static int dembandangchoi(){
        int i=0;
        ResultSet rs = DAL.DAL_Ban.GetDataDangchoi();
        try {
            while (rs.next()) {
                i=rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    public static int dembandadat(){
        int i=0;
        ResultSet rs = DAL.DAL_Ban.GetDataDaDat();
        try {
            while (rs.next()) {
                i=rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    public static int demtongban(){
        int i=0;
        ResultSet rs = DAL.DAL_Ban.Count();
        try {
            while (rs.next()) {
                i=rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    public static void loadBan(int tukhoa) {
        pnlLoadban.removeAll();
        ArrayList<Ban> arrTable = BLL.BLLBan.listTabless(tukhoa);
        new BLLBan().DoVaoPanel(arrTable, pnlLoadban);
        pnlLoadban.validate();
        SwingUtilities.updateComponentTreeUI(pnlLoadban);
    }
    public static void loadTimkiem(int tukhoa,String ip) {
        pnlLoadban.removeAll();
        ArrayList<Ban> arr = BLL.BLLBan.timBanTheoTenBanvaKV(tukhoa,ip);
        new BLLBan().DoVaoPanel(arr, pnlLoadban);
        pnlLoadban.validate();
        SwingUtilities.updateComponentTreeUI(pnlLoadban);
    }

    public static ArrayList<LoaiBan> listLoaiBan() {
        //lay tat ca du lieu loai san pham tu sql
        ResultSet rs = DAL.DAL_Khac.GetAllDataLoaiBan();
        ArrayList<LoaiBan> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                LoaiBan table = new LoaiBan();
                table.setMaLoaiBan(rs.getByte("MaLoaiBan"));
                table.setTenLoaiBan(rs.getString("TenLoaiBan"));
                arr.add(table);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    public static ArrayList<LoaiBan> listLoaiBantheoma(int id) {
        //lay tat ca du lieu loai san pham tu sql
        ResultSet rs = DAL.DAL_Khac.getDataLBByID(id);
        ArrayList<LoaiBan> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                LoaiBan table = new LoaiBan();
                table.setTenLoaiBan(rs.getString("TenLoaiBan"));
                arr.add(table);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    public static void LoadComboboxLoaiBan(ArrayList<LoaiBan> arr, JComboBox cb) {
        DefaultComboBoxModel cbModel = (DefaultComboBoxModel) cb.getModel();
        cbModel.removeAllElements();
        for (LoaiBan lb : arr) {
            Object value = lb.getMaLoaiBan();
            Object text = lb.getTenLoaiBan();
            MyComboBox myCb = new MyComboBox(value, text);
            cbModel.addElement(myCb);
        }
    }
     public static ArrayList<Ban> listTablesByName(String tukhoa) {
        //lay tat ca du lieu loai san pham tu sql
        ResultSet rs = DAL.DAL_Ban.GetDatabyName(tukhoa);
        ArrayList<Ban> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                Ban table = new Ban();
                table.setMaBan(rs.getInt("MaBan"));
                table.setTenBan(rs.getString("TenBan"));
                table.setLoaiBan(rs.getInt("LoaiBan"));
                table.setKhuVuc(rs.getInt("KhuVuc"));
                table.setTinhTrang(rs.getString("TinhTrang"));
                arr.add(table);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    public static ArrayList<Ban> timBanTheoMaLoaiVaKhuVuc(int maKhuVuc, int maLoai) {
        //lay tat ca du lieu loai san pham tu sql
        ResultSet rs = DAL.DAL_Ban.timBanTheoMaLoaiVaKhuVuc(maKhuVuc, maLoai);
        ArrayList<Ban> arr = new ArrayList();
        try {
            while (rs.next()) {
                Ban table = new Ban();
                table.setMaBan(rs.getByte("MaBan"));
                table.setTenBan(rs.getString("TenBan"));
                table.setLoaiBan(rs.getInt("LoaiBan"));
                table.setKhuVuc(rs.getInt("KhuVuc"));
                table.setTinhTrang(rs.getString("TinhTrang"));
                arr.add(table);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    public static ArrayList<Ban> timBanTheoMaLoai(int maLoai) {
        //lay tat ca du lieu loai san pham tu sql
        ResultSet rs = DAL.DAL_Ban.FindByMaLSP(maLoai);
        ArrayList<Ban> arr = new ArrayList();
        try {
            while (rs.next()) {
                Ban table = new Ban();
                table.setMaBan(rs.getByte("MaBan"));
                table.setTenBan(rs.getString("TenBan"));
                table.setLoaiBan(rs.getInt("LoaiBan"));
                table.setKhuVuc(rs.getInt("KhuVuc"));
                table.setTinhTrang(rs.getString("TinhTrang"));
                arr.add(table);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    public static ArrayList<Ban> timBanTheoTenBan(String tenBan) {
        //lay tat ca du lieu loai san pham tu sql
        ResultSet rs = DAL.DAL_Ban.FindByName(tenBan);
        ArrayList<Ban> arr = new ArrayList();
        try {
            while (rs.next()) {
                Ban table = new Ban();
                table.setMaBan(rs.getByte("MaBan"));
                table.setTenBan(rs.getString("TenBan"));
                table.setLoaiBan(rs.getInt("LoaiBan"));
                table.setKhuVuc(rs.getInt("KhuVuc"));
                table.setTinhTrang(rs.getString("TinhTrang"));
                arr.add(table);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    public static ArrayList<Ban> timBanTheoTenBanvaKV(int kv,String tenBan) {
        //lay tat ca du lieu loai san pham tu sql
        ResultSet rs = DAL.DAL_Ban.GetAllDatabyKhuVucandName(kv,tenBan);
        ArrayList<Ban> arr = new ArrayList();
        try {
            while (rs.next()) {
                Ban table = new Ban();
                table.setMaBan(rs.getByte("MaBan"));
                table.setTenBan(rs.getString("TenBan"));
                table.setLoaiBan(rs.getInt("LoaiBan"));
                table.setKhuVuc(rs.getInt("KhuVuc"));
                table.setTinhTrang(rs.getString("TinhTrang"));
                arr.add(table);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    static ArrayList<Ban> getAllDataById(int maBanDat) {
        //lay tat ca du lieu loai san pham tu sql
        ResultSet rs = DAL.DAL_Ban.GetAllDataId(maBanDat);
        ArrayList<Ban> arr = new ArrayList();
        try {
            while (rs.next()) {
                Ban table = new Ban();
                table.setMaBan(rs.getByte("MaBan"));
                table.setTenBan(rs.getString("TenBan"));
                table.setLoaiBan(rs.getInt("LoaiBan"));
                table.setKhuVuc(rs.getInt("KhuVuc"));
                table.setTinhTrang(rs.getString("TinhTrang"));
                arr.add(table);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    public void DoVaoPanel(ArrayList<Ban> arr, JPanel pnl) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/IMG/pool-table.png"));
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/IMG/billiards1cushion.png"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/IMG/billiards3cushion.png"));
        for (Ban table : arr) {
            JButton button = new JButton();
            button.setFocusPainted(false);
            button.setBackground(new Color(63, 213, 192));
            button.setBorderPainted(false);
            button.setHorizontalAlignment(JButton.CENTER);
            button.setVerticalAlignment(JButton.TOP);
            button.setVerticalTextPosition(JButton.BOTTOM);
            button.setHorizontalTextPosition(JButton.CENTER);
            button.setFont(new Font("Segoe UI", Font.BOLD, 14));
            button.setText(table.getTenBan());
            button.setPreferredSize(new Dimension(252, 100));
            if(listLoaiBantheoma(table.getLoaiBan()).get(0).getTenLoaiBan().equals("8 Pool")){
                button.setIcon(icon);
            }else if (listLoaiBantheoma(table.getLoaiBan()).get(0).getTenLoaiBan().equals("Libre")){
                button.setIcon(icon1);
            }else{
                button.setIcon(icon2);
            }
            button.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(java.awt.event.MouseEvent evt) {
//                    int countClick = e.getClickCount();
                    if (evt.getButton() == MouseEvent.BUTTON1) {
                        jdlChiTietBan ban = new jdlChiTietBan(null, true);
                        ban.lbtxtName.setText(button.getText());
                        ban.setVisible(true);
                    }
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
            pnl.add(button);
        }
    }
    public  static void LoadLBAndKV(JComboBox cb,String TenLoai){
        for (int i=0;i<cb.getItemCount();i++){
            MyComboBox myCb = (MyComboBox)cb.getItemAt(i);
            if(myCb.toString().equals(TenLoai)){
                cb.setSelectedIndex(i);
            }
        }
    }
    

//    public static void DoVaoTable(ArrayList<Ban> arr, JTable tbl) {
//        String[] headerTable = {"ID", "Name", "Loại Bàn", "Status"};
//        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
//        tbModel.setRowCount(0);
//        tbModel.setColumnIdentifiers(headerTable);
//        int i = 1;
//        for (Tables table : arr) {
//            Object obj[] = new Object[4];
//            obj[0] = table.getTableId();
//            obj[1] = table.getTableName();
//            obj[2] = BLL_LoaiBan.loadTenLB(table.getMaLoaiBan() + "");
//            obj[3] = table.getStatus() ? "Đã đặt" : "Còn trống";
//            tbModel.addRow(obj);
//        }
//    }
//
//    public static void DoVaoTableOrders(ArrayList<Tables> arr, JTable tbl) {
//        String[] headerTable = {"Name", "Loại Bàn", "Status", "Note"};
//        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
//        tbModel.setRowCount(0);
//        tbModel.setColumnIdentifiers(headerTable);
//        int i = 1;
//        for (Tables table : arr) {
//            Object obj[] = new Object[4];
//            obj[0] = table.getTableName();
//            obj[1] = BLL_LoaiBan.loadTenLB(table.getMaLoaiBan() + "");
//            obj[2] = table.getStatus() ? "Đã đặt" : "Còn trống";
//            obj[3] = table.getGhichu();
//            tbModel.addRow(obj);
//        }
//    }
    public static boolean check(String tukhoa) {
        ArrayList<Ban> arrlist = listTables();
        for (Ban table : arrlist) {
            if (table.getTenBan().equalsIgnoreCase(tukhoa)) {
                Caution.ThongBaoDonGian("Lỗi", "Bàn đã tồn tại!");
                return false;
            }
        }
        return true;
    }

    public static void ThemSanpham(Ban table) {
        if (check(table.getTenBan())) {
            DAL.DAL_Ban.Add(table);
            Caution.ThongBaoDonGian("Thông báo", "Thành công!");
        }
    }

    public static void XoaSanpham(int ID, boolean status) {
        if (Caution.ThongBaoYesNo()) {
            try {
                DAL.DAL_Ban.Delete(ID, status);
                Caution.ThongBaoThanhCong("Thông báo", "Thành công!");
            } catch (Exception e) {
                Caution.ThongBaoCoIcon("Cảnh báo", "Không thể xóa bàn đang được sử dụng", 0);
            }

        }
    }

    public static void XoaSanphambyName(String name, String status) {
        if (Caution.ThongBaoYesNo()) {
            try {
                DAL.DAL_Ban.DeletebyName(name, status);
                Caution.ThongBaoThanhCong("Thông báo", "Thành công!");
            } catch (Exception e) {
                Caution.ThongBaoCoIcon("Cảnh báo", "Không thể xóa bàn đang được sử dụng", 0);
            }
        }
    }

    public static void SuaSanpham(Ban table) {
        if (Caution.ThongBaoYesNo()) {
            DAL.DAL_Ban.Update(table);
            Caution.ThongBaoThanhCong("Thông báo", "Thành công!");
        }
    }

    public static void SuaStatus(int tukhoa) {
        DAL.DAL_Ban.UpdateStatus(tukhoa);
    }

    public static int DemBan() {
        ResultSet rs = DAL.DAL_Ban.GetAllData();
        int i = 0;
        try {
            while (rs.next()) {
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLLBan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    public static void updateTinhTrangBan(int maBan,String tinhTrang){
        DAL.DAL_Ban.UpdateStatusAll(maBan, tinhTrang);
    }

}
