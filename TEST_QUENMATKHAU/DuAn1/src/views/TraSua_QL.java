/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Color;
import javax.swing.JFrame;
import utilities.XImages;

public class TraSua_QL extends javax.swing.JFrame {

    public TraSua_QL() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        init();
    }
public void init() {
        setIconImage(XImages.getIconApp());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnMenu = new javax.swing.JPanel();
        lblTraSua = new javax.swing.JLabel();
        lblNhanVien1 = new javax.swing.JLabel();
        lblSanPham = new javax.swing.JLabel();
        lblQuanLyBan = new javax.swing.JLabel();
        lblHoaDon = new javax.swing.JLabel();
        lblVoucher = new javax.swing.JLabel();
        lblTaiKhoan = new javax.swing.JLabel();
        lblThongKe = new javax.swing.JLabel();
        lblDoiMatKhau = new javax.swing.JLabel();
        btnKhieuNaiHoTro = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jpnTong = new javax.swing.JPanel();
        jpnNhanVien = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnSanPham = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpnQLBan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpnHoaDon = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jpnVoucher = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jpnTaiKhoan = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jpnThongKe = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jpnDoiMatKhau = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jpnKhieuNaiHoTro = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hệ thống quản lý quán trà sữa ToTo");
        setBounds(new java.awt.Rectangle(0, 0, 1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));

        jpnMenu.setBackground(new java.awt.Color(0, 65, 123));
        jpnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTraSua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTraSua.setForeground(new java.awt.Color(255, 255, 255));
        lblTraSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoXoaNen2.png"))); // NOI18N
        lblTraSua.setText("TRÀ SỮA TOTO");
        jpnMenu.add(lblTraSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        lblNhanVien1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNhanVien1.setForeground(new java.awt.Color(255, 255, 255));
        lblNhanVien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nhanVien.png"))); // NOI18N
        lblNhanVien1.setText("  NHÂN VIÊN");
        lblNhanVien1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNhanVien1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNhanVien1MouseEntered(evt);
            }
        });
        jpnMenu.add(lblNhanVien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 190, -1));

        lblSanPham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/sanPham.png"))); // NOI18N
        lblSanPham.setText("  SẢN PHẨM");
        lblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseClicked(evt);
            }
        });
        jpnMenu.add(lblSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, -1));

        lblQuanLyBan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQuanLyBan.setForeground(new java.awt.Color(255, 255, 255));
        lblQuanLyBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ban2.png"))); // NOI18N
        lblQuanLyBan.setText("  QUẢN LÝ BÀN");
        lblQuanLyBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuanLyBanMouseClicked(evt);
            }
        });
        jpnMenu.add(lblQuanLyBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        lblHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lblHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/hoaDon.png"))); // NOI18N
        lblHoaDon.setText("  HÓA ĐƠN");
        lblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHoaDonMouseClicked(evt);
            }
        });
        jpnMenu.add(lblHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        lblVoucher.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVoucher.setForeground(new java.awt.Color(255, 255, 255));
        lblVoucher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/voucher.png"))); // NOI18N
        lblVoucher.setText("  VOUCHER");
        lblVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoucherMouseClicked(evt);
            }
        });
        jpnMenu.add(lblVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        lblTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        lblTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/taiKhoan.png"))); // NOI18N
        lblTaiKhoan.setText("  TÀI KHOẢN");
        lblTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTaiKhoanMouseClicked(evt);
            }
        });
        jpnMenu.add(lblTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        lblThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblThongKe.setForeground(new java.awt.Color(255, 255, 255));
        lblThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/thongKe.png"))); // NOI18N
        lblThongKe.setText("  THỐNG KÊ");
        lblThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongKeMouseClicked(evt);
            }
        });
        jpnMenu.add(lblThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        lblDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDoiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        lblDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/doiMatKhau.png"))); // NOI18N
        lblDoiMatKhau.setText("  ĐỔI MẬT KHẨU");
        lblDoiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDoiMatKhauMouseClicked(evt);
            }
        });
        jpnMenu.add(lblDoiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 160, -1));

        btnKhieuNaiHoTro.setBackground(new java.awt.Color(2, 82, 155));
        btnKhieuNaiHoTro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKhieuNaiHoTro.setForeground(new java.awt.Color(255, 255, 255));
        btnKhieuNaiHoTro.setText("KHIẾU NẠI HỖ TRỢ ?");
        btnKhieuNaiHoTro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhieuNaiHoTroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKhieuNaiHoTroMouseEntered(evt);
            }
        });
        jpnMenu.add(btnKhieuNaiHoTro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, -1, 40));

        btnDangXuat.setBackground(new java.awt.Color(45, 132, 252));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setText("ĐĂNG XUẤT");
        btnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseClicked(evt);
            }
        });
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jpnMenu.add(btnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 750, 170, -1));
        jpnMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 220, 10));
        jpnMenu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 10));

        jpnTong.setBackground(new java.awt.Color(0, 153, 51));
        jpnTong.setLayout(new java.awt.CardLayout());

        jpnNhanVien.setBackground(new java.awt.Color(204, 255, 0));

        jLabel1.setText("NHÂN VIÊN");

        javax.swing.GroupLayout jpnNhanVienLayout = new javax.swing.GroupLayout(jpnNhanVien);
        jpnNhanVien.setLayout(jpnNhanVienLayout);
        jpnNhanVienLayout.setHorizontalGroup(
            jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhanVienLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel1)
                .addContainerGap(1643, Short.MAX_VALUE))
        );
        jpnNhanVienLayout.setVerticalGroup(
            jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhanVienLayout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnTong.add(jpnNhanVien, "card2");

        jpnSanPham.setBackground(new java.awt.Color(255, 51, 204));

        jLabel3.setText("SẢN PHẨM");

        javax.swing.GroupLayout jpnSanPhamLayout = new javax.swing.GroupLayout(jpnSanPham);
        jpnSanPham.setLayout(jpnSanPhamLayout);
        jpnSanPhamLayout.setHorizontalGroup(
            jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSanPhamLayout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jLabel3)
                .addContainerGap(1522, Short.MAX_VALUE))
        );
        jpnSanPhamLayout.setVerticalGroup(
            jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSanPhamLayout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(jLabel3)
                .addContainerGap(689, Short.MAX_VALUE))
        );

        jpnTong.add(jpnSanPham, "card3");

        jpnQLBan.setBackground(new java.awt.Color(204, 204, 0));
        jpnQLBan.setForeground(new java.awt.Color(204, 0, 153));

        jLabel2.setText("QUẢN LÝ BÀN");

        javax.swing.GroupLayout jpnQLBanLayout = new javax.swing.GroupLayout(jpnQLBan);
        jpnQLBan.setLayout(jpnQLBanLayout);
        jpnQLBanLayout.setHorizontalGroup(
            jpnQLBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLBanLayout.createSequentialGroup()
                .addGap(619, 619, 619)
                .addComponent(jLabel2)
                .addContainerGap(1264, Short.MAX_VALUE))
        );
        jpnQLBanLayout.setVerticalGroup(
            jpnQLBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQLBanLayout.createSequentialGroup()
                .addContainerGap(639, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(425, 425, 425))
        );

        jpnTong.add(jpnQLBan, "card4");

        jpnHoaDon.setBackground(new java.awt.Color(255, 153, 0));

        jLabel4.setText("HÓA ĐƠN");

        javax.swing.GroupLayout jpnHoaDonLayout = new javax.swing.GroupLayout(jpnHoaDon);
        jpnHoaDon.setLayout(jpnHoaDonLayout);
        jpnHoaDonLayout.setHorizontalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1629, Short.MAX_VALUE))
        );
        jpnHoaDonLayout.setVerticalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHoaDonLayout.createSequentialGroup()
                .addContainerGap(645, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(419, 419, 419))
        );

        jpnTong.add(jpnHoaDon, "card5");

        jpnVoucher.setBackground(new java.awt.Color(0, 204, 51));

        jLabel5.setText("VOUCHER");

        javax.swing.GroupLayout jpnVoucherLayout = new javax.swing.GroupLayout(jpnVoucher);
        jpnVoucher.setLayout(jpnVoucherLayout);
        jpnVoucherLayout.setHorizontalGroup(
            jpnVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnVoucherLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1702, Short.MAX_VALUE))
        );
        jpnVoucherLayout.setVerticalGroup(
            jpnVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnVoucherLayout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(jLabel5)
                .addContainerGap(716, Short.MAX_VALUE))
        );

        jpnTong.add(jpnVoucher, "card6");

        jpnTaiKhoan.setBackground(new java.awt.Color(204, 255, 204));

        jLabel6.setText("TÀI KHOẢN");

        javax.swing.GroupLayout jpnTaiKhoanLayout = new javax.swing.GroupLayout(jpnTaiKhoan);
        jpnTaiKhoan.setLayout(jpnTaiKhoanLayout);
        jpnTaiKhoanLayout.setHorizontalGroup(
            jpnTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTaiKhoanLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1694, Short.MAX_VALUE))
        );
        jpnTaiKhoanLayout.setVerticalGroup(
            jpnTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTaiKhoanLayout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel6)
                .addContainerGap(775, Short.MAX_VALUE))
        );

        jpnTong.add(jpnTaiKhoan, "card7");

        jpnThongKe.setBackground(new java.awt.Color(0, 102, 153));

        jLabel7.setText("THỐNG KÊ");

        javax.swing.GroupLayout jpnThongKeLayout = new javax.swing.GroupLayout(jpnThongKe);
        jpnThongKe.setLayout(jpnThongKeLayout);
        jpnThongKeLayout.setHorizontalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1656, Short.MAX_VALUE))
        );
        jpnThongKeLayout.setVerticalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel7)
                .addContainerGap(798, Short.MAX_VALUE))
        );

        jpnTong.add(jpnThongKe, "card8");

        jpnDoiMatKhau.setBackground(new java.awt.Color(255, 204, 204));

        jLabel8.setText("ĐỔI MẬT KHẨU");

        javax.swing.GroupLayout jpnDoiMatKhauLayout = new javax.swing.GroupLayout(jpnDoiMatKhau);
        jpnDoiMatKhau.setLayout(jpnDoiMatKhauLayout);
        jpnDoiMatKhauLayout.setHorizontalGroup(
            jpnDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDoiMatKhauLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1650, Short.MAX_VALUE))
        );
        jpnDoiMatKhauLayout.setVerticalGroup(
            jpnDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDoiMatKhauLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jLabel8)
                .addContainerGap(776, Short.MAX_VALUE))
        );

        jpnTong.add(jpnDoiMatKhau, "card9");

        jpnKhieuNaiHoTro.setBackground(new java.awt.Color(255, 204, 102));

        jLabel9.setText("KHIẾU NẠI HỖ TRỢ");

        javax.swing.GroupLayout jpnKhieuNaiHoTroLayout = new javax.swing.GroupLayout(jpnKhieuNaiHoTro);
        jpnKhieuNaiHoTro.setLayout(jpnKhieuNaiHoTroLayout);
        jpnKhieuNaiHoTroLayout.setHorizontalGroup(
            jpnKhieuNaiHoTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKhieuNaiHoTroLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1610, Short.MAX_VALUE))
        );
        jpnKhieuNaiHoTroLayout.setVerticalGroup(
            jpnKhieuNaiHoTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKhieuNaiHoTroLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel9)
                .addContainerGap(810, Short.MAX_VALUE))
        );

        jpnTong.add(jpnKhieuNaiHoTro, "card10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed

    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseClicked
       
        new DangXuat().setVisible(true);
    }//GEN-LAST:event_btnDangXuatMouseClicked

    private void btnKhieuNaiHoTroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhieuNaiHoTroMouseClicked
        jpnKhieuNaiHoTro.setVisible(true);
        jpnNhanVien.setVisible(false);
        jpnSanPham.setVisible(false);
        jpnQLBan.setVisible(false);
        jpnHoaDon.setVisible(false);
        jpnVoucher.setVisible(false);
        jpnTaiKhoan.setVisible(false);
        jpnThongKe.setVisible(false);
        jpnDoiMatKhau.setVisible(false);
    }//GEN-LAST:event_btnKhieuNaiHoTroMouseClicked

    private void lblDoiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoiMatKhauMouseClicked
       new DoiMatKhau().setVisible(true);
        
    }//GEN-LAST:event_lblDoiMatKhauMouseClicked

    private void lblThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseClicked

        jpnThongKe.setVisible(true);
        jpnNhanVien.setVisible(false);
        jpnSanPham.setVisible(false);
        jpnQLBan.setVisible(false);
        jpnHoaDon.setVisible(false);
        jpnVoucher.setVisible(false);
        jpnTaiKhoan.setVisible(false);
    }//GEN-LAST:event_lblThongKeMouseClicked

    private void lblTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTaiKhoanMouseClicked

        jpnTaiKhoan.setVisible(true);
        jpnNhanVien.setVisible(false);
        jpnSanPham.setVisible(false);
        jpnQLBan.setVisible(false);
        jpnHoaDon.setVisible(false);
        jpnVoucher.setVisible(false);
    }//GEN-LAST:event_lblTaiKhoanMouseClicked

    private void lblVoucherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoucherMouseClicked

        jpnVoucher.setVisible(true);
        jpnNhanVien.setVisible(false);
        jpnSanPham.setVisible(false);
        jpnQLBan.setVisible(false);
        jpnHoaDon.setVisible(false);
    }//GEN-LAST:event_lblVoucherMouseClicked

    private void lblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMouseClicked
        jpnHoaDon.setVisible(true);
        jpnNhanVien.setVisible(false);
        jpnSanPham.setVisible(false);
        jpnQLBan.setVisible(false);
    }//GEN-LAST:event_lblHoaDonMouseClicked

    private void lblQuanLyBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyBanMouseClicked

        jpnQLBan.setVisible(true);
        jpnNhanVien.setVisible(false);
        jpnSanPham.setVisible(false);
    }//GEN-LAST:event_lblQuanLyBanMouseClicked

    private void lblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseClicked
        jpnSanPham.setVisible(true);
        jpnNhanVien.setVisible(false);
    }//GEN-LAST:event_lblSanPhamMouseClicked

    private void lblNhanVien1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVien1MouseClicked
        jpnNhanVien.setVisible(true);
        jpnSanPham.setVisible(false);
    }//GEN-LAST:event_lblNhanVien1MouseClicked

    private void btnKhieuNaiHoTroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhieuNaiHoTroMouseEntered
     
    }//GEN-LAST:event_btnKhieuNaiHoTroMouseEntered

    private void lblNhanVien1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVien1MouseEntered
    }//GEN-LAST:event_lblNhanVien1MouseEntered

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TraSua_QL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnKhieuNaiHoTro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpnDoiMatKhau;
    private javax.swing.JPanel jpnHoaDon;
    private javax.swing.JPanel jpnKhieuNaiHoTro;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnNhanVien;
    private javax.swing.JPanel jpnQLBan;
    private javax.swing.JPanel jpnSanPham;
    private javax.swing.JPanel jpnTaiKhoan;
    private javax.swing.JPanel jpnThongKe;
    private javax.swing.JPanel jpnTong;
    private javax.swing.JPanel jpnVoucher;
    private javax.swing.JLabel lblDoiMatKhau;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblNhanVien1;
    private javax.swing.JLabel lblQuanLyBan;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblTraSua;
    private javax.swing.JLabel lblVoucher;
    // End of variables declaration//GEN-END:variables
}
