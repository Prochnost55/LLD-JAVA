package Adapter;

//This is an example of class provided via a banking platform
public class ICICIBankAPI {
    public double checkBalance(String accountNumber){
        // let's say this method returns balance
        return 534234.0;
    }

    public boolean transferBalance(String fromAccount, String toAccount, double amount){
        // let's say this method transfers balance
        return true;
    }
}
