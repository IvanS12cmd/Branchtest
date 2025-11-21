import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What type of drink do you want?(coffee, espresso, latte, cappuccino): ");
        String drink = sc.nextLine();
        switch (drink) {
            case "coffee":
                System.out.println("Long(1.50) or short(1)?");
                String type = sc.nextLine();
                if (type.equals("long")) {
                    double pricea = 1.50;
                    System.out.println("How many grams of sugar do you want to add?:");
                    double sugar = sc.nextDouble();
                    double price = pricea + (sugar / 10);
                    System.out.println("How many mililiters of milk do you want to add?: ");
                    double milk = sc.nextDouble();
                    price += milk / 10;
                    if (sugar + milk < 14) {
                        System.out.println("Your coffee costs: " + pricea + "0");
                        break;
                    }
                    double finalprice = price * 0.5;
                    System.out.println("Your coffee costs: " + finalprice);
                    break;
                }
                else if (type.equals("short")) {
                    double pricea = 1;
                    System.out.println("How many grams of sugar do you want to add?:");
                    double sugar = sc.nextDouble();
                    double price = pricea + (sugar / 10);
                    System.out.println("How many mililiters of milk do you want to add?: ");
                    double milk = sc.nextDouble();
                    price += milk / 10;
                    if (sugar + milk < 9) {
                        System.out.println("Your coffee costs: " + pricea + "0");
                        break;
                    }
                    double finalprice = price * 0.5;
                    System.out.println("Your coffee costs: " + finalprice + "0");
                    break;
                }
            case "espresso":
                System.out.println("Long(2) or short(1.50)?");
                String type1 = sc.nextLine();
                if (type1.equals("long")) {
                    double pricea = 2;
                    System.out.println("How many grams of sugar do you want to add?:");
                    double sugar = sc.nextDouble();
                    double price = pricea + (sugar / 10);
                    System.out.println("How many mililiters of milk do you want to add?: ");
                    double milk = sc.nextDouble();
                    price += milk / 10;
                    if (sugar + milk < 20) {
                        System.out.println("Your coffee costs: " + pricea + "0");
                        break;
                    }
                    double finalprice = price * 0.5;
                    System.out.println("Your coffee costs: " + finalprice);
                    break;
                }
                else if (type1.equals("short")) {
                    double pricea = 1.50;
                    System.out.println("How many grams of sugar do you want to add?:");
                    double sugar = sc.nextDouble();
                    double price = pricea + (sugar / 10);
                    System.out.println("How many mililiters of milk do you want to add?: ");
                    double milk = sc.nextDouble();
                    price += milk / 10;
                    if (sugar + milk < 14) {
                        System.out.println("Your coffee costs: " + pricea + "0");
                        break;
                    }
                    double finalprice = price * 0.5;
                    System.out.println("Your coffee costs: " + finalprice);
                    break;
                }
            case "latte":
                System.out.println("Long(1.75) or short(1.25)?");
                String type2 = sc.nextLine();
                if (type2.equals("long")) {
                    double pricea = 1.75;
                    System.out.println("How many grams of sugar do you want to add?:");
                    double sugar = sc.nextDouble();
                    double price = pricea + (sugar / 10);
                    System.out.println("How many mililiters of milk do you want to add?: ");
                    double milk = sc.nextDouble();
                    price += milk / 10;
                    if (sugar + milk < 18) {
                        System.out.println("Your coffee costs: " + pricea);
                        break;
                    }
                    double finalprice = price * 0.5;
                    System.out.println("Your coffee costs: " + finalprice);
                    break;
                }
                else if (type2.equals("short")) {
                    double pricea = 1.25;
                    System.out.println("How many grams of sugar do you want to add?:");
                    double sugar = sc.nextDouble();
                    double price = pricea + (sugar / 10);
                    System.out.println("How many mililiters of milk do you want to add?: ");
                    double milk = sc.nextDouble();
                    price += milk / 10;
                    if (sugar + milk < 12) {
                        System.out.println("Your coffee costs: " + pricea + "0");
                        break;
                    }
                    double finalprice = price * 0.5;
                    System.out.println("Your coffee costs: " + finalprice);
                    break;
                }
            case "cappuccino":
                System.out.println("Long(1.75) or short(1.20)?");
                String type3 = sc.nextLine();
                if (type3.equals("long")) {
                    double pricea = 1.75;
                    System.out.println("How many grams of sugar do you want to add?:");
                    double sugar = sc.nextDouble();
                    double price = pricea + (sugar / 10);
                    System.out.println("How many mililiters of milk do you want to add?: ");
                    double milk = sc.nextDouble();
                    price += milk / 10;
                    if (sugar + milk < 18) {
                        System.out.println("Your coffee costs: " + pricea);
                        break;
                    }
                    double finalprice = price * 0.5;
                    System.out.println("Your coffee costs: " + finalprice);
                    break;
                }
                else if (type3.equals("short")) {
                    double pricea = 1.20;
                    System.out.println("How many grams of sugar do you want to add?:");
                    double sugar = sc.nextDouble();
                    double price = pricea + (sugar / 10);
                    System.out.println("How many mililiters of milk do you want to add?: ");
                    double milk = sc.nextDouble();
                    price += milk / 10;
                    if (sugar + milk < 11) {
                        System.out.println("Your coffee costs: " + pricea + "0");
                        break;
                    }
                    double finalprice = price * 0.5;
                    System.out.println("Your coffee costs: " + finalprice);
                    break;
                }
        }
    }
}