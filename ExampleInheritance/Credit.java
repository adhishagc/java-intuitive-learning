package ExampleInheritance;
public class Credit extends Card {

    private float usage;
    private float percentage;
    private int attempts;

    public Credit(){
        this.usage = -1;
        this.attempts = -1;
        this.percentage = -1;
    }

    public Credit(float percentage, Account account,int CSV) {
        this.percentage = percentage;
        this.usage = 0;
        this.attempts = 0;
        setAccount(account);
        setCardCSV(CSV);
        setCardNumber(account.getAccountNumber());
        setPoints(0);
    }

    public void makePayment(float amount,int CSV){
        if(getCardCSV() == CSV & attempts <3){
            attempts = 0;
            if(amount > calculateMaxLimit()){
                printMessage("Balance too low to make payment");
            }else{
                getAccount().setBalance(getAccount().getBalance()-amount);
                this.usage += amount;
                this.calculatePoints(amount);
                printMessage("Payment Successful");
                printMessage("Updated Account Balance is Rs ",getAccount().getBalance());
            }
        }
        else{            
            attempts++;
            if(attempts >=3){
                printMessage("Card disabled. Please contact Bank");
            }else{
                printMessage("Authentical Failed");
            }      
        }
    }

    private void calculatePoints(float amount){
        int pointsCalc = (int)amount / 100;
        int points = pointsCalc;
        setPoints(points);
    }
    
    private float calculateMaxLimit(){
        return this.percentage*getAccount().getBalance();
    }

    public float getUsage() {
        return this.usage;
    }

    public float getPercentage() {
        return this.percentage;
    }

    public int getAttempts() {
        return this.attempts;
    }

    @Override
    public String toString() {
        return "{" +
            " usage='" + getUsage() + "'" +
            ", percentage='" + getPercentage() + "'" +
            ", account='" + getAccount().toString() + "'" +
            ", Membership Points= "+ getPoints() +
            "}";
    }

}

    
