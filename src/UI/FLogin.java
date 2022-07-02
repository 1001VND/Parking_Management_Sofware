/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.DangNhapDAO;
import DTO.AccountDTO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Admin
 */
public class FLogin extends javax.swing.JFrame {

    /**
     * Creates new form FLogin
     */
    public FLogin() {
        initComponents();
        setSize(1270, 720);
        setLocationRelativeTo(this);
        this.setTitle("PHẦN MỀN QUẢN LÝ BÃI GỬI XE");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassWord = new javax.swing.JPasswordField();
        btnQuenMK = new javax.swing.JButton();
        btnDangNhap = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        lbTaikhoan = new javax.swing.JLabel();
        lbMatkhau = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Flogin"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName("btnTaoTK"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setText("ĐĂNG NHẬP");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_user_50px.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Tài Khoản");

        txtUserName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUserName.setBorder(null);
        txtUserName.setName("txtUserName"); // NOI18N
        txtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserNameMouseClicked(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserNameKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Mật Khẩu");

        txtPassWord.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPassWord.setBorder(null);
        txtPassWord.setName("txtPassWord"); // NOI18N
        txtPassWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassWordMouseClicked(evt);
            }
        });
        txtPassWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassWordKeyPressed(evt);
            }
        });

        btnQuenMK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnQuenMK.setText("Quên mật khẩu ?");
        btnQuenMK.setBorder(null);
        btnQuenMK.setBorderPainted(false);
        btnQuenMK.setContentAreaFilled(false);
        btnQuenMK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuenMK.setName("btnQuenMK"); // NOI18N
        btnQuenMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuenMKActionPerformed(evt);
            }
        });

        btnDangNhap.setBackground(new java.awt.Color(102, 102, 255));
        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setBorder(null);
        btnDangNhap.setBorderPainted(false);
        btnDangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangNhap.setName("btnDangNhap"); // NOI18N
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(102, 102, 255));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThoat.setText("Thoát ứng dụng");
        btnThoat.setBorder(null);
        btnThoat.setBorderPainted(false);
        btnThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoat.setName("btnThoat"); // NOI18N
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        lbMatkhau.setName("lbPassWord"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnQuenMK)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(txtPassWord, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 89, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnQuenMK)
                .addGap(50, 50, 50)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/bai-do-xe-hoi-min-1638325312-2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuenMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuenMKActionPerformed
        new FErrorLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuenMKActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        try {
            if (txtUserName.getText().equals("") && txtPassWord.getText().equals("")) {
                lbTaikhoan.setText("*Chưa nhập tài khoản.");
                lbTaikhoan.setForeground(Color.red);
                lbMatkhau.setText("*Chưa nhập mật khẩu.");
                lbMatkhau.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtUserName.setBorder(RedLine);
                txtPassWord.setBorder(RedLine);
            } else if (txtUserName.getText().equals("")) {
                lbTaikhoan.setText("*Chưa nhập tài khoản.");
                lbTaikhoan.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtUserName.setBorder(RedLine);
            } else if (txtPassWord.getText().equals("")) {
                lbMatkhau.setText("*Chưa nhập mật khẩu.");
                lbMatkhau.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtPassWord.setBorder(RedLine);
            } else {
                DangNhapDAO dn = new DangNhapDAO();
                AccountDTO tk = dn.CheckUser(txtUserName.getText());
                AccountDTO tk1 = dn.CheckPass(txtPassWord.getText(), txtUserName.getText());
                if (txtUserName.getText().equals("admin") && txtPassWord.getText().equals("admin")) {
                    JOptionPane.showMessageDialog(this, "Đăng nhập thành công, bạn là admin");
                    new FMenuManager(txtUserName.getText()).setVisible(true);
                    this.dispose();
                } else {
                    if (tk == null) {
                        lbTaikhoan.setText("*Tài khoản không tồn tại");
                        txtUserName.setText("");
                        lbTaikhoan.setForeground(Color.red);
                        Border RedLine = BorderFactory.createLineBorder(Color.red);
                        txtUserName.setBorder(RedLine);
                    } else {
                        if (tk1 != null) {
                            JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
                            new FMenuStaff(txtUserName.getText()).setVisible(true);
                            this.dispose();
                        } else {
                            lbMatkhau.setText("*Mật khẩu không đúng");
                            txtPassWord.setText("");
                            lbMatkhau.setForeground(Color.red);
                            Border RedLine = BorderFactory.createLineBorder(Color.red);
                            txtPassWord.setBorder(RedLine);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int exit = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát ứng dụng không", "Thông báo!", JOptionPane.YES_NO_OPTION);
        if (exit != JOptionPane.YES_OPTION) {
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                if (txtUserName.getText().equals("") && txtPassWord.getText().equals("")) {
                    lbTaikhoan.setText("*Chưa nhập tài khoản.");
                    lbTaikhoan.setForeground(Color.red);
                    lbMatkhau.setText("*Chưa nhập mật khẩu.");
                    lbMatkhau.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtUserName.setBorder(RedLine);
                    txtPassWord.setBorder(RedLine);
                } else if (txtUserName.getText().equals("")) {
                    lbTaikhoan.setText("*Chưa nhập tài khoản.");
                    lbTaikhoan.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtUserName.setBorder(RedLine);
                } else if (txtPassWord.getText().equals("")) {
                    lbMatkhau.setText("*Chưa nhập mật khẩu.");
                    lbMatkhau.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtPassWord.setBorder(RedLine);
                } else {
                    DangNhapDAO dn = new DangNhapDAO();
                    AccountDTO tk = dn.CheckUser(txtUserName.getText());
                    AccountDTO tk1 = dn.CheckPass(txtPassWord.getText(), txtUserName.getText());
                    if (txtUserName.getText().equals("admin") && txtPassWord.getText().equals("admin")) {
                        JOptionPane.showMessageDialog(this, "Đăng nhập thành công, bạn là admin");
                        new FMenuManager(txtUserName.getText()).setVisible(true);
                        this.dispose();
                    } else {
                        if (tk == null) {
                            lbTaikhoan.setText("*Tài khoản không tồn tại");
                            txtUserName.setText("");
                            lbTaikhoan.setForeground(Color.red);
                            Border RedLine = BorderFactory.createLineBorder(Color.red);
                            txtUserName.setBorder(RedLine);
                        } else {
                            if (tk1 != null) {
                                JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
                                new FMenuStaff(txtUserName.getText()).setVisible(true);
                                this.dispose();
                            } else {
                                lbMatkhau.setText("*Mật khẩu không đúng");
                                txtPassWord.setText("");
                                lbMatkhau.setForeground(Color.red);
                                Border RedLine = BorderFactory.createLineBorder(Color.red);
                                txtPassWord.setBorder(RedLine);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_txtUserNameKeyPressed

    private void txtUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserNameMouseClicked
        lbTaikhoan.setText("");
        txtUserName.setBorder(null);
    }//GEN-LAST:event_txtUserNameMouseClicked

    private void txtPassWordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassWordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                if (txtUserName.getText().equals("") && txtPassWord.getText().equals("")) {
                    lbTaikhoan.setText("*Chưa nhập tài khoản.");
                    lbTaikhoan.setForeground(Color.red);
                    lbMatkhau.setText("*Chưa nhập mật khẩu.");
                    lbMatkhau.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtUserName.setBorder(RedLine);
                    txtPassWord.setBorder(RedLine);
                } else if (txtUserName.getText().equals("")) {
                    lbTaikhoan.setText("*Chưa nhập tài khoản.");
                    lbTaikhoan.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtUserName.setBorder(RedLine);
                } else if (txtPassWord.getText().equals("")) {
                    lbMatkhau.setText("*Chưa nhập mật khẩu.");
                    lbMatkhau.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtPassWord.setBorder(RedLine);
                } else {
                    DangNhapDAO dn = new DangNhapDAO();
                    AccountDTO tk = dn.CheckUser(txtUserName.getText());
                    AccountDTO tk1 = dn.CheckPass(txtPassWord.getText(), txtUserName.getText());
                    if (txtUserName.getText().equals("admin") && txtPassWord.getText().equals("admin")) {
                        JOptionPane.showMessageDialog(this, "Đăng nhập thành công, bạn là admin");
                        new FMenuManager(txtUserName.getText()).setVisible(true);
                        this.dispose();
                    } else {
                        if (tk == null) {
                            lbTaikhoan.setText("*Tài khoản không tồn tại");
                            txtUserName.setText("");
                            lbTaikhoan.setForeground(Color.red);
                            Border RedLine = BorderFactory.createLineBorder(Color.red);
                            txtUserName.setBorder(RedLine);
                        } else {
                            if (tk1 != null) {
                                JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
                                new FMenuStaff(txtUserName.getText()).setVisible(true);
                                this.dispose();
                            } else {
                                lbMatkhau.setText("*Mật khẩu không đúng");
                                txtPassWord.setText("");
                                lbMatkhau.setForeground(Color.red);
                                Border RedLine = BorderFactory.createLineBorder(Color.red);
                                txtPassWord.setBorder(RedLine);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_txtPassWordKeyPressed

    private void txtPassWordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassWordMouseClicked
        lbMatkhau.setText("");
        txtPassWord.setBorder(null);
    }//GEN-LAST:event_txtPassWordMouseClicked

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
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnQuenMK;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbMatkhau;
    private javax.swing.JLabel lbTaikhoan;
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
