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
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author H_Abb
 */
public class ViewInmate extends javax.swing.JFrame {

    /**
     * Creates new form ViewInmate
     */
    ArrayList<JFrame> formList;
    public ViewInmate(ArrayList<JFrame> formList) {
        this.formList=formList;
        this.setResizable(false);
        formList.add(this);       
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        
    }

    public void clear(){
        IDField.setText("");
        NameField.setText("");
        ImprisonedField.setText("");
        ReleasedField.setText("");
        PrisonField.setText("");
        CellField.setText("");
        CellTypeField.setText("");
        InputField.setText("");
        jPanel1.setVisible(false);
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
        InputField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IDField = new javax.swing.JLabel();
        CellTypeField = new javax.swing.JLabel();
        CellField = new javax.swing.JLabel();
        PrisonField = new javax.swing.JLabel();
        ReleasedField = new javax.swing.JLabel();
        ImprisonedField = new javax.swing.JLabel();
        NameField = new javax.swing.JLabel();
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
        jLabel1.setText("View Inmate");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Enter Inmate Name/ID");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton1.setText("Generate");
        jButton1.setMaximumSize(new java.awt.Dimension(109, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(109, 23));
        jButton1.setPreferredSize(new java.awt.Dimension(109, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1generateClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton2.setText("Back");
        jButton2.setMaximumSize(new java.awt.Dimension(109, 23));
        jButton2.setMinimumSize(new java.awt.Dimension(109, 23));
        jButton2.setPreferredSize(new java.awt.Dimension(109, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2backClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton3.setText("Remove Inmate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3removePrisonClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Date Imprisoned");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Name");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("ID");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Date Released");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Prison");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Cell ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cell Type");

        IDField.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        IDField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        CellTypeField.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        CellTypeField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        CellField.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        CellField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        PrisonField.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        PrisonField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        ReleasedField.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        ReleasedField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        ImprisonedField.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        ImprisonedField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        NameField.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        NameField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IDField, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(CellTypeField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CellField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PrisonField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReleasedField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ImprisonedField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IDField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ImprisonedField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ReleasedField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PrisonField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CellField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CellTypeField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InputField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(InputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1generateClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1generateClicked
        // TODO add your handling code here:
        IDField.setText("");
        NameField.setText("");
        ImprisonedField.setText("");
        ReleasedField.setText("");
        PrisonField.setText("");
        CellField.setText("");
        CellTypeField.setText("");
        if(InputField.getText().trim().equals("")){
        }
        else{
            Connection conn=OracleJDBCConnection.connectDataBase();
            try {
                Statement st=conn.createStatement();
                String sql="SELECT INMATE_ID,INMATE_NAME,IMPRISON_DATE,IMPRISON_DATE+SENTENCE_PERIOD,PRISON_LOCATION,INMATE.CELL_ID,CELL_TYPE FROM INMATE,PRISON,CELL "
                        + "WHERE INMATE.PRISON_ID=PRISON.PRISON_ID AND INMATE.CELL_ID=CELL.CELL_ID AND ";
                if(InputField.getText().trim().startsWith("1")||
                   InputField.getText().trim().startsWith("2")||
                   InputField.getText().trim().startsWith("3")||
                   InputField.getText().trim().startsWith("4")||
                   InputField.getText().trim().startsWith("5")||
                   InputField.getText().trim().startsWith("6")||
                   InputField.getText().trim().startsWith("7")||
                   InputField.getText().trim().startsWith("8")||
                   InputField.getText().trim().startsWith("9")){
                    sql+="INMATE_ID= "+InputField.getText().trim();
                }
                else
                    sql+="LOWER(INMATE_NAME) LIKE LOWER('%"+InputField.getText().trim()+"%')";
                ResultSet rs=st.executeQuery(sql);
                while(rs.next()){
                    IDField.setText(rs.getString(1));
                    NameField.setText(rs.getString(2));
                    ImprisonedField.setText(rs.getString(3).replaceFirst(" 00:00:00.0", ""));
                    ReleasedField.setText(rs.getString(4).replaceFirst(" 00:00:00.0", ""));
                    PrisonField.setText(rs.getString(5));
                    CellField.setText(rs.getString(6));
                    CellTypeField.setText(rs.getString(7));
                }
                if(IDField.getText().trim().equals(""))
                    JOptionPane.showMessageDialog(null,"Inmate not found");
                jPanel1.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployee1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButton1generateClicked

    private void jButton2backClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2backClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof PrisonInfo) {
                frame.setVisible(true);
                break;

            }
        }

    }//GEN-LAST:event_jButton2backClicked

    private boolean findInmate(){
        Connection conn=OracleJDBCConnection.connectDataBase();
        try {
            Statement st=conn.createStatement();
            String sql="SELECT * FROM INMATE WHERE ";
            if(InputField.getText().trim().startsWith("1")||
            InputField.getText().trim().startsWith("2")||
            InputField.getText().trim().startsWith("3")||
            InputField.getText().trim().startsWith("4")||
            InputField.getText().trim().startsWith("5")||
            InputField.getText().trim().startsWith("6")||
            InputField.getText().trim().startsWith("7")||
            InputField.getText().trim().startsWith("8")||
            InputField.getText().trim().startsWith("9")){
                sql+="INMATE_ID = "+InputField.getText().trim();}
            else
                sql+="LOWER(INMATE_NAME) LIKE LOWER('%"+InputField.getText().trim()+"%')";
            
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
    
    private void jButton3removePrisonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3removePrisonClicked
        int choice;
        if(!InputField.getText().trim().equals("")){
            choice=JOptionPane.showConfirmDialog(this,"Are you sure you want to remove inmate "+InputField.getText()+ "?");
            if(choice==JOptionPane.YES_OPTION){
                boolean found=findInmate();
                if(found){
                    Connection conn=OracleJDBCConnection.connectDataBase();
                    try {
                        Statement st=conn.createStatement();
                        String sql="DELETE FROM INMATE WHERE ";
                        if(InputField.getText().trim().startsWith("1")||
                        InputField.getText().trim().startsWith("2")||
                        InputField.getText().trim().startsWith("3")||
                        InputField.getText().trim().startsWith("4")||
                        InputField.getText().trim().startsWith("5")||
                        InputField.getText().trim().startsWith("6")||
                        InputField.getText().trim().startsWith("7")||
                        InputField.getText().trim().startsWith("8")||
                        InputField.getText().trim().startsWith("9")){
                            sql+="INMATE_ID = "+InputField.getText().trim();}
                        else
                            sql+="LOWER(INMATE_NAME) LIKE LOWER('%"+InputField.getText().trim()+"%')";
                        ResultSet rs=st.executeQuery(sql);
                        clear();
                        JOptionPane.showMessageDialog(this, "Inmate successfully removed.");
                    } catch (SQLException ex) {
                        Logger.getLogger(ViewStation.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                    JOptionPane.showMessageDialog(this,"Inmate not found.");
            }
        }
    }//GEN-LAST:event_jButton3removePrisonClicked

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CellField;
    private javax.swing.JLabel CellTypeField;
    private javax.swing.JLabel IDField;
    private javax.swing.JLabel ImprisonedField;
    private javax.swing.JTextField InputField;
    private javax.swing.JLabel NameField;
    private javax.swing.JLabel PrisonField;
    private javax.swing.JLabel ReleasedField;
    private javax.swing.JMenuItem addCell;
    private javax.swing.JMenuItem addDept;
    private javax.swing.JMenuItem addEmp;
    private javax.swing.JMenuItem addInmate;
    private javax.swing.JMenuItem addPrison;
    private javax.swing.JMenuItem addStation;
    private javax.swing.JMenuItem exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem viewDept;
    private javax.swing.JMenuItem viewEmp;
    private javax.swing.JMenuItem viewInmate;
    private javax.swing.JMenuItem viewPrison;
    private javax.swing.JMenuItem viewStation;
    private javax.swing.JMenuItem viewStationEmp;
    // End of variables declaration//GEN-END:variables
}
