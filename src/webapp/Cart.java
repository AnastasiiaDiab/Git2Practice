package webapp;

public class Cart {

    public static void main(String[] args) {

        double price = 25.00;

        if(price<100){
            System.out.println("Please follow to self checkout");
        }else{
            System.out.println("Please see the cashier");
        }
    }
}
