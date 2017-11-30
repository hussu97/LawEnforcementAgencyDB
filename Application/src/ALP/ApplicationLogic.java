package ALP;

//Source file: C:\\Labs\\Y2017\\COE 420L-S17\\COE 420 Labs - S17\\COE420-LA10-S17-SQL Oracle-GUI\\RentACar-ClassTojavaCode-LA8\\ApplicationLogic.java
//import RentACar.ApplicationLogic.DBMS;
import java.util.ArrayList;
import java.util.Date;

enum EnumPayType {

    cash, card
};

public class ApplicationLogic {

    public ApplicationLogic() {

    }
}

class Location {

    int latitude;
    int logitude;

    public Location() {

    }
}

class RentalContract {

    private int carID;
    private String licenseNo;
    private Date issuaDate;
    private Date returnDate;
    private double rentalCharges;
    private EnumPayType paymentType;
  // public DBMS theDBMS;

    public RentalContract() {

    }
}

class Track {

    private int carID;
    private String gpsData;
  // public DBMS theDBMS;

    public Track() {

    }

    /**
     * @param carID
     * @return Location
     */
    public Location getLocation(int carID) {
        Location location = null;
        return location;
    }
}

class User {

    private int userID;
    private String userName;
    private String password;
    private int mobileNo;

    // public DBMS theDBMS;
    public User(int userID, String userName, String password, int mobileNo) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.mobileNo = mobileNo;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public String getPassword() {
        return password;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public User() {

    }
}

class Fleet {

    private ArrayList carList;
    public Car theCar[];

    public Fleet() {

    }

    /**
     * @param car
     * @return boolean
     */
    public boolean addCar(Car car) {
        return true;
    }

    /**
     * @param carID
     * @return boolean
     */
    public boolean removeCar(int carID) {
        return true;
    }

    /**
     * @param carID
     * @return boolean
     */
    public boolean findCar(int carID) {
        return true;
    }
}

class UserList {

    private ArrayList userList;
    public User theUser[];

    public UserList() {

    }

    /**
     * @param user
     * @return boolean
     */
    public boolean addUser(User user) {
        return true;
    }

    /**
     * @param userID
     * @return boolean
     */
    public boolean removeUser(int userID) {
        return true;
    }

    /**
     * @param userID
     */
    public void findUser(int userID) {

    }
}

class RentalContractList {

    private ArrayList rentalContractList;
    public RentalContract theRentalContract[];

    public RentalContractList() {

    }

    /**
     * @param rentalContract
     * @return boolean
     */
    public boolean addRentalContract(RentalContract rentalContract) {
        return true;
    }

    /**
     * @param licenseNumber
     * @return boolean
     */
    public boolean removeRentalContract(String licenseNumber) {
        return true;
    }
}

class Car {

    private int carID;
    private String carBrand;
    private int drive;
    private double engineCapacity;
    private int carModel;
    private boolean available;
    private int name;
  // public DBMS theDBMS;

    public Car() {

    }
}
