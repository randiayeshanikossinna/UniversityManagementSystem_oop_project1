package GUIProgram;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class HomePage extends javax.swing.JFrame {

    public static StudentSignIn stdSignIn=new StudentSignIn();
    public static StudentSignUp stdSignUp=new StudentSignUp();
    public static LecturerSignUp lecSignUp=new LecturerSignUp();
    public static LecturerSignIn lecSignIn=new LecturerSignIn();
    
    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSTDSignUp = new javax.swing.JButton();
        btnLECSignUp = new javax.swing.JButton();
        btnSTDSignIn = new javax.swing.JButton();
        btnLECSignIn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME TO UNIVERSITY MANAGEMENT SYSTEM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(26, 46, 568, 33);

        btnSTDSignUp.setBackground(new java.awt.Color(0, 0, 153));
        btnSTDSignUp.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnSTDSignUp.setForeground(new java.awt.Color(153, 255, 255));
        btnSTDSignUp.setText("Sign Up As Student");
        btnSTDSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSTDSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(btnSTDSignUp);
        btnSTDSignUp.setBounds(359, 107, 195, 31);

        btnLECSignUp.setBackground(new java.awt.Color(0, 0, 153));
        btnLECSignUp.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnLECSignUp.setForeground(new java.awt.Color(153, 255, 255));
        btnLECSignUp.setText("Sign Up As Lecturer");
        btnLECSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLECSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(btnLECSignUp);
        btnLECSignUp.setBounds(359, 156, 195, 31);

        btnSTDSignIn.setBackground(new java.awt.Color(0, 0, 153));
        btnSTDSignIn.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnSTDSignIn.setForeground(new java.awt.Color(153, 255, 255));
        btnSTDSignIn.setText("Sign In As Student");
        btnSTDSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSTDSignInActionPerformed(evt);
            }
        });
        getContentPane().add(btnSTDSignIn);
        btnSTDSignIn.setBounds(359, 217, 195, 31);

        btnLECSignIn.setBackground(new java.awt.Color(0, 0, 153));
        btnLECSignIn.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnLECSignIn.setForeground(new java.awt.Color(153, 255, 255));
        btnLECSignIn.setText("Sign In As Lecturer");
        btnLECSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLECSignInActionPerformed(evt);
            }
        });
        getContentPane().add(btnLECSignIn);
        btnLECSignIn.setBounds(359, 266, 195, 31);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\oop_\\download.png")); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(339, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 370);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSTDSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSTDSignUpActionPerformed
        // TODO add your handling code here:
        
        stdSignUp.setVisible(true);
        this.setVisible(false);
        this.dispose();
            
               
      
    }//GEN-LAST:event_btnSTDSignUpActionPerformed

    private void btnLECSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLECSignUpActionPerformed
        // TODO add your handling code here:
        
        lecSignUp.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
        
              
               
    }//GEN-LAST:event_btnLECSignUpActionPerformed

    private void btnSTDSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSTDSignInActionPerformed
        // TODO add your handling code here:
       
        stdSignIn.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_btnSTDSignInActionPerformed

    private void btnLECSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLECSignInActionPerformed
        // TODO add your handling code here:
        
        lecSignIn.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_btnLECSignInActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new HomePage().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLECSignIn;
    private javax.swing.JButton btnLECSignUp;
    private javax.swing.JButton btnSTDSignIn;
    private javax.swing.JButton btnSTDSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
