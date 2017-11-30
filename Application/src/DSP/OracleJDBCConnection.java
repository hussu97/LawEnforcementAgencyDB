/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DSP;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
 
public class OracleJDBCConnection {
    
 public static String JDBC_CONNECTION_DRIVER =  "oracle.jdbc.driver.OracleDriver"; 
 //public static String  CONNECTION_STRING = "jdbc:oracle:thin:@coeoracle.aus.edu:1521:orcl," + "sli00011238,"+ "sli00011238";
 public static String  CONNECTION_STRING = "jdbc:oracle:thin:b00063271/b00063271@coeoracle.aus.edu:1521:orcl";
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
                    System.out.println("Connectioned to database");
			return connection;
		} else {
                    System.out.println("Connection Failed! Check");
			return null;
		}
                
 }
}
	