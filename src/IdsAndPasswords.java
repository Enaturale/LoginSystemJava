import java.util.HashMap;

public class IdsAndPasswords {
    //creating an hashmap for data storage
    HashMap<String, String> logininfo = new HashMap<String, String>(); 

    IdsAndPasswords(){
        logininfo.put("Bukky", "Bukky");
        logininfo.put("Teslim", "Teslim");
        logininfo.put("Elizabeth", "Elizabeth");


    }
    //we have to create a method that will allow us to import the hashmap into any class
    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
