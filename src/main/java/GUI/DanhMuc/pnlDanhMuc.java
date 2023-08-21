/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.DanhMuc;

import static BLL.BLLKhac.bientry;
import GUI.QLNhanVien.jdlThemNhanVien;
import GUI.QLNhanVien.pnlNhanVien;
import EXTENDED.Caution;
import static GUI.DanhMuc.pnlDoDung.LoadDoDung;
import static GUI.DanhMuc.pnlDoDung.MaDoDung;
import static GUI.DanhMuc.pnlDoDung.StatusDoDung;
import static GUI.DanhMuc.pnlDoDung.tbdodung;
import static GUI.DanhMuc.pnlKhac.LoadKhac;
import static GUI.DanhMuc.pnlKhac.TenKhacTuCBX;
import static GUI.DanhMuc.pnlKhac.TenKhacTuTable;
import static GUI.DanhMuc.pnlKhac.tbchung;
import static GUI.DanhMuc.pnlThietBi.LoadThietBi;
import static GUI.DanhMuc.pnlThietBi.MaThietBi;
import static GUI.QLNhanVien.pnlNhanVien.loadnhanvien;
import static GUI.QLNhanVien.pnlNhanVien.manhanvien;
import static GUI.QLNhanVien.pnlNhanVien.tbnhanvien;
import static GUI.QLNhanVien.pnlNhanVien.chucvunv;
import GUI.HomeScreen;
import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JDialog;

/**
 *
 * @author ADMIN
 */
public class pnlDanhMuc extends javax.swing.JPanel {

    /**
     * Creates new form pnlDanhMuc
     */
    public pnlDanhMuc() {
        initComponents();
        setBackground(Color.white);
        pnlbtncon.setVisible(false);
    }

    public void backgroundColor() {
        btnnhanvien.setBackground(new Color(240, 240, 240));
        btnkhac.setBackground(new Color(240, 240, 240));
        btndodung.setBackground(new Color(240, 240, 240));
        btnthietbi.setBackground(new Color(240, 240, 240));
    }

    public void changecolormoved(JButton btn) {
        if (!btn.getBackground().equals(new Color(63, 213, 192))) {
            btn.setBackground(new Color(1, 177, 189));
        }
    }
    Color color = new Color(240, 240, 240);

    public void changecolorexit(JButton btn) {
        if (!btn.getBackground().equals(new Color(63, 213, 192))) {
            btn.setBackground(color);
        }

    }

