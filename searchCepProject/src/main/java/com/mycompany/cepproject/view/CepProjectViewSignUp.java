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
public class CepProjectViewSignUp extends javax.swing.JFrame {

    /**
     * Creates new form CepProjectViewSignUp
     */
    public CepProjectViewSignUp() {
        initComponents();
    }

    public String getSignUpName() {
        return jtNameSignUpField.getText();
    }

    public String getSignUpEmail() {
        return jtEmailSignUpField.getText();
    }

    public String getSignUpPassword() {
        return jtPasswordSignUpField.getText();
    }
    
    public void setSignUpButton(ActionListener actionSignUp){
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

        jpSignUp = new javax.swing.JPanel();
        jtNameSignUpField = new javax.swing.JTextField();
        jtEmailSignUpField = new javax.swing.JTextField();
        jtPasswordSignUpField = new javax.swing.JTextField();
        jbSignUp = new javax.swing.JButton();
        jlSignUpWarning = new javax.swing.JLabel();
        jlNameSignUpText = new javax.swing.JLabel();
        jlEmailSignUpText = new javax.swing.JLabel();
        jlPasswordSignUpText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtPasswordSignUpField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPasswordSignUpFieldActionPerformed(evt);
            }
        });

        jbSignUp.setBackground(new java.awt.Color(204, 255, 204));
        jbSignUp.setText("Confirmar");

        jlSignUpWarning.setText("CADASTRO");

        jlNameSignUpText.setText("Nome");

        jlEmailSignUpText.setText("E-mail");

        jlPasswordSignUpText.setText("Senha");

        javax.swing.GroupLayout jpSignUpLayout = new javax.swing.GroupLayout(jpSignUp);
        jpSignUp.setLayout(jpSignUpLayout);
        jpSignUpLayout.setHorizontalGroup(
            jpSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSignUpLayout.createSequentialGroup()
                .addGroup(jpSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSignUpLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jpSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtEmailSignUpField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtPasswordSignUpField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNameSignUpField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNameSignUpText)
                            .addComponent(jlEmailSignUpText)
                            .addComponent(jlPasswordSignUpText)))
                    .addGroup(jpSignUpLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jlSignUpWarning))
                    .addGroup(jpSignUpLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jbSignUp)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jpSignUpLayout.setVerticalGroup(
            jpSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSignUpLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlSignUpWarning)
                .addGap(14, 14, 14)
                .addComponent(jlNameSignUpText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNameSignUpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlEmailSignUpText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtEmailSignUpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlPasswordSignUpText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPasswordSignUpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jbSignUp)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpSignUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpSignUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPasswordSignUpFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPasswordSignUpFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPasswordSignUpFieldActionPerformed

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
            java.util.logging.Logger.getLogger(CepProjectViewSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CepProjectViewSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CepProjectViewSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CepProjectViewSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CepProjectViewSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbSignUp;
    private javax.swing.JLabel jlEmailSignUpText;
    private javax.swing.JLabel jlNameSignUpText;
    private javax.swing.JLabel jlPasswordSignUpText;
    private javax.swing.JLabel jlSignUpWarning;
    private javax.swing.JPanel jpSignUp;
    private javax.swing.JTextField jtEmailSignUpField;
    private javax.swing.JTextField jtNameSignUpField;
    private javax.swing.JTextField jtPasswordSignUpField;
    // End of variables declaration//GEN-END:variables
}
