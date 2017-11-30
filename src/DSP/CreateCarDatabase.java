package DSP;

import DSP.OracleJDBCConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateCarDatabase {

    static int carID = 0;
    static String brand[] = {"Toyota", "Honda", "Mitsubishi", "Mazda", "BMW", "MERC"};
    static int model[] = {2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017};
    static double drive[] = {2, 4};
    static double dailyRentalCharges[] = {100.00, 150.00, 200.00, 250.00, 300.00};
    static String available[] = {"y", "n"};
    static double engCapacity[] = {1.5, 2.0, 2.4, 2.5, 3.0, 4.0, 4.5, 5.0};

    public static void createDatabase() throws SQLException {

        Connection connection = OracleJDBCConnection.connectDataBase();
        Statement st = null;
        try {
            st = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(OracleJDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
         
            String sql ="";
            Random rand = new Random();
            for (int i = 0; i < 250; i++) {

                sql = sql + "INSERT INTO CAR VALUES(";
                sql = sql + (++carID);
                sql = sql + ",'" + brand[rand.nextInt(brand.length)] + "'";
                sql = sql + "," + model[rand.nextInt(model.length)];
                sql = sql + "," + drive[rand.nextInt(drive.length)];
                sql = sql + "," + dailyRentalCharges[rand.nextInt(dailyRentalCharges.length)];
                sql = sql + ",'" + available[rand.nextInt(available.length)] + "'";
                sql = sql + "," + engCapacity[rand.nextInt(engCapacity.length)];
                sql = sql + ")";
                try {
                    System.out.println("Executing sql");
                    st.executeUpdate(sql);
                } catch (SQLException ex) {
                    //  Logger.getLogger(OracleJDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(sql);
                sql = "";
               
            }// end of while
            st.executeQuery("COMMIT");
   
        connection.close();

    }

}
