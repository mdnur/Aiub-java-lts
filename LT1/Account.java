public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void showDetails() {
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Account Holder Name : " + this.accountHolderName);
        System.out.println("Account balance : " + this.balance);
    }
}
