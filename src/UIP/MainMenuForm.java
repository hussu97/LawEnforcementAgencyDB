/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UIP;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author sradder
 */
public class MainMenuForm extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuForm
     */
    private  ArrayList<JFrame> formList;
    public MainMenuForm(ArrayList<JFrame>  formList) {
                this.formList = formList;
                initComponents();
                formList.add(this);
                 //Display the screen at the center of the screen
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
               // this.setSize(dim);
               this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuUser = new javax.swing.JMenu();
        menuAddUser = new javax.swing.JMenuItem();
        menuItemUpdateUser = new javax.swing.JMenuItem();
        menuItemRemoveUser = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuAddCar = new javax.swing.JMenuItem();
        menuRemoveCar = new javax.swing.JMenuItem();
        menuUpdateCar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenu();
        menuItemClose = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuUser.setText("User");
        menuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUserActionPerformed(evt);
            }
        });

        menuAddUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuAddUser.setText("Add User");
        menuAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddUserActionPerformed(evt);
            }
        });
        menuUser.add(menuAddUser);

        menuItemUpdateUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        menuItemUpdateUser.setText("Update User");
        menuItemUpdateUser.setActionCommand("UpdateUser");
        menuItemUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUpdateUserActionPerformed(evt);
            }
        });
        menuUser.add(menuItemUpdateUser);

        menuItemRemoveUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuItemRemoveUser.setText("Remove User");
        menuItemRemoveUser.setActionCommand("RemoveUser");
        menuItemRemoveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRemoveUserActionPerformed(evt);
            }
        });
        menuUser.add(menuItemRemoveUser);

        jMenuBar1.add(menuUser);

        jMenu2.setText("Fleet");

        menuAddCar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuAddCar.setText("Add Car");
        menuAddCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddCarActionPerformed(evt);
            }
        });
        jMenu2.add(menuAddCar);

        menuRemoveCar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuRemoveCar.setText("Remove Car");
        jMenu2.add(menuRemoveCar);

        menuUpdateCar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        menuUpdateCar.setText("Upadate Car");
        jMenu2.add(menuUpdateCar);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Find Car");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Report");
        jMenuBar1.add(jMenu3);

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });

        menuItemClose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuItemClose.setText("Close");
        menuItemClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCloseActionPerformed(evt);
            }
        });
        menuExit.add(menuItemClose);

        jMenuBar1.add(menuExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_menuUserActionPerformed

    private void menuItemUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUpdateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemUpdateUserActionPerformed

    private void menuItemRemoveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRemoveUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemRemoveUserActionPerformed

    private void menuAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddUserActionPerformed
        // TODO add your handling code here:
            this.setVisible(false);
            for (JFrame frame : formList) {
                if (frame instanceof AddUserForm) {
                    frame.setVisible(true);
                    break;
                }
               
            }
    }//GEN-LAST:event_menuAddUserActionPerformed

    private void menuAddCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddCarActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
            for (JFrame frame : formList) {
                if (frame instanceof AddCarForm) {
                    frame.setVisible(true);
                    break;
                }
               
            }
    }//GEN-LAST:event_menuAddCarActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuItemCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuItemCloseActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem menuAddCar;
    private javax.swing.JMenuItem menuAddUser;
    private javax.swing.JMenu menuExit;
    private javax.swing.JMenuItem menuItemClose;
    private javax.swing.JMenuItem menuItemRemoveUser;
    private javax.swing.JMenuItem menuItemUpdateUser;
    private javax.swing.JMenuItem menuRemoveCar;
    private javax.swing.JMenuItem menuUpdateCar;
    private javax.swing.JMenu menuUser;
    // End of variables declaration//GEN-END:variables
}