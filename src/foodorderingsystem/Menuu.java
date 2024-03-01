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
public class Menuu extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public Menuu() {
        initComponents();
       setImage();
    }
    
     public void setImage(){
    ImageIcon IM = new  ImageIcon(getClass().getResource("/foodorderingsystem/Pics/MB2.jpg"));
        Image img = IM.getImage().getScaledInstance(MB.getWidth(), MB.getHeight(), Image.SCALE_SMOOTH);
        MB.setIcon(new ImageIcon(img));
       


 ImageIcon IM2 = new  ImageIcon(getClass().getResource("/foodorderingsystem/Pics/S.png"));
       Image img2 = IM2.getImage().getScaledInstance(M2.getWidth(), M2.getHeight(), Image.SCALE_SMOOTH);
      M2.setIcon(new ImageIcon(img2));

//ImageIcon IM3 = new  ImageIcon(getClass().getResource("/foodorderingsystem/Pics/M2.jpg"));
//       Image img3 = IM3.getImage().getScaledInstance(M2.getWidth(), M2.getHeight(), Image.SCALE_SMOOTH);
//      M2.setIcon(new ImageIcon(img3));
      
      
        
    
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DRINKButton = new javax.swing.JButton();
        ICECREAMButton = new javax.swing.JButton();
        BurgerButton = new javax.swing.JButton();
        PIZZAButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        MB = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        M2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DRINKButton.setText("DRINK");
        DRINKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DRINKButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DRINKButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 89, -1));

        ICECREAMButton.setText("ICE CREAM");
        ICECREAMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICECREAMButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ICECREAMButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 89, -1));

        BurgerButton.setText("Burger");
        BurgerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurgerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BurgerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 89, -1));

        PIZZAButton.setText("PIZZA");
        PIZZAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PIZZAButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PIZZAButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 89, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MB, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MB, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 800));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setFont(new java.awt.Font("Californian FB", 3, 48)); // NOI18N
        jLabel1.setText("Satisfy Your Cravings With DelightBite..");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(M2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(255, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 950, 820));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ICECREAMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICECREAMButtonActionPerformed
        // TODO add your handling code here:
        IceCream IC = new IceCream();
        IC.setVisible(true);

        dispose();
    }//GEN-LAST:event_ICECREAMButtonActionPerformed

    private void BurgerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurgerButtonActionPerformed
        // TODO add your handling code here:

        Menu B = new Menu ();
        B.setVisible(true);

        dispose();
    }//GEN-LAST:event_BurgerButtonActionPerformed

    private void DRINKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DRINKButtonActionPerformed
        // TODO add your handling code here:
        DRINKM D = new DRINKM();
        D.setVisible(true);

        dispose();
    }//GEN-LAST:event_DRINKButtonActionPerformed

    private void PIZZAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PIZZAButtonActionPerformed
        // TODO add your handling code here:
        Pizza P = new Pizza();
        P.setVisible(true);

        dispose();
    }//GEN-LAST:event_PIZZAButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Menuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menuu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BurgerButton;
    private javax.swing.JButton DRINKButton;
    private javax.swing.JButton ICECREAMButton;
    private javax.swing.JLabel M2;
    private javax.swing.JLabel MB;
    private javax.swing.JButton PIZZAButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
