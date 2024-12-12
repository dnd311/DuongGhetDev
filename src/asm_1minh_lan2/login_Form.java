/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asm_1minh_lan2;

import javax.swing.JOptionPane;
import java.sql.*;

public class login_Form extends javax.swing.JFrame {

    String url = "jdbc:sqlserver://localhost:1433;databaseName=QLVT;trustServerCertificate=true";
    String username = "sa";
    String password = "123456654321";
    
    ResultSet rs;
    
    Menu menu = new Menu();
    
    public login_Form() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_signUp = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lbl_login = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        lbl_password = new javax.swing.JLabel();
        pwd_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 830));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel4)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 800);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btn_signUp.setBackground(new java.awt.Color(255, 153, 153));
        btn_signUp.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        btn_signUp.setForeground(new java.awt.Color(255, 255, 255));
        btn_signUp.setText("Sign Up");
        btn_signUp.setBorder(null);
        btn_signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signUpActionPerformed(evt);
            }
        });

        btn_login.setBackground(new java.awt.Color(255, 153, 153));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.setBorder(null);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 153));
        jLabel7.setText("I don't have an account");

        lbl_login.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        lbl_login.setForeground(new java.awt.Color(255, 153, 153));
        lbl_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_login.setText("LOGIN");

        lbl_username.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 153, 153));
        lbl_username.setText("Username:");

        txt_username.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 204, 204));

        lbl_password.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(255, 153, 153));
        lbl_password.setText("Password:");

        pwd_password.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        pwd_password.setForeground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_password)
                                    .addComponent(lbl_username))
                                .addGap(129, 129, 129)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_username)
                                    .addComponent(pwd_password, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))))
                        .addGap(75, 75, 75))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lbl_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_username))
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_password)
                    .addComponent(pwd_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btn_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(400, 0, 890, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signUpActionPerformed
        Sign_Up_Form signUpForm = new Sign_Up_Form();
        signUpForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_signUpActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        int login = JOptionPane.showConfirmDialog(null, "Do you want to login ?", "Confirm", JOptionPane.YES_NO_OPTION);
        if( txt_username.getText().equals("") | String.valueOf(pwd_password.getPassword()).equals("") ){
            JOptionPane.showMessageDialog(null, "Please fill out the form completely !!!");
            return;
        }
        if(login != JOptionPane.YES_OPTION){
            return;
        }
        
        try{
            Connection con = DriverManager.getConnection(url, username, password);
            String sql = "select * from ACCOUNT where Username = ? and Password = ?";
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, txt_username.getText());
            ps.setString(2, String.valueOf(pwd_password.getPassword()));
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Login Successfully");
                menu.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Login Failed");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_loginActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
        String projectPath = System.getProperty("user.dir");
        System.out.println("Đường dẫn gốc của dự án: " + projectPath);
        String imagePath = projectPath + "\\images\\Picture.jpg";
        System.out.println("Đường dẫn đầy đủ tới hình ảnh: " + imagePath);
                new login_Form().setVisible(true);
            }
        });
    }
    
//    ũa, cái main này e làm gì???
//    em đang làm form login bên đây ạ à,để test coi len hình k cai
//            ủa lên mà
//                    anh run chạy thửu mới ok
    
    //dẫn sai url~~ :))))
    // chú ý cái chổ lưu .png đồ á, muốn dễ e để riêng 1 cái assets : 1.icon, 2.image
    // ok ch
    //dạ anh em hiểu r ạ

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_signUp;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField pwd_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
