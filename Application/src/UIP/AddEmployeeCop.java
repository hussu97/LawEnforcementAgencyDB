/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIP;

import ALP.Employee;
import DSP.OracleJDBCConnection;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author H_Abb
 */
public class AddEmployeeCop extends javax.swing.JFrame {
private DefaultComboBoxModel department=new DefaultComboBoxModel();
    private DefaultComboBoxModel station=new DefaultComboBoxModel();
    ArrayList<JFrame> formList;
    public AddEmployeeCop(ArrayList<JFrame> formList) {
        this.formList=formList;
        this.setResizable(false);
        formList.add(this);
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        
    }

    public void setStationsComboBox(){  
        station.removeAllElements();
        Connection conn=OracleJDBCConnection.connectDataBase();
        Statement st=null;
        try {
            st=conn.createStatement();
            ResultSet rs=st.executeQuery("SELECT STATION_LOCATION FROM STATION");
            while(rs.next()){
                Employee.station=rs.getString(1);
                station.addElement(Employee.station);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setDeptComboBox(){
        department.removeAllElements();
        Connection conn=OracleJDBCConnection.connectDataBase();
        Statement st=null;
        try {
            st=conn.createStatement();
            ResultSet rs=st.executeQuery("SELECT DEPT_NAME FROM DEPARTMENT,CONSIST_OF WHERE CONSIST_OF.DEPT_ID = DEPARTMENT.DEPT_ID AND STATION_LOCATION='"+Employee.station+"'");
            while(rs.next()){
                department.addElement(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void clear(){
        PosField.setText("");
        ArrestField.setText("");
        SalaryField.setText("");
        setStationsComboBox();
        DepartmentField.setSelectedIndex(0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DepartmentField = new javax.swing.JComboBox<>();
        workLabel = new javax.swing.JLabel();
        SalaryField = new javax.swing.JTextField();
        PosField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        StationField = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ArrestField = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();
        EmpMenu = new javax.swing.JMenu();
        addEmp = new javax.swing.JMenuItem();
        editEmp = new javax.swing.JMenuItem();
        viewEmp = new javax.swing.JMenuItem();
        StationMenu = new javax.swing.JMenu();
        viewStation = new javax.swing.JMenuItem();
        viewStationEmp = new javax.swing.JMenuItem();
        addStation = new javax.swing.JMenuItem();
        viewDept = new javax.swing.JMenuItem();
        addDept = new javax.swing.JMenuItem();
        PrisonMenu = new javax.swing.JMenu();
        viewPrison = new javax.swing.JMenuItem();
        addPrison = new javax.swing.JMenuItem();
        viewInmate = new javax.swing.JMenuItem();
        addInmate = new javax.swing.JMenuItem();
        addCell = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DepartmentField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        DepartmentField.setModel(department);

        workLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        workLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        workLabel.setText("Station*");

        SalaryField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        PosField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Add Employee");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Salary*");

        StationField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        StationField.setModel(station);
        StationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StationFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel10.setText("2/2");

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton4.setText("Submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4submitClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3backClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Department*");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Position*");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Arrests*");

        ArrestField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        FileMenu.setText("File");

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnClicked(evt);
            }
        });
        FileMenu.add(exit);

        jMenuBar1.add(FileMenu);

        EmpMenu.setText("Employee");

        addEmp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        addEmp.setText("Add Employee");
        addEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpBtnClicked(evt);
            }
        });
        EmpMenu.add(addEmp);

        editEmp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        editEmp.setText("Edit Employee");
        editEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmpBtnClicked(evt);
            }
        });
        EmpMenu.add(editEmp);

        viewEmp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        viewEmp.setText("View Employee");
        viewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEmpBtnClicked(evt);
            }
        });
        EmpMenu.add(viewEmp);

        jMenuBar1.add(EmpMenu);

        StationMenu.setText("Station");

        viewStation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        viewStation.setText("View Station");
        viewStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStationBtnClicked(evt);
            }
        });
        StationMenu.add(viewStation);

        viewStationEmp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        viewStationEmp.setText("View Station Employees");
        viewStationEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStationEmpBtnClicked(evt);
            }
        });
        StationMenu.add(viewStationEmp);

        addStation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        addStation.setText("Add Station");
        addStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStationBtnClicked(evt);
            }
        });
        StationMenu.add(addStation);

        viewDept.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        viewDept.setText("View Department");
        viewDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDeptBtnClicked(evt);
            }
        });
        StationMenu.add(viewDept);

        addDept.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        addDept.setText("Add Department");
        addDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDeptBtnClicked(evt);
            }
        });
        StationMenu.add(addDept);

        jMenuBar1.add(StationMenu);

        PrisonMenu.setText("Prison");

        viewPrison.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        viewPrison.setText("View Prison");
        viewPrison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPrisonBtnClicked(evt);
            }
        });
        PrisonMenu.add(viewPrison);

        addPrison.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        addPrison.setText("Add Prison");
        addPrison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPrisonBtnClicked(evt);
            }
        });
        PrisonMenu.add(addPrison);

        viewInmate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        viewInmate.setText("View Inmate");
        viewInmate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInmateBtnClicked(evt);
            }
        });
        PrisonMenu.add(viewInmate);

        addInmate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        addInmate.setText("Add Inmate");
        addInmate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInmateBtnClicked(evt);
            }
        });
        PrisonMenu.add(addInmate);

        addCell.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        addCell.setText("Add Cell");
        addCell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCellBtnClicked(evt);
            }
        });
        PrisonMenu.add(addCell);

        jMenuBar1.add(PrisonMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(workLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ArrestField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(StationField, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PosField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SalaryField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DepartmentField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(DepartmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(PosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ArrestField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(SalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StationFieldActionPerformed
        Employee.station=(String)StationField.getSelectedItem();
        System.out.println(Employee.station);
        setDeptComboBox();
    }//GEN-LAST:event_StationFieldActionPerformed

    private void jButton4submitClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4submitClicked
        if(SalaryField.getText().equals("")||ArrestField.getText().equals("")||PosField.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Some of the fields are invalid.","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            Connection conn = OracleJDBCConnection.connectDataBase();
            Statement st = null;
            ResultSet rs=null;
            int ID=Employee.getID();
            String sql = "Insert into Employee values(";
            sql += ID;
            sql += ", " + Employee.SSN;
            sql += ", '" + Employee.name +"'";
            sql += ", '" + Employee.contact +"'";
            sql += ", '"+ Employee.date + "'";
            Employee.station=(String) StationField.getSelectedItem();
            sql+=", '"+Employee.station+"'";
            Employee.prison="NULL";
            sql+=", "+Employee.prison+")";

            try {
                st=conn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployeeClerical.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                rs=st.executeQuery("SELECT DEPT_ID FROM DEPARTMENT WHERE DEPT_NAME='"+DepartmentField.getSelectedItem().toString()+"'");
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployeeCop.class.getName()).log(Level.SEVERE, null, ex);
            }
            int dept_id=0;
            try {
                while(rs.next()){
                    dept_id=rs.getInt(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployeeCop.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql2 ="Insert into Cop values(";
            sql2 +=ID;
            sql2 +=","+dept_id;
            sql2 +=",'"+PosField.getText().trim()+"'";
            sql2 +=","+ArrestField.getText().trim();
            sql2 += ","+SalaryField.getText().trim()+")";
           try {
                System.out.println(sql);
                st.executeUpdate(sql);
                System.out.println(sql2);
                st.executeUpdate(sql2);
                JOptionPane.showMessageDialog(null,"Cop added.");
                this.setVisible(false);
                for (JFrame frame : formList) {
                    if(frame instanceof AddEmployee1){
                        ((AddEmployee1) frame).clear();
                    }
                    if (frame instanceof EmployeeInfo) {
                        frame.setVisible(true);
                        break;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployeeClerical.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Some of the fields are invalid.","Error",JOptionPane.ERROR_MESSAGE);
            }
            try {
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployeeClerical.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton4submitClicked

    private void jButton3backClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3backClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof AddEmployee1) {
                frame.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_jButton3backClicked

    private void exitBtnClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnClicked

    private void addEmpBtnClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpBtnClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof AddEmployee1) {
                ((AddEmployee1) frame).clear();
                frame.setVisible(true);
                break;

            }
        }
    }//GEN-LAST:event_addEmpBtnClicked

    private void editEmpBtnClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmpBtnClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof EditEmployee) {
                ((EditEmployee) frame).clear();
                frame.setVisible(true);
                break;

            }
        }
    }//GEN-LAST:event_editEmpBtnClicked

    private void viewEmpBtnClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEmpBtnClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof ViewEmployee) {
                ((ViewEmployee) frame).clear();
                frame.setVisible(true);
                break;

            }
        }
    }//GEN-LAST:event_viewEmpBtnClicked

    private void viewStationBtnClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStationBtnClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof ViewStation) {
                ((ViewStation) frame).clear();
                frame.setVisible(true);
                break;

            }
        }
    }//GEN-LAST:event_viewStationBtnClicked

    private void viewStationEmpBtnClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStationEmpBtnClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof ViewStationEmp) {
                ((ViewStationEmp) frame).clear();
                frame.setVisible(true);
                break;

            }
        }
    }//GEN-LAST:event_viewStationEmpBtnClicked

    private void addStationBtnClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStationBtnClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof AddStation) {
                ((AddStation) frame).clear();
                frame.setVisible(true);
                break;

            }
        }
    }//GEN-LAST:event_addStationBtnClicked

    private void viewDeptBtnClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDeptBtnClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof ViewDepartment) {
                ((ViewDepartment) frame).clear();
                frame.setVisible(true);
                break;

            }
        }
    }//GEN-LAST:event_viewDeptBtnClicked

    private void addDeptBtnClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDeptBtnClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof AddDepartment) {
                ((AddDepartment) frame).clear();
                frame.setVisible(true);
                break;

            }
        }
    }//GEN-LAST:event_addDeptBtnClicked

    private void viewPrisonBtnClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPrisonBtnClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof ViewPrison) {
                ((ViewPrison) frame).clear();
                frame.setVisible(true);
                break;

            }
        }
    }//GEN-LAST:event_viewPrisonBtnClicked

    private void addPrisonBtnClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPrisonBtnClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof AddPrison) {
                ((AddPrison) frame).clear();
                frame.setVisible(true);
                break;

            }
        }
    }//GEN-LAST:event_addPrisonBtnClicked

    private void viewInmateBtnClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInmateBtnClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof ViewInmate) {
                ((ViewInmate) frame).clear();
                frame.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_viewInmateBtnClicked

    private void addInmateBtnClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInmateBtnClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof AddInmate) {
                ((AddInmate) frame).clear();
                frame.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_addInmateBtnClicked

    private void addCellBtnClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCellBtnClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof AddCell) {
                ((AddCell) frame).clear();
                frame.setVisible(true);
                break;

            }
        }
    }//GEN-LAST:event_addCellBtnClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ArrestField;
    private javax.swing.JComboBox<String> DepartmentField;
    private javax.swing.JMenu EmpMenu;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JTextField PosField;
    private javax.swing.JMenu PrisonMenu;
    private javax.swing.JTextField SalaryField;
    private javax.swing.JComboBox<String> StationField;
    private javax.swing.JMenu StationMenu;
    private javax.swing.JMenuItem addCell;
    private javax.swing.JMenuItem addDept;
    private javax.swing.JMenuItem addEmp;
    private javax.swing.JMenuItem addInmate;
    private javax.swing.JMenuItem addPrison;
    private javax.swing.JMenuItem addStation;
    private javax.swing.JMenuItem editEmp;
    private javax.swing.JMenuItem exit;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem viewDept;
    private javax.swing.JMenuItem viewEmp;
    private javax.swing.JMenuItem viewInmate;
    private javax.swing.JMenuItem viewPrison;
    private javax.swing.JMenuItem viewStation;
    private javax.swing.JMenuItem viewStationEmp;
    private javax.swing.JLabel workLabel;
    // End of variables declaration//GEN-END:variables
}
