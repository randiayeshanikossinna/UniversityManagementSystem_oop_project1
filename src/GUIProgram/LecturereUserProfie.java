package GUIProgram;


import Controller.LecturerController;
import Entity.Subject;
import Entity.Lecturer;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class LecturereUserProfie extends javax.swing.JFrame {

    private HomePage homePage=new HomePage();
    /**
     * Creates new form StudentProfile
     */
    private Lecturer lecturer;
    
    public LecturereUserProfie() {
        
    }

    public LecturereUserProfie(Lecturer lecturer) throws ClassNotFoundException, SQLException {
        this.lecturer = lecturer;
        initComponents();
        loadLecture();
    }
    
    public void loadLecture() throws ClassNotFoundException, SQLException{
        LecturerController lecController=new LecturerController();
        Lecturer tplecturer=lecController.lecSignIn(lecturer.getUserName(), lecturer.getPassword());
        lblLecId.setText(Integer.toString(tplecturer.getId()));
        lblLecName.setText(tplecturer.getName());
        lblLecAge.setText(Integer.toString(tplecturer.getAge()));
        ArrayList<Subject> subList=lecController.lecRegedSubjects(lecturer.getUserName(), lecturer.getPassword());
        DefaultTableModel dtm=(DefaultTableModel) tblLecturerDetails.getModel();
        dtm.setRowCount(0);
         for(Subject subject:subList){
            Object[] rowdata={subject.getId(),subject.getSubName()};
            dtm.addRow(rowdata);
        }
                        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblLecId = new javax.swing.JLabel();
        lblLecName = new javax.swing.JLabel();
        lblLecAge = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLecturerDetails = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel2.setText("LECTURER PROFILE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(47, 54, 236, 29);

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setText("Lecturer ID:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(47, 111, 100, 22);

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setText("Lecturer Name:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(47, 158, 129, 22);

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel5.setText("Lecturer Age:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(47, 191, 112, 22);
        getContentPane().add(lblLecId);
        lblLecId.setBounds(316, 130, 242, 22);
        getContentPane().add(lblLecName);
        lblLecName.setBounds(316, 158, 242, 27);
        getContentPane().add(lblLecAge);
        lblLecAge.setBounds(316, 191, 242, 25);

        tblLecturerDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Course Code", "Course Name"
            }
        ));
        jScrollPane1.setViewportView(tblLecturerDetails);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(47, 238, 688, 97);

        btnBack.setBackground(new java.awt.Color(0, 0, 153));
        btnBack.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(153, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(577, 362, 73, 31);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 770, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        homePage.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLecAge;
    private javax.swing.JLabel lblLecId;
    private javax.swing.JLabel lblLecName;
    private javax.swing.JTable tblLecturerDetails;
    // End of variables declaration//GEN-END:variables
}
