package Adapter;

public class ICICIApiAdapter implements BankAPI {
//    ICICIBankAPI iciciBankAPI;
//    public ICICIApiAdapter(ICICIBankAPI iciciBankAPI){
//        this.iciciBankAPI = iciciBankAPI;
//    }

    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        return iciciBankAPI.checkBalance(accountNumber);
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amount) {
        System.out.println("ICICI API: sending "+ amount + " from " + fromAcc + " to " + toAcc);
        return iciciBankAPI.transferBalance(fromAcc, toAcc, amount);
    }
}
