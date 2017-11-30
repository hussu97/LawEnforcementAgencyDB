package ALP;
public class Login
{
    private int loginID;
    private String loginPW;

    public Login() {
    }

    public Login(int loginID, String loginPW) {
        this.loginID = loginID;
        this.loginPW = loginPW;
    }

    public int getLoginID() {
        return loginID;
    }

    public String getLoginPW() {
        return loginPW;
    }
    
   public boolean equals(Object otherObject) 
   {
        //A quick test to see if the objects are equla 
        if(this == otherObject) 
        {
            System.out.println("I am in this");
            return true;
        }
        //Return false if otherObject is null
          if(otherObject == null)  return false;
         
          //Check if both objects belong the the same class 
          //and return false if they do not
          if(getClass() != otherObject.getClass()) return false;
         
          Login other =  (Login) otherObject;
          return this.loginID==( other.loginID) 
                  && this.loginPW.equals(other.loginPW);
   }

    @Override
    public String toString() {
        return loginID +" " + loginPW;
    }
   
}