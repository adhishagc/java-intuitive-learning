package ExampleInheritance;

public class Application {
    public static void main(String[] args){
        //Create customer
        Customer adhisha = new Customer("Adhisha Gammanpila","adhishagc@gmail.com","Battaramulla");
        System.out.println(adhisha.toString());

        //Create Account
        Account account = new Account("Nations Trust Bank",123456,"Battaramulla",100000,adhisha);
        System.out.println(account.toString());

        //Create credit card
        Credit adhishaCard = new Credit(0.8f,account);
        System.out.println(adhishaCard.toString());

        //Make a payment
        adhishaCard.makePayment(5000);
        System.out.println(adhishaCard.toString());

        //Exceed Payment
        adhishaCard.makePayment(135000);
        System.out.println(adhishaCard.toString());

    


    }
}
