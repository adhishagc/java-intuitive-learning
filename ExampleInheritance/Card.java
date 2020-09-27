package ExampleInheritance;
public abstract class Card{

    protected int cardNumber;
    protected int cardCSV;
    protected Account account;
    protected String brandType;
    protected int points = 0;

    public int getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardCSV() {
        return this.cardCSV;
    }

    public void setCardCSV(int cardCSV) {
        this.cardCSV = cardCSV;
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getBrandType() {
        return this.brandType;
    }

    public void setBrandType(String brandType) {
        this.brandType = brandType;
    }

    

    public void printMessage(String message){
        System.out.println(message);
    }

    public abstract void makePayment(float amount);
    protected abstract void setPoints(float amount);


    
}
