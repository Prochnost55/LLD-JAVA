package Adapter;

//This is an example of class provided via a banking platform
public class YesBankAPI {
    public double getBalanceOfAccount(String accountNumber){
        // let's say this method returns balance
        return 534234.0;
    }

    // Note how the method signature is different here.
    // in icici bank api we have the fromAccount first but here amount is first
    // the methods will behave in a similar manner but the implementation might be different
    public boolean transferBalance(double amount, String toAccount, String fromAccount){
        // let's say this method transfers balance
        return true;
    }
}
