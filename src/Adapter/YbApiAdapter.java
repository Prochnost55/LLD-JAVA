package Adapter;

public class YbApiAdapter implements BankAPI{

    YesBankAPI yesBankAPI =  new YesBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        return yesBankAPI.getBalanceOfAccount(accountNumber);
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amount) {
        System.out.println("YB API: sending "+ amount + " from " + fromAcc + " to " + toAcc);
        return yesBankAPI.transferBalance(amount, toAcc, fromAcc);
    }
}
