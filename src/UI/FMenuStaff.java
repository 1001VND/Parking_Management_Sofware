package UI;

import DAO.DangNhapDAO;
import DTO.AccountDTO;
import java.awt.event.KeyEvent;

public class FMenuStaff extends javax.swing.JFrame {

    private PFNhanXe PFNhanXeTab;
    private PFTraXe PFTraXeTab;
    private PFDKiVeThang PFDKiVeThangTab;
    private PFTraCuuBaiXe PFTraCuuBaiXeTab;
    private PFThongTinThem PFInfor;

    public FMenuStaff(String user) {
        initComponents();
        setSize(1270, 720);
        setLocationRelativeTo(null);
        this.setTitle("PHẦN MỀN QUẢN LÝ BÃI GỬI XE");
        xinchao(user);
        btnNhanXe.setMnemonic(KeyEvent.VK_1);
        btnTraXe.setMnemonic(KeyEvent.VK_2);
        btnDKVeThang.setMnemonic(KeyEvent.VK_3);
        btnThongTinBaiXe.setMnemonic(KeyEvent.VK_4);
        btnThongTinThem.setMnemonic(KeyEvent.VK_5);
    }

    private void xinchao(String user) {
        DangNhapDAO dn = new DangNhapDAO();
        AccountDTO ac = dn.CheckUser(user);
        if (ac != null) {
            txtChaomung.setText("Chào mừng nhân viên " + ac.getTenNguoidung());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtChaomung = new javax.swing.JLabel();
        btnDoiMK = new javax.swing.JLabel();
        btnThoat = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        TabMainBoard = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnNhanXe = new javax.swing.JButton();
        btnTraXe = new javax.swing.JButton();
        btnDKVeThang = new javax.swing.JButton();
        btnThongTinBaiXe = new javax.swing.JButton();
        btnThongTinThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1270, 720));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_parking_64px_1.png"))); // NOI18N
        jLabel3.setName("ParkingIcon"); // NOI18N

        txtChaomung.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtChaomung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_user_32px_1.png"))); // NOI18N
        txtChaomung.setText("Xin Chào");
        txtChaomung.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnDoiMK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDoiMK.setText("Đổi Mật Khẩu");
        btnDoiMK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDoiMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoiMKMouseClicked(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/download-icon-left+previous+icon-1320166862746760425_24.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtChaomung, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDoiMK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThoat)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDoiMK)
                            .addComponent(btnThoat)
                            .addComponent(txtChaomung))
                        .addGap(21, 21, 21))))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        TabMainBoard.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        TabMainBoard.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        TabMainBoard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabMainBoard.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabMainBoard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabMainBoard)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 515, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnNhanXe.setBackground(new java.awt.Color(102, 102, 255));
        btnNhanXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_sedan_32px.png"))); // NOI18N
        btnNhanXe.setText("Nhận Xe");
        btnNhanXe.setBorder(null);
        btnNhanXe.setBorderPainted(false);
        btnNhanXe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNhanXe.setFocusPainted(false);
        btnNhanXe.setFocusable(false);
        btnNhanXe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhanXe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNhanXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanXeActionPerformed(evt);
            }
        });

        btnTraXe.setBackground(new java.awt.Color(102, 102, 255));
        btnTraXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_car_theft_32px.png"))); // NOI18N
        btnTraXe.setText("Trả Xe");
        btnTraXe.setBorder(null);
        btnTraXe.setBorderPainted(false);
        btnTraXe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTraXe.setFocusPainted(false);
        btnTraXe.setFocusable(false);
        btnTraXe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTraXe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTraXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraXeActionPerformed(evt);
            }
        });

        btnDKVeThang.setBackground(new java.awt.Color(102, 102, 255));
        btnDKVeThang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_membership_card_32px_1.png"))); // NOI18N
        btnDKVeThang.setText("Đăng Kí Vé Tháng");
        btnDKVeThang.setBorder(null);
        btnDKVeThang.setBorderPainted(false);
        btnDKVeThang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDKVeThang.setFocusPainted(false);
        btnDKVeThang.setFocusable(false);
        btnDKVeThang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDKVeThang.setName("btnDKVeThang"); // NOI18N
        btnDKVeThang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDKVeThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDKVeThangActionPerformed(evt);
            }
        });

        btnThongTinBaiXe.setBackground(new java.awt.Color(102, 102, 255));
        btnThongTinBaiXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_car_racing_32px_1.png"))); // NOI18N
        btnThongTinBaiXe.setText("Thông Tin Bãi Xe");
        btnThongTinBaiXe.setBorder(null);
        btnThongTinBaiXe.setBorderPainted(false);
        btnThongTinBaiXe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongTinBaiXe.setFocusable(false);
        btnThongTinBaiXe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThongTinBaiXe.setName("btnThongTinBaiXe"); // NOI18N
        btnThongTinBaiXe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThongTinBaiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinBaiXeActionPerformed(evt);
            }
        });

        btnThongTinThem.setBackground(new java.awt.Color(102, 102, 255));
        btnThongTinThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_information_32px.png"))); // NOI18N
        btnThongTinThem.setText("Thông Tin");
        btnThongTinThem.setBorder(null);
        btnThongTinThem.setBorderPainted(false);
        btnThongTinThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongTinThem.setFocusPainted(false);
        btnThongTinThem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThongTinThem.setName("btnThongTinThem"); // NOI18N
        btnThongTinThem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThongTinThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThongTinThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraXe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNhanXe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDKVeThang, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongTinBaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnNhanXe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnTraXe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnDKVeThang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnThongTinBaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnThongTinThem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1271, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {
        new FLogin().setVisible(true);
        this.dispose();
    }
    private void btnThongTinThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinThemActionPerformed
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFInfor = new PFThongTinThem();
            TabMainBoard.addTab("Thông Tin", null, PFInfor, "Thông Tin");
        }
        if (PFInfor == null) {
            PFInfor = new PFThongTinThem();
            TabMainBoard.addTab("Thông Tin", null, PFInfor, "Thông Tin");
        }
    }//GEN-LAST:event_btnThongTinThemActionPerformed

    private void btnDKVeThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDKVeThangActionPerformed
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFDKiVeThangTab = new PFDKiVeThang();
            TabMainBoard.addTab("Đăng Kí Vé Thàng", null, PFDKiVeThangTab, "Đăng Kí Vé Thàng");
        }
        if (PFDKiVeThangTab == null) {
            PFDKiVeThangTab = new PFDKiVeThang();
            TabMainBoard.addTab("Đăng Kí Vé Thàng", null, PFDKiVeThangTab, "Đăng Kí Vé Thàng");
        }
    }//GEN-LAST:event_btnDKVeThangActionPerformed

    private void btnThongTinBaiXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinBaiXeActionPerformed
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFTraCuuBaiXeTab = new PFTraCuuBaiXe();
            TabMainBoard.addTab("Thông Tin Bãi Xe", null, PFTraCuuBaiXeTab, "Thông Tin Bãi Xe");
        }
        if (PFTraCuuBaiXeTab == null) {
            PFTraCuuBaiXeTab = new PFTraCuuBaiXe();
            TabMainBoard.addTab("Thông Tin Bãi Xe", null, PFTraCuuBaiXeTab, "Thông Tin Bãi Xe");
        }
    }//GEN-LAST:event_btnThongTinBaiXeActionPerformed

    private void btnNhanXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanXeActionPerformed
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFNhanXeTab = new PFNhanXe();
            TabMainBoard.addTab("Nhập Xe", null, PFNhanXeTab, "Nhập Xe");
        }
        if (PFNhanXeTab == null) {
            PFNhanXeTab = new PFNhanXe();
            TabMainBoard.addTab("Nhập Xe", null, PFNhanXeTab, "Nhập Xe");
        }
    }//GEN-LAST:event_btnNhanXeActionPerformed

    private void btnTraXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraXeActionPerformed
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFTraXeTab = new PFTraXe();
            TabMainBoard.addTab("Trả Xe", null, PFTraXeTab, "trả Xe");
        }
        if (PFTraXeTab == null) {
            PFTraXeTab = new PFTraXe();
            TabMainBoard.addTab("Trả Xe", null, PFTraXeTab, "trả Xe");
        }
    }//GEN-LAST:event_btnTraXeActionPerformed

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        new FLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThoatMouseClicked

    private void btnDoiMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiMKMouseClicked
        new FDoiMatKhau().setVisible(true);
    }//GEN-LAST:event_btnDoiMKMouseClicked

    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabMainBoard;
    private javax.swing.JButton btnDKVeThang;
    private javax.swing.JLabel btnDoiMK;
    private javax.swing.JButton btnNhanXe;
    private javax.swing.JLabel btnThoat;
    private javax.swing.JButton btnThongTinBaiXe;
    private javax.swing.JButton btnThongTinThem;
    private javax.swing.JButton btnTraXe;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel txtChaomung;
    // End of variables declaration//GEN-END:variables
}
