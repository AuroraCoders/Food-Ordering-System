/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author hp
 */
public class Burger extends javax.swing.JFrame {

    /**
     * Creates new form Burger
     */
    public Burger() {
        initComponents();
        setImage();
    }
    public void setImage(){
        
        ImageIcon IM = new  ImageIcon(getClass().getResource("/foodorderingsystem/Pics/burgerb.jpg"));
        Image img = IM.getImage().getScaledInstance(bugerb.getWidth(), bugerb.getHeight(), Image.SCALE_SMOOTH);
        bugerb.setIcon(new ImageIcon(img));}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ZingerButton = new javax.swing.JButton();
        HamBurgerButton = new javax.swing.JButton();
        TurkeyBurgerButton = new javax.swing.JButton();
        TurkeyBurgerButton1 = new javax.swing.JButton();
        bugerb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ZingerButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ZingerButton.setText("Zinger Burger");
        ZingerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZingerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ZingerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        HamBurgerButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HamBurgerButton.setText("Ham Burger");
        getContentPane().add(HamBurgerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        TurkeyBurgerButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TurkeyBurgerButton.setText("Back");
        TurkeyBurgerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurkeyBurgerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TurkeyBurgerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 730, -1, -1));

        TurkeyBurgerButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TurkeyBurgerButton1.setText("Turkey Burger");
        TurkeyBurgerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurkeyBurgerButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(TurkeyBurgerButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, -1, -1));

        bugerb.setText("jLabel1");
        getContentPane().add(bugerb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ZingerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZingerButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ZingerButtonActionPerformed

    private void TurkeyBurgerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurkeyBurgerButtonActionPerformed
        // TODO add your handling code here:
        this.hide();
        Menuu m=new Menuu();
        m.setVisible(true);
    }//GEN-LAST:event_TurkeyBurgerButtonActionPerformed

    private void TurkeyBurgerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurkeyBurgerButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TurkeyBurgerButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Burger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Burger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Burger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Burger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Burger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HamBurgerButton;
    private javax.swing.JButton TurkeyBurgerButton;
    private javax.swing.JButton TurkeyBurgerButton1;
    private javax.swing.JButton ZingerButton;
    private javax.swing.JLabel bugerb;
    // End of variables declaration//GEN-END:variables
}
