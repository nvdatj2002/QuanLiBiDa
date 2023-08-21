/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.ChucVu;
import DTO.DonViTinh;
import DTO.KhuVuc;
import DTO.KhuyenMai;
import DTO.LoaiBan;
import DTO.LoaiDoDung;
import EXTENDED.Caution;
import EXTENDED.MyComboBox;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class BLLKhac {

    public static boolean bientry = false;

    //LoaiDoDung
    public static ArrayList<LoaiDoDung> GetAllLoaiDoDung() {
        ResultSet rs = DAL.DAL_Khac.GetAllDataLoaiDoDung();
        ArrayList<LoaiDoDung> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                LoaiDoDung ldd = new LoaiDoDung();
                ldd.setLoaiDoDung(rs.getInt("MaLoaiDoDung"));
                ldd.setTenLoaiDoDung(rs.getString("TenLoaiDoDung"));
                arr.add(ldd);

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr; //trả về ds loại sản phẩm
    }

    public static String loadTenLSP(int MaLoaiSP) {
        ResultSet rs = DAL.DAL_Khac.GetAllDataLoaiDoDungbyMa(MaLoaiSP);
        try {
            if (rs.next()) {
                return rs.getString("TenLoaiDoDung");
            }
        } catch (SQLException ex) {

        }
        return null;
    }

    public static void DoVaoCBLoaiDoDung(ArrayList<LoaiDoDung> arr, JComboBox cb) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.removeAllElements();//xóa dữ liệu trên cbbox
        for (LoaiDoDung ldd : arr) {
            Object text = ldd.getTenLoaiDoDung();
            Object value = ldd.getLoaiDoDung();
            MyComboBox myCBB = new MyComboBox(value, text);
            model.addElement(myCBB);
            cb.setModel(model);
        }
        cb.repaint();
    }

    public static void DoVaoTableLoaiDoDung(ArrayList<LoaiDoDung> arr, JTable tbl) {
        String[] headerTable = {"STT", "Tên"};
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        tbModel.setColumnIdentifiers(headerTable);
        for (LoaiDoDung dd : arr) {
            Object obj[] = new Object[10];
            obj[0] = tbl.getRowCount() + 1;
            obj[1] = dd.getTenLoaiDoDung();
            tbModel.addRow(obj);

        }

    }

    public static boolean checkLoaiDoDung(String tukhoa) {
        ArrayList<LoaiDoDung> arrlist = GetAllLoaiDoDung();
        for (LoaiDoDung ldd : arrlist) {
            if (ldd.getTenLoaiDoDung().equals(tukhoa)) {
                Caution.ThongBaoDonGian("Lỗi", "Loại đồ dùng đã tồn tại!");
                return false;
            }
        }
        return true;
    }

    public static void ThemLoaiDoDung(LoaiDoDung ldd) {
        if (checkLoaiDoDung(ldd.getTenLoaiDoDung())) {
            DAL.DAL_Khac.AddLoaiDoDung(ldd);
            Caution.ThongBaoDonGian("Thông báo", "Thêm thành công");
        }
    }

    public static void SuaLoaiDoDung(LoaiDoDung ldd, String Tencu) {
        if (checkLoaiDoDung(ldd.getTenLoaiDoDung())) {
            DAL.DAL_Khac.UpdateLoaiDoDung(ldd, Tencu);
            Caution.ThongBaoDonGian("Thông báo", "Thêm thành công");
        }
    }

    public static void XoaLoaiDoDung(String Ten) {
        try {
            DAL.DAL_Khac.DeleteLoaiDoDung(Ten);
            bientry = true;
        } catch (Exception e) {
            Caution.ThongBaoDonGian("Thông báo", "Xóa không thành công");
        }

    }

    public static void LoadCBBKhiMo(JComboBox cb, String TenLoai) {
        for (int i = 0; i < cb.getItemCount(); i++) {
            MyComboBox myCb = (MyComboBox) cb.getItemAt(i);
            if (myCb.toString().equals(TenLoai)) {
                cb.setSelectedIndex(i);
            }
        }
    }

    //LoaiKhacHang
    public static ArrayList<KhuyenMai> GetAllKhuyenMai() {
        //lay tat ca du lieu loai san pham tu sql
        ResultSet rs = DAL.DAL_Khac.getAllKhuyenMai();
        ArrayList<KhuyenMai> array = new ArrayList();
        try {
            while (rs.next()) {
                KhuyenMai table = new KhuyenMai();
                table.setMaKhuyenMai(rs.getByte("MaKhuyenMai"));
                table.setTenKhuyenMai(rs.getString("TenKhuyenMai"));
                table.setGiaTri(rs.getInt("GiaTriKhuyenMai"));
                table.setTinhTrang(rs.getBoolean("TinhTrang"));
                array.add(table);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return array;
    }
    
        public static ArrayList<KhuyenMai> GetAllKhuyenMaibyMa(int ma) {
        //lay tat ca du lieu loai san pham tu sql
        ResultSet rs = DAL.DAL_Khac.FindKhuyenMaibyMa(ma);
        ArrayList<KhuyenMai> array = new ArrayList();
        try {
            while (rs.next()) {
                KhuyenMai table = new KhuyenMai();
                table.setMaKhuyenMai(rs.getByte("MaKhuyenMai"));
                table.setTenKhuyenMai(rs.getString("TenKhuyenMai"));
                table.setGiaTri(rs.getInt("GiaTriKhuyenMai"));
                table.setTinhTrang(rs.getBoolean("TinhTrang"));
                array.add(table);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return array;
    }

    public static void LoadComboboxKhuyenMai(ArrayList<KhuyenMai> arr, JComboBox cb) {
        DefaultComboBoxModel cbModel = (DefaultComboBoxModel) cb.getModel();
        for (KhuyenMai lb : arr) {
            Object value = lb.getMaKhuyenMai();
            Object text = lb.getTenKhuyenMai();
            MyComboBox myCb = new MyComboBox(value, text);
            cbModel.addElement(myCb);
        }
    }

    public static void DoVaoTableKhuyenMai(ArrayList<KhuyenMai> arr, JTable tbl) {
        String[] headerTable = {"STT","Mã", "Tên", "Giá trị", "Tình trạng"};
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        tbModel.setColumnIdentifiers(headerTable);
        for (KhuyenMai dd : arr) {
            Object obj[] = new Object[5];
            obj[0] = tbl.getRowCount() + 1;
            obj[1] = dd.getMaKhuyenMai();
            obj[2] = dd.getTenKhuyenMai();
            obj[3] = dd.getGiaTri();
            obj[4] = dd.isTinhTrang();
            tbModel.addRow(obj);
        }

    }


    public static void ThemKhuyenMai(KhuyenMai ldd) {
            DAL.DAL_Khac.AddKhuyenMai(ldd);
            Caution.ThongBaoDonGian("Thông báo", "Thêm thành công");
    }

    public static void SuaKhuyenMai(KhuyenMai ldd, int Ma) {
            DAL.DAL_Khac.UpdateKhuyenMai(ldd, Ma);
            Caution.ThongBaoDonGian("Thông báo", "Sửa thành công");
    }

    public static void XoaKhuyenMai(int Ma) {
        try {
            DAL.DAL_Khac.DeleteKhuyenMai(Ma);
            bientry = true;
        } catch (Exception e) {
            Caution.ThongBaoDonGian("Thông báo", "Xóa không thành công");
        }
    }

    //KhuVuc
    public static ArrayList<KhuVuc> GetAllKhuVuc() {
        //lay tat ca du lieu loai san pham tu sql
        ResultSet rs = DAL.DAL_Khac.GetAllDataKhuVuc();
        ArrayList<KhuVuc> array = new ArrayList();
        try {
            while (rs.next()) {
                KhuVuc table = new KhuVuc();
                table.setMaKhuVuc(rs.getByte("MaKhuVuc"));
                table.setTenKhuvuc(rs.getString("TenKhuVuc"));
                array.add(table);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return array;
    }

    public static String GetNameKhuVuc(int id) {
        //lay tat ca du lieu loai san pham tu sql
        ResultSet rs = DAL.DAL_Khac.GetAllDataKhuVucbyID(id);
        String rt = "";
        try {
            while (rs.next()) {
                KhuVuc table = new KhuVuc();
                table.setTenKhuvuc(rs.getString("TenKhuVuc"));
                rt = table.getTenKhuvuc();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rt;
    }

    public static void LoadComboboxKhuVucs(ArrayList<KhuVuc> arr, JComboBox cb) {
        DefaultComboBoxModel cbModel = (DefaultComboBoxModel) cb.getModel();
        cbModel.removeAllElements();
        for (KhuVuc lb : arr) {
            Object value = lb.getMaKhuVuc();
            Object text = lb.getTenKhuvuc();
            MyComboBox myCb = new MyComboBox(value, text);
            cbModel.addElement(myCb);
        }
    }

    public static void DoVaoTableKhuVuc(ArrayList<KhuVuc> arr, JTable tbl) {
        String[] headerTable = {"STT", "Tên"};
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        tbModel.setColumnIdentifiers(headerTable);
        for (KhuVuc dd : arr) {
            Object obj[] = new Object[10];
            obj[0] = tbl.getRowCount() + 1;
            obj[1] = dd.getTenKhuvuc();
            tbModel.addRow(obj);
        }
    }

    public static boolean checkKhuvuc(String tukhoa) {
        ArrayList<KhuVuc> arrlist = GetAllKhuVuc();
        for (KhuVuc ldd : arrlist) {
            if (ldd.getTenKhuvuc().equals(tukhoa)) {
                Caution.ThongBaoDonGian("Lỗi", "Khu vực đã tồn tại!");
                return false;
            }
        }
        return true;
    }

    public static void ThemKhuVuc(KhuVuc ldd) {
        if (checkKhuvuc(ldd.getTenKhuvuc())) {
            DAL.DAL_Khac.AddKhuVuc(ldd);
            Caution.ThongBaoDonGian("Thông báo", "Thêm thành công");
        }
    }

    public static void SuaKhuVuc(KhuVuc ldd, String Tencu) {
        if (checkKhuvuc(ldd.getTenKhuvuc())) {
            DAL.DAL_Khac.UpdateKhuVuc(ldd, Tencu);
            Caution.ThongBaoDonGian("Thông báo", "Sửa thành công");
        }
    }

    public static void XoaKhuVuc(String Ten) {
        try {
            DAL.DAL_Khac.DeleteKhuVuc(Ten);
            bientry = true;
        } catch (Exception e) {
            Caution.ThongBaoDonGian("Thông báo", "Xóa không thành công");
        }
    }

    //ChucVu
    public static ArrayList<ChucVu> GetAllChucVu() {
        //lay tat ca du lieu loai san pham tu sql
        ResultSet rs = DAL.DAL_Khac.GetAllDataChucvu();
        ArrayList<ChucVu> array = new ArrayList();
        try {
            while (rs.next()) {
                ChucVu cv = new ChucVu();
                cv.setMaChucVu(rs.getInt("MaChucVu"));
                cv.setTenChucVu(rs.getString("TenChucVu"));
                array.add(cv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return array;
    }

    public static String loadTenChucVu(int macv) {
        ResultSet rs = DAL.DAL_Khac.GetAllDataChucVubyMa(macv);
        try {
            if (rs.next()) {
                return rs.getString("TenChucVu");
            }
        } catch (SQLException ex) {

        }
        return null;
    }

    public static void LoadComboboxChucVu(ArrayList<ChucVu> arr, JComboBox cb) {
        DefaultComboBoxModel cbModel = (DefaultComboBoxModel) cb.getModel();
        cbModel.removeAllElements();
        for (ChucVu kv : arr) {
            Object value = kv.getMaChucVu();
            Object text = kv.getTenChucVu();
            MyComboBox myCb = new MyComboBox(value, text);
            cbModel.addElement(myCb);
        }
    }

    public static void DoVaoTableChucVu(ArrayList<ChucVu> arr, JTable tbl) {
        String[] headerTable = {"STT", "Tên"};
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        tbModel.setColumnIdentifiers(headerTable);
        for (ChucVu kv : arr) {
            Object obj[] = new Object[10];
            obj[0] = tbl.getRowCount() + 1;
            obj[1] = kv.getTenChucVu();
            tbModel.addRow(obj);
        }
    }

    public static boolean checkChucVu(String tukhoa) {
        ArrayList<ChucVu> arrlist = GetAllChucVu();
        for (ChucVu dvt : arrlist) {
            if (dvt.getTenChucVu().equals(tukhoa)) {
                Caution.ThongBaoDonGian("Lỗi", "Chức vụ đã tồn tại!");
                return false;
            }
        }
        return true;
    }

    public static void ThemChucvu(ChucVu dvt) {
        if (checkChucVu(dvt.getTenChucVu())) {
            DAL.DAL_Khac.AddChucVu(dvt);
            Caution.ThongBaoDonGian("Thông báo", "Thêm thành công");
        }
    }

    public static void SuaChucVu(ChucVu dvt, String Tencu) {
        if (checkChucVu(dvt.getTenChucVu())) {
            DAL.DAL_Khac.UpdateChucVu(dvt, Tencu);
            Caution.ThongBaoDonGian("Thông báo", "Sửa thành công");
        }
    }

    public static void XoaChucVu(String Ten) {
        try {
            DAL.DAL_Khac.DeleteChucVu(Ten);
            bientry = true;
        } catch (Exception e) {
            Caution.ThongBaoDonGian("Thông báo", "Xóa không thành công");
        }
    }

    //DonViTinh
    public static ArrayList<DonViTinh> GetAllDVT() {
        ResultSet rs = DAL.DAL_Khac.GetAllDataDVTDoDung();
        ArrayList<DonViTinh> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                DonViTinh dvt = new DonViTinh();
                dvt.setMaDonViTinh(rs.getInt("MaDonViTinh"));
                dvt.setTen(rs.getString("Ten"));
                arr.add(dvt);

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr; //trả về ds loại sản phẩm
    }

    public static String loadTenDVT(int MaLoaDVT) {
        ResultSet rs = DAL.DAL_Khac.GetAllDataDVTbyMa(MaLoaDVT);
        try {
            if (rs.next()) {
                return rs.getString("Ten");
            }
        } catch (SQLException ex) {

        }
        return null;
    }

    public static void DoVaoCBDVT(ArrayList<DonViTinh> arr, JComboBox cb) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.removeAllElements();//xóa dữ liệu trên cbbox
        for (DonViTinh ldd : arr) {
            Object text = ldd.getTen();
            Object Value = ldd.getMaDonViTinh();
            MyComboBox myCBB = new MyComboBox(Value, text);
            model.addElement(myCBB);
            cb.setModel(model);
        }
    }

    public static void DoVaoTableDVT(ArrayList<DonViTinh> arr, JTable tbl) {
        String[] headerTable = {"STT", "Tên"};
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        tbModel.setColumnIdentifiers(headerTable);
        for (DonViTinh dd : arr) {
            Object obj[] = new Object[10];
            obj[0] = tbl.getRowCount() + 1;
            obj[1] = dd.getTen();
            tbModel.addRow(obj);
        }
    }

    public static boolean checkDVT(String tukhoa) {
        ArrayList<DonViTinh> arrlist = GetAllDVT();
        for (DonViTinh dvt : arrlist) {
            if (dvt.getTen().equals(tukhoa)) {
                Caution.ThongBaoDonGian("Lỗi", "Đơn vị tính đã tồn tại!");
                return false;
            }
        }
        return true;
    }

    public static void ThemDVT(DonViTinh dvt) {
        if (checkDVT(dvt.getTen())) {
            DAL.DAL_Khac.AddDonViTinh(dvt);
            Caution.ThongBaoDonGian("Thông báo", "Thêm thành công");
        }
    }

    public static void SuaDVT(DonViTinh dvt, String Tencu) {
        if (checkDVT(dvt.getTen())) {
            DAL.DAL_Khac.UpdateDonViTinh(dvt, Tencu);
            Caution.ThongBaoDonGian("Thông báo", "Sửa thành công");
        }
    }

    public static void XoaDVT(String Ten) {
        try {
            DAL.DAL_Khac.DeleteDonViTinh(Ten);
            bientry = true;
        } catch (Exception e) {
            Caution.ThongBaoDonGian("Thông báo", "Xóa không thành công");
        }
    }

    //LoaiBan
    public static ArrayList<LoaiBan> GetAllLoaiBan() {
        ResultSet rs = DAL.DAL_Khac.GetAllDataLoaiBan();
        ArrayList<LoaiBan> arr = new ArrayList<>();

        try {
            while (rs.next()) {
                LoaiBan dvt = new LoaiBan();
                dvt.setMaLoaiBan(rs.getInt("MaLoaiBan"));
                dvt.setTenLoaiBan(rs.getString("TenLoaiBan"));
                dvt.setGiaTien(rs.getDouble("GiaTien"));
                arr.add(dvt);

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return arr; //trả về ds loại sản phẩm
    }

    public static String GetNameLoaiBan(int id) {
        ResultSet rs = DAL.DAL_Khac.getDataLBByID(id);
        String rt = "";

        try {
            while (rs.next()) {
                LoaiBan dvt = new LoaiBan();
                dvt.setTenLoaiBan(rs.getString("TenLoaiBan"));
                rt = dvt.getTenLoaiBan();

            }
        } catch (SQLException ex) {
            System.out.println("lỗi lấy dự liệu" + ex.getMessage());
        }

        return rt; //trả về ds loại sản phẩm
    }

    public static void DoVaoCBLoaiBan(ArrayList<LoaiBan> arr, JComboBox cb) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.removeAllElements();//xóa dữ liệu trên cbbox
        for (LoaiBan ldd : arr) {
            Object text = ldd.getTenLoaiBan();
            Object Value = ldd.getMaLoaiBan();
            MyComboBox myCBB = new MyComboBox(Value, text);
            model.addElement(myCBB);
            cb.setModel(model);
        }
    }

    public static void DoVaoTableLoaiBan(ArrayList<LoaiBan> arr, JTable tbl) {
        String[] headerTable = {"STT", "Tên", "Giá tiền"};
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        tbModel.setColumnIdentifiers(headerTable);
        for (LoaiBan dd : arr) {
            Object obj[] = new Object[3];
            obj[0] = tbl.getRowCount() + 1;
            obj[1] = dd.getTenLoaiBan();
            obj[2] = dd.getGiaTien();
            tbModel.addRow(obj);
        }
    }

    public static boolean checkLoaiBan(String tukhoa) {
        ArrayList<LoaiBan> arrlist = GetAllLoaiBan();
        for (LoaiBan dvt : arrlist) {
            if (dvt.getTenLoaiBan().equals(tukhoa)) {
                Caution.ThongBaoDonGian("Lỗi", "Loại bàn đã tồn tại!");
                return false;
            }
        }
        return true;
    }

    public static void ThemLoaiBan(LoaiBan dvt) {
        if (checkLoaiBan(dvt.getTenLoaiBan())) {
            DAL.DAL_Khac.AddLoaiBan(dvt);
            Caution.ThongBaoDonGian("Thông báo", "Thêm thành công");
        }
    }

    public static void SuaLoaiBan(LoaiBan dvt, String Tencu) {
        DAL.DAL_Khac.UpdateLoaiBan(dvt, Tencu);
        Caution.ThongBaoDonGian("Thông báo", "Sửa thành công");
    }

    public static void XoaLoaiBan(String Ten) {
        try {
            DAL.DAL_Khac.DeleteLoaiBan(Ten);
            bientry = true;
        } catch (Exception e) {
            Caution.ThongBaoDonGian("Thông báo", "Xóa không thành công");
        }
    }

    public static ArrayList<LoaiBan> findByMaLoaiBan(int maLoai) {
        ResultSet rs = DAL.DAL_Khac.getDataLBByID(maLoai);
        ArrayList<LoaiBan> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                LoaiBan LoaiBan = new LoaiBan();
                LoaiBan.setMaLoaiBan(rs.getByte(1));
                LoaiBan.setTenLoaiBan(rs.getString(2));
                LoaiBan.setGiaTien(rs.getDouble(3));
                arr.add(LoaiBan);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return arr;
    }

}
