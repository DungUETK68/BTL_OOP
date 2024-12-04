
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    private Connection con;
    private PreparedStatement pst;

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passwordRe = new javax.swing.JPasswordField();
        usernameRe = new javax.swing.JTextField();
        studentIDRe = new javax.swing.JTextField();
        addressRe = new javax.swing.JTextField();
        CreateRe = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        nameRe = new javax.swing.JTextField();
        CancelRe = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        emailRe = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel2.setBackground(new java.awt.Color(0, 204, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Đăng ký tài khoản");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(129, 129, 129))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Tên đăng nhập:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Mật khẩu:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Mã sinh viên:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Địa chỉ:");

        passwordRe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordReActionPerformed(evt);
            }
        });

        usernameRe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        studentIDRe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        studentIDRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIDReActionPerformed(evt);
            }
        });

        addressRe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        CreateRe.setBackground(new java.awt.Color(0, 153, 255));
        CreateRe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CreateRe.setForeground(new java.awt.Color(255, 255, 255));
        CreateRe.setText("Create");
        CreateRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateReActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Họ và tên:");

        nameRe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        CancelRe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CancelRe.setText("Cancel");
        CancelRe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelReMouseClicked(evt);
            }
        });
        CancelRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelReActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Email:");

        emailRe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(CreateRe, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(CancelRe, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(passwordRe, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                        .addComponent(usernameRe)
                        .addComponent(studentIDRe)
                        .addComponent(addressRe)
                        .addComponent(nameRe)
                        .addComponent(emailRe)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIDRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateRe, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelRe, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Connect() {
        con = DatabaseConnection.getConnection();
    }


    private void passwordReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordReActionPerformed
        // Nhap mat khau
    }//GEN-LAST:event_passwordReActionPerformed

    private void studentIDReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIDReActionPerformed
        // Nhap ma sinh vien
    }//GEN-LAST:event_studentIDReActionPerformed

    // them tai khoan 
    private void CreateReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateReActionPerformed
        try {
            String name = nameRe.getText();
            String username = usernameRe.getText();
            String password = passwordRe.getText();
            String studentid = studentIDRe.getText();
            String address = addressRe.getText();
            String email = emailRe.getText();

            if (name.isEmpty() || username.isEmpty() || password.isEmpty() || studentid.isEmpty() || address.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (username.equals("admin") || password.equals("password")) {
                JOptionPane.showMessageDialog(this, "Tải khoản đã tồn tại!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Statement stm = con.createStatement();
            String checkUsername = "SELECT * FROM student WHERE username='" + username + "'";
            ResultSet rs = stm.executeQuery(checkUsername);

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Username đã tồn tại!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                usernameRe.setText("");
            } else {
                //them tai khoan vao database
                pst = con.prepareStatement("INSERT INTO student (studentid, studentname, email, address, username, password)VALUES(?, ?, ?, ?, ?, ?)");

                pst.setString(1, studentid);
                pst.setString(2, name);
                pst.setString(3, email);
                pst.setString(4, address);
                pst.setString(5, username);
                pst.setString(6, password);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Tạo tài khoản thành công!");
                new Login().setVisible(true);
                dispose();
            }

        } catch (Exception e) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_CreateReActionPerformed

    private void CancelReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelReActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelReActionPerformed

    private void CancelReMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelReMouseClicked
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelReMouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelRe;
    private javax.swing.JButton CreateRe;
    private javax.swing.JTextField addressRe;
    private javax.swing.JTextField emailRe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameRe;
    private javax.swing.JPasswordField passwordRe;
    private javax.swing.JTextField studentIDRe;
    private javax.swing.JTextField usernameRe;
    // End of variables declaration//GEN-END:variables
}
