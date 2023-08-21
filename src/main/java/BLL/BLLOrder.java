/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DALKhuyenMai;
import DTO.Ban;
import DTO.ChiTietHoaDon;
import DTO.DoDung;
import DTO.HoaDon;
import DTO.KhuVuc;
import DTO.KhuyenMai;
import DTO.LoaiBan;
import EXTENDED.Caution;

import EXTENDED.MyComboBox;

import EXTENDED.Render;
import EXTENDED.RenderLable;
import EXTENDED.Transform;
import EXTENDED.handleTime;
import GUI.DatBan;
import GUI.Order;
import GUI.jdlTuyChon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import org.jfree.util.ObjectUtilities;

public class BLLOrder {

    public static ArrayList<KhuyenMai> layKhuyenMai() {
        ArrayList<KhuyenMai> list = new ArrayList<>();
        ResultSet rs = DALKhuyenMai.getdata();
        try {
            while (rs.next()) {
                KhuyenMai khuyenMai = new KhuyenMai();
                khuyenMai.setMaKhuyenMai(rs.getInt(1));
                khuyenMai.setTenKhuyenMai(rs.getString(2));
                khuyenMai.setGiaTri(rs.getInt(3));
                khuyenMai.setTinhTrang(rs.getBoolean(4));
                list.add(khuyenMai);
            }
        } catch (Exception e) {
            return null;
        }
        return list;
    }

    public static ArrayList<KhuyenMai> LayMaKhuyenMaiBangMa(Object maKhuyenMai) {
        ArrayList<KhuyenMai> list = new ArrayList<>();
        ResultSet rs = DALKhuyenMai.layMaKhuyenMaiBangMa(maKhuyenMai);
        try {
            while (rs.next()) {
                KhuyenMai khuyenMai = new KhuyenMai();
                khuyenMai.setMaKhuyenMai(rs.getInt(1));
                khuyenMai.setTenKhuyenMai(rs.getString(2));
                khuyenMai.setGiaTri(rs.getInt(3));
                khuyenMai.setTinhTrang(rs.getBoolean(4));
                list.add(khuyenMai);
            }
        } catch (Exception e) {
            return null;
        }
        return list;
    }

