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

        final ArrayList<JFrame> formList = new ArrayList<>();
        Runnable r = () -> {new MainMenu(formList).setVisible(true);};
        java.awt.EventQueue.invokeLater(r);
        
        java.awt.EventQueue.invokeLater(() -> {new EmployeeInfo(formList).setVisible(false);});
        java.awt.EventQueue.invokeLater(() -> {new EditEmployee(formList).setVisible(false);});
        java.awt.EventQueue.invokeLater(() -> {new StationInfo(formList).setVisible(false);});
        java.awt.EventQueue.invokeLater(() -> {new PrisonInfo(formList).setVisible(false);});
        java.awt.EventQueue.invokeLater(() -> {new AddEmployee1(formList).setVisible(false);});
        java.awt.EventQueue.invokeLater(() -> {new AddEmployeeGuard(formList).setVisible(false);});
        java.awt.EventQueue.invokeLater(() -> {new AddEmployeeCop(formList).setVisible(false);});
        java.awt.EventQueue.invokeLater(() -> {new AddEmployeeClerical(formList).setVisible(false);});
        java.awt.EventQueue.invokeLater(() -> {new ViewStation(formList).setVisible(false);});
        java.awt.EventQueue.invokeLater(() -> {new ViewPrison(formList).setVisible(false);});
        java.awt.EventQueue.invokeLater(() -> {new AddPrison(formList).setVisible(false);});
        java.awt.EventQueue.invokeLater(() -> {new ViewInmate(formList).setVisible(false);});
        java.awt.EventQueue.invokeLater(() -> {new AddInmate(formList).setVisible(false);});
        java.awt.EventQueue.invokeLater(() -> {new AddCell(formList).setVisible(false);});
        java.awt.EventQueue.invokeLater(() -> {new ViewEmployee(formList).setVisible(false);});
        java.awt.EventQueue.invokeLater(() -> {new ViewDepartment(formList).setVisible(false);});
        java.awt.EventQueue.invokeLater(() -> {new AddDepartment(formList).setVisible(false);});
        java.awt.EventQueue.invokeLater(() -> {new AddStation(formList).setVisible(false);});
        java.awt.EventQueue.invokeLater(() -> {new ViewStationEmp(formList).setVisible(false);});
        
    }
}
