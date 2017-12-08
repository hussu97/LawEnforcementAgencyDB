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
public class AddEmployeeClerical extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployeeClerical
     */
    ArrayList<JFrame> formList;
    DefaultComboBoxModel jobType=new DefaultComboBoxModel();
    DefaultComboBoxModel work=new DefaultComboBoxModel();
    public AddEmployeeClerical(ArrayList<JFrame> formList) {
        this.formList=formList;
        this.setResizable(false);
        formList.add(this);
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        workLabel.setText("");
        workCB.setVisible(false);
    }

    public void setComboBox(){
        jobType.removeAllElements();
        Connection conn=OracleJDBCConnection.connectDataBase();
        Statement st=null;
        try {
            st=conn.createStatement();
            ResultSet rs=st.executeQuery("SELECT JOB_TYPE FROM CLERICAL");
            while(rs.next()){
                jobType.addElement(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee1.class.getName()).log(Level.SEVERE, null, ex);
        }
        jobType.addElement("Other");
        
        if(workPlaceCB.getSelectedIndex()==0){
            workLabel.setText("Station Location*");
            work.removeAllElements();
            Statement st2=null;
            try {
                st2=conn.createStatement();
                ResultSet rs=st2.executeQuery("SELECT STATION_LOCATION FROM STATION");
                while(rs.next()){
                    work.addElement(rs.getString(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployee1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            workLabel.setText("Prison ID*");
            work.removeAllElements();
            Statement st2=null;
            try {
                st2=conn.createStatement();
                ResultSet rs=st2.executeQuery("SELECT PRISON_ID FROM PRISON");
                while(rs.next()){
                    work.addElement(rs.getString(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployee1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        workCB.setVisible(true);
        
    }
    
    public void clear(){
        //setComboBox();
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        OtherField = new javax.swing.JTextField();
        SalaryField = new javax.swing.JTextField();
        JobTypeField = new javax.swing.JComboBox<>();
        workCB = new javax.swing.JComboBox<>();
        workLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        workPlaceCB = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        addEmp = new javax.swing.JMenuItem();
        viewEmp = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        viewStation = new javax.swing.JMenuItem();
        viewStationEmp = new javax.swing.JMenuItem();
        addStation = new javax.swing.JMenuItem();
        viewDept = new javax.swing.JMenuItem();
        addDept = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        viewPrison = new javax.swing.JMenuItem();
        addPrison = new javax.swing.JMenuItem();
        viewInmate = new javax.swing.JMenuItem();
        addInmate = new javax.swing.JMenuItem();
        addCell = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Employee");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setText("2/2");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1submitClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2backClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Salary*");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Job Type*");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("If other, please specify");

        OtherField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        SalaryField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        JobTypeField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        JobTypeField.setModel(jobType);

        workCB.setVisible(false);
        workCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        workCB.setModel(work);

        workLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        workLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Work place*");

        workPlaceCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        workPlaceCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Station", "Prison" }));
        workPlaceCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workPlaceCBActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnClicked(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Employee");

        addEmp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        addEmp.setText("Add Employee");
        addEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpBtnClicked(evt);
            }
        });
        jMenu2.add(addEmp);

        viewEmp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        viewEmp.setText("View Employee");
        viewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEmpBtnClicked(evt);
            }
        });
        jMenu2.add(viewEmp);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Station");

        viewStation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        viewStation.setText("View Station");
        viewStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStationBtnClicked(evt);
            }
        });
        jMenu3.add(viewStation);

        viewStationEmp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        viewStationEmp.setText("View Station Employees");
        viewStationEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStationEmpBtnClicked(evt);
            }
        });
        jMenu3.add(viewStationEmp);

        addStation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        addStation.setText("Add Station");
        addStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStationBtnClicked(evt);
            }
        });
        jMenu3.add(addStation);

        viewDept.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        viewDept.setText("View Department");
        viewDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDeptBtnClicked(evt);
            }
        });
        jMenu3.add(viewDept);

        addDept.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        addDept.setText("Add Department");
        addDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDeptBtnClicked(evt);
            }
        });
        jMenu3.add(addDept);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Prison");

        viewPrison.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        viewPrison.setText("View Prison");
        viewPrison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPrisonBtnClicked(evt);
            }
        });
        jMenu4.add(viewPrison);

        addPrison.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        addPrison.setText("Add Prison");
        addPrison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPrisonBtnClicked(evt);
            }
        });
        jMenu4.add(addPrison);

        viewInmate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        viewInmate.setText("View Inmate");
        viewInmate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInmateBtnClicked(evt);
            }
        });
        jMenu4.add(viewInmate);

        addInmate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        addInmate.setText("Add Inmate");
        addInmate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInmateBtnClicked(evt);
            }
        });
        jMenu4.add(addInmate);

        addCell.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        addCell.setText("Add Cell");
        addCell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCellBtnClicked(evt);
            }
        });
        jMenu4.add(addCell);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(workLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JobTypeField, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SalaryField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OtherField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(workCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(workPlaceCB, javax.swing.GroupLayout.Alignment.LEADING, 0, 208, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(SalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JobTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(OtherField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(workPlaceCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(workCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1submitClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1submitClicked
        // TODO add your handling code here:
        if(SalaryField.getText().equals("")){
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
            if(workPlaceCB.getSelectedIndex()==0){
                Employee.station=(String) workCB.getSelectedItem();
                sql+=", '"+Employee.station+"'";
                Employee.prison="NULL";
                sql+=", "+Employee.prison+")";
            }
            else{
                Employee.station="NULL";
                sql+=", "+Employee.station;
                Employee.prison=(String) workCB.getSelectedItem();
                sql+=", '"+Employee.prison+"')";
            }

            String sql2 ="Insert into Clerical values(";
            sql2 +=ID;
            sql2 += ","+SalaryField.getText().trim();
            if(JobTypeField.getSelectedItem().toString().trim().equals("Other"))
                sql2+= ",'"+OtherField.getText().trim()+"')";
            else
                sql2+= ",'"+JobTypeField.getSelectedItem().toString().trim()+"')";
                
           try {
                System.out.println(sql);
                st.executeUpdate(sql);
                System.out.println(sql2);
                st.executeUpdate(sql2);
                JOptionPane.showMessageDialog(null,"Clerical added.");
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
    }//GEN-LAST:event_jButton1submitClicked

    private void jButton2backClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2backClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof AddEmployee1) {
                frame.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_jButton2backClicked

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

    private void workPlaceCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workPlaceCBActionPerformed
        // TODO add your handling code here:
        setComboBox();
    }//GEN-LAST:event_workPlaceCBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JobTypeField;
    private javax.swing.JTextField OtherField;
    private javax.swing.JTextField SalaryField;
    private javax.swing.JMenuItem addCell;
    private javax.swing.JMenuItem addDept;
    private javax.swing.JMenuItem addEmp;
    private javax.swing.JMenuItem addInmate;
    private javax.swing.JMenuItem addPrison;
    private javax.swing.JMenuItem addStation;
    private javax.swing.JMenuItem exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
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
    // End of variables declaration//GEN-END:variables
}