    // load table chi tiết sản phẩm
    public void loadtblSanPhamDaGoi(JTable table) {
        Icon addIcon = new ImageIcon(getClass().getResource("/IMG/IMGicons8-plus-16.png"));
        Icon truIcon = new ImageIcon(getClass().getResource("/IMG/icons8-minus-16.png"));
        Icon xoaIcon = new ImageIcon(getClass().getResource("/IMG/icons8-trash-bin-16.png"));

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
        btnThem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

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

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.setColumnIdentifiers(new Object[]{
            "Ten", "", "So luong", "", "Gia", ""
        });

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

    // Them so luong san pham
    public static void clickBtnThem(JTable table, int indexRow, int valueOld) {
        int valueNew = valueOld + 1;
        table.setValueAt(valueNew, indexRow, 2);
    }

    // tru so luong san pham
    public static void clickBtntru(JTable table, int indexRow, int valueOld) {
        System.out.println("-");
        int valueNew = valueOld - 1;
        table.setValueAt(valueNew, indexRow, 2);
    }

    // xoá row table 
    public static void xoaRow(JTable jTable, int indexRow) {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.removeRow(indexRow);
    }

    public static String tenban = "";
    public static int maHoaDon = 0;

    public static void loadmm() {
        System.out.println("oké");
    }

    // load bàn
    public static String giora = "";
    public static double tongTienThanhToan = 0;
    public static double tienGio = 0;
    public static double thanhTien = 0;

    public void loadBan(JPanel jPanel, ArrayList<Ban> arr, JTextField field, JTable jTable, JButton btn) {
        FlowLayout flowLayout = new FlowLayout(0, 5, 5);
        flowLayout.preferredLayoutSize(jPanel);

        ImageIcon icon = new ImageIcon(getClass().getResource("/IMG/icons8-pool-table-96.png"));
        for (Ban list : arr) {
            JButton button = new JButton();
            button.setFocusPainted(false);
            button.setBackground(new Color(63, 213, 192));
            button.setBorderPainted(false);
            button.setText(list.getTenBan());
            button.setIcon(icon);
            button.setFont(new Font("Segoe UI", Font.BOLD, 14));
            button.setForeground(Color.white);
            String ten = button.getText();
            if (list.getTinhTrang().equals("1")) {
                button.setBackground(new Color(227, 91, 90));
            }
            if (list.getTinhTrang().equals("2")) {
                button.setBackground(new Color(255, 191, 0));
            }
            button.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getButton() == MouseEvent.BUTTON1) {
                        field.setText(tenban);
                        ArrayList<Ban> arr = BLLBan.timBanTheoTenBan(ten);
                        int maBan = arr.get(0).getMaBan();
                        ArrayList<HoaDon> arrHoaDon = BLLHoaDon.getAllDataByTinhTrang(maBan);
                        if (arrHoaDon.size() > 0) {
                            maHoaDon = arrHoaDon.get(0).getMaHoaDon();
                            BLLChiTietHoaDon.loadTable(jTable);
                            btn.setEnabled(true);
                        } else {
                            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
                            model.setColumnCount(0);
                            model.setRowCount(0);
                            btn.setEnabled(false);
                        }
                    }
                }

                @Override
                public void mousePressed(java.awt.event.MouseEvent e) {
                    int countClick = e.getClickCount();
                    tenban = ten;
                    ArrayList<Ban> list = findTableByName(ten);
                    if (countClick == 2 && e.getButton() == MouseEvent.BUTTON1) {
                        if (list.get(0).getTinhTrang().equals("0") || list.get(0).getTinhTrang().equals("2")) {

                            boolean xacNhanMoBan = Caution.ThongBao("Bạn có muốn mở " + ten + "?");
                            if (xacNhanMoBan) {
                                btn.setEnabled(true);
                                updateStatus(ten);
                                button.setBackground(new Color(227, 91, 90));
                                HoaDon hd = new HoaDon();
                                // [NgayVao],[MaNhanVien],[MaBan],[GiaTienGio],[TinhTrang]
                                String ngay = handleTime.fullTime(new Date());
                                Date date = handleTime.fullTimeString(ngay);
                                ArrayList<Ban> arr = BLLBan.timBanTheoTenBan(ten);
                                int maBan = arr.get(0).getMaBan();
                                int maLoaiBan = arr.get(0).getLoaiBan();
                                ArrayList<LoaiBan> loaiBan = BLLKhac.findByMaLoaiBan(maLoaiBan);
                                double giaTien = loaiBan.get(0).getGiaTien();
                                hd.setNgayVao(date);
                                hd.setMaBan(maBan);
                                hd.setMaNhanVien(BLL.BLLNhanVien.GetAccountNhanVien().getMaNhanVien());
                                hd.setGiaTienGio(giaTien);
                                hd.setTinhTrang(true);
                                ArrayList<Ban> arrBanCu = BLLOrder.findTableByName(ten);
                                int maBanCu = arrBanCu.get(0).getMaBan();
                                ArrayList<DTO.DatBan> arrBan = BLLDatBan.layDuLieuTheoBan(maBanCu, "1");
                                BLLBan.updateTinhTrangBan(maBanCu, "1");

                                BLLDatBan.updateTinhTrang(arrBan.get(0).getMaDat(), "0");
                                BLLHoaDon.themHoaDon(hd);
                                ArrayList<HoaDon> arrHoaDon = BLLHoaDon.getAllDataByTinhTrang(maBan);
                                maHoaDon = arrHoaDon.get(0).getMaHoaDon();
                                BLLChiTietHoaDon.loadTable(jTable);
                            }
                        }
//                         else {
//                            ChiTietBan ban = new ChiTietBan(null, true);
//                            ban.setVisible(true);
//                            if (ban.thanhToan) {
//                                //[NgayRa] = ?,[TongTien] = ?,[TinhTrang] = ? WHERE [MaHoaDon]
//                                button.setBackground(new Color(63, 213, 192));
//                                ban.thanhToan = false;
//                            }
//                        }
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

            button.setHorizontalTextPosition(JButton.CENTER);
            button.setVerticalTextPosition(JButton.BOTTOM);
            button.setPreferredSize(new Dimension(220, 120));
            jPanel.add(button);
            int row = arr.size();
            if (arr.size() % 2 == 0) {
                jPanel.setPreferredSize(new Dimension(420, row / 2 * 125 + 15));
            } else {
                jPanel.setPreferredSize(new Dimension(420, row / 2 * 125 + 140));
            }
            jPanel.setLayout(flowLayout);
        }
    }

    public static void thanhToanTien(JLabel gioVao, JLabel giora, JLabel tienGio, JLabel TongTien, JLabel thanhTien, int khuyenMai, JLabel tienKhuyenMai, Object maKhuyenMai) {
        HoaDon hd = new HoaDon();
        ArrayList<Ban> arr = BLLBan.timBanTheoTenBan(tenban);
        int maBan = arr.get(0).getMaBan();
        ArrayList<HoaDon> arrHoaDon = BLLHoaDon.getAllDataByTinhTrang(maBan);
        int maHoaDon = arrHoaDon.get(0).getMaHoaDon();
        double tienBan = arrHoaDon.get(0).getGiaTienGio();
        String ngayVao = BLLHoaDon.ngayVao(maHoaDon);
        Date ngayVaoDate = handleTime.fullTimeString(ngayVao);

        Date date = new Date();
        String ngay = handleTime.time(date);
        long tg = date.getTime() - ngayVaoDate.getTime();

        double tienBanMotGiay = tienBan / 3600;
        long giay = tg / 1000;
        double tienChoi = tienBanMotGiay * giay;
        Order o = new Order();
        double tongTien = tienChoi + o.tienDoDung;
        BLLBan.SuaStatus(maBan);
        tienGio.setText(Transform.SoString(Math.ceil(tienChoi)));
        String giovao = handleTime.time(ngayVaoDate);

        gioVao.setText(giovao);
        giora.setText(ngay);

        tongTienThanhToan = Math.ceil(tongTien);
        TongTien.setText(Transform.SoString(tongTienThanhToan));

        double tienKM = tongTienThanhToan * khuyenMai / 100;
        int ttkm = (int) tienKM;
        System.out.println("ttkm " + ttkm);
        double tt = tongTienThanhToan - ttkm;
        BLLOrder.thanhTien = tt;
        tienKhuyenMai.setText(Transform.SoString(Math.ceil(ttkm)));
        thanhTien.setText(Transform.SoString(Math.ceil(tt)));

        o.tienDoDung = 0;
        BLLHoaDon.thanhToan(date, Math.ceil(tt), false, maHoaDon, maKhuyenMai);
    }

    public static void taoHoaDon() {
        ArrayList<Ban> ban = findTableByName(tenban);
        int maBan = ban.get(0).getMaBan();
        int maLoaiBan = ban.get(0).getLoaiBan();
        ArrayList<LoaiBan> loaiBan = BLLKhac.findByMaLoaiBan(maLoaiBan);

        Date date = new Date();
        HoaDon hoaDon = new HoaDon();
        String dateString = handleTime.fullTime(date);
        Date ngayChinhXac = handleTime.fullTimeString(dateString);
        double giaTien = loaiBan.get(0).getGiaTien();

        hoaDon.setMaBan(maBan);
        hoaDon.setTinhTrang(true);
        hoaDon.setMaNhanVien(1);
        hoaDon.setNgayVao(ngayChinhXac);
        hoaDon.setGiaTienGio(giaTien);

//        BLLHoaDon.themHoaDon(hoaDon);
    }

    // load table sản phẩm
    public void loadTableSanPham(JTable table, ArrayList<DoDung> arr) {
        JButton btnThem = new JButton();
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/IMG/icons8-plus-16.png"));

        btnThem.setIcon(imageIcon);
        btnThem.setOpaque(true);
        btnThem.setBackground(Color.white);
        btnThem.setFocusPainted(false);
        btnThem.setFocusable(false);
        btnThem.setBorder(null);
        btnThem.setBorderPainted(false);

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.setColumnIdentifiers(new Object[]{
            "Ten", "Gia", "", ""
        });
        for (DoDung doDung : arr) {
            model.addRow(new Object[]{
                doDung.getTenDoDung(), doDung.getGiaBan(), doDung.getHinhAnh(), btnThem
            });
        }

        table.setModel(model);
        table.getColumnModel().getColumn(2).setCellRenderer(new RenderLable());
        table.getColumnModel().getColumn(3).setCellRenderer(new Render());
//        table.getColumnModel().getColumn(3).setCellEditor((TableCellEditor) new CellEditor());

        table.setRowHeight(60);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        table.getColumnModel().getColumn(0).setHeaderRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setHeaderRenderer(centerRenderer);

        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);

        table.setShowGrid(false);
    }

