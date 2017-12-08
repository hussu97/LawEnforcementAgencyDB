/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DSP;

import ALP.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class OracleJDBCConnection {
    
 public static String JDBC_CONNECTION_DRIVER =  "oracle.jdbc.driver.OracleDriver"; 
 public static String  CONNECTION_STRING = "jdbc:oracle:thin:tf20170006/tf20170006@coeoracle.aus.edu:1521:orcl";
 public static Connection connectDataBase()
 {
     System.out.println("-------- Oracle JDBC Connection Testing ------");
 
		try {
 
			Class.forName(JDBC_CONNECTION_DRIVER);
 
		} catch (ClassNotFoundException e) {
 
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return null;
 
		}
 
		System.out.println("Oracle JDBC Driver Registered!");
 
		Connection connection = null;
 
		try {
 
			connection = DriverManager.getConnection(CONNECTION_STRING);
 
		} catch (SQLException e) {
 
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return null;
 }
 		if (connection != null) {
                    System.out.println("Connected to database");
                    
                try {
                    Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);
                    int ID=0;
                    ResultSet rs = statement.executeQuery("SELECT MAX(EMP_ID) FROM EMPLOYEE");
                    while(rs.next()){
                        ID=rs.getInt(1);
                        
                    }
                    if(ID==0)
                        Employee.ID=1;
                    else
                        Employee.ID=ID;
                    rs = statement.executeQuery("SELECT MAX(INMATE_ID) FROM INMATE");
                    while(rs.next()){
                        ID=rs.getInt(1);
                    }
                    if(ID==0)
                        Inmate.ID=1;
                    else
                        Inmate.ID=ID;
                    rs = statement.executeQuery("SELECT MAX(PRISON_ID) FROM PRISON");
                    while(rs.next()){
                        ID=rs.getInt(1);
                    }
                    if(ID==0)
                        Prison.ID=1;
                    else
                        Prison.ID=ID;
                    rs = statement.executeQuery("SELECT MAX(CELL_ID) FROM CELL");
                    while(rs.next()){
                        ID=rs.getInt(1);
                    }
                    if(ID==0)
                        Cell.ID=1;
                    else
                        Cell.ID=ID;
                    rs = statement.executeQuery("SELECT MAX(DEPT_ID) FROM DEPARTMENT");
                    while(rs.next()){
                        ID=rs.getInt(1);
                    }
                    if(ID==0)
                        Department.ID=1;
                    else
                        Department.ID=ID;
                } catch (SQLException ex) {
                    Logger.getLogger(OracleJDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
                    return connection;
		} else {
                    System.out.println("Connection Failed! Check");
			return null;
		}
                
                
 }
}
	