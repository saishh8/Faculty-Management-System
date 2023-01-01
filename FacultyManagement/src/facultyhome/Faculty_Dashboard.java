/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package facultymanagement;

/**
 *
 * @author Dimple
 */
public class Faculty_Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Faculty
     */
    public Faculty_Dashboard() {
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

        jPanel1 = new javax.swing.JPanel();
        btnWorkshops = new com.k33ptoo.components.KButton();
        jPanel4 = new javax.swing.JPanel();
        btnDashboard = new com.k33ptoo.components.KButton();
        btnPublications = new com.k33ptoo.components.KButton();
        btnProfile = new com.k33ptoo.components.KButton();
        btnLogout = new com.k33ptoo.components.KButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);
        setSize(new java.awt.Dimension(1600, 900));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnWorkshops.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dimple\\Documents\\NetBeansProjects\\FacultyManagement\\src\\facultymanagement\\icons\\workshop (2).png")); // NOI18N
        btnWorkshops.setText("Workshops");
        btnWorkshops.setBorderPainted(false);
        btnWorkshops.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnWorkshops.setkBackGroundColor(new java.awt.Color(242, 242, 242));
        btnWorkshops.setkEndColor(new java.awt.Color(242, 242, 242));
        btnWorkshops.setkForeGround(new java.awt.Color(0, 0, 0));
        btnWorkshops.setkHoverEndColor(new java.awt.Color(0, 204, 204));
        btnWorkshops.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnWorkshops.setkHoverStartColor(new java.awt.Color(0, 102, 204));
        btnWorkshops.setkPressedColor(new java.awt.Color(0, 51, 204));
        btnWorkshops.setkSelectedColor(new java.awt.Color(0, 102, 204));
        btnWorkshops.setkStartColor(new java.awt.Color(255, 255, 255));
        btnWorkshops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkshopsActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        btnDashboard.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dimple\\Documents\\NetBeansProjects\\FacultyManagement\\src\\facultymanagement\\icons\\home.png")); // NOI18N
        btnDashboard.setText("Dashboard");
        btnDashboard.setBorderPainted(false);
        btnDashboard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDashboard.setkBackGroundColor(new java.awt.Color(242, 242, 242));
        btnDashboard.setkEndColor(new java.awt.Color(242, 242, 242));
        btnDashboard.setkForeGround(new java.awt.Color(0, 0, 0));
        btnDashboard.setkHoverEndColor(new java.awt.Color(0, 204, 204));
        btnDashboard.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnDashboard.setkHoverStartColor(new java.awt.Color(0, 102, 204));
        btnDashboard.setkPressedColor(new java.awt.Color(0, 51, 204));
        btnDashboard.setkSelectedColor(new java.awt.Color(0, 102, 204));
        btnDashboard.setkStartColor(new java.awt.Color(255, 255, 255));
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnPublications.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dimple\\Documents\\NetBeansProjects\\FacultyManagement\\src\\facultymanagement\\icons\\book (2).png")); // NOI18N
        btnPublications.setText("Publications");
        btnPublications.setBorderPainted(false);
        btnPublications.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPublications.setkBackGroundColor(new java.awt.Color(242, 242, 242));
        btnPublications.setkEndColor(new java.awt.Color(242, 242, 242));
        btnPublications.setkForeGround(new java.awt.Color(0, 0, 0));
        btnPublications.setkHoverEndColor(new java.awt.Color(0, 204, 204));
        btnPublications.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnPublications.setkHoverStartColor(new java.awt.Color(0, 102, 204));
        btnPublications.setkPressedColor(new java.awt.Color(0, 51, 204));
        btnPublications.setkSelectedColor(new java.awt.Color(0, 102, 204));
        btnPublications.setkStartColor(new java.awt.Color(255, 255, 255));
        btnPublications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicationsActionPerformed(evt);
            }
        });

        btnProfile.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dimple\\Documents\\NetBeansProjects\\FacultyManagement\\src\\facultymanagement\\icons\\user.png")); // NOI18N
        btnProfile.setText("Profile");
        btnProfile.setBorderPainted(false);
        btnProfile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProfile.setkBackGroundColor(new java.awt.Color(242, 242, 242));
        btnProfile.setkEndColor(new java.awt.Color(242, 242, 242));
        btnProfile.setkForeGround(new java.awt.Color(0, 0, 0));
        btnProfile.setkHoverEndColor(new java.awt.Color(0, 204, 204));
        btnProfile.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnProfile.setkHoverStartColor(new java.awt.Color(0, 102, 204));
        btnProfile.setkPressedColor(new java.awt.Color(0, 51, 204));
        btnProfile.setkSelectedColor(new java.awt.Color(0, 102, 204));
        btnProfile.setkStartColor(new java.awt.Color(255, 255, 255));
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnLogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dimple\\Documents\\NetBeansProjects\\FacultyManagement\\src\\facultymanagement\\icons\\exit.png")); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorderPainted(false);
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogout.setkBackGroundColor(new java.awt.Color(242, 242, 242));
        btnLogout.setkEndColor(new java.awt.Color(242, 242, 242));
        btnLogout.setkForeGround(new java.awt.Color(0, 0, 0));
        btnLogout.setkHoverEndColor(new java.awt.Color(0, 204, 204));
        btnLogout.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnLogout.setkHoverStartColor(new java.awt.Color(0, 102, 204));
        btnLogout.setkPressedColor(new java.awt.Color(0, 51, 204));
        btnLogout.setkSelectedColor(new java.awt.Color(0, 102, 204));
        btnLogout.setkStartColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(btnProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPublications, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnWorkshops, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnWorkshops, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnPublications, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(1300, 900));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Faculty Management System");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addGap(325, 325, 325))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1275, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWorkshopsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkshopsActionPerformed
        this.setVisible(false);
        Faculty_Workshop wk = new Faculty_Workshop();
        wk.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnWorkshopsActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        this.setVisible(false);
        Faculty_Dashboard fc = new Faculty_Dashboard();
        fc.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnPublicationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicationsActionPerformed
        this.setVisible(false);
        Faculty_Publications fp = new Faculty_Publications();
        fp.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_btnPublicationsActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        this.setVisible(false);
        Faculty_Profile fpr = new Faculty_Profile();
        fpr.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnProfileActionPerformed

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
            java.util.logging.Logger.getLogger(Faculty_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faculty_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faculty_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faculty_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Faculty_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnDashboard;
    private com.k33ptoo.components.KButton btnLogout;
    private com.k33ptoo.components.KButton btnProfile;
    private com.k33ptoo.components.KButton btnPublications;
    private com.k33ptoo.components.KButton btnWorkshops;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