    // load chi tiết bàn
    public static void loadChiTietBan(JTable table, JLabel tenBan, JLabel gioVao, ArrayList arr) {
        tenBan.setText(tenban);
        ArrayList<ChiTietHoaDon> chiTietHoaDon = BLLChiTietHoaDon.getData(maHoaDon);
        System.out.println(chiTietHoaDon.size() + " ss");
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        System.out.println("s");
        model.setColumnIdentifiers(new Object[]{
            "Tên", "Số lượng ", "Giá bán", "Thành tiền"
        });
        table.setModel(model);
        model.setRowCount(0);
        for (ChiTietHoaDon cthd : chiTietHoaDon) {
            String tenDoDung = BLLDoDung.loadTenDoDung(cthd.getMaDoDung());
            model.addRow(new Object[]{
                tenDoDung, cthd.getSoLuong(), cthd.getGiaBan(), cthd.getSoLuong() * cthd.getGiaBan()
            });
        }

        table.setRowHeight(40);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        table.getColumnModel().getColumn(0).setHeaderRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setHeaderRenderer(centerRenderer);
        table.getColumnModel().getColumn(2).setHeaderRenderer(centerRenderer);
        table.getColumnModel().getColumn(3).setHeaderRenderer(centerRenderer);

        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        table.setShowGrid(false);
        System.out.println(maHoaDon);
        String ngay = BLLHoaDon.ngayVao(maHoaDon);
        System.out.println(ngay);
        gioVao.setText(ngay);
    }

