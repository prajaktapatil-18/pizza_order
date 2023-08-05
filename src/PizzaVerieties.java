import java.util.Scanner;

public class PizzaVerieties {
    Scanner sc = new Scanner(System.in);

int vegP= 200;

    public void vegPizza() {
        PizzaVerieties pv = new PizzaVerieties();
        BillPayment b= new BillPayment();
        System.out.println(" veg pizza = 200");

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your choice\n" +
                "1. order more\n" +
                "2. exit");
        int choice1 = scan.nextInt();

        PizzaVerieties pv1 = new PizzaVerieties();
        if (choice1 == 1) {
            pv1.addMenu();
        } else {
            b.payment();
        }
    }

    public void nonVegPizza() {
        PizzaVerieties pv = new PizzaVerieties();
        BillPayment b= new BillPayment();
        System.out.println(" nonveg = 400");

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your choice\n" +
                "1. order more\n" +
                "2. exit");
        int choice1 = scan.nextInt();

        PizzaVerieties pv1 = new PizzaVerieties();
        if (choice1 == 1) {
            pv1.addMenu();
        } else {
            b.payment2();
        }
    }

    public void paneerPizza() {
        PizzaVerieties pv = new PizzaVerieties();
        BillPayment b= new BillPayment();
        System.out.println("Paneer Pizza = 300");

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your choice\n" +
                "1. order more\n" +
                "2. exit");
        int choice1 = scan.nextInt();

        PizzaVerieties pv1 = new PizzaVerieties();
        if (choice1 == 1) {
            pv1.addMenu();
        } else {
            b.payment3();
        }

    }
    public void cornPizza(){
        PizzaVerieties pv = new PizzaVerieties();
        BillPayment b= new BillPayment();
        System.out.println(" Corn pizza = 200");

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your choice\n" +
                "1. order more\n" +
                "2. exit");
        int choice1 = scan.nextInt();

        PizzaVerieties pv1 = new PizzaVerieties();
        if (choice1 == 1) {
            pv1.addMenu();
        } else {
            b.payment();
        }
    }


    public void spicesPizza() {
        PizzaVerieties pv = new PizzaVerieties();
        BillPayment b= new BillPayment();
        System.out.println(" spices pizza = 200");

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your choice\n" +
                "1. order more\n" +
                "2. exit");
        int choice1 = scan.nextInt();

        PizzaVerieties pv1 = new PizzaVerieties();
        if (choice1 == 1) {
            pv1.addMenu();
        } else {
            b.payment();
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

                System.out.println("veg biryani = " + (vegB));

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


