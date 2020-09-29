package ExampleInheritance;

public class Debit extends Card{
    private float usage;
    private int attempts;

    public Debit(){
        this.usage = -1;
        this.attempts = -1;
    }

    public Debit(Account account,int CSV) {
        this.usage = 0;
        this.attempts = 0;
        setAccount(account);
        setCardCSV(CSV);
        setCardNumber(account.getAccountNumber());
        setPoints(0);
    }

    public float getUsage() {
        return this.usage;
    }


    public void makePayment(float amount,int CSV){
        float balance = getAccount().getBalance();
        if(getCardCSV() == CSV  & attempts <3){
            attempts = 0;
            if(amount > balance){
                printMessage("Balance too low to make payment");
            }else{
                getAccount().setBalance(balance-amount);
                this.usage += amount;
                this.calculatePoints(amount);
                printMessage("Payment Successful.");
                printMessage("Updated Account Balance is Rs ",getAccount().getBalance());
            }
        }else{
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


    @Override
    public String toString() {
        return "{" +
            " usage='" + usage + "'" +
            ", account='" + getAccount() + "'" +
            ", Membership Points= "+ getPoints() +
            "}";
    }




}
