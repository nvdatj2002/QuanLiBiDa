/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.BLLNhanVien;
import GUI.DanhMuc.pnlDanhMuc;
import EXTENDED.sqlConnect;
import GUI.Chi.pnlChi;
import GUI.Nhap.pnlNhap;
import GUI.QLBan.pnlQLBan;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRootPane;

/**
 *
 * @author ADMIN
 */
public class HomeScreen extends javax.swing.JFrame {

    public HomeScreen() {
        sqlConnect.openConnection();
        setUndecorated(true);
        initComponents();
        lbactor.setText(BLLNhanVien.GetAccountNhanVien().getTenNhanvien());
//        this.setExtendedState(HomeScreen.MAXIMIZED_BOTH);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        getContentPane().setBackground(Color.white);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        disablebutton();
    }

    public void backgroundColor() {
        btntongquan.setBackground(null);
        btnban.setBackground(null);
        btnorder.setBackground(null);
        btndanhmuc.setBackground(null);
        btnthu.setBackground(null);
        btnchi.setBackground(null);
        btnlogout.setBackground(null);
    }

    public void disablebutton() {
        if (BLL.BLLKhac.loadTenChucVu(BLLNhanVien.GetAccountNhanVien().getChucVu()).equals("Kế toán")) {
//            btntongquan.setEnabled(false);
            btndanhmuc.setEnabled(false);
            btnban.setEnabled(false);
//            btnthu.setEnabled(false);
//            btnchi.setEnabled(false);
        }
    }

    public void changecolormoved(JButton btn) {
        if (!btn.getBackground().equals(new Color(63, 213, 192))) {
            btn.setBackground(new Color(1, 177, 189));
        }
    }

    public void changecolorexit(JButton btn) {
        if (!btn.getBackground().equals(new Color(63, 213, 192))) {
            btn.setBackground(color);
        }
    }

    Color color = new Color(204, 204, 204);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbminimize = new javax.swing.JButton();
        lbicon = new javax.swing.JLabel();
        lbexit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnlmenu = new javax.swing.JPanel();
        btntongquan = new javax.swing.JButton();
        btnorder = new javax.swing.JButton();
        btnban = new javax.swing.JButton();
        btndanhmuc = new javax.swing.JButton();
        btnthu = new javax.swing.JButton();
        btnchi = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbactor = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        pnltongquan = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(0, 0));

        lbminimize.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lbminimize.setForeground(new java.awt.Color(255, 0, 51));
        lbminimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-subtract-16.png"))); // NOI18N
        lbminimize.setBorderPainted(false);
        lbminimize.setFocusPainted(false);
        lbminimize.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbminimize.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbminimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbminimizeActionPerformed(evt);
            }
        });

        lbicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/billiard.png"))); // NOI18N
        lbicon.setToolTipText("");

        lbexit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbexit.setForeground(new java.awt.Color(255, 51, 51));
        lbexit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbexit.setText("X");
        lbexit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbexit.setOpaque(true);
        lbexit.setPreferredSize(new java.awt.Dimension(4, 16));
        lbexit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbexitMouseMoved(evt);
            }
        });
        lbexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbexitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbexitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbicon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbminimize, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbexit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbminimize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbexit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        pnlmenu.setBackground(new java.awt.Color(204, 204, 204));
        pnlmenu.setLayout(new java.awt.GridLayout(8, 0));

        btntongquan.setBackground(new java.awt.Color(204, 204, 204));
        btntongquan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btntongquan.setForeground(new java.awt.Color(51, 51, 51));
        btntongquan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/overview.png"))); // NOI18N
        btntongquan.setText("   TỔNG QUAN");
        btntongquan.setBorderPainted(false);
        btntongquan.setFocusPainted(false);
        btntongquan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btntongquan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btntongquanMouseMoved(evt);
            }
        });
        btntongquan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntongquanMouseExited(evt);
            }
        });
        btntongquan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntongquanActionPerformed(evt);
            }
        });
        pnlmenu.add(btntongquan);

        btnorder.setBackground(new java.awt.Color(204, 204, 204));
        btnorder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnorder.setForeground(new java.awt.Color(51, 51, 51));
        btnorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/order.png"))); // NOI18N
        btnorder.setText("   ORDER");
        btnorder.setBorderPainted(false);
        btnorder.setFocusPainted(false);
        btnorder.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnorder.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnorderMouseMoved(evt);
            }
        });
        btnorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnorderMouseExited(evt);
            }
        });
        btnorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorderActionPerformed(evt);
            }
        });
        pnlmenu.add(btnorder);

        btnban.setBackground(new java.awt.Color(204, 204, 204));
        btnban.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnban.setForeground(new java.awt.Color(51, 51, 51));
        btnban.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/table.png"))); // NOI18N
        btnban.setText("   BÀN");
        btnban.setBorderPainted(false);
        btnban.setFocusPainted(false);
        btnban.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnban.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnbanMouseMoved(evt);
            }
        });
        btnban.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnbanMouseExited(evt);
            }
        });
        btnban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbanActionPerformed(evt);
            }
        });
        pnlmenu.add(btnban);

        btndanhmuc.setBackground(new java.awt.Color(204, 204, 204));
        btndanhmuc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndanhmuc.setForeground(new java.awt.Color(51, 51, 51));
        btndanhmuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/category.png"))); // NOI18N
        btndanhmuc.setText("   DANH MỤC");
        btndanhmuc.setBorderPainted(false);
        btndanhmuc.setFocusPainted(false);
        btndanhmuc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btndanhmuc.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btndanhmucMouseMoved(evt);
            }
        });
        btndanhmuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndanhmucMouseExited(evt);
            }
        });
        btndanhmuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndanhmucActionPerformed(evt);
            }
        });
        pnlmenu.add(btndanhmuc);

        btnthu.setBackground(new java.awt.Color(204, 204, 204));
        btnthu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnthu.setForeground(new java.awt.Color(51, 51, 51));
        btnthu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-brochure-48.png"))); // NOI18N
        btnthu.setText("   THU");
        btnthu.setBorderPainted(false);
        btnthu.setFocusPainted(false);
        btnthu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnthu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnthuMouseMoved(evt);
            }
        });
        btnthu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnthuMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnthuMouseExited(evt);
            }
        });
        btnthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthuActionPerformed(evt);
            }
        });
        pnlmenu.add(btnthu);

        btnchi.setBackground(new java.awt.Color(204, 204, 204));
        btnchi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnchi.setForeground(new java.awt.Color(51, 51, 51));
        btnchi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-cashbook-48.png"))); // NOI18N
        btnchi.setText("   CHI");
        btnchi.setBorderPainted(false);
        btnchi.setFocusPainted(false);
        btnchi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnchi.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnchiMouseMoved(evt);
            }
        });
        btnchi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnchiMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnchiMouseExited(evt);
            }
        });
        btnchi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchiActionPerformed(evt);
            }
        });
        pnlmenu.add(btnchi);

        btnThongKe.setBackground(new java.awt.Color(204, 204, 204));
        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThongKe.setForeground(new java.awt.Color(51, 51, 51));
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-cashbook-48.png"))); // NOI18N
        btnThongKe.setText("Thống Kê");
        btnThongKe.setBorderPainted(false);
        btnThongKe.setFocusPainted(false);
        btnThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongKe.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnThongKeMouseMoved(evt);
            }
        });
        btnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThongKeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThongKeMouseExited(evt);
            }
        });
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        pnlmenu.add(btnThongKe);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        lbactor.setBackground(new java.awt.Color(204, 204, 204));
        lbactor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbactor.setForeground(new java.awt.Color(51, 51, 51));
        lbactor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbactor.setText("ADMINISTRATOR");
        lbactor.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbactor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbactorMouseClicked(evt);
            }
        });
        jPanel3.add(lbactor);

        btnlogout.setBackground(new java.awt.Color(204, 204, 204));
        btnlogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(51, 51, 51));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-logout-48.png"))); // NOI18N
        btnlogout.setText("ĐĂNG XUẤT");
        btnlogout.setBorderPainted(false);
        btnlogout.setFocusPainted(false);
        btnlogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnlogout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnlogoutMouseMoved(evt);
            }
        });
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlogoutMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnlogoutMouseExited(evt);
            }
        });
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel3.add(btnlogout);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pnlmenu, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnltongquan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnltongquan.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnltongquan, javax.swing.GroupLayout.DEFAULT_SIZE, 1196, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnltongquan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    boolean flag = false;
    private void btnthuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthuMouseClicked
        // TODO add your handling code here:
        backgroundColor();

        btnthu.setBackground(new Color(63, 213, 192));
    }//GEN-LAST:event_btnthuMouseClicked

    private void btnchiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnchiMouseClicked
        // TODO add your handling code here:
        backgroundColor();
        btnchi.setBackground(new Color(63, 213, 192));
    }//GEN-LAST:event_btnchiMouseClicked

    private void btntongquanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntongquanActionPerformed
        // TODO add your handling code here:
        backgroundColor();
        btntongquan.setBackground(new Color(63, 213, 192));
        pnltongquan.removeAll();
        pnltongquan.add(new Tongquan()).setVisible(true);
        pnltongquan.validate();
    }//GEN-LAST:event_btntongquanActionPerformed

    private void btnlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnlogoutMouseClicked

    private void btnorderMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnorderMouseMoved
        // TODO add your handling code here:
        changecolormoved(btnorder);
    }//GEN-LAST:event_btnorderMouseMoved

    private void btnorderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnorderMouseExited
        // TODO add your handling code here:
        if (!btnorder.getBackground().equals(new Color(63, 213, 192))) {
            btnorder.setBackground(color);
        }
    }//GEN-LAST:event_btnorderMouseExited

    private void btntongquanMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntongquanMouseMoved
        // TODO add your handling code here:
        changecolormoved(btntongquan);
    }//GEN-LAST:event_btntongquanMouseMoved

    private void btntongquanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntongquanMouseExited
        // TODO add your handling code here:
        changecolorexit(btntongquan);
    }//GEN-LAST:event_btntongquanMouseExited

    private void btnbanMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbanMouseMoved
        // TODO add your handling code here:
        changecolormoved(btnban);
    }//GEN-LAST:event_btnbanMouseMoved

    private void btnbanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbanMouseExited
        // TODO add your handling code here:
        changecolorexit(btnban);
    }//GEN-LAST:event_btnbanMouseExited

    private void btndanhmucMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndanhmucMouseMoved
        // TODO add your handling code here:
        changecolormoved(btndanhmuc);
    }//GEN-LAST:event_btndanhmucMouseMoved

    private void btndanhmucMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndanhmucMouseExited
        // TODO add your handling code here:
        changecolorexit(btndanhmuc);

    }//GEN-LAST:event_btndanhmucMouseExited

    private void btnthuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthuMouseMoved

        changecolormoved(btnthu);
    }//GEN-LAST:event_btnthuMouseMoved

    private void btnthuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthuMouseExited

        changecolorexit(btnthu);
    }//GEN-LAST:event_btnthuMouseExited

    private void btnchiMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnchiMouseMoved

        changecolormoved(btnchi);
    }//GEN-LAST:event_btnchiMouseMoved

    private void btnchiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnchiMouseExited

        changecolorexit(btnchi);
    }//GEN-LAST:event_btnchiMouseExited

    private void btnlogoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseMoved
        // TODO add your handling code here:
        if (!btnlogout.getBackground().equals(new Color(63, 213, 192))) {
            btnlogout.setBackground(new Color(1, 177, 189));
        }
    }//GEN-LAST:event_btnlogoutMouseMoved

    private void btnlogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseExited
        // TODO add your handling code here:
        if (!btnlogout.getBackground().equals(new Color(63, 213, 192))) {
            btnlogout.setBackground(color);
        }
    }//GEN-LAST:event_btnlogoutMouseExited

    private void lbexitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbexitMouseMoved
        // TODO add your handling code here:
        lbexit.setForeground(Color.white);
        lbexit.setBackground(Color.RED);
    }//GEN-LAST:event_lbexitMouseMoved

    private void lbexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbexitMouseExited
        // TODO add your handling code here:
        lbexit.setForeground(new Color(255, 51, 51));
        lbexit.setBackground(null);
    }//GEN-LAST:event_lbexitMouseExited

    private void lbexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbexitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbexitMouseClicked

    private void lbminimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbminimizeActionPerformed
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lbminimizeActionPerformed

    private void btnorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorderActionPerformed
        // TODO add your handling code here:
        backgroundColor();
        btnorder.setBackground(new Color(63, 213, 192));
        pnltongquan.removeAll();
        Order order = new Order();
        pnltongquan.add(order);
        pnltongquan.validate();
    }//GEN-LAST:event_btnorderActionPerformed

    private void btnbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbanActionPerformed
        // TODO add your handling code here:
        backgroundColor();
        btnban.setBackground(new Color(63, 213, 192));
        pnltongquan.removeAll();
        pnlQLBan pnlban = new pnlQLBan();
        pnltongquan.add(pnlban);
        pnltongquan.validate();
    }//GEN-LAST:event_btnbanActionPerformed

    private void btndanhmucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndanhmucActionPerformed
        // TODO add your handling code here:
        backgroundColor();
        btndanhmuc.setBackground(new Color(63, 213, 192));
        pnlDanhMuc danhmuc = new pnlDanhMuc();
        pnltongquan.removeAll();
        pnltongquan.add(danhmuc);
        pnltongquan.validate();
    }//GEN-LAST:event_btndanhmucActionPerformed

    private void lbactorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbactorMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            ChiTietNhanVien chitiet = new ChiTietNhanVien(new HomeScreen(), true);
            chitiet.setVisible(true);
        }
    }//GEN-LAST:event_lbactorMouseClicked

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        MenuDangNhap mdn = new MenuDangNhap();
        mdn.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthuActionPerformed

        backgroundColor();
        btndanhmuc.setBackground(new Color(63, 213, 192));
        pnlNhap danhmuc = new pnlNhap();
        pnltongquan.removeAll();
        pnltongquan.add(danhmuc);
        pnltongquan.validate();
    }//GEN-LAST:event_btnthuActionPerformed

    private void btnchiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchiActionPerformed
        backgroundColor();
        btndanhmuc.setBackground(new Color(63, 213, 192));
        pnlChi danhmuc = new pnlChi();
        pnltongquan.removeAll();
        pnltongquan.add(danhmuc);
        pnltongquan.validate();
    }//GEN-LAST:event_btnchiActionPerformed

    private void btnThongKeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseMoved
        // TODO add your handling code here:
        changecolormoved(btnThongKe);
    }//GEN-LAST:event_btnThongKeMouseMoved

    private void btnThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseClicked
        // TODO add your handling code here:
        backgroundColor();
        btnThongKe.setBackground(new Color(63, 213, 192));
    }//GEN-LAST:event_btnThongKeMouseClicked

    private void btnThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseExited
        // TODO add your handling code here:
        changecolorexit(btnThongKe);
    }//GEN-LAST:event_btnThongKeMouseExited

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        backgroundColor();
        btndanhmuc.setBackground(new Color(63, 213, 192));
        ThongKe thongke = new ThongKe();
        pnltongquan.removeAll();
        pnltongquan.add(thongke);
        pnltongquan.validate();
    }//GEN-LAST:event_btnThongKeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnban;
    private javax.swing.JButton btnchi;
    private javax.swing.JButton btndanhmuc;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnorder;
    private javax.swing.JButton btnthu;
    private javax.swing.JButton btntongquan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbactor;
    private javax.swing.JLabel lbexit;
    private javax.swing.JLabel lbicon;
    private javax.swing.JButton lbminimize;
    private javax.swing.JPanel pnlmenu;
    public javax.swing.JPanel pnltongquan;
    // End of variables declaration//GEN-END:variables
}
