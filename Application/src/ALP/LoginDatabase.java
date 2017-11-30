package ALP;


/* 
 **************************************
 This database  is no more used 
 **************************************

 */

/*
 - This creates a local database
 -Prefered for sing user application
 -For multi use application fetch data directly from the database to 
 maintain integrity and accuracy

 */
import java.util.ArrayList;

public class LoginDatabase {

    final static private ArrayList<Login> loginList = new ArrayList<Login>();

    //Add login item
    public static void addLogin(Login loginItem) {
        loginList.add(loginItem);
    }

    //Return true if login item exists else false
    public static boolean findLoginUser(Login loginUser) {
        for (Login loginItem : loginList) {
            if (loginItem.equals(loginUser)) {
                return true;
            }
        }
        return false;
    }

    //Return true if login item exists else false
    public static boolean removeLoginUser(Login loginUser) {

        for (Login loginItem : loginList) {
            if (loginItem.equals(loginUser)) {
                loginList.remove(loginItem);
            }
        }
        return false;
    }
}
