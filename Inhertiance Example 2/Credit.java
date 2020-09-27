public class Credit extends Card{

    private float usage;
    private float percentage;


    public Credit() {
    }

    public Credit(float usage, float percentage) {
        this.usage = usage;
        this.percentage = percentage;
    }

    public float getUsage() {
        return this.usage;
    }

    public void setUsage(float usage) {
        this.usage = usage;
    }

    public float getPercentage() {
        return this.percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public float remainder(){
        float remainder = super.getBalance()*this.percentage - this.usage;
    }
    

    
}

    
