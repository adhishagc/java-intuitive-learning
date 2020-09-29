package ExampleInheritance;
public abstract class Card{

    private int cardNumber;
    private int cardCSV;
    private Account account;
    private int points;

    public Card(){
        this.cardNumber = -1;
        this.cardCSV  = -1;
        this.account = null;
        this.points = -1;
    }

    public int getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        if(this.cardNumber ==-1){
            this.cardNumber = cardNumber;
        }else{
            printMessage("Card number cannot be changed.");
        }   
    }

    public int getCardCSV() {
        return this.cardCSV;
    }

    public void setCardCSV(int cardCSV) {
        if(this.cardCSV == -1){
            this.cardCSV = cardCSV;
        }else{
            printMessage("Card CSV cannot be changed.");
        }
        
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        if(this.account == null){
            this.account = account;
        }else{
            printMessage("Card Account cannot be changed.");
        }
        
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessage(float value){
        System.out.println(value);
    }

    public void printMessage(String message, float value){
        System.out.println(message + " " + value);
    }

    public abstract void makePayment(float amount,int CSV);
    

}
