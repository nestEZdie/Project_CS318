/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package bulibrary;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author Mr.Phiphat
 */
public class DialogRegister extends javax.swing.JDialog {
        private String firstName;
        private String lastName;
        private String email;
        private String studentId;
        private String phoneNumber;
        private String password;
        
    /**
     * Creates new form DialogRegister
     */
    public DialogRegister(java.awt.Frame parent, boolean modal,UserData user,String warning) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        txtWarning.setText(warning);
        Fullname.setText("<html><div style='text-align: center;'>" +
    "<font color='gray'>Name:</font> " + user.getFirstName() + " " + user.getLastName() + " " +
    "<font color='gray'>Email:</font> " + user.getEmail() + "<br>" +
    "<font color='gray'>Student ID:</font> " + user.getStudentId() + "<br>" +
    "<font color='gray'>Tel:</font> " + user.getPhoneNumber() +
    "</div></html>");
        firstName = user.getFirstName();
        lastName = user.getLastName();
        email = user.getEmail();
        studentId = user.getStudentId();
        phoneNumber = user.getPhoneNumber();
        password = user.getPassword();
        JFregister.getInstance().changeOpacity(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtWarning = new javax.swing.JLabel();
        btnCancel = new javax.swing.JLabel();
        Fullname = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JLabel();
        Bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtWarning.setFont(new java.awt.Font("Airbnb Cereal App Medium", 0, 20)); // NOI18N
        txtWarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 490, 40));

        btnCancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/CANCEL_EXTED.png"))); // NOI18N
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 181, 210, 60));

        Fullname.setFont(new java.awt.Font("Airbnb Cereal App Book", 0, 14)); // NOI18N
        Fullname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 470, 80));

        btnConfirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Confirmbtn.png"))); // NOI18N
        btnConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfirmMouseExited(evt);
            }
        });
        getContentPane().add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 180, 200, 60));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/warningBG.png"))); // NOI18N
        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 260));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        dispose();
        JFregister.getInstance().changeOpacity( false);
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/cancelbtn.png"));
        btnCancel.setIcon(icon);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/CANCEL_EXTED.png"));
        btnCancel.setIcon(icon);
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/ConfirmbtnEx.png"));
        btnConfirm.setIcon(icon);
    }//GEN-LAST:event_btnConfirmMouseEntered

    private void btnConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Confirmbtn.png"));
        btnConfirm.setIcon(icon);
    }//GEN-LAST:event_btnConfirmMouseExited

    private void btnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseClicked

        
        String selectQuery = "SELECT COUNT(*) FROM user WHERE email = ? OR studentid = ? OR phone = ?";
        DBConnect conn = new DBConnect();
        ResultSet rs = null;

        try {
            PreparedStatement statement = conn.prepareStatement(selectQuery);
            statement.setString(1, email);
            statement.setString(2, studentId);
            statement.setString(3, phoneNumber);
            rs = statement.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    System.out.println("Data already exists!");
                } else {
                    String insertQuery = "INSERT INTO user (email, studentid, phone, fname, lname, password) VALUES (?, ?, ?, ?, ?, ?)";
                    PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
                    insertStatement.setString(1, email);
                    insertStatement.setString(2, studentId);
                    insertStatement.setString(3, phoneNumber);
                    insertStatement.setString(4, firstName);
                    insertStatement.setString(5, lastName);
                    insertStatement.setString(6, password);

                    int rowsAffected = insertStatement.executeUpdate();
                    if (rowsAffected > 0) {
                        System.out.println("Data inserted successfully.");
                        conn.close();
                        dispose();
                        String text = "Successfully Registered.";
                        String url = "/bulibrary/image/tickAnimat.png";
                        WarningMessage warnmessage = new WarningMessage(new javax.swing.JFrame(),true,url,text);
                        warnmessage.setVisible(true);
                        JFregister.getInstance().changePanelVisibility(true, false);
                        JFregister.getInstance().clearFields();
                    } else {
                        System.out.println("Failed to insert data.");
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            conn.close();
        }





        
    }//GEN-LAST:event_btnConfirmMouseClicked

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
            java.util.logging.Logger.getLogger(DialogRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UserData user = new UserData();
                String warning = "Are you confirm Register";
                DialogRegister dialog = new DialogRegister(new javax.swing.JFrame(), true,user,warning);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bg;
    private javax.swing.JLabel Fullname;
    private javax.swing.JLabel btnCancel;
    private javax.swing.JLabel btnConfirm;
    private javax.swing.JLabel txtWarning;
    // End of variables declaration//GEN-END:variables

}