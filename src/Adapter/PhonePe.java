package Adapter;

public class PhonePe {

    public static void main(String[] args) {
        // we just need to change the adapter and the code will run as is
//        BankAPI bankAPI = new YbApiAdapter();
        BankAPI bankAPI = new ICICIApiAdapter();
        String abhishekAccNo = "543252345";
        String monuAccNo = "78979878";
        double amount = 100.0;

        bankAPI.sendMoney(abhishekAccNo, monuAccNo, amount);
    }
}
