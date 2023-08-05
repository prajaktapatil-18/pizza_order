import java.util.Scanner;

public class BillPayment {
    Scanner sc = new Scanner(System.in);
    public void payment(){

        PizzaVerieties pv = new PizzaVerieties();
        System.out.println("Veg pizza = 200");
        System.out.println("you can pay  200 to get your order \n" +
                "please pay your bill ");
        int payment = sc.nextInt();
        if (payment == 200) {
            System.out.println("Your order will be delivered in 20 min");
        } else if (payment > 200 || payment < 200) {
            System.out.println("check your payment again");
            pv.vegPizza();
        } else {
            System.out.println("your payment not received please check again");
        }
    }

    public void payment2(){

        PizzaVerieties pv = new PizzaVerieties();
        System.out.println("NonVeg pizza = 400");
        System.out.println("you can pay  400 to get your order \n" +
                "please pay your bill ");
        int payment = sc.nextInt();
        if (payment == 400) {
            System.out.println("Your order will be delivered in 20 min");
        } else if (payment > 400 || payment < 400) {
            System.out.println("check your payment again");
            pv.nonVegPizza();
        } else {
            System.out.println("your payment not received please check again");
        }

    }

    public void payment3(){
        PizzaVerieties pv = new PizzaVerieties();
        System.out.println("paneer pizza = 300");
        System.out.println("you can pay  300 to get your order \n" +
                "please pay your bill ");
        int payment = sc.nextInt();
        if (payment == 300) {
            System.out.println("Your order will be delivered in 20 min");
        } else if (payment > 300 || payment < 300) {
            System.out.println("check your payment again");
            pv.paneerPizza();
        } else {
            System.out.println("your payment not received please check again");
        }

    }
}