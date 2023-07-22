
import java.util.Scanner;

public class PizzaOrder {


    public static void main(String [ ] args){

        System.out.println("WELCOME");
        Scanner scan = new Scanner(System.in);
        System.out.println( "Welcome user you can see our pizza verities and order your fev pizza\n" +
                "1. veg pizza =200\n" +
                "2.nonveg pizza=400\n" +
                "3.paneer pizza = 300\n" +
                "4.corn pizza =200\n" +
                "5.spices pizza =200\n");
        PizzaVerieties pv = new PizzaVerieties();
        int  choice = scan .nextInt();
        switch(choice){
            case 1 :
                pv.vegPizza();
                pv.addMenu();
                break;
            case 2 :
                pv.nonVegPizza();
                pv.addMenu();
                break;

            case 3 :
                pv.paneerPizza();
                pv.addMenu();
                break;
            case  4 :
                pv.cornPizza();
                pv.addMenu();
                break;
            case  5 :
                pv.spicesPizza();
                pv.addMenu();
                break;
            default:
                System.out.println("invalid");
        }

    }



    }
