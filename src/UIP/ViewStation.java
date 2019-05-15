/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIP;

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
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author H_Abb
 */
public class ViewStation extends javax.swing.JFrame {

    /**
     * Creates new form ViewStation
     */
    ArrayList<JFrame> formList;
    DefaultListModel dept=new DefaultListModel();
    public ViewStation(ArrayList<JFrame> formList) {
        this.formList=formList;
        this.setResizable(false);
        formList.add(this); 
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);            
    }

    public void clear(){
        StationField.setText("");
        NameField.setText("");
        FloorField.setText("");
        HourField.setText("");
        jPanel1.setVisible(false);
        setList();
    }
    private void setList(){
        dept.removeAllElements();
        if(StationField.getText().trim().equals(""));
        else{
            Connection conn=OracleJDBCConnection.connectDataBase();
            try {
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("SELECT DEPT_NAME,FLOOR_NO FROM STATION natural join CONSIST_OF natural join DEPARTMENT "
                    + "WHERE LOWER(STATION_LOCATION) LIKE LOWER('%"+StationField.getText().trim()+"%')");
            while(rs.next()){
                dept.addElement(rs.getString(1)+" in Floor "+rs.getInt(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee1.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        StationField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NameField = new javax.swing.JLabel();
        FloorField = new javax.swing.JLabel();
        HourField = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
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
        jLabel1.setText("View Station");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Enter Station Location");

        StationField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton2.setText("Back");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Location");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("No Floors");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("No. of Working Hours");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Departments");

        NameField.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        NameField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        FloorField.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        FloorField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        HourField.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        HourField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jList1.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        jList1.setModel(dept);
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HourField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FloorField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HourField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(FloorField, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

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
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(138, 138, 138)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(StationField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(StationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateClicked
        // TODO add your handling code here:
        NameField.setText("");
        HourField.setText("");
        FloorField.setText("");
        if(StationField.getText().trim().equals(""));
        else{
            Connection conn=OracleJDBCConnection.connectDataBase();
            try {
                Statement st=conn.createStatement();
                String sql="SELECT STATION_LOCATION,NO_FLOORS,WORKING_HOURS FROM STATION WHERE ";
                sql+="LOWER(STATION_LOCATION) LIKE LOWER('%"+StationField.getText().trim()+"%')";
                ResultSet rs=st.executeQuery(sql);
                while(rs.next()){
                    NameField.setText(rs.getString(1));
                    FloorField.setText(rs.getString(2));
                    HourField.setText(rs.getString(3));                   
                }
                if(NameField.getText().trim().equals(""))
                    JOptionPane.showMessageDialog(null,"Station not found.");
                jPanel1.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ViewStation.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        setList();
    }//GEN-LAST:event_generateClicked

    private void backClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof StationInfo) {
                frame.setVisible(true);
                break;

            }
        }
    }//GEN-LAST:event_backClicked

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

    private boolean findStation(){
        Connection conn=OracleJDBCConnection.connectDataBase();
        try {
            Statement st=conn.createStatement();
            String sql="SELECT * FROM STATION WHERE ";
            sql+="LOWER(STATION_LOCATION) LIKE LOWER('%"+StationField.getText().trim()+"%')";
            ResultSet rs=st.executeQuery(sql);
            String str="";
            while(rs.next()){
                str=rs.getString(1);
            }
            if(str.equals(""))
                return false;
        } catch (SQLException ex) {
            Logger.getLogger(ViewStation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu EmpMenu;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JLabel FloorField;
    private javax.swing.JLabel HourField;
    private javax.swing.JLabel NameField;
    private javax.swing.JMenu PrisonMenu;
    private javax.swing.JTextField StationField;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem viewDept;
    private javax.swing.JMenuItem viewEmp;
    private javax.swing.JMenuItem viewInmate;
    private javax.swing.JMenuItem viewPrison;
    private javax.swing.JMenuItem viewStation;
    private javax.swing.JMenuItem viewStationEmp;
    // End of variables declaration//GEN-END:variables
}