public class Acccount1 {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public void setAccountNumber(int an) {
        accountNumber = an;
    }

    public void setAccountHolderName(String ahn) {
        accountHolderName = ahn;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void showDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Account balance : " + balance);
    }
}
