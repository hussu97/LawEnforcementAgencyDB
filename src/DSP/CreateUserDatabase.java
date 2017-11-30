package DSP;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateUserDatabase
{
    public static void createUserDatabase()throws SQLException
    {
        Connection connection = OracleJDBCConnection.connectDataBase();
        Statement st = null;
        try {
            st = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(OracleJDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
         
            String sql ="Insert into userTable values(3,'Ali', '3', '00971501234567')";
            try {
                    System.out.println("Executing sql");
                    st.executeUpdate(sql);
                } catch (SQLException ex) {
                    //  Logger.getLogger(OracleJDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(sql);
//                sql = "";
//                sql ="Insert into userTable values(1,'Alisha', 'Alisha123', '00971501234568')";
//            try {
//                    System.out.println("Executing sql");
//                    st.executeUpdate(sql);
//                } catch (SQLException ex) {
//                    //  Logger.getLogger(OracleJDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                System.out.println(sql);
//                st.executeUpdate("commit");
                connection.close();
               
            
    }
}
