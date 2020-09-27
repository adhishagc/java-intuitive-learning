public abstract class Card{

    protected int number;
    protected String name;
    protected String bank;
    protected int accountNumber;
    protected float balance;
    protected String type;


    protected abstract void setNumber();
    protected abstract void setName();
    protected abstract void setBank();
    protected abstract void setAccountNumber();
    protected abstract void setBalance();
    protected abstract void setType();

    protected abstract int getNumber();
    protected abstract String getName();
    protected abstract String getBank();
    protected abstract int getAccountNumber();
    protected abstract float getBalance();
    protected abstract String getType();

    
}
