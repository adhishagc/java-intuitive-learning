package ExampleInheritance;

public class Account {
    private String bank;
    private int accountNumber;
    private String branch;
    private Customer customer;
    private float balance;
    private final String currency = "LKR";


    public Account(String bank, int accountNumber, String branch,float balance ,Customer customer) {
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.branch = branch;
        this.balance = balance;
        this.customer = customer;
    }

    public String getBank() {
        return this.bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "{" +
            " bank='" + getBank() + "'" +
            ", accountNumber='" + getAccountNumber() + "'" +
            ", branch='" + getBranch() + "'" +
            ", customer='" + getCustomer() + "'" +
            ", balance='" + currency + " "+getBalance() + "'" +
            "}";
    }


}
