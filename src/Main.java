import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Drink = "";
        while (!Drink.equals("coffee") && !Drink.equals("espresso") && !Drink.equals("latte") && !Drink.equals("cappuccino")) {
            System.out.println("What type of drink do you want? (coffee, espresso, latte, cappuccino): ");
            Drink = sc.nextLine();
        }

        String Type = "";
        while (!Type.equals("long") && !Type.equals("short")) {
            if (Drink.equals("coffee")) {
                System.out.println("Long(1.50) or short(1)?");
            } else if (Drink.equals("espresso")) {
                System.out.println("Long(2) or short(1.50)?");
            } else if (Drink.equals("latte")) {
                System.out.println("Long(1.75) or short(1.25)?");
            } else {
                System.out.println("Long(1.75) or short(1.20)?");
            }
            Type = sc.nextLine();
        }

        double BasePrice = 0;
        double Discount = 0;

        if (Drink.equals("coffee")) {
            if (Type.equals("long")) {
                BasePrice = 1.50;
                Discount = 14;
            } else {
                BasePrice = 1.00;
                Discount = 9;
            }
        } else if (Drink.equals("espresso")) {
            if (Type.equals("long")) {
                BasePrice = 2.00;
                Discount = 20;
            } else {
                BasePrice = 1.50;
                Discount = 14;
            }
        } else if (Drink.equals("latte")) {
            if (Type.equals("long")) {
                BasePrice = 1.75;
                Discount = 18;
            } else {
                BasePrice = 1.25;
                Discount = 12;
            }
        } else {
            if (Type.equals("long")) {
                BasePrice = 1.75;
                Discount = 18;
            } else {
                BasePrice = 1.20;
                Discount = 11;
            }
        }

        System.out.println("How many grams of sugar do you want to add?:");
        double Sugar = sc.nextDouble();
        System.out.println("How many mililiters of milk do you want to add?: ");
        double Milk = sc.nextDouble();

        if (Sugar + Milk <= 45) {
            double Price = BasePrice + (Sugar / 10) + (Milk / 10);
            if (Sugar + Milk >= Discount) {
                Price = Price * 0.5;
            }

            Price = Math.round(Price * 100.0) / 100.0;
            String Formattedprice = String.format("%.2f", Price);
            System.out.println("Your " + Drink + " costs: " + Formattedprice);

            sc.nextLine();
            String Currency = "";
            while (!Currency.equals("bgn") && !Currency.equals("euro")) {
                System.out.println("Would you like to pay with bgn or euro?");
                Currency = sc.nextLine();
            }

            double Finalprice = Price;
            if (Currency.equals("euro")) {
                Finalprice = Price * 0.51;
            }
            Finalprice = Math.round(Finalprice * 100.0) / 100.0;
            String Formattedfinalprice = String.format("%.2f", Finalprice);

            System.out.println("The final price is: " + Formattedfinalprice + " " + Currency + ". Pay here: ");
            double Paid = sc.nextDouble();

            if (Paid > Finalprice) {
                double Change = Math.round((Paid - Finalprice) * 100.0) / 100.0;
                System.out.println("Here's your change: " + String.format("%.2f", Change) + ". Come back again!");
            } else if (Paid == Finalprice) {
                System.out.println("Thank you! Come back again!");
            } else {
                double Remaining = Math.round((Finalprice - Paid) * 100.0) / 100.0;
                while (Remaining > 0) {
                    System.out.println("You're still short! You need: " + String.format("%.2f", Remaining) + " more. Pay up!");
                    double Additional = sc.nextDouble();

                    if (Additional >= Remaining) {
                        if (Additional > Remaining) {
                            double change = Math.round((Additional - Remaining) * 100.0) / 100.0;
                            System.out.println("Here's your change: " + String.format("%.2f", change) + ". Come back again!");
                        } else {
                            System.out.println("Thank you! Come back again!");
                        }
                        break;
                    } else {
                        Remaining = Math.round((Remaining - Additional) * 100.0) / 100.0;
                    }
                }
            }
        } else {
            System.out.println("Too many resources used! Order canceled.");
        }
    }
}