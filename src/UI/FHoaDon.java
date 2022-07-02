/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.TongXeDAO;
import DAO.TraXeDAO;
import DTO.NhapXeDTO;
import DTO.TongXeDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import javax.swing.Timer;
import java.sql.*;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class FHoaDon extends javax.swing.JFrame {

    /**
     * Creates new form FHoaDon
     */
    public FHoaDon(String mave) {
        initComponents();
        setSize(1270, 720);
        setLocationRelativeTo(null);
        this.setTitle("PHẦN MỀN QUẢN LÝ BÃI GỬI XE");
        loadHoaDon(mave);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        autoDate();
        autoTime();
        loadTien();
    }

    private void autoDate() {
        java.util.Date d = new java.util.Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        txtNgayTra.setText(s.format(d));
    }

    private void autoTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.Date d = new java.util.Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                txtGioTra.setText(s.format(d));
            }
        }).start();
    }

    private void loadTien() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String TuNgay = txtNgayNhan.getText();
        String DenNgay = txtNgayTra.getText();
        try {
            if (txtLoaiXe.getText().trim().equals("Xe máy")) {
                Date DNgaygui = sdf.parse(TuNgay);
                Date DNgaytra = sdf.parse(DenNgay);
                long ngayGui = DNgaygui.getTime();
                long ngayTra = DNgaytra.getTime();
                long soNgayMili = ngayTra - ngayGui;
                long soNgay = soNgayMili / (24 * 60 * 60 * 1000);
                long tongTien = (soNgay + 1) * 5000;
                txtThanhTien.setText(String.valueOf(tongTien));
            } else if (txtLoaiXe.getText().trim().equals("Ô tô")) {
                Date DNgaygui = sdf.parse(TuNgay);
                Date DNgaytra = sdf.parse(DenNgay);
                long ngayGui = DNgaygui.getTime();
                long ngayTra = DNgaytra.getTime();
                long soNgayMili = ngayTra - ngayGui;
                long soNgay = soNgayMili / (24 * 60 * 60 * 1000);
                long tongTien = (soNgay + 1) * 20000;
                txtThanhTien.setText(String.valueOf(tongTien));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadHoaDon(String mave) {
        try {
            TraXeDAO tx = new TraXeDAO();
            NhapXeDTO nx = tx.findXebyMave(mave);

            if (nx != null) {
                txtBienSo.setText(nx.getBienSo());
                txtMauXe.setText(nx.getMauXe());
                txtLoaiXe.setText(nx.getLoaiXe());
                txtMaVe.setText(nx.getMaVe());
                txtKhuVuc.setText(nx.getKhuVuc());
                txtViTri.setText(nx.getViTri());
                txtNgayNhan.setText(nx.getNgayGui().toString());
                txtGioNhan.setText(nx.getGioGui());
                if (txtMaVe.getText().contains("VT") == false) {
                    txtLoaiVe.setText("Vé Ngày");

                } else {
                    txtLoaiVe.setText("Vé Tháng");
                    txtThanhTien.setText("0");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public TongXeDTO themHoadon() {
        TongXeDTO themxe = new TongXeDTO();
        themxe.setBienSo(txtBienSo.getText());
        themxe.setLoaiXe(txtLoaiXe.getText());
        themxe.setLoaiVe(txtLoaiVe.getText());
        themxe.setMaVe(txtMaVe.getText());
        themxe.setMauXe(txtMauXe.getText());
        themxe.setKhuVuc(txtKhuVuc.getText());
        themxe.setViTri(txtViTri.getText());
        themxe.setNgayGui(LocalDate.parse(txtNgayNhan.getText()));
        themxe.setGioGui(txtGioNhan.getText());
        themxe.setNgayTra(LocalDate.parse(txtNgayTra.getText()));
        themxe.setGioTra(txtGioTra.getText());
        int a = Integer.parseInt(txtThanhTien.getText());
        themxe.setGiaTien(a);
        return themxe;
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
        btnInHoaDon = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtBienSo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMauXe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLoaiXe = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMaVe = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtKhuVuc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtViTri = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNgayNhan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtGioNhan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNgayTra = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtGioTra = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtLoaiVe = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1270, 720));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hóa Đơn Gửi Xe");

        btnInHoaDon.setBackground(new java.awt.Color(102, 102, 255));
        btnInHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInHoaDon.setText("In Hóa Đơn và Trả Xe");
        btnInHoaDon.setBorder(null);
        btnInHoaDon.setBorderPainted(false);
        btnInHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInHoaDon.setFocusPainted(false);
        btnInHoaDon.setName("btnInHoaDon"); // NOI18N
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtBienSo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBienSo.setBorder(null);
        txtBienSo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtBienSo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtBienSo.setEnabled(false);
        txtBienSo.setFocusable(false);
        txtBienSo.setName("txtBienSo"); // NOI18N
        txtBienSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBienSoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Biển Số Xe :");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Màu Xe :");

        txtMauXe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMauXe.setBorder(null);
        txtMauXe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtMauXe.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMauXe.setEnabled(false);
        txtMauXe.setFocusable(false);
        txtMauXe.setName("txtMauXe"); // NOI18N
        txtMauXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMauXeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Loại Xe :");

        txtLoaiXe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLoaiXe.setBorder(null);
        txtLoaiXe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtLoaiXe.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtLoaiXe.setEnabled(false);
        txtLoaiXe.setFocusable(false);
        txtLoaiXe.setName("txtLoaiXe"); // NOI18N
        txtLoaiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoaiXeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Mã vé :");

        txtMaVe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMaVe.setBorder(null);
        txtMaVe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtMaVe.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMaVe.setEnabled(false);
        txtMaVe.setFocusable(false);
        txtMaVe.setName("txtMaVe"); // NOI18N
        txtMaVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaVeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Khu Vực :");

        txtKhuVuc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtKhuVuc.setBorder(null);
        txtKhuVuc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtKhuVuc.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtKhuVuc.setEnabled(false);
        txtKhuVuc.setFocusable(false);
        txtKhuVuc.setName("txtKhuVuc"); // NOI18N
        txtKhuVuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKhuVucActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Vị Trí :");

        txtViTri.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtViTri.setBorder(null);
        txtViTri.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtViTri.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtViTri.setEnabled(false);
        txtViTri.setFocusable(false);
        txtViTri.setName("txtViTri"); // NOI18N
        txtViTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViTriActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Ngày Nhận :");

        txtNgayNhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNgayNhan.setBorder(null);
        txtNgayNhan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNgayNhan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNgayNhan.setEnabled(false);
        txtNgayNhan.setFocusable(false);
        txtNgayNhan.setName("txtNgayNhan"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Giờ Nhận :");

        txtGioNhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtGioNhan.setBorder(null);
        txtGioNhan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtGioNhan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtGioNhan.setEnabled(false);
        txtGioNhan.setFocusable(false);
        txtGioNhan.setName("txtGioNhan"); // NOI18N
        txtGioNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGioNhanActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Ngày Trả :");

        txtNgayTra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNgayTra.setBorder(null);
        txtNgayTra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNgayTra.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNgayTra.setEnabled(false);
        txtNgayTra.setFocusable(false);
        txtNgayTra.setName("txtNgayTra"); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Giờ Trả :");

        txtGioTra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtGioTra.setBorder(null);
        txtGioTra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtGioTra.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtGioTra.setEnabled(false);
        txtGioTra.setFocusable(false);
        txtGioTra.setName("txtGioTra"); // NOI18N
        txtGioTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGioTraActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Thành Tiền :");
        jLabel12.setToolTipText("");

        txtThanhTien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtThanhTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtThanhTien.setBorder(null);
        txtThanhTien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtThanhTien.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txtThanhTien.setEnabled(false);
        txtThanhTien.setFocusable(false);
        txtThanhTien.setName("txtTongTien"); // NOI18N
        txtThanhTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThanhTienActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText(" VND");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Loại Vé :");
        jLabel14.setToolTipText("");

        txtLoaiVe.setBackground(new java.awt.Color(204, 204, 204));
        txtLoaiVe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLoaiVe.setBorder(null);
        txtLoaiVe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtLoaiVe.setFocusable(false);
        txtLoaiVe.setName("txtBienSo"); // NOI18N
        txtLoaiVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoaiVeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMauXe, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGioNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGioTra, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLoaiVe, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(0, 0, 0)
                                .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(469, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMauXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMaVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtGioNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtGioTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtLoaiVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtViTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(493, 493, 493)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtGioNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGioNhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGioNhanActionPerformed

    private void txtThanhTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThanhTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThanhTienActionPerformed

    private void txtViTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViTriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViTriActionPerformed

    private void txtKhuVucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKhuVucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKhuVucActionPerformed

    private void txtMaVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaVeActionPerformed

    private void txtGioTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGioTraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGioTraActionPerformed

    private void txtMauXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMauXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMauXeActionPerformed

    private void txtBienSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBienSoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBienSoActionPerformed

    private void txtLoaiXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoaiXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoaiXeActionPerformed

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoaDonActionPerformed
        try {
            TongXeDAO txa = new TongXeDAO();
            TongXeDTO txt = themHoadon();
            String bienso = txtBienSo.getText();
            if (txa.xoaXekhoibai(bienso) > 0) {
                if (txa.themXe(txt) > 0) {
                    JOptionPane.showMessageDialog(this, "Xuất hóa đơn thành công, xe đã rời khỏi bãi!");
                    PFTraXe formtraxe = new PFTraXe();
                    formtraxe.show();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Xuất hóa đơn thất bại!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Xuất hóa đơn thất bại!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        this.dispose();
    }//GEN-LAST:event_btnInHoaDonActionPerformed

    private void txtLoaiVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoaiVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoaiVeActionPerformed

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
            java.util.logging.Logger.getLogger(FHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FHoaDon().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInHoaDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField txtBienSo;
    private javax.swing.JTextField txtGioNhan;
    private javax.swing.JTextField txtGioTra;
    private javax.swing.JTextField txtKhuVuc;
    private javax.swing.JTextField txtLoaiVe;
    private javax.swing.JTextField txtLoaiXe;
    private javax.swing.JTextField txtMaVe;
    private javax.swing.JTextField txtMauXe;
    private javax.swing.JTextField txtNgayNhan;
    private javax.swing.JTextField txtNgayTra;
    private javax.swing.JTextField txtThanhTien;
    private javax.swing.JTextField txtViTri;
    // End of variables declaration//GEN-END:variables
}
