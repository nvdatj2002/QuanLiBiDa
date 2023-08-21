/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import EXTENDED.Mail;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.border.MatteBorder;

/**
 *
 * @author ADMIN
 */
public class formForgotpw extends javax.swing.JPanel {

    public static String text;

    /**
     * Creates new form formForgotpw
     */
    public formForgotpw() {
        initComponents();
        btnXacnhan.setVisible(false);
        disable(false);
    }

    public void disable(boolean kt) {
        otp1.setEnabled(kt);
        otp2.setEnabled(kt);
        otp3.setEnabled(kt);
        otp4.setEnabled(kt);
        otp5.setEnabled(kt);
        otp6.setEnabled(kt);
        lbchange.setEnabled(kt);
    }

    public void request(javax.swing.JTextField txt, javax.swing.JTextField txt2) {
        if (txt.getText().length() > 0) {
            txt.setText(txt.getText().charAt(0) + "");
            txt2.requestFocus();
        }
    }

    public void prequest(javax.swing.JTextField txt, javax.swing.JTextField txt2) {
        if (txt.getText().length() < 1) {
            txt2.requestFocus();
        }
    }
    public static int otp = (int) Math.floor(((Math.random() * 899999) + 100000));

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnLogin = new javax.swing.JButton();
        txtemail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        otp1 = new javax.swing.JTextField();
        otp2 = new javax.swing.JTextField();
        otp3 = new javax.swing.JTextField();
        otp4 = new javax.swing.JTextField();
        otp5 = new javax.swing.JTextField();
        otp6 = new javax.swing.JTextField();
        lbchange = new javax.swing.JLabel();
        btnXacnhan = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setBackground(new java.awt.Color(68, 182, 174));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("GỬI MÃ");
        btnLogin.setBorderPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 182, 39));

        txtemail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtemail.setForeground(new java.awt.Color(102, 102, 102));
        txtemail.setText("ĐỊA CHỈ EMAIL");
        txtemail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailFocusLost(evt);
            }
        });
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
        });
        add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 46, 247, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/id-card.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 46, 37, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/id-password.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 108, 37, 37));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        otp1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        otp1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        otp1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        otp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                otp1KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 4);
        jPanel1.add(otp1, gridBagConstraints);

        otp2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        otp2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        otp2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        otp2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                otp2KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 4);
        jPanel1.add(otp2, gridBagConstraints);

        otp3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        otp3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        otp3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        otp3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                otp3KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 4);
        jPanel1.add(otp3, gridBagConstraints);

        otp4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        otp4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        otp4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        otp4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                otp4KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 4);
        jPanel1.add(otp4, gridBagConstraints);

        otp5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        otp5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        otp5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        otp5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                otp5KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 4);
        jPanel1.add(otp5, gridBagConstraints);

        otp6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        otp6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        otp6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        otp6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                otp6KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 4);
        jPanel1.add(otp6, gridBagConstraints);

        lbchange.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbchange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/resendpng.png"))); // NOI18N
        lbchange.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanel1.add(lbchange, gridBagConstraints);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 108, 247, -1));

        btnXacnhan.setBackground(new java.awt.Color(68, 182, 174));
        btnXacnhan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXacnhan.setForeground(new java.awt.Color(255, 255, 255));
        btnXacnhan.setText("XÁC NHẬN");
        btnXacnhan.setBorderPainted(false);
        btnXacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacnhanActionPerformed(evt);
            }
        });
        add(btnXacnhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 182, 39));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (new Mail().send(txtemail.getText(), otp)) {
            disable(true);
            btnLogin.setVisible(false);
            btnXacnhan.setVisible(true);
        }


    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusGained
        // TODO add your handling code here:
        if (txtemail.getText().equalsIgnoreCase("ĐỊA CHỈ EMAIL")) {
            txtemail.setBorder(new MatteBorder(0, 0, 1, 0, new Color(102, 102, 102)));
            txtemail.setText("");
            txtemail.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtemailFocusGained

    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
        // TODO add your handling code here:
        if (txtemail.getText().equals("")) {
            txtemail.setText("ĐỊA CHỈ EMAIL");
            txtemail.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_txtemailFocusLost

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }
    }//GEN-LAST:event_txtemailKeyPressed

    private void btnXacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacnhanActionPerformed
        // TODO add your handling code here:
        int reotp = Integer.parseInt(otp1.getText() + otp2.getText() + otp3.getText() + otp4.getText() + otp5.getText() + otp6.getText());
        if (otp == reotp) {
            otp = 0;
            text = txtemail.getText();
            new jdlQuenmatkhau(new MenuDangNhap(), true).setVisible(true);
            disable(false);
            btnLogin.setVisible(true);
            btnXacnhan.setVisible(false);
        }
    }//GEN-LAST:event_btnXacnhanActionPerformed

    private void otp1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otp1KeyReleased
        // TODO add your handling code here:
        request(otp1, otp2);
    }//GEN-LAST:event_otp1KeyReleased

    private void otp2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otp2KeyReleased
        // TODO add your handling code here:
        request(otp2, otp3);
        prequest(otp2, otp1);
    }//GEN-LAST:event_otp2KeyReleased

    private void otp3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otp3KeyReleased
        // TODO add your handling code here:
        request(otp3, otp4);
        prequest(otp3, otp2);
    }//GEN-LAST:event_otp3KeyReleased

    private void otp5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otp5KeyReleased
        // TODO add your handling code here:
        request(otp5, otp6);
        prequest(otp5, otp4);
    }//GEN-LAST:event_otp5KeyReleased

    private void otp4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otp4KeyReleased
        // TODO add your handling code here:
        request(otp4, otp5);
        prequest(otp4, otp3);
    }//GEN-LAST:event_otp4KeyReleased

    private void otp6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otp6KeyReleased
        // TODO add your handling code here:
        prequest(otp6, otp5);
    }//GEN-LAST:event_otp6KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnLogin;
    public javax.swing.JButton btnXacnhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbchange;
    private javax.swing.JTextField otp1;
    private javax.swing.JTextField otp2;
    private javax.swing.JTextField otp3;
    private javax.swing.JTextField otp4;
    private javax.swing.JTextField otp5;
    private javax.swing.JTextField otp6;
    public javax.swing.JTextField txtemail;
    // End of variables declaration//GEN-END:variables
}