package ALP;
import DSP.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Driver
{
    public static void main(String args[])
    {
        try {
           //CreateCarDatabase.createDatabase();
           //CreateUserDatabase.createUserDatabase();
            
        } catch (SQLException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}