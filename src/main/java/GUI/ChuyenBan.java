/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BLL.BLLBan;
import BLL.BLLHoaDon;
import BLL.BLLKhac;
import BLL.BLLOrder;
import DTO.Ban;
import DTO.HoaDon;
import DTO.KhuVuc;
import DTO.LoaiBan;
import EXTENDED.Caution;
import EXTENDED.MyComboBox;
import static GUI.DatBan.loadCBBLoaiaBanOKs;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author dell 7559
 */
public class ChuyenBan extends javax.swing.JPanel {

    /**
     * Creates new form ChuyenBan
     */
    public ChuyenBan() {
        initComponents();
        loadCBBKhuVuc();
        loadCBBLoaiBan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnChuyenBan = new javax.swing.JButton();
        btnXong = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CBBKhuVucBanDangChoi = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        CBBLoaiBanDangChoi = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpnDangChoi = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        CBBLoaiBanDangTrong = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        CBBKhuVucBanDangTrong = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jpnBanDangTrong = new javax.swing.JPanel();

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel5.setPreferredSize(new java.awt.Dimension(567, 48));

        btnChuyenBan.setBackground(new java.awt.Color(204, 0, 51));
        btnChuyenBan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChuyenBan.setForeground(new java.awt.Color(255, 255, 255));
        btnChuyenBan.setText("Chuyển bàn");
        btnChuyenBan.setBorderPainted(false);
        btnChuyenBan.setOpaque(true);
        btnChuyenBan.setPreferredSize(new java.awt.Dimension(100, 36));
        btnChuyenBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenBanActionPerformed(evt);
            }
        });
        jPanel5.add(btnChuyenBan);

        btnXong.setBackground(new java.awt.Color(0, 153, 51));
        btnXong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXong.setForeground(new java.awt.Color(255, 255, 255));
        btnXong.setText("Xong");
        btnXong.setBorderPainted(false);
        btnXong.setOpaque(true);
        btnXong.setPreferredSize(new java.awt.Dimension(100, 36));
        btnXong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXongActionPerformed(evt);
            }
        });
        jPanel5.add(btnXong);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Chuyển");

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Chọn bàn chuyển");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        btn2.setBorderPainted(false);
        btn2.setFocusPainted(false);
        btn2.setOpaque(true);
        jPanel7.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 70));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Chọn bài cần chuyển");
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        btn1.setBorderPainted(false);
        btn1.setFocusPainted(false);
        btn1.setOpaque(true);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel8.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 114, 68));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.setPreferredSize(new java.awt.Dimension(455, 389));

        jLabel5.setText("Khu vực : ");

        CBBKhuVucBanDangChoi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBBKhuVucBanDangChoiItemStateChanged(evt);
            }
        });

        jLabel6.setText("Loại bàn : ");

        CBBLoaiBanDangChoi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBBLoaiBanDangChoiItemStateChanged(evt);
            }
        });

        jLabel10.setText("Bàn đang chơi");

        jpnDangChoi.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPane1.setViewportView(jpnDangChoi);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBBKhuVucBanDangChoi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(CBBLoaiBanDangChoi, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CBBKhuVucBanDangChoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(CBBLoaiBanDangChoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        CBBLoaiBanDangTrong.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBBLoaiBanDangTrongItemStateChanged(evt);
            }
        });

        jLabel7.setText("Khu vực : ");

        CBBKhuVucBanDangTrong.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBBKhuVucBanDangTrongItemStateChanged(evt);
            }
        });

        jLabel8.setText("Loại bàn : ");

        jLabel9.setText("Bàn đang trống");

        jpnBanDangTrong.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jScrollPane2.setViewportView(jpnBanDangTrong);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBBKhuVucBanDangTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(CBBLoaiBanDangTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CBBKhuVucBanDangTrong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(CBBLoaiBanDangTrong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    static boolean loadCBBLoaiaBanOKs = false;
    public void loadCBBLoaiBan() {
        ArrayList<LoaiBan> list = BLLKhac.GetAllLoaiBan();
        BLLOrder.loadComboBoxLoaiBan(CBBLoaiBanDangChoi, list);
        BLLOrder.loadComboBoxLoaiBan(CBBLoaiBanDangTrong, list);
    }

    public void loadCBBKhuVuc() {
        ArrayList<KhuVuc> list = BLLKhac.GetAllKhuVuc();
        BLLOrder.loadComboBoxKhuVuc(CBBKhuVucBanDangChoi, list);
        BLLOrder.loadComboBoxKhuVuc(CBBKhuVucBanDangTrong, list);
        MyComboBox cbbKhuVuc = (MyComboBox) CBBKhuVucBanDangTrong.getSelectedItem();
        System.out.println(cbbKhuVuc.MaInt());
        loadCBBLoaiaBanOKs = true;
    }
    private void btnChuyenBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenBanActionPerformed
        // TODO add your handling code here:
        String tenBanCu = btn1.getText();
        String tenBanMoi = btn2.getText();

        if (tenBanMoi.equals("")) {
            return;
        }
        if (tenBanCu.equals("")) {
            return;
        }
        ArrayList<Ban> arrBanCu = BLLOrder.findTableByName(tenBanCu);
        int maBanCu = arrBanCu.get(0).getMaBan();
        ArrayList<Ban> arrBanMoi = BLLOrder.findTableByName(tenBanMoi);
        int maBanMoi = arrBanMoi.get(0).getMaBan();

        ArrayList<HoaDon> arrHoaDon = BLLHoaDon.getAllDataByTinhTrang(maBanCu);
        int maHoaDon = arrHoaDon.get(0).getMaHoaDon();

        BLLHoaDon.chuyenBan(maHoaDon, maBanMoi);
        jpnDangChoi.removeAll();
        jpnBanDangTrong.removeAll();

        BLLBan.updateTinhTrangBan(maBanCu, "0");
        BLLBan.updateTinhTrangBan(maBanMoi, "1");
        MyComboBox cbbKhuVucDangChoi = (MyComboBox) CBBKhuVucBanDangChoi.getSelectedItem();
        if (CBBKhuVucBanDangChoi == null) {
            return;
        }
        int maKhuVucDangChoi = cbbKhuVucDangChoi.MaInt();
        if (!loadCBBLoaiaBanOKs) {
            return;
        }
        MyComboBox cbbLoaiBanDangChoi = (MyComboBox) CBBLoaiBanDangChoi.getSelectedItem();
        if (cbbLoaiBanDangChoi == null) {
            return;
        }
        int maLoaiBanDangChoi = cbbLoaiBanDangChoi.MaInt();
        ArrayList<Ban> listDangChoi = BLLBan.timBanTheoMaLoaiVaKhuVuc(maKhuVucDangChoi, maLoaiBanDangChoi);

        new BLLOrder().loadBanDangChoi(jpnDangChoi, btn1, listDangChoi);
        
        MyComboBox cbbKhuVuc = (MyComboBox) CBBKhuVucBanDangTrong.getSelectedItem();
        if (CBBKhuVucBanDangTrong == null) {
            return;
        }
        int maKhuVuc = cbbKhuVuc.MaInt();
        if (!loadCBBLoaiaBanOKs) {
            return;
        }
        MyComboBox cbbLoaiBan = (MyComboBox) CBBLoaiBanDangTrong.getSelectedItem();
        if (cbbLoaiBan == null) {
            return;
        }
        int maLoaiBan = cbbLoaiBan.MaInt();
        ArrayList<Ban> list = BLLBan.timBanTheoMaLoaiVaKhuVuc(maKhuVuc, maLoaiBan);
        new BLLOrder().loadBanDangTrong(jpnBanDangTrong, btn2, list);
        SwingUtilities.updateComponentTreeUI(jpnDangChoi);
        SwingUtilities.updateComponentTreeUI(jpnBanDangTrong);
        btn1.setText("");
        btn1.setBackground(null);
        btn2.setText("");
        btn2.setBackground(null);

        Caution.ThongBaoCoIcon("Thông báo", "Chuyển bàn thành công ", 1);
        Order.updateBan = true;
    }//GEN-LAST:event_btnChuyenBanActionPerformed

    private void btnXongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXongActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void CBBKhuVucBanDangChoiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBBKhuVucBanDangChoiItemStateChanged
        // TODO add your handling code here:
        jpnDangChoi.removeAll();
        MyComboBox cbbKhuVuc = (MyComboBox) CBBKhuVucBanDangChoi.getSelectedItem();
        if (CBBKhuVucBanDangChoi == null) {
            return;
        }
        int maKhuVuc = cbbKhuVuc.MaInt();
        if (!loadCBBLoaiaBanOKs) {
            return;
        }
        MyComboBox cbbLoaiBan = (MyComboBox) CBBLoaiBanDangChoi.getSelectedItem();
        if (cbbLoaiBan == null) {
            return;
        }
        int maLoaiBan = cbbLoaiBan.MaInt();
        ArrayList<Ban> list = BLLBan.timBanTheoMaLoaiVaKhuVuc(maKhuVuc, maLoaiBan);
        new BLLOrder().loadBanDangChoi(jpnDangChoi, btn1, list);

        SwingUtilities.updateComponentTreeUI(jpnDangChoi);
    }//GEN-LAST:event_CBBKhuVucBanDangChoiItemStateChanged

    private void CBBLoaiBanDangChoiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBBLoaiBanDangChoiItemStateChanged
        jpnDangChoi.removeAll();

        MyComboBox cbbLoaiBan = (MyComboBox) CBBLoaiBanDangChoi.getSelectedItem();
        if (CBBLoaiBanDangChoi == null) {
            return;
        }
        MyComboBox cbbKhuVuc = (MyComboBox) CBBKhuVucBanDangChoi.getSelectedItem();
        int maLoaiBan = cbbLoaiBan.MaInt();
        int maKhuVuc = cbbKhuVuc.MaInt();
        ArrayList<Ban> list = BLLBan.timBanTheoMaLoaiVaKhuVuc(maKhuVuc, maLoaiBan);
        new BLLOrder().loadBanDangChoi(jpnDangChoi, btn1, list);
        SwingUtilities.updateComponentTreeUI(jpnDangChoi);        // TODO add your handling code here:
    }//GEN-LAST:event_CBBLoaiBanDangChoiItemStateChanged

    private void CBBKhuVucBanDangTrongItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBBKhuVucBanDangTrongItemStateChanged
        // TODO add your handling code here:
        jpnBanDangTrong.removeAll();
        MyComboBox cbbKhuVuc = (MyComboBox) CBBKhuVucBanDangTrong.getSelectedItem();
        if (CBBKhuVucBanDangTrong == null) {
            return;
        }
        int maKhuVuc = cbbKhuVuc.MaInt();
        if (!loadCBBLoaiaBanOKs) {
            return;
        }
        MyComboBox cbbLoaiBan = (MyComboBox) CBBLoaiBanDangTrong.getSelectedItem();
        if (cbbLoaiBan == null) {
            return;
        }
        int maLoaiBan = cbbLoaiBan.MaInt();
        ArrayList<Ban> list = BLLBan.timBanTheoMaLoaiVaKhuVuc(maKhuVuc, maLoaiBan);
        new BLLOrder().loadBanDangTrong(jpnBanDangTrong, btn2, list);
        SwingUtilities.updateComponentTreeUI(jpnBanDangTrong);
    }//GEN-LAST:event_CBBKhuVucBanDangTrongItemStateChanged

    private void CBBLoaiBanDangTrongItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBBLoaiBanDangTrongItemStateChanged
        // TODO add your handling code here:
        jpnBanDangTrong.removeAll();

        MyComboBox cbbLoaiBan = (MyComboBox) CBBLoaiBanDangTrong.getSelectedItem();
        if (CBBLoaiBanDangTrong == null) {
            return;
        }
        MyComboBox cbbKhuVuc = (MyComboBox) CBBKhuVucBanDangTrong.getSelectedItem();
        int maLoaiBan = cbbLoaiBan.MaInt();
        int maKhuVuc = cbbKhuVuc.MaInt();
        ArrayList<Ban> list = BLLBan.timBanTheoMaLoaiVaKhuVuc(maKhuVuc, maLoaiBan);
        new BLLOrder().loadBanDangTrong(jpnBanDangTrong, btn2, list);
        SwingUtilities.updateComponentTreeUI(jpnBanDangTrong);
    }//GEN-LAST:event_CBBLoaiBanDangTrongItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBBKhuVucBanDangChoi;
    private javax.swing.JComboBox<String> CBBKhuVucBanDangTrong;
    private javax.swing.JComboBox<String> CBBLoaiBanDangChoi;
    private javax.swing.JComboBox<String> CBBLoaiBanDangTrong;
    public javax.swing.JButton btn1;
    public javax.swing.JButton btn2;
    private javax.swing.JButton btnChuyenBan;
    public javax.swing.JButton btnXong;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JPanel jpnBanDangTrong;
    public javax.swing.JPanel jpnDangChoi;
    // End of variables declaration//GEN-END:variables
}