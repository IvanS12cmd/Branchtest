import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What type of drink do you want?(coffee, espresso, latte, cappuccino): ");
        String drink = sc.nextLine();

        double Baseprice = 0;
        double Discount = 0;

        if (drink.equals("coffee")) {
            System.out.println("Long(1.50) or short(1)?");
            String type = sc.nextLine();
            if (type.equals("long")) {
                Baseprice = 1.50;
                Discount = 14;
            } else if (type.equals("short")) {
                Baseprice = 1.00;
                Discount = 9;
            }
        } else if (drink.equals("espresso")) {
            System.out.println("Long(2) or short(1.50)?");
            String type = sc.nextLine();
            if (type.equals("long")) {
                Baseprice = 2.00;
                Discount = 20;
            } else if (type.equals("short")) {
                Baseprice = 1.50;
                Discount = 14;
            }
        } else if (drink.equals("latte")) {
            System.out.println("Long(1.75) or short(1.25)?");
            String type = sc.nextLine();
            if (type.equals("long")) {
                Baseprice = 1.75;
                Discount = 18;
            } else if (type.equals("short")) {
                Baseprice = 1.25;
                Discount = 12;
            }
        } else if (drink.equals("cappuccino")) {
            System.out.println("Long(1.75) or short(1.20)?");
            String type = sc.nextLine();
            if (type.equals("long")) {
                Baseprice = 1.75;
                Discount = 18;
            } else if (type.equals("short")) {
                Baseprice = 1.20;
                Discount = 11;
            }
        }

        System.out.println("How many grams of sugar do you want to add?:");
        double sugar = sc.nextDouble();
        System.out.println("How many mililiters of milk do you want to add?: ");
        double milk = sc.nextDouble();

        double price = Baseprice + (sugar / 10) + (milk / 10);

        if (sugar + milk >= Discount) {
            price = price * 0.5;
        }

        price = Math.round(price * 100.0) / 100.0;

        String Formattedprice = String.format("%.2f", price);
        System.out.println("Your " + drink + " costs: " + Formattedprice);

        System.out.println("Would you like to pay with bgn or euro?");
        sc.nextLine();
        String currency = sc.nextLine();

        double Finalprice = price;
        if (currency.equals("euro")) {
            Finalprice = price * 0.51;
        }

        Finalprice = Math.round(Finalprice * 100.0) / 100.0;

        String Formattedfinalprice = String.format("%.2f", Finalprice);
        System.out.println("The final price is: " + Formattedfinalprice + " " + currency + ". Pay here: ");
        double paid = sc.nextDouble();

        if (paid > Finalprice) {
            double change = paid - Finalprice;
            change = Math.round(change * 100.0) / 100.0;

            String Formattedchange = String.format("%.2f", change);
            System.out.println("Here's your change: " + Formattedchange + ". Come back again!");
        } else if (paid == Finalprice) {
            System.out.println("Thank you! Come back again!");
        } else {
            double remaining = Finalprice - paid;
            remaining = Math.round(remaining * 100.0) / 100.0;

            while (remaining > 0) {

                String Formattedremaining = String.format("%.2f", remaining);
                System.out.println("You're still short! You need: " + Formattedremaining + " more. Pay up!");
                double additional = sc.nextDouble();

                if (additional >= remaining) {
                    if (additional > remaining) {
                        double change = additional - remaining;
                        change = Math.round(change * 100.0) / 100.0;

                        String Formattedchange = String.format("%.2f", change);
                        System.out.println("Here's your change: " + Formattedchange + ". Come back again!");
                    } else {
                        System.out.println("Thank you! Come back again!");
                    }
                    break;
                } else {
                    remaining = remaining - additional;
                    remaining = Math.round(remaining * 100.0) / 100.0;
                }
            }
        }
    }
}