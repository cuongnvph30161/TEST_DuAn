/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;


import javax.swing.JFrame;
import utilities.XImages;

public class TraSua_NV extends javax.swing.JFrame {

    public TraSua_NV() {
        initComponents();
       setExtendedState(JFrame.MAXIMIZED_BOTH);
       btnThem.setVisible(false);
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
        lblBanHang = new javax.swing.JLabel();
        lblSanPham = new javax.swing.JLabel();
        lblQuanLyBan = new javax.swing.JLabel();
        lblHoaDon = new javax.swing.JLabel();
        lblDoiMatKhau = new javax.swing.JLabel();
        btnKhieuNaiHoTro = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jpnTong = new javax.swing.JPanel();
        jpnBanHang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnSanPham = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        lblHinhAnh1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jpnQLBan = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jpnHoaDon = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jpnDoiMatKhau = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpnKhieuNaiHoTro = new javax.swing.JPanel();

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
        jpnMenu.add(lblTraSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblBanHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBanHang.setForeground(new java.awt.Color(255, 255, 255));
        lblBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/sanPham.png"))); // NOI18N
        lblBanHang.setText("  BÁN HÀNG");
        lblBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBanHangMouseClicked(evt);
            }
        });
        jpnMenu.add(lblBanHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, -1));

        lblSanPham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/sanPham.png"))); // NOI18N
        lblSanPham.setText("  SẢN PHẨM");
        lblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseClicked(evt);
            }
        });
        jpnMenu.add(lblSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 120, -1));

        lblQuanLyBan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQuanLyBan.setForeground(new java.awt.Color(255, 255, 255));
        lblQuanLyBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ban2.png"))); // NOI18N
        lblQuanLyBan.setText("  QUẢN LÝ BÀN");
        lblQuanLyBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuanLyBanMouseClicked(evt);
            }
        });
        jpnMenu.add(lblQuanLyBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        lblHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lblHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/hoaDon.png"))); // NOI18N
        lblHoaDon.setText("  HÓA ĐƠN");
        lblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHoaDonMouseClicked(evt);
            }
        });
        jpnMenu.add(lblHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        lblDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDoiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        lblDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/doiMatKhau.png"))); // NOI18N
        lblDoiMatKhau.setText("  ĐỔI MẬT KHẨU");
        lblDoiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDoiMatKhauMouseClicked(evt);
            }
        });
        jpnMenu.add(lblDoiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        btnKhieuNaiHoTro.setBackground(new java.awt.Color(2, 82, 155));
        btnKhieuNaiHoTro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKhieuNaiHoTro.setForeground(new java.awt.Color(255, 255, 255));
        btnKhieuNaiHoTro.setText("KHIẾU NẠI HỖ TRỢ ?");
        btnKhieuNaiHoTro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhieuNaiHoTroMouseClicked(evt);
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
        jpnMenu.add(btnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 740, 170, -1));
        jpnMenu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 10));
        jpnMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 220, 10));

        jpnTong.setBackground(new java.awt.Color(0, 153, 51));
        jpnTong.setLayout(new java.awt.CardLayout());

        jpnBanHang.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BÁN HÀNG");

        javax.swing.GroupLayout jpnBanHangLayout = new javax.swing.GroupLayout(jpnBanHang);
        jpnBanHang.setLayout(jpnBanHangLayout);
        jpnBanHangLayout.setHorizontalGroup(
            jpnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBanHangLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel1)
                .addContainerGap(1641, Short.MAX_VALUE))
        );
        jpnBanHangLayout.setVerticalGroup(
            jpnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBanHangLayout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jLabel1)
                .addContainerGap(744, Short.MAX_VALUE))
        );

        jpnTong.add(jpnBanHang, "card2");

        jpnSanPham.setBackground(new java.awt.Color(255, 255, 255));
        jpnSanPham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Sản phẩm");
        jpnSanPham.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Chọn tầng ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tầng 1", "Tầng 2", "Tầng 3", "Tầng 4", "Tầng 5" }));

        jLabel7.setText("Chọn bàn");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bàn 1", "Bàn 2", "Bàn 3", "Bàn 4", "Bàn 5", "Bàn 6", " " }));

        jButton1.setBackground(new java.awt.Color(45, 132, 252));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Thêm bàn");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên sản phẩm", "Đơn giá", "Số lượng", "Xóa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jLabel8.setText("Ghi chú");

        jLabel9.setText("Phí dịch vụ phát sinh(nếu có)");

        jLabel10.setText("Tổng thanh toán(tạm tính):");

        jButton2.setBackground(new java.awt.Color(45, 132, 252));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Thanh toán");

        jButton3.setBackground(new java.awt.Color(45, 132, 252));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Thêm hóa đơn");

        jLabel20.setText("Danh sách sản phẩm");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 153, 255));
        jLabel21.setText("Xóa tất cả");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addGap(26, 26, 26)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(60, 60, 60)
                                            .addComponent(jButton1))))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(31, 31, 31))
        );

        jpnSanPham.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 84, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tim3.png"))); // NOI18N
        jpnSanPham.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 90, -1, -1));
        jpnSanPham.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 84, 846, 35));

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnThem.setBackground(new java.awt.Color(45, 132, 252));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel2.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        lblHinhAnh1.setText("Hình ảnh 1");
        lblHinhAnh1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblHinhAnh1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhAnh1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHinhAnh1MouseEntered(evt);
            }
        });
        jPanel2.add(lblHinhAnh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 200, 246));

        jLabel12.setText("Hình ảnh 2");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 36, 200, 246));

        jLabel13.setText("Hình ảnh 3");
        jLabel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 36, 200, 246));

        jLabel14.setText("Hình ảnh 4");
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 336, 200, 246));

        jLabel15.setText("Hình ảnh 9");
        jLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 655, 200, 246));

        jLabel16.setText("Hình ảnh 6");
        jLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 336, 200, 246));

        jLabel17.setText("Hình ảnh 7");
        jLabel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 655, 200, 246));

        jLabel18.setText("Hình ảnh 5");
        jLabel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 336, 200, 246));

        jLabel19.setText("Hình ảnh 8");
        jLabel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 655, 200, 246));

        jLabel23.setText("Tên sản phẩm 1");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 288, -1, -1));

        jLabel24.setText("Tên sản phẩm 2");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 288, -1, -1));

        jLabel25.setText("Tên sản phẩm 3");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 288, -1, -1));

        jLabel26.setText("Tên sản phẩm 4");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 588, -1, -1));

        jLabel27.setText("Tên sản phẩm 5");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 588, -1, -1));

        jLabel28.setText("Tên sản phẩm 6");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 588, -1, -1));

        jLabel29.setText("Tên sản phẩm 7");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 913, -1, -1));

        jLabel30.setText("Tên sản phẩm 8");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 913, -1, -1));

        jLabel31.setText("Tên sản phẩm 9");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 913, -1, -1));

        jLabel32.setText("Giá");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 308, -1, -1));

        jLabel33.setText("Giá");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 308, -1, -1));

        jLabel34.setText("Giá");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 308, -1, -1));

        jLabel35.setText("Giá");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 610, -1, -1));

        jLabel36.setText("Giá");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 610, -1, -1));

        jLabel37.setText("Giá");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 610, -1, -1));

        jLabel38.setText("Giá");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 935, -1, -1));

        jLabel39.setText("Giá");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 935, -1, -1));

        jLabel40.setText("Giá");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 935, -1, -1));

        jScrollPane4.setViewportView(jPanel2);

        jpnSanPham.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 137, 840, 660));

        jpnTong.add(jpnSanPham, "card3");

        jpnQLBan.setBackground(new java.awt.Color(102, 204, 255));

        jLabel4.setText("QUẢN LÝ BÀN");

        javax.swing.GroupLayout jpnQLBanLayout = new javax.swing.GroupLayout(jpnQLBan);
        jpnQLBan.setLayout(jpnQLBanLayout);
        jpnQLBanLayout.setHorizontalGroup(
            jpnQLBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLBanLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel4)
                .addContainerGap(1724, Short.MAX_VALUE))
        );
        jpnQLBanLayout.setVerticalGroup(
            jpnQLBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLBanLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel4)
                .addContainerGap(969, Short.MAX_VALUE))
        );

        jpnTong.add(jpnQLBan, "card4");

        jpnHoaDon.setBackground(new java.awt.Color(0, 204, 204));

        jLabel5.setText("HÓA ĐƠN");

        javax.swing.GroupLayout jpnHoaDonLayout = new javax.swing.GroupLayout(jpnHoaDon);
        jpnHoaDon.setLayout(jpnHoaDonLayout);
        jpnHoaDonLayout.setHorizontalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel5)
                .addContainerGap(1780, Short.MAX_VALUE))
        );
        jpnHoaDonLayout.setVerticalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonLayout.createSequentialGroup()
                .addGap(522, 522, 522)
                .addComponent(jLabel5)
                .addContainerGap(609, Short.MAX_VALUE))
        );

        jpnTong.add(jpnHoaDon, "card5");

        jpnDoiMatKhau.setBackground(new java.awt.Color(255, 102, 102));
        jpnDoiMatKhau.setForeground(new java.awt.Color(204, 0, 153));

        jLabel2.setText("ĐỔI MẬT KHẨU");

        javax.swing.GroupLayout jpnDoiMatKhauLayout = new javax.swing.GroupLayout(jpnDoiMatKhau);
        jpnDoiMatKhau.setLayout(jpnDoiMatKhauLayout);
        jpnDoiMatKhauLayout.setHorizontalGroup(
            jpnDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDoiMatKhauLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel2)
                .addContainerGap(1785, Short.MAX_VALUE))
        );
        jpnDoiMatKhauLayout.setVerticalGroup(
            jpnDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDoiMatKhauLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel2)
                .addContainerGap(896, Short.MAX_VALUE))
        );

        jpnTong.add(jpnDoiMatKhau, "card6");

        jpnKhieuNaiHoTro.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout jpnKhieuNaiHoTroLayout = new javax.swing.GroupLayout(jpnKhieuNaiHoTro);
        jpnKhieuNaiHoTro.setLayout(jpnKhieuNaiHoTroLayout);
        jpnKhieuNaiHoTroLayout.setHorizontalGroup(
            jpnKhieuNaiHoTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1955, Short.MAX_VALUE)
        );
        jpnKhieuNaiHoTroLayout.setVerticalGroup(
            jpnKhieuNaiHoTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1147, Short.MAX_VALUE)
        );

        jpnTong.add(jpnKhieuNaiHoTro, "card7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseClicked
        new DangXuat().setVisible(true);
    }//GEN-LAST:event_btnDangXuatMouseClicked

    private void btnKhieuNaiHoTroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhieuNaiHoTroMouseClicked
        jpnKhieuNaiHoTro.setVisible(true);
        jpnSanPham.setVisible(false);
        jpnBanHang.setVisible(false);
        jpnQLBan.setVisible(false);
        jpnHoaDon.setVisible(false);
        jpnDoiMatKhau.setVisible(false);


    }//GEN-LAST:event_btnKhieuNaiHoTroMouseClicked

    private void lblDoiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoiMatKhauMouseClicked

        jpnDoiMatKhau.setVisible(true);
        jpnSanPham.setVisible(false);
        jpnBanHang.setVisible(false);
        jpnQLBan.setVisible(false);
        jpnHoaDon.setVisible(false);
    }//GEN-LAST:event_lblDoiMatKhauMouseClicked

    private void lblBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangMouseClicked
        jpnBanHang.setVisible(true);
    }//GEN-LAST:event_lblBanHangMouseClicked

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed

    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void lblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseClicked
        jpnSanPham.setVisible(true);
        jpnBanHang.setVisible(false);
    }//GEN-LAST:event_lblSanPhamMouseClicked

    private void lblQuanLyBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyBanMouseClicked

        jpnQLBan.setVisible(true);
        jpnSanPham.setVisible(false);
        jpnBanHang.setVisible(false);
    }//GEN-LAST:event_lblQuanLyBanMouseClicked

    private void lblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMouseClicked
        jpnHoaDon.setVisible(true);
        jpnSanPham.setVisible(false);
        jpnBanHang.setVisible(false);
        jpnQLBan.setVisible(false);

    }//GEN-LAST:event_lblHoaDonMouseClicked

    private void lblHinhAnh1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhAnh1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblHinhAnh1MouseClicked

    private void lblHinhAnh1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhAnh1MouseEntered
        btnThem.setVisible(true);
    }//GEN-LAST:event_lblHinhAnh1MouseEntered

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        btnThem.setVisible(false);
    }//GEN-LAST:event_jPanel2MouseEntered

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
       
    }//GEN-LAST:event_btnThemActionPerformed

  
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TraSua_NV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnKhieuNaiHoTro;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpnBanHang;
    private javax.swing.JPanel jpnDoiMatKhau;
    private javax.swing.JPanel jpnHoaDon;
    private javax.swing.JPanel jpnKhieuNaiHoTro;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnQLBan;
    private javax.swing.JPanel jpnSanPham;
    private javax.swing.JPanel jpnTong;
    private javax.swing.JLabel lblBanHang;
    private javax.swing.JLabel lblDoiMatKhau;
    private javax.swing.JLabel lblHinhAnh1;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblQuanLyBan;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblTraSua;
    // End of variables declaration//GEN-END:variables
}
