public abstract class Card{

    protected int number;
    protected String name;
    protected String bank;
    protected int accountNumber;
    protected float balance;
    protected String type;


    public Card() {
    }

    public Card(int number, String name, String bank, int accountNumber, float balance, String type) {
        this.number = number;
        this.name = name;
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.type = type;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    public abstract float getBalance();

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "{" +
            " number='" + getNumber() + "'" +
            ", name='" + getName() + "'" +
            ", bank='" + getBank() + "'" +
            ", accountNumber='" + getAccountNumber() + "'" +
            ", balance='" + getBalance() + "'" +
            ", type='" + getType() + "'" +
            "}";
    }

    
}
