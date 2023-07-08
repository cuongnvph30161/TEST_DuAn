/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import domainmodel.TaiKhoan;
import interfaceservices.INhanVienService;
import interfaceservices.ITaiKhoanService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import services.NhanVienService;
import services.TaiKhoanService;
import java.util.regex.Pattern;
import repositorys.EmailSender;

public class QuenMatKhau2 extends javax.swing.JFrame {

    public INhanVienService nhanVienService = new NhanVienService();
    public ITaiKhoanService taiKhoanService = new TaiKhoanService();
    public String email;

    public QuenMatKhau2() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenTaiKhoan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnKhoiPhuc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giao diện quên mật khẩu");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("QUÊN MẬT KHẨU");

        jLabel2.setText("Tên tài khoản");

        jLabel3.setText("Email");

        btnKhoiPhuc.setBackground(new java.awt.Color(22, 139, 89));
        btnKhoiPhuc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKhoiPhuc.setForeground(new java.awt.Color(255, 255, 255));
        btnKhoiPhuc.setText("Khôi phục");
        btnKhoiPhuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhoiPhucMouseClicked(evt);
            }
        });
        btnKhoiPhuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoiPhucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTenTaiKhoan)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(txtEmail)
                        .addComponent(btnKhoiPhuc, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnKhoiPhuc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKhoiPhucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhoiPhucMouseClicked

    }//GEN-LAST:event_btnKhoiPhucMouseClicked

    public class EmailValidator {

        private static final Pattern EMAIL_PATTERN = Pattern.compile(
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
        );

        public static boolean isValidEmail(String email) {
            return EMAIL_PATTERN.matcher(email).matches();
        }
    }

    private void btnKhoiPhucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoiPhucActionPerformed
        String email = txtEmail.getText();
        // Kiểm tra trường email có rỗng không
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập địa chỉ email.");
        } else if (!EmailValidator.isValidEmail(email)) { // Kiểm tra tính hợp lệ của địa chỉ email
            JOptionPane.showMessageDialog(this, "Địa chỉ email không hợp lệ.");
        } else {
            // Gửi email xác nhận đến địa chỉ email người dùng

            String code = EmailSender.sendEmail(email, "nguyendhph23086@fpt.edu.vn", "mnkfjdqlxlkbntqh");

            // Kiểm tra kết quả gửi email
            if (code != null) {
                JOptionPane.showMessageDialog(this, "Gửi email xác nhận thành công.");
                new NhapMaBaoMat(email).setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Gửi email xác nhận thất bại. Vui lòng thử lại sau.");
                return;
            }
        }

    }//GEN-LAST:event_btnKhoiPhucActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                QuenMatKhau2 quenMatKhau2 = new QuenMatKhau2();
                quenMatKhau2.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKhoiPhuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtTenTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