    public static void pnlbtncon(int a, JDialog dlg, JButton btn1, JButton btn2, JButton btn3) {
        switch (a) {
            case 4:
                pnlbtncon.setVisible(true);
                btn1.removeMouseListener(btn1.getMouseListeners()[0]);
                btn1.addMouseListener(new java.awt.event.MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        dlg.setVisible(true);

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
                btn3.removeMouseListener(btn3.getMouseListeners()[0]);
                btn3.addMouseListener(new java.awt.event.MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (MaThietBi == 0) {
                            Caution.ThongBaoDonGian("Thông báo", "Vui lòng chọn đối tượng");
                        } else {
                            if (Caution.ThongBaoYesNo()) {
                                int cacDongCanXoa[] = pnlThietBi.tbthietbi.getSelectedRows();
                                for (int i = 0; i < cacDongCanXoa.length; i++) {
                                    int IdSanPham = Integer.parseInt(pnlThietBi.tbthietbi.getValueAt(cacDongCanXoa[i], 1).toString());
                                        BLL.BLLThietBi.XoaThietBi(IdSanPham);
                                        LoadThietBi();
                                        MaThietBi = 0;
                                        Caution.ThongBaoDonGian("Thông báo", "Thành công");
                                }

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
                break;
            case 3:
                pnlbtncon.setVisible(true);
                btn1.removeMouseListener(btn1.getMouseListeners()[0]);
                btn1.addMouseListener(new java.awt.event.MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        dlg.setVisible(true);

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
                btn3.removeMouseListener(btn3.getMouseListeners()[0]);
                btn3.addMouseListener(new java.awt.event.MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (manhanvien == 0) {
                            Caution.ThongBaoDonGian("Thông báo", "Vui lòng chọn đối tượng");
                        } else {
                            if (Caution.ThongBaoYesNo()) {
                                int cacDongCanXoa[] = tbnhanvien.getSelectedRows();
                                for (int i = 0; i < cacDongCanXoa.length; i++) {
                                    int IdSanPham = Integer.parseInt(tbnhanvien.getValueAt(cacDongCanXoa[i], 1).toString());
                                    if (chucvunv.equals("Admin")) {
                                        Caution.ThongBaoDonGian("Thông báo", "Không thể xóa Admin");
                                    } else {
                                        BLL.BLLNhanVien.delete(IdSanPham);
                                        loadnhanvien();
                                        manhanvien = 0;
                                        chucvunv = "";
                                        Caution.ThongBaoDonGian("Thông báo", "Thành công");
                                    }

                                }

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
                break;
            case 2:
                pnlbtncon.setVisible(true);
                btn1.removeMouseListener(btn1.getMouseListeners()[0]);
                btn1.addMouseListener(new java.awt.event.MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        dlg.setVisible(true);

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
                btn3.removeMouseListener(btn3.getMouseListeners()[0]);
                btn3.addMouseListener(new java.awt.event.MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {

                        if (TenKhacTuTable.equals("")) {
                            Caution.ThongBaoDonGian("Thông báo", "Vui lòng chọn đối tượng");
                        } else {
                            if (Caution.ThongBaoYesNo()) {
                                int cacDongCanXoa[] = tbchung.getSelectedRows();
                                for (int i = 0; i < cacDongCanXoa.length; i++) {
                                    if (TenKhacTuCBX.equals("Khuyến mãi")) {
                                        int IdSanPham = Integer.parseInt(tbchung.getValueAt(cacDongCanXoa[i], 1).toString());
                                        BLL.BLLKhac.XoaKhuyenMai(IdSanPham);
                                        TenKhacTuTable = "";
                                    }
                                    if (TenKhacTuCBX.equals("Loại đồ dùng")) {
                                        String IdSanPham = (tbchung.getValueAt(cacDongCanXoa[i], 1).toString());
                                        BLL.BLLKhac.XoaLoaiDoDung(IdSanPham);
                                        TenKhacTuTable = "";
                                    }
                                    if (TenKhacTuCBX.equals("Chức vụ")) {
                                        String IdSanPham = (tbchung.getValueAt(cacDongCanXoa[i], 1).toString());
                                        BLL.BLLKhac.XoaChucVu(IdSanPham);
                                        TenKhacTuTable = "";
                                    }
                                    if (TenKhacTuCBX.equals("Khu vực")) {
                                        String IdSanPham = (tbchung.getValueAt(cacDongCanXoa[i], 1).toString());
                                        BLL.BLLKhac.XoaKhuVuc(IdSanPham);
                                        TenKhacTuTable = "";
                                    }
                                    if (TenKhacTuCBX.equals("Đơn vị tính")) {
                                        String IdSanPham = (tbchung.getValueAt(cacDongCanXoa[i], 1).toString());
                                        BLL.BLLKhac.XoaDVT(IdSanPham);
                                        TenKhacTuTable = "";
                                    }
                                    if (TenKhacTuCBX.equals("Loại bàn")) {
                                        String IdSanPham = (tbchung.getValueAt(cacDongCanXoa[i], 1).toString());
                                        BLL.BLLKhac.XoaLoaiBan(IdSanPham);
                                        TenKhacTuTable = "";
                                    }

                                }
                                if (bientry) {
                                    Caution.ThongBaoDonGian("Thông báo", "Thành công");
                                    LoadKhac();
                                    bientry = false;
                                }

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
                break;
            case 1:
                pnlbtncon.setVisible(true);
                btn1.removeMouseListener(btn1.getMouseListeners()[0]);
                btn1.addMouseListener(new java.awt.event.MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        dlg.setVisible(true);
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
                btn3.removeMouseListener(btn3.getMouseListeners()[0]);
                btn3.addMouseListener(new java.awt.event.MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (MaDoDung == 0) {
                            Caution.ThongBaoDonGian("Thông báo", "Vui lòng chọn đối tượng");
                        } else {
                            if (Caution.ThongBaoYesNo()) {
                                int cacDongCanXoa[] = tbdodung.getSelectedRows();
                                for (int i = 0; i < cacDongCanXoa.length; i++) {
                                    int IdSanPham = Integer.parseInt(tbdodung.getValueAt(cacDongCanXoa[i], 1).toString());
                                    if (!StatusDoDung) {
                                        BLL.BLLDoDung.XoaDoDung(IdSanPham, StatusDoDung);
                                        Caution.ThongBaoDonGian("Thông báo", "Thành công");
                                        MaDoDung = 0;
                                    } else {
                                        Caution.ThongBaoDonGian("Thông báo", "Không thể xóa đồ dùng đang sử dụng");
                                    }
                                }

                                LoadDoDung();
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
                break;
            default:
                throw new AssertionError();
        }
    }
    public static int a = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnnhanvien = new javax.swing.JButton();
        btndodung = new javax.swing.JButton();
        btnthietbi = new javax.swing.JButton();
        btnkhac = new javax.swing.JButton();
        pnlbutton = new javax.swing.JPanel();
        pnlbtncon = new javax.swing.JPanel();
        pnlxoa = new javax.swing.JPanel();
        btndelete = new javax.swing.JButton();
        pnlxuat = new javax.swing.JPanel();
        btnxuatds = new javax.swing.JButton();
        pnlthem = new javax.swing.JPanel();
        btnthem = new javax.swing.JButton();
        pnldanhmucchung = new javax.swing.JPanel();

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(1, 1, 5, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(1, 1));

        btnnhanvien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnnhanvien.setForeground(new java.awt.Color(51, 51, 51));
        btnnhanvien.setText("Nhân Viên");
        btnnhanvien.setBorderPainted(false);
        btnnhanvien.setFocusPainted(false);
        btnnhanvien.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnnhanvienMouseMoved(evt);
            }
        });
        btnnhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnnhanvienMouseExited(evt);
            }
        });
        btnnhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhanvienActionPerformed(evt);
            }
        });
        jPanel2.add(btnnhanvien);

        btndodung.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndodung.setForeground(new java.awt.Color(51, 51, 51));
        btndodung.setText("Đồ dùng");
        btndodung.setBorderPainted(false);
        btndodung.setFocusPainted(false);
        btndodung.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btndodungMouseMoved(evt);
            }
        });
        btndodung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndodungMouseExited(evt);
            }
        });
        btndodung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndodungActionPerformed(evt);
            }
        });
        jPanel2.add(btndodung);

        btnthietbi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnthietbi.setForeground(new java.awt.Color(51, 51, 51));
        btnthietbi.setText("Thiết bị");
        btnthietbi.setBorderPainted(false);
        btnthietbi.setFocusPainted(false);
        btnthietbi.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnthietbiMouseMoved(evt);
            }
        });
        btnthietbi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnthietbiMouseExited(evt);
            }
        });
        btnthietbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthietbiActionPerformed(evt);
            }
        });
        jPanel2.add(btnthietbi);

        btnkhac.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnkhac.setForeground(new java.awt.Color(51, 51, 51));
        btnkhac.setText("Khác");
        btnkhac.setBorderPainted(false);
        btnkhac.setFocusPainted(false);
        btnkhac.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnkhacMouseMoved(evt);
            }
        });
        btnkhac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnkhacMouseExited(evt);
            }
        });
        btnkhac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkhacActionPerformed(evt);
            }
        });
        jPanel2.add(btnkhac);

        jPanel1.add(jPanel2);

        pnlbtncon.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btndelete.setBackground(new java.awt.Color(227, 91, 90));
        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/bin.png"))); // NOI18N
        btndelete.setText("Xóa danh sách");
        btndelete.setBorderPainted(false);
        btndelete.setFocusPainted(false);
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlxoaLayout = new javax.swing.GroupLayout(pnlxoa);
        pnlxoa.setLayout(pnlxoaLayout);
        pnlxoaLayout.setHorizontalGroup(
            pnlxoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btndelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );
        pnlxoaLayout.setVerticalGroup(
            pnlxoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlxoaLayout.createSequentialGroup()
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlbtncon.add(pnlxoa);

        btnxuatds.setBackground(new java.awt.Color(27, 188, 155));
        btnxuatds.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnxuatds.setForeground(new java.awt.Color(255, 255, 255));
        btnxuatds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/bin.png"))); // NOI18N
        btnxuatds.setText("Xuất danh sách");
        btnxuatds.setBorderPainted(false);
        btnxuatds.setFocusPainted(false);

        javax.swing.GroupLayout pnlxuatLayout = new javax.swing.GroupLayout(pnlxuat);
        pnlxuat.setLayout(pnlxuatLayout);
        pnlxuatLayout.setHorizontalGroup(
            pnlxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnxuatds, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );
        pnlxuatLayout.setVerticalGroup(
            pnlxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlxuatLayout.createSequentialGroup()
                .addComponent(btnxuatds, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlbtncon.add(pnlxuat);

        btnthem.setBackground(new java.awt.Color(27, 188, 155));
        btnthem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnthem.setForeground(new java.awt.Color(255, 255, 255));
        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/bin.png"))); // NOI18N
        btnthem.setText("Tạo mới");
        btnthem.setBorderPainted(false);
        btnthem.setFocusPainted(false);
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlthemLayout = new javax.swing.GroupLayout(pnlthem);
        pnlthem.setLayout(pnlthemLayout);
        pnlthemLayout.setHorizontalGroup(
            pnlthemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );
        pnlthemLayout.setVerticalGroup(
            pnlthemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlthemLayout.createSequentialGroup()
                .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlbtncon.add(pnlthem);

        javax.swing.GroupLayout pnlbuttonLayout = new javax.swing.GroupLayout(pnlbutton);
        pnlbutton.setLayout(pnlbuttonLayout);
        pnlbuttonLayout.setHorizontalGroup(
            pnlbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbuttonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlbtncon, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlbuttonLayout.setVerticalGroup(
            pnlbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlbuttonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlbtncon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnlbutton);

        jToolBar1.add(jPanel1);

        pnldanhmucchung.setLayout(new javax.swing.BoxLayout(pnldanhmucchung, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnldanhmucchung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnldanhmucchung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed

    }//GEN-LAST:event_btnthemActionPerformed

    private void btnnhanvienMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnhanvienMouseMoved
        // TODO add your handling code here:
        changecolormoved(btnnhanvien);
    }//GEN-LAST:event_btnnhanvienMouseMoved

    private void btnnhanvienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnhanvienMouseExited
        // TODO add your handling code here:
        changecolorexit(btnnhanvien);
    }//GEN-LAST:event_btnnhanvienMouseExited

    private void btndodungMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndodungMouseMoved
        // TODO add your handling code here:
        changecolormoved(btndodung);
    }//GEN-LAST:event_btndodungMouseMoved

    private void btndodungMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndodungMouseExited
        // TODO add your handling code here:
        changecolorexit(btndodung);
    }//GEN-LAST:event_btndodungMouseExited

    private void btndodungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndodungActionPerformed
        backgroundColor();
        btndodung.setBackground(new Color(63, 213, 192));
        pnlDoDung pnldodung = new pnlDoDung();
        pnldanhmucchung.removeAll();
        pnldanhmucchung.add(pnldodung);
        pnldanhmucchung.validate();
        a = 1;
        jdlThemDoDung themdodung = new jdlThemDoDung(new HomeScreen(), true);
        pnlbtncon(a, themdodung, btnthem, btnxuatds, btndelete);
        MaDoDung = 0;
    }//GEN-LAST:event_btndodungActionPerformed

    private void btnkhacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhacActionPerformed
        backgroundColor();
        btnkhac.setBackground(new Color(63, 213, 192));
        pnlKhac pnkhac = new pnlKhac();
        pnldanhmucchung.removeAll();
        pnldanhmucchung.add(pnkhac);
        pnldanhmucchung.validate();
        a = 2;
        jdlthemkhac khac = new jdlthemkhac(new HomeScreen(), true);
        pnlbtncon(a, khac, btnthem, btnxuatds, btndelete);
        TenKhacTuTable = "";
    }//GEN-LAST:event_btnkhacActionPerformed

    private void btnnhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhanvienActionPerformed
        backgroundColor();
        btnnhanvien.setBackground(new Color(63, 213, 192));
        pnlNhanVien nhanvien = new pnlNhanVien();
        pnldanhmucchung.removeAll();
        pnldanhmucchung.add(nhanvien);
        pnldanhmucchung.validate();
        a = 3;
        jdlThemNhanVien themnhanvien = new jdlThemNhanVien(new HomeScreen(), true);
        pnlbtncon(a, themnhanvien, btnthem, btnxuatds, btndelete);
        manhanvien = 0;
    }//GEN-LAST:event_btnnhanvienActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnkhacMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkhacMouseMoved
        changecolormoved(btnkhac);
    }//GEN-LAST:event_btnkhacMouseMoved

    private void btnkhacMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkhacMouseExited
        changecolorexit(btnkhac);
    }//GEN-LAST:event_btnkhacMouseExited

    private void btnthietbiMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthietbiMouseMoved
        changecolormoved(btnthietbi);
    }//GEN-LAST:event_btnthietbiMouseMoved

    private void btnthietbiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthietbiMouseExited
        changecolorexit(btnthietbi);
    }//GEN-LAST:event_btnthietbiMouseExited

    private void btnthietbiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthietbiActionPerformed
        backgroundColor();
        btnthietbi.setBackground(new Color(63, 213, 192));
        pnlThietBi thietbi = new pnlThietBi();
        pnldanhmucchung.removeAll();
        pnldanhmucchung.add(thietbi);
        pnldanhmucchung.validate();
        a = 4;
        jdlThemThietBi themtb = new jdlThemThietBi(new HomeScreen(), true);
        pnlbtncon(a, themtb, btnthem, btnxuatds, btndelete);
        MaThietBi=0;
    }//GEN-LAST:event_btnthietbiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btndelete;
    private javax.swing.JButton btndodung;
    private javax.swing.JButton btnkhac;
    private javax.swing.JButton btnnhanvien;
    public static javax.swing.JButton btnthem;
    private javax.swing.JButton btnthietbi;
    public static javax.swing.JButton btnxuatds;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JPanel pnlbtncon;
    private javax.swing.JPanel pnlbutton;
    private javax.swing.JPanel pnldanhmucchung;
    private javax.swing.JPanel pnlthem;
    private javax.swing.JPanel pnlxoa;
    private javax.swing.JPanel pnlxuat;
    // End of variables declaration//GEN-END:variables
}
