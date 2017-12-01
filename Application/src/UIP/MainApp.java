/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIP;

import DSP.*;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author sradder
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Load the requied datanses proceesed 
        //at application level

        final ArrayList<JFrame> formList = new ArrayList<JFrame>();
    
        //Login form opens up first
        Runnable r = new Runnable() {
            public void run() {
                new MainMenu(formList).setVisible(true);        
            }
        };
        java.awt.EventQueue.invokeLater(r);

        //Load main menu form as a thread
         //Not shown to the user
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeInfo(formList).setVisible(false);
            }
        });

         //Load cardetals form as a thread
         //Not shown to the user
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StationInfo(formList).setVisible(false);
            }
        });
        //Load AddUserdetails form as a thread
         //Not shown to the user
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee1(formList).setVisible(false);
            }
        });
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeGuard(formList).setVisible(false);
            }
        });
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeCop(formList).setVisible(false);
            }
        });
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeClerical(formList).setVisible(false);
            }
        });

    }

}
