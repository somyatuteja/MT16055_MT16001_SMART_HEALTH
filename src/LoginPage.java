
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        jL_welcome.setText("Welcome "+ Login.loginuser);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_welcome = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jCB_update = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("LOGOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UPDATE INFORMATION");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("DELETE ACCOUNT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jCB_update.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT WHAT YOU WANT TO UPDATE-", "PASSWORD", "ADDRESS", "FIRST NAME", "LAST NAME", "SECONDARY EMAIL", "PICTURE", "ABOUT ME", "QUALIFICATION", "EMERGENCY CONTACT NO", " ", " ", " " }));
        jCB_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_updateActionPerformed(evt);
            }
        });

        jButton3.setText("Print info");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jL_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCB_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jL_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCB_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new FIRST_PAGE().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Manage m=new Manage();
       String op= m.delAccount(Login.loginuser);
       if(op==null)
       {
           JOptionPane.showMessageDialog(this, "THERE WAS SOME ERROR \n TRYAGAIN!","ERROR",ERROR_MESSAGE);
       }
       if(op!=null)
       {  
        JOptionPane.showMessageDialog(this, op);
        new FIRST_PAGE().setVisible(true);
        this.setVisible(false);
        
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int i=jCB_update.getSelectedIndex();
        Manage m=new Manage();
        String passu;
        String passa;
        String op;
        switch(i)
        {
            case 0:
                JOptionPane.showMessageDialog(this, "Select the information", "ERROR", ERROR_MESSAGE);
                break;
            case 1:
                 passu=JOptionPane.showInputDialog("CONFIRM PASSWORD");
                 passa=m.getPassword(Login.loginuser);
                 if(passu.equals(passa))
            {
                String newdata=JOptionPane.showInputDialog("ENTER NEW PASSWORD");
               op= m.updatePassword(Login.loginuser, newdata);
            }
                 break;
                 case 2:
                 passu=JOptionPane.showInputDialog("CONFIRM PASSWORD");
                 passa=m.getPassword(Login.loginuser);
                 if(passu.equals(passa))
            {
                String newdata=JOptionPane.showInputDialog("ENTER NEW ADDRESS");
                op=m.changeAddress(Login.loginuser, newdata);
            }
                 break;
           case 3:
                 passu=JOptionPane.showInputDialog("CONFIRM PASSWORD");
                 passa=m.getPassword(Login.loginuser);
                 if(passu.equals(passa))
            {
                String newdata=JOptionPane.showInputDialog("ENTER NEW FIRST NAME");
               op= m.updateFirstName(Login.loginuser, newdata);
            }
                 break;     
                 case 4:
                 passu=JOptionPane.showInputDialog("CONFIRM PASSWORD");
                 passa=m.getPassword(Login.loginuser);
                 if(passu.equals(passa))
            {
                String newdata=JOptionPane.showInputDialog("ENTER NEW LASTNAME");
               op= m.updateLastName(Login.loginuser, newdata);
            }
                 break;
                 case 5:
                 passu=JOptionPane.showInputDialog("CONFIRM PASSWORD");
                 passa=m.getPassword(Login.loginuser);
                 if(passu.equals(passa))
            {
                String newdata=JOptionPane.showInputDialog("ENTER NEW SECONDARY EMAIL-ID");
               op= m.updateEmail(Login.loginuser, newdata);
            }
                 break;
                 case 6:
                 passu=JOptionPane.showInputDialog("CONFIRM PASSWORD");
                 passa=m.getPassword(Login.loginuser);
                 if(passu.equals(passa))
            {
               JFileChooser fc=new JFileChooser();
      fc.showOpenDialog(this);
    String newdata= fc.getSelectedFile().getPath();
               op= m.updatePic(Login.loginuser, newdata);
            }
                 break;
           case 7:
                 passu=JOptionPane.showInputDialog("CONFIRM PASSWORD");
                 passa=m.getPassword(Login.loginuser);
                 if(passu.equals(passa))
            {
              String newdata= JOptionPane.showInputDialog("ENTER NEW ABOUT ME");
               op=m.updateAboutMe(Login.loginuser,newdata);
            }
                 break;
                     case 8:
                 passu=JOptionPane.showInputDialog("CONFIRM PASSWORD");
                 passa=m.getPassword(Login.loginuser);
                 if(passu.equals(passa))
            {
              String newdata= JOptionPane.showInputDialog("ENTER NEW QUALIFICATIONS");
                op=m.updateQual(Login.loginuser, newdata);
               JOptionPane.showMessageDialog(this, op);
            }
                 break;  
                  case 9:
                 passu=JOptionPane.showInputDialog("CONFIRM PASSWORD");
                 passa=m.getPassword(Login.loginuser);
                 if(passu.equals(passa))
            {
              int newdata= Integer.parseInt(JOptionPane.showInputDialog("ENTER NEW EMERGENCY NO."));
              try
              {
                   op=m.updateNumber(Login.loginuser, newdata);
                   JOptionPane.showMessageDialog(this, op);
              }
              catch(Exception e)
                  
              {
                  JOptionPane.showMessageDialog(this, "PLEASE ENTER VALID NUMBER","ERROR",ERROR_MESSAGE);
              
              }
               
            }
                 break; 
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCB_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCB_updateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Manage m=new Manage();
       String x= m.getPerson(Login.loginuser);
       ta.setText(x);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jCB_update;
    private javax.swing.JLabel jL_welcome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