    // lấy dữ liệu bàn
    public static ArrayList<Ban> findTableByName(String name) {
        ResultSet rs = DAL.DAL_Ban.FindByName(name);
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

    // gọi món
    public void goiMon(JTable table, String tenMon, double gia, JButton btnLuu, String tenBan) {
        if (tenBan.equals("")) {
            Caution.ThongBaoDonGian("Thong Ban", "Chua chon ban!");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        table.setModel(model);
        int countRow = table.getRowCount();
        String a = JOptionPane.showInputDialog(null, "Nhập số lượng", 1);
        System.out.println(a);
        if (a == null) {
            return;
        }
        if (a.equals("")) {
            Caution.ThongBaoDonGian("Thông báo", "Vui lòng nhập số lượng");
        }
        int soLuongThem = Integer.parseInt(a);
        ArrayList<Ban> arrBan = BLLBan.timBanTheoTenBan(tenBan);
        if (arrBan.get(0).getTinhTrang().equals("0")) {
            Caution.ThongBaoDonGian("Thông báo", "Bàn chưa mở");
            return;
        }
        if (arrBan.get(0).getTinhTrang().equals("2")) {
            Caution.ThongBaoDonGian("Thông báo", "Bàn chưa mở");
            return;
        }

        for (int i = 0; i < countRow; i++) {
            String ten = table.getValueAt(i, 0).toString();
            if (ten.equals(tenMon)) {
                int soLuong = Integer.parseInt(table.getValueAt(i, 2).toString());
                int tongSoLuong = soLuong + soLuongThem;

                table.setValueAt(tongSoLuong, i, 2);
                btnLuu.setEnabled(true);
                return;
            }
        }
        Icon addIcon = new ImageIcon(getClass().getResource("/IMG/icons8-plus-16.png"));
        Icon truIcon = new ImageIcon(getClass().getResource("/IMG/icons8-minus-16.png"));
        Icon xoaIcon = new ImageIcon(getClass().getResource("/IMG/icons8-trash-bin-16.png"));

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
        btnThem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

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
        model.addRow(new Object[]{
            tenMon, btnTru, soLuongThem, btnThem, gia, btnXoa
        });
        btnLuu.setEnabled(true);
    }

    // update tình trạng bàn chơi
    public static void updateStatus(String tenBan) {
        DAL.DAL_Ban.Updatesttbyname(tenBan);
    }

    // update tình trạng bàn về trống 
    public static void updateBanVeTrong(String tenBan) {
        DAL.DAL_Ban.Updatesttis0byname(tenBan);
    }

    // load cbb 
    public static void loadComboBoxLoaiBan(JComboBox cbb, ArrayList<LoaiBan> arr) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbb.getModel();
        model.removeAllElements();
        for (LoaiBan loaiBan : arr) {
            Object value = loaiBan.getMaLoaiBan();   //Lưu vào database
            Object text = loaiBan.getTenLoaiBan();
            MyComboBox myCbb = new MyComboBox(value, text);
            model.addElement(myCbb);
        }
    }

    public static void loadComboBoxKhuVuc(JComboBox cbb, ArrayList<KhuVuc> arr) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbb.getModel();
        model.removeAllElements();
        for (KhuVuc khuVuc : arr) {
            Object value = khuVuc.getMaKhuVuc();   //Lưu vào database
            Object text = khuVuc.getTenKhuvuc();
            MyComboBox myCbb = new MyComboBox(value, text);
            model.addElement(myCbb);
        }
    }

    public static void loadComboBoxKhuyenMai(JComboBox cbb, ArrayList<KhuyenMai> arr) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbb.getModel();

        for (KhuyenMai khuyenMai : arr) {
            Object value = khuyenMai.getMaKhuyenMai();   //Lưu vào database
            Object text = khuyenMai.getTenKhuyenMai();
            MyComboBox myCbb = new MyComboBox(value, text);
            model.addElement(myCbb);
        }
    }

