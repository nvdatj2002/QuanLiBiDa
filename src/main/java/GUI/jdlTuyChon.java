/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI;

import BLL.BLLBan;
import BLL.BLLHoaDon;
import BLL.BLLOrder;
import DTO.Ban;
import DTO.HoaDon;
import EXTENDED.Caution;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author dell 7559
 */
public class jdlTuyChon extends javax.swing.JDialog {

    /**
     * Creates new form jdlChuyenBan
     */
    public jdlTuyChon(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnChuyenBan = new javax.swing.JButton();
        btnDatBan = new javax.swing.JButton();
        jpnChinh = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnChuyenBan.setText("Chuyển bàn");
        btnChuyenBan.setBorderPainted(false);
        btnChuyenBan.setOpaque(true);
        btnChuyenBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenBanActionPerformed(evt);
            }
        });

        btnDatBan.setText("Đặt bàn");
        btnDatBan.setBorderPainted(false);
        btnDatBan.setOpaque(true);
        btnDatBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatBanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnChuyenBan, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnDatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 515, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnChuyenBan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnDatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jpnChinhLayout = new javax.swing.GroupLayout(jpnChinh);
        jpnChinh.setLayout(jpnChinhLayout);
        jpnChinhLayout.setHorizontalGroup(
            jpnChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnChinhLayout.setVerticalGroup(
            jpnChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ChuyenBan chuyenBan = new ChuyenBan();
        chuyenBan.setVisible(true);
        chuyenBan.setSize(new Dimension(852, 582));
        BLLOrder o = new BLLOrder();
//        o.loadBanDangChoi(chuyenBan.jpnDangChoi, chuyenBan.btn1);
//        o.loadBanDangTrong(chuyenBan.jpnBanDangTrong, chuyenBan.btn2);
        jpnChinh.add(chuyenBan);
        jpnChinh.validate();
        btnChuyenBan.setBackground(new Color(0, 128, 128));
        btnDatBan.setBackground(new Color(48, 213, 200));
        BLLOrder.dong(this, chuyenBan.btnXong);

    }//GEN-LAST:event_formWindowOpened

    private void btnChuyenBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenBanActionPerformed
        // TODO add your handling code here:
        jpnChinh.removeAll();
        ChuyenBan chuyenBan = new ChuyenBan();
        chuyenBan.setVisible(true);
        chuyenBan.setSize(new Dimension(852, 582));
//        BLLOrder o = new BLLOrder();
//        
//        o.loadBanDangChoi(chuyenBan.jpnDangChoi, chuyenBan.btn1);
//        o.loadBanDangTrong(chuyenBan.jpnBanDangTrong, chuyenBan.btn2);
        jpnChinh.add(chuyenBan);
        btnChuyenBan.setBackground(new Color(0, 128, 128));
        btnDatBan.setBackground(new Color(48, 213, 200));
        jpnChinh.validate();
        BLLOrder.dong(this, chuyenBan.btnXong);
    }//GEN-LAST:event_btnChuyenBanActionPerformed

    private void btnDatBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatBanActionPerformed
        // TODO add your handling code here:
        jpnChinh.removeAll();
        DatBan db = new DatBan();
        db.setVisible(true);

        db.setSize(new Dimension(852, 582));
        BLLOrder o = new BLLOrder();
//        o.loadDaDat(db.jpnBanDaDat, new JButton(),new ArrayList<>());
//        o.loadBanDangTrong(db.jpnBanDangTrong, db.btn1,new ArrayList<>());
        btnDatBan.setBackground(new Color(0, 128, 128));
        btnChuyenBan.setBackground(new Color(48, 213, 200));
        jpnChinh.add(db);
        jpnChinh.validate();
        BLLOrder.dong(this, db.btnXong);
    }//GEN-LAST:event_btnDatBanActionPerformed
    public static boolean updateBan = false;
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        updateBan = true;
    }//GEN-LAST:event_formWindowClosed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jdlTuyChon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdlTuyChon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdlTuyChon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdlTuyChon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdlTuyChon dialog = new jdlTuyChon(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenBan;
    private javax.swing.JButton btnDatBan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpnChinh;
    // End of variables declaration//GEN-END:variables
}
