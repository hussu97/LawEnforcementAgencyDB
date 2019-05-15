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
 *p
 * @author H_Abb
 */
public class AddEmployeeGuard extends javax.swing.JFrame {

    ArrayList<JFrame> formList;
    DefaultComboBoxModel work=new DefaultComboBoxModel();
    
    public AddEmployeeGuard(ArrayList<JFrame> formList) {
        this.formList=formList;
        this.setResizable(false);
        formList.add(this);
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        HourField = new javax.swing.JTextField();
        RankField = new javax.swing.JTextField();
        RateField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        workCB = new javax.swing.JComboBox<>();
        workLabel = new javax.swing.JLabel();
        workPlaceLabel = new javax.swing.JLabel();
        workPlaceCB = new javax.swing.JComboBox<>();
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

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Employee");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Shift Hours*");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Rank (1-5)*");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Hourly Rate*");

        HourField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        RankField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        RateField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setText("2/2");

        workCB.setVisible(false);
        workCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        workCB.setModel(work);
        workCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workCBActionPerformed(evt);
            }
        });

        workLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        workLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        workPlaceLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        workPlaceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        workPlaceLabel.setText("Work Place*");

        workPlaceCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        workPlaceCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Station", "Prison" }));
        workPlaceCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workPlaceCBActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(workPlaceLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(workLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RateField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RankField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HourField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(workPlaceCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(workCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HourField)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RankField)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RateField)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(workPlaceCB)
                    .addComponent(workPlaceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(workCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void clear(){
        RankField.setText("");
        HourField.setText("");
        RateField.setText("");
        setComboBox();
        workCB.setSelectedIndex(0);
        workPlaceCB.setSelectedIndex(0);
    }
    
    private void submitClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitClicked
        if(HourField.getText().equals("")||RankField.getText().equals("")||RateField.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Some of the fields are invalid","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(Integer.parseInt(RankField.getText())>5||Integer.parseInt(RankField.getText())<1){
            JOptionPane.showMessageDialog(null,"Please enter rank between 1 and 5","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
        Connection conn = OracleJDBCConnection.connectDataBase();
        Statement st = null;
            ResultSet rs=null;
            int ID=Employee.getID();
            String sql = "Insert into Employee values(";
            sql += ID;
            sql += "," + Employee.SSN +""  ;
            sql += ",'" + Employee.name +"'";
            sql += ",'" + Employee.contact +"'";
            sql += ",'"+ Employee.date + "'";
            if(workPlaceCB.getSelectedItem().toString().equals("Prison"))
            sql += ",NULL";
            else
            sql+=",'"+workCB.getSelectedItem().toString()+"'";
            try {
                st = conn.createStatement();
                if(workPlaceCB.getSelectedItem().toString().equals("Station"))
                    sql += ",NULL)";
                else{
                    rs=st.executeQuery("SELECT PRISON_ID FROM PRISON WHERE PRISON_LOCATION ='"+workCB.getSelectedItem().toString()+"'");
                    while(rs.next())
                        sql += ","+ rs.getString(1)+")";
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployeeCop.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(sql);
        
        String sql2 ="Insert into Guard values(";
        sql2 +=ID;
        sql2 +=","+HourField.getText().trim();
        sql2 +=","+RankField.getText().trim();
        sql2+=","+RateField.getText().trim()+")";
            System.out.println(sql2);
            try {
                st = conn.createStatement();
                
            } catch (SQLException ex) {
                Logger.getLogger(OracleJDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                st.executeUpdate(sql);
                st.executeUpdate(sql2);
                JOptionPane.showMessageDialog(null,"Guard Added");
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
                Logger.getLogger(AddEmployeeGuard.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Some of the fields are invalid","Error",JOptionPane.ERROR_MESSAGE);
            }
            try {
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployeeGuard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_submitClicked

    private void backClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backClicked
        // TODO add your handling code here:
        this.setVisible(false);
                    for (JFrame frame : formList) {
                        if (frame instanceof AddEmployee1) {
                            frame.setVisible(true);
                            break;
                        }
                    }
    }//GEN-LAST:event_backClicked
    
    public void setComboBox(){
        Connection conn=OracleJDBCConnection.connectDataBase();
        if(workPlaceCB.getSelectedIndex()==0){ //if station
            workLabel.setText("Station Location*"); //set label text
            work.removeAllElements(); 
            Statement st=null;
            try {
                st=conn.createStatement();
                ResultSet rs=st.executeQuery("SELECT STATION_LOCATION FROM STATION"); //select all station locations
                while(rs.next()){ 
                    work.addElement(rs.getString(1)); //add to the combobox
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployee1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{ //else if prison
            workLabel.setText("Prison Location*"); //set label text
            work.removeAllElements();
            Statement st=null;
            try {
                st=conn.createStatement();
                ResultSet rs=st.executeQuery("SELECT PRISON_LOCATION FROM PRISON"); //select all prison ids
                while(rs.next()){
                    work.addElement(rs.getString(1)); //add to combobox
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployee1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        workCB.setVisible(true); //set the combobox to visible
    }
    
    private void workPlaceCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workPlaceCBActionPerformed
        // TODO add your handling code here:
        setComboBox();
    }//GEN-LAST:event_workPlaceCBActionPerformed

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

    private void workCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workCBActionPerformed
        // TODO add your handling code here:
        //Employee.prison=workCB.getSelectedItem().toString();
    }//GEN-LAST:event_workCBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu EmpMenu;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JTextField HourField;
    private javax.swing.JMenu PrisonMenu;
    private javax.swing.JTextField RankField;
    private javax.swing.JTextField RateField;
    private javax.swing.JMenu StationMenu;
    private javax.swing.JMenuItem addCell;
    private javax.swing.JMenuItem addDept;
    private javax.swing.JMenuItem addEmp;
    private javax.swing.JMenuItem addInmate;
    private javax.swing.JMenuItem addPrison;
    private javax.swing.JMenuItem addStation;
    private javax.swing.JMenuItem editEmp;
    private javax.swing.JMenuItem exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem viewDept;
    private javax.swing.JMenuItem viewEmp;
    private javax.swing.JMenuItem viewInmate;
    private javax.swing.JMenuItem viewPrison;
    private javax.swing.JMenuItem viewStation;
    private javax.swing.JMenuItem viewStationEmp;
    private javax.swing.JComboBox<String> workCB;
    private javax.swing.JLabel workLabel;
    private javax.swing.JComboBox<String> workPlaceCB;
    private javax.swing.JLabel workPlaceLabel;
    // End of variables declaration//GEN-END:variables
}