//    public static void loadComboBoxtest(JComboBox cbb) {
//        String[] data = {"Khu vực 1", "Khu vực 2"};
//        DefaultComboBoxModel model = (DefaultComboBoxModel) cbb.getModel();
//        model.addElement(data);
//        cbb.setModel(model);
//    }
    public static void delete(JPanel jPanel) {
        SwingUtilities.updateComponentTreeUI(jPanel);
    }

    // load ten bàn 
    public void loadTenVaBang(JTextField field, JTable jTable) {
        field.setText(tenban);
    }

    public static void loadBanTheoCBB(JComboBox cbbKhuVuc, JComboBox cbbLoaiBan) {
        int indexItemCBBKhuVuc = cbbKhuVuc.getSelectedIndex();
        int indexItemCBBLoaiBan = cbbKhuVuc.getSelectedIndex();
        if (indexItemCBBKhuVuc != -1 && indexItemCBBLoaiBan == -1) {
            System.out.println("load bàn theo loại bàn");
        } else if (indexItemCBBKhuVuc == -1 && indexItemCBBLoaiBan != -1) {
            System.out.println("load bàn theo khu vực");

        } else {
            System.out.println("load bàn theo loại bàn và khu vực");

        }
    }
    // load tbl san pham

    public void DoVaoTable(ArrayList<DoDung> arr, JTable tbl) {
        JButton btnThem = new JButton();
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/IMG/icons8-plus-16.png"));

        btnThem.setIcon(imageIcon);
        btnThem.setOpaque(true);
        btnThem.setBackground(Color.white);
        btnThem.setFocusPainted(false);
        btnThem.setFocusable(false);
        btnThem.setBorder(null);
        btnThem.setBorderPainted(false);

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.setRowCount(0);
        for (DoDung dd : arr) {
            Object obj[] = new Object[10];
            obj[0] = dd.getTenDoDung();
            obj[1] = Transform.SoString(dd.getGiaBan());
            obj[2] = dd.getHinhAnh();
            model.addRow(obj);
        }

    }

    // load bàn bên chuyển bàn
    public void loadBanDangChoi(JPanel jpanel, JButton btn1, ArrayList<Ban> arrBan) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/IMG/icons8-pool-table-96.png"));
        int i = 0;
        for (Ban ban : arrBan) {

            if (ban.getTinhTrang().equals("1")) {
                JButton button = new JButton();
                button.setFocusPainted(false);
                button.setBorderPainted(false);
                button.setText(ban.getTenBan());
                button.setFont(new Font("Segoe UI", Font.BOLD, 14));
                button.setForeground(Color.white);
                String ten = button.getText();
                button.setPreferredSize(new Dimension(106, 60));
                button.setBackground(new Color(227, 91, 90));
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        btn1.setText(ten);
                        btn1.setBackground(new Color(227, 91, 90));
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

    //load bàn đã đặt
    public void loadDaDat(JPanel jpanel, JButton btn1, ArrayList<Ban> arr) {
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
                    }
                });
                button.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (e.getButton() == MouseEvent.BUTTON1) {
                            ArrayList<Ban> arrBanCu = BLLOrder.findTableByName(ten);
                            int maBanCu = arrBanCu.get(0).getMaBan();

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

    // đóng giao jdl chuyển bàn, đặt bàn
    public static void dong(JDialog dialog, JButton btn) {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
    }

    /// lịch sử thanh toán
    public static void loadLichSuThanhToan(int maNgay, JTable jtable) {

        ResultSet rs = DAL.DALHoaDon.GetHistoryHDByDay();
        if (maNgay == 1) {
            rs = DAL.DALHoaDon.GetHistoryHDByMonth();
        } else if (maNgay == 2) {
            rs = DAL.DALHoaDon.GetHistoryHDByYear();
        }
        String[] headerTable = {"Mã hóa đơn", "Ngày vào", "Ngày ra", "Mã nhân viên", "Tên bàn", "Loại bàn", "Khu vực", "Tổng tiền"};
        DefaultTableModel tbModel = (DefaultTableModel) jtable.getModel();
        tbModel.setRowCount(0);
        tbModel.setColumnIdentifiers(headerTable);
        try {
            while (rs.next()) {
                Object obj[] = new Object[8];
                obj[0] = rs.getString(1);
                obj[1] = rs.getString(2);
                obj[2] = rs.getString(3);
                obj[3] = rs.getString(4);
                obj[4] = rs.getString(5);
                obj[5] = rs.getString(6);
                obj[6] = rs.getString(7);
                obj[7] = rs.getString(8);
                tbModel.addRow(obj);
            }
        } catch (Exception e) {
        }

    }

}
