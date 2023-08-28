/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.IntelliJTheme;
import java.awt.Color;
import javax.swing.JOptionPane;
import service.ServiceTaiKhoan;
import global.Global;
import java.time.LocalDateTime;

/**
 *
 * @author sethk
 */
public class FormDangNhap extends javax.swing.JFrame {
    
    ServiceTaiKhoan qltk = new ServiceTaiKhoan();

    /**
     * Creates new form FormDangNhap
     */
    public FormDangNhap() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new swing.background.Background();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonDN1 = new swing.controls.ButtonDN();
        btExit = new swing.controls.ButtonDN();
        txtUser = new swing.controls.TextField();
        txtPass = new swing.controls.PasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        background1.setBlur(panel);

        panel.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Log In");

        buttonDN1.setForeground(new java.awt.Color(255, 255, 255));
        buttonDN1.setText("Đăng Nhập");
        buttonDN1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        buttonDN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDN1ActionPerformed(evt);
            }
        });

        btExit.setForeground(new java.awt.Color(255, 255, 255));
        btExit.setText("Thoát");
        btExit.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        txtUser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtUser.setHint("Username");

        txtPass.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtPass.setHint("Password");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(buttonDN1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btExit, buttonDN1});

        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btExit, buttonDN1});

        background1.add(panel);
        panel.setBounds(330, 110, 380, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosing

    private void buttonDN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDN1ActionPerformed
        // TODO add your handling code here:
        String user = txtUser.getText();
        String pass = String.valueOf(txtPass.getPassword());
        Global gl = new Global();
        
        gl.setUser(user);
        gl.setPass(pass);
        LocalDateTime time = LocalDateTime.now();
        gl.setGioVao(time);
        
        if (qltk.DangNhap(user, pass).equals("NV")) {
            this.dispose();
            new FormNhanVien().setVisible(true);
        } else if (qltk.DangNhap(user, pass).equals("QL")) {
            this.dispose();
            new FormAdmin().setVisible(true);
        } else if (qltk.DangNhap(user, pass).equals("Fail")) {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu không chính xác");
        }
        

    }//GEN-LAST:event_buttonDN1ActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        IntelliJTheme.setup(FormDangNhap.class.getResourceAsStream("/Light.theme.json"));
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.background.Background background1;
    private swing.controls.ButtonDN btExit;
    private swing.controls.ButtonDN buttonDN1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
    private swing.controls.PasswordField txtPass;
    private swing.controls.TextField txtUser;
    // End of variables declaration//GEN-END:variables
}
