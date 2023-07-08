/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;
import repositorys.EmailSender;

public class NhapMaBaoMat extends javax.swing.JFrame {

    public String email;

    public NhapMaBaoMat(String email) {
      
        initComponents();
        setLocationRelativeTo(null);
        // Lưu giá trị email vào biến thành viên của lớp
        this.email = email;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaXacNhan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnHuy = new javax.swing.JButton();
        btnTiepTuc = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nhập mã bảo mật");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("NHẬP MÃ BẢO MẬT");

        jLabel2.setText("Vui lòng kiểm tra email để xem tin nhắn văn bản có mã. ");

        txtMaXacNhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel3.setText("Nhập mã");

        btnHuy.setBackground(new java.awt.Color(204, 204, 204));
        btnHuy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHuyMouseClicked(evt);
            }
        });
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        btnTiepTuc.setBackground(new java.awt.Color(0, 65, 123));
        btnTiepTuc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTiepTuc.setForeground(new java.awt.Color(255, 255, 255));
        btnTiepTuc.setText("Tiếp tục");
        btnTiepTuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiepTucActionPerformed(evt);
            }
        });

        jLabel4.setText("Chúng tôi đã gửi mã tới email ");

        jLabel5.setText("của bạn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMaXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel3))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHuy)
                .addGap(32, 32, 32)
                .addComponent(btnTiepTuc)
                .addGap(25, 25, 25))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(txtMaXacNhan))
                .addGap(40, 40, 40)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy)
                    .addComponent(btnTiepTuc))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHuyMouseClicked


    }//GEN-LAST:event_btnHuyMouseClicked
    public class CodeValidator {

        public static boolean validateCode(String inputCode) {
            String sentCode = EmailSender.getSentCode(); // Lấy mã xác nhận đã gửi đi từ sendEmailRepository
            return inputCode.equals(sentCode);
        }
    }


    private void btnTiepTucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiepTucActionPerformed
        String ma = txtMaXacNhan.getText();
        CodeValidator codeValidator = new CodeValidator();
        System.out.println("emailxb"+email);
        // Kiểm tra mã xác nhận có khớp với mã đã gửi đi hay không
        if (codeValidator.validateCode(ma)) {
            // Mã xác nhận hợp lệ
            new XacNhanMatKhau(email).setVisible(true);
            this.dispose();
        } else {
            // Mã xác nhận không hợp lệ
            JOptionPane.showMessageDialog(this, "Mã xác nhận không hợp lệ. Vui lòng kiểm tra lại.");
        }
    }//GEN-LAST:event_btnTiepTucActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
         new QuenMatKhau2().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                javax.swing.JTextField emailField = new javax.swing.JTextField();
                javax.swing.JOptionPane.showOptionDialog(
                        null,
                        emailField,
                        "Nhập email",
                        javax.swing.JOptionPane.OK_CANCEL_OPTION,
                        javax.swing.JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        null
                );

                String email = emailField.getText();
                if (email != null && !email.isEmpty()) {
                    NhapMaBaoMat frame = new NhapMaBaoMat(email);
                    frame.setVisible(true);
                } else {
                    // Xử lý khi người dùng không nhập email
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnTiepTuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtMaXacNhan;
    // End of variables declaration//GEN-END:variables
}