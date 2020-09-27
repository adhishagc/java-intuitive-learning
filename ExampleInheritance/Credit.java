package ExampleInheritance;
public class Credit extends Card {

    private float usage =0;
    private float percentage;
    private Account account;

    public Credit(float percentage, Account account) {
        this.percentage = percentage;
        this.account = account;
        setAccount(account);
    }

    public void makePayment(float amount){
        if(amount > calculateMaxLimit()){
            printMessage("Balance too low to make payment");
        }else{
            getAccount().setBalance(getAccount().getBalance()-amount);
            this.usage += amount;
            setPoints(amount);
            
        }
    }

    protected void setPoints(float amount){
        int pointsCalc = (int)amount / 100; 
        points = pointsCalc;
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

    public Account getAccount(){
        return this.account;
    }


    @Override
    public String toString() {
        return "{" +
            " usage='" + getUsage() + "'" +
            ", percentage='" + getPercentage() + "'" +
            ", account='" + getAccount().toString() + "'" +
            ", Membership Points= "+ points +
            "}";
    }

    

}

    
