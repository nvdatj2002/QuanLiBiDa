/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import static GUI.MenuDangNhap.frameLogin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;

/**
 *
 * @author ADMIN
 */
public class formLogin extends javax.swing.JPanel {

    /**
     * Creates new form formLogin
     */
    public formLogin() {
        initComponents();
    }

    private static void AuthenticateAndLogin() {
        if (txtUsername.getText().isEmpty() || txtUsername.getText().equals("TÊN ĐĂNG NHẬP")) {
            txtUsername.setBorder(new MatteBorder(0, 0, 1, 0, Color.red));
            return;
        } else {
            txtUsername.setBorder(new MatteBorder(0, 0, 1, 0, new Color(102, 102, 102)));
        }
        if (txtPassword.getText().equals("") || txtPassword.getText().equals("MẬT KHẨU")) {
            txtPassword.setBorder(new MatteBorder(0, 0, 1, 0, Color.red));
            lbeye.setBorder(new MatteBorder(0, 0, 1, 0, Color.red));
            return;
        } else {
            txtPassword.setBorder(new MatteBorder(0, 0, 1, 0, new Color(102, 102, 102)));
            lbeye.setBorder(new MatteBorder(0, 0, 1, 0, new Color(102, 102, 102)));
        }
        if (!BLL.BLLNhanVien.getAccount(txtUsername.getText(), txtPassword.getText())) {
            txtUsername.setBorder(new MatteBorder(0, 0, 1, 0, Color.red));
            txtPassword.setBorder(new MatteBorder(0, 0, 1, 0, Color.red));
            lbeye.setBorder(new MatteBorder(0, 0, 1, 0, Color.red));
            txtmessage.setText("Sai tên đăng nhập hoặc mật khẩu");
            txtUsername.setText("TÊN ĐĂNG NHẬP");
            txtPassword.setText("MẬT KHẨU");
            txtPassword.setEchoChar('●');
            lbeye.setIcon(new formLogin().eye_hide);
            show=true;
            return;
        } 
        
        frameLogin.dispose();
        HomeScreen home = new HomeScreen();
        home.setVisible(true);
        
    }

    public  ImageIcon eye = new ImageIcon(getClass().getResource("/IMG/eye.png"));
    public ImageIcon eye_hide = new ImageIcon(getClass().getResource("/IMG/eye_hide.png"));
    public static boolean show = true;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        txtmessage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        lbeye = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(430, 278));

        txtmessage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtmessage.setForeground(new java.awt.Color(255, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/id-password.png"))); // NOI18N

        btnLogin.setBackground(new java.awt.Color(68, 182, 174));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("ĐĂNG NHẬP");
        btnLogin.setBorderPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(102, 102, 102));
        txtUsername.setText("TÊN ĐĂNG NHẬP");
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/id-card.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setText("MẬT KHẨU");
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 220;
        gridBagConstraints.ipady = 18;
        jPanel1.add(txtPassword, gridBagConstraints);

        lbeye.setBackground(new java.awt.Color(255, 255, 255));
        lbeye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/eye_hide.png"))); // NOI18N
        lbeye.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        lbeye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbeyeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbeyeMousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(lbeye, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(txtmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        AuthenticateAndLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            AuthenticateAndLogin();
        }
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        // TODO add your handling code here:
        txtmessage.setText("");
        if (txtUsername.getText().equalsIgnoreCase("TÊN ĐĂNG NHẬP")) {
            txtUsername.setBorder(new MatteBorder(0, 0, 1, 0, new Color(102, 102, 102)));
            txtUsername.setText("");
            txtUsername.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        // TODO add your handling code here:
        if (txtUsername.getText().equals("")) {
            txtUsername.setText("TÊN ĐĂNG NHẬP");
            txtUsername.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void lbeyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbeyeMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lbeyeMouseClicked

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
        txtmessage.setText("");
        if (txtPassword.getText().equalsIgnoreCase("MẬT KHẨU")) {
            txtPassword.setBorder(new MatteBorder(0, 0, 1, 0, new Color(102, 102, 102)));
            lbeye.setBorder(new MatteBorder(0, 0, 1, 0, new Color(102, 102, 102)));
            txtPassword.setText("");
            txtPassword.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:
        if (txtPassword.getText().equals("")) {
            txtPassword.setText("MẬT KHẨU");
            txtPassword.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void lbeyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbeyeMousePressed
        // TODO add your handling code here:
        if (show) {
            lbeye.setIcon(eye);
            txtPassword.setEchoChar((char) 0);
            show=false;
        } else {
            txtPassword.setFont(new Font("Segoe UI", 1, 12));
            txtPassword.setEchoChar('●');
            lbeye.setIcon(eye_hide);
            show=true;
        }
    }//GEN-LAST:event_lbeyeMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lbeye;
    public static javax.swing.JPasswordField txtPassword;
    public static javax.swing.JTextField txtUsername;
    public static javax.swing.JLabel txtmessage;
    // End of variables declaration//GEN-END:variables
}
