import java.util.Scanner;

public class PizzaVerieties {
    Scanner sc = new Scanner(System.in);

int vegP= 200;

    public void vegPizza() {
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

    public void nonVegPizza() {
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

    public void paneerPizza() {
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
    public void cornPizza(){
        PizzaVerieties pv = new PizzaVerieties();
        System.out.println("corn pizza = 200");
        System.out.println("you can pay  200 to get your order \n" +
                "please pay your bill ");
        int payment = sc.nextInt();
        if (payment==200){
            System.out.println("Your order will be delivered in 20 min");
        }else if (payment>200 || payment <200){
            System.out.println("check your payment again");
            pv.cornPizza();
        }else {
            System.out.println("your payment not received please check again");
        }
    }


    public void spicesPizza(){
        PizzaVerieties pv = new PizzaVerieties();
        System.out.println(" spices pizza = 200");
        System.out.println("you can pay  200 to get your order \n" +
                "please pay your bill ");
        int payment = sc.nextInt();
        if (payment==200){
            System.out.println("Your order will be delivered in 20 min");
        }else if (payment>200 || payment <200){
            System.out.println("check your payment again");
            pv. spicesPizza();
        }else {
            System.out.println("your payment not received please check again");
        }
    }
    public void addMenu(){
        System.out.println("you can ordered more item  check  famous menu list \n" +
                "1. veg biryani = 100\n" +
                "2 . chicken Birayani = 150 \n" +
                "3. fried Rice  = 100 \n" +
                "4 . chicken masala = 180\n" +
                " 5. pav bahji = 50\n" +
                "6. extra chess on pizza = 100 \n" +
                "7. misal = 60");


        Scanner scan = new Scanner(System.in);

        int vegB = 100;
        int cheB = 150;
        int friedR = 100;
        int chickenM = 180;
        int pavBhaji= 50;
        int extraCh = 100;
        int misal = 60;

        int   choice = sc.nextInt();
        switch (choice){

            case 1 :

                System.out.println("veg biryani = " + (vegB + vegP));

                break;
            case 2 :
                System.out.println("chicken biryani 150");
                System.out.println("addded new menu chicken biryani ");
                break;
            case 3 :
                System.out.println("fried  rice 100");
                break;
            case 4 :
                System.out.println("chicken masala  180");
                break;
            case 5 :
                System.out.println("pav bhaji 50");
                break;
            case 6 :
                System.out.println("extra chess");

                break;
            case 7:
                System.out.println("misal = 60");
                break;
            default:
                System.out.println("invalid choice");
        }
    }








}


