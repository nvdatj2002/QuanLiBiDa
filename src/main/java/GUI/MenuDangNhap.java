/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.formLogin.txtPassword;
import static GUI.formLogin.txtUsername;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JRootPane;

/**
 *
 * @author huyparody
 */
public class MenuDangNhap extends javax.swing.JFrame {

    /**
     * Creates new form MenuDangNhap
     */
    public static JFrame frameLogin = null;
    public MenuDangNhap() {
        setUndecorated(true);
        initComponents();
        frameLogin=this;
//        this.setExtendedState(HomeScreen.MAXIMIZED_BOTH);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
//        ImageIcon imageIcon = new ImageIcon(new ImageIcon("IMAGE\\billiard2.png").getImage().
//                getScaledInstance(lbicon.getWidth(), lbicon.getHeight(), Image.SCALE_SMOOTH));
//        lbicon.setIcon(imageIcon);
        setPreferredSize(new Dimension(587, 318));
        pnlForm.setPreferredSize(new Dimension(434, 282));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlForm = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbminimize = new javax.swing.JButton();
        lbexit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnForgotpassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Đăng nhập");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlForm.setBackground(new java.awt.Color(255, 255, 255));
        pnlForm.setPreferredSize(new java.awt.Dimension(434, 282));
        pnlForm.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("ĐĂNG NHẬP");
        jLabel4.setToolTipText("");

        lbminimize.setBackground(new java.awt.Color(255, 255, 255));
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

        lbexit.setBackground(new java.awt.Color(255, 255, 255));
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
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                .addComponent(lbminimize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbexit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbminimize, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));
        jPanel3.setLayout(new java.awt.GridLayout(2, 1));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/login.png"))); // NOI18N
        btnLogin.setText("ĐĂNG NHẬP");
        btnLogin.setBorderPainted(false);
        btnLogin.setFocusPainted(false);
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel3.add(btnLogin);

        btnForgotpassword.setBackground(new java.awt.Color(255, 255, 255));
        btnForgotpassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnForgotpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/forgot-password.png"))); // NOI18N
        btnForgotpassword.setText("QUÊN MẬT KHẨU");
        btnForgotpassword.setBorderPainted(false);
        btnForgotpassword.setFocusPainted(false);
        btnForgotpassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnForgotpassword.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnForgotpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotpasswordActionPerformed(evt);
            }
        });
        jPanel3.add(btnForgotpassword);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbexitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbexitMouseClicked

    private void lbexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbexitMouseExited
        // TODO add your handling code here:
        lbexit.setForeground(new Color(255, 51, 51));
        lbexit.setBackground(null);
    }//GEN-LAST:event_lbexitMouseExited

    private void lbexitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbexitMouseMoved
        // TODO add your handling code here:
        lbexit.setForeground(Color.white);
        lbexit.setBackground(Color.RED);
    }//GEN-LAST:event_lbexitMouseMoved

    private void lbminimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbminimizeActionPerformed
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lbminimizeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        btnLogin.setSelected(true);
        btnLogin.setBackground(new Color(68, 182, 174));
        pnlForm.removeAll();
        pnlForm.add(new formLogin()).setVisible(true);
        pnlForm.validate();
    }//GEN-LAST:event_formWindowOpened

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        btnLogin.setBackground(new Color(68, 182, 174));
        btnForgotpassword.setBackground(Color.white);
        pnlForm.removeAll();
        pnlForm.add(new formLogin()).setVisible(true);
        pnlForm.validate();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnForgotpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotpasswordActionPerformed
        // TODO add your handling code here:
        btnForgotpassword.setBackground(new Color(68, 182, 174));
        btnLogin.setBackground(Color.WHITE);
        pnlForm.removeAll();
        pnlForm.add(new formForgotpw()).setVisible(true);
        pnlForm.validate();
    }//GEN-LAST:event_btnForgotpasswordActionPerformed

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
            java.util.logging.Logger.getLogger(MenuDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuDangNhap mn = new MenuDangNhap();
                mn.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgotpassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbexit;
    private javax.swing.JButton lbminimize;
    private javax.swing.JPanel pnlForm;
    // End of variables declaration//GEN-END:variables
}