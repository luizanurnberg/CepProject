/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cepproject.view;

import java.awt.event.ActionListener;

/**
 *
 * @author luizanurnberg
 */
public class CepProjectViewLogin extends javax.swing.JFrame {

    /**
     * Creates new form CepProjectViewLogin
     */
    public CepProjectViewLogin() {
        initComponents();
    }
    
    public String getLoginEmail() {
        return jtEmailLoginField.getText();
    }
    
    public String getLoginPassword() {
        return jtPasswordLoginField.getText();
    }
    
    public void setLoginButton(ActionListener actionLogin) {
        jbLogin.addActionListener(actionLogin);
    }
    
    public void setSignUpButton(ActionListener actionSignUp) {
        jbSignUp.addActionListener(actionSignUp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLogin = new javax.swing.JPanel();
        jtEmailLoginField = new javax.swing.JTextField();
        jtPasswordLoginField = new javax.swing.JTextField();
        jlEmailLoginText = new javax.swing.JLabel();
        jbLogin = new javax.swing.JButton();
        jlPasswordLoginText = new javax.swing.JLabel();
        jbSignUp = new javax.swing.JButton();
        jlLoginWarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtEmailLoginField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEmailLoginFieldActionPerformed(evt);
            }
        });

        jtPasswordLoginField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPasswordLoginFieldActionPerformed(evt);
            }
        });

        jlEmailLoginText.setText("E-mail");

        jbLogin.setBackground(new java.awt.Color(204, 255, 204));
        jbLogin.setText("Entrar");

        jlPasswordLoginText.setText("Senha");

        jbSignUp.setBackground(new java.awt.Color(204, 204, 204));
        jbSignUp.setText("Cadastrar-se");

        jlLoginWarning.setText("LOGIN");

        javax.swing.GroupLayout jpLoginLayout = new javax.swing.GroupLayout(jpLogin);
        jpLogin.setLayout(jpLoginLayout);
        jpLoginLayout.setHorizontalGroup(
            jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLoginLayout.createSequentialGroup()
                .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLoginLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlEmailLoginText)
                            .addComponent(jtEmailLoginField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtPasswordLoginField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPasswordLoginText)))
                    .addGroup(jpLoginLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jbLogin)))
                .addGap(0, 89, Short.MAX_VALUE))
            .addGroup(jpLoginLayout.createSequentialGroup()
                .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLoginLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jlLoginWarning))
                    .addGroup(jpLoginLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jbSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpLoginLayout.setVerticalGroup(
            jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLoginLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlLoginWarning)
                .addGap(39, 39, 39)
                .addComponent(jlEmailLoginText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtEmailLoginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlPasswordLoginText)
                .addGap(4, 4, 4)
                .addComponent(jtPasswordLoginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jbSignUp)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtEmailLoginFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEmailLoginFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEmailLoginFieldActionPerformed

    private void jtPasswordLoginFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPasswordLoginFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPasswordLoginFieldActionPerformed

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
            java.util.logging.Logger.getLogger(CepProjectViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CepProjectViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CepProjectViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CepProjectViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CepProjectViewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbLogin;
    private javax.swing.JButton jbSignUp;
    private javax.swing.JLabel jlEmailLoginText;
    private javax.swing.JLabel jlLoginWarning;
    private javax.swing.JLabel jlPasswordLoginText;
    private javax.swing.JPanel jpLogin;
    private javax.swing.JTextField jtEmailLoginField;
    private javax.swing.JTextField jtPasswordLoginField;
    // End of variables declaration//GEN-END:variables
}