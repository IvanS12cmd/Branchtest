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

                        double mpricea = Math.round(pricea * 100.0) / 100.0;
                        String fmpricea = String.format("%.2f", mpricea);
                        System.out.println("Your coffee costs: " + fmpricea);
                        System.out.println("Would you like to pay with bgn or euro?");
                        sc.nextLine();
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "euro":
                                double epricea = pricea * 0.51;
                                double mepricea = Math.round(epricea * 100.0) / 100.0;
                                String fmepricea = String.format("%.2f", mepricea);
                                System.out.println("The final price is: " + fmepricea + ". Pay here: ");
                                double pay = sc.nextDouble();
                                if (pay > mepricea) {
                                    double change = pay - mepricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay == mepricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay < mepricea) {
                                    double diff = mepricea - pay;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    boolean whi = true;
                                    while (whi) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 - diff >= 0) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case "bgn":
                                double mpricea_bgn = Math.round(pricea * 100.0) / 100.0;
                                String fmpricea_bgn = String.format("%.2f", mpricea_bgn);
                                System.out.println("The final price is: " + fmpricea_bgn + ". Pay here: ");
                                double pay2 = sc.nextDouble();
                                if (pay2 > mpricea_bgn) {
                                    double change = pay2 - mpricea_bgn;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay2 == mpricea_bgn) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay2 < mpricea_bgn) {
                                    double diff = mpricea_bgn - pay2;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    } else {
                        double finalprice = price * 0.5;
                        double finalroundprice = Math.round(finalprice * 100.0) / 100.0;
                        String ffinalroundprice = String.format("%.2f", finalroundprice);
                        System.out.println("Your coffee costs: " + ffinalroundprice + ". You have the money, right?");
                        sc.nextLine();
                        String money = sc.nextLine();
                        if (money.equals("No")) {
                            System.out.println("You have been kicked. Get some money next time.");
                            break;
                        }
                        System.out.println("Would you like to pay with bgn or euro?");
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "euro":
                                double epricea = finalprice * 0.51;
                                double mepricea = Math.round(epricea * 100.0) / 100.0;
                                String fmepricea = String.format("%.2f", mepricea);
                                System.out.println("The final price is: " + fmepricea + ". Pay here: ");
                                double pay = sc.nextDouble();
                                if (pay > mepricea) {
                                    double change = pay - mepricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay == mepricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay < mepricea) {
                                    double diff = mepricea - pay;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case "bgn":
                                double mpricea = Math.round(finalprice * 100.0) / 100.0;
                                String fmpricea = String.format("%.2f", mpricea);
                                System.out.println("The final price is: " + fmpricea + ". Pay here: ");
                                double pay2 = sc.nextDouble();
                                if (pay2 > mpricea) {
                                    double change = pay2 - mpricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay2 == mpricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay2 < mpricea) {
                                    double diff = mpricea - pay2;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
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

                        double mpricea = Math.round(pricea * 100.0) / 100.0;
                        String fmpricea = String.format("%.2f", mpricea);
                        System.out.println("Your coffee costs: " + fmpricea);
                        System.out.println("Would you like to pay with bgn or euro?");
                        sc.nextLine(); // Consume newline
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "euro":
                                double epricea = pricea * 0.51;
                                double mepricea = Math.round(epricea * 100.0) / 100.0;
                                String fmepricea = String.format("%.2f", mepricea);
                                System.out.println("The final price is: " + fmepricea + ". Pay here: ");
                                double pay = sc.nextDouble();
                                if (pay > mepricea) {
                                    double change = pay - mepricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay == mepricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay < mepricea) {
                                    double diff = mepricea - pay;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    boolean whi = true;
                                    while (whi) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 - diff >= 0) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case "bgn":
                                double mpricea_bgn = Math.round(pricea * 100.0) / 100.0;
                                String fmpricea_bgn = String.format("%.2f", mpricea_bgn);
                                System.out.println("The final price is: " + fmpricea_bgn + ". Pay here: ");
                                double pay2 = sc.nextDouble();
                                if (pay2 > mpricea_bgn) {
                                    double change = pay2 - mpricea_bgn;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay2 == mpricea_bgn) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay2 < mpricea_bgn) {
                                    double diff = mpricea_bgn - pay2;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    } else {
                        double finalprice = price * 0.5;
                        double mfinalprice = Math.round(finalprice * 100.0) / 100.0;
                        String fmfinalprice = String.format("%.2f", mfinalprice);
                        System.out.println("Your coffee costs: " + fmfinalprice + ". You have the money, right?");
                        sc.nextLine();
                        String money = sc.nextLine();
                        if (money.equals("No")) {
                            System.out.println("You have been kicked. Get some money next time.");
                            break;
                        }
                        System.out.println("Would you like to pay with bgn or euro?");
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "euro":
                                double epricea = finalprice * 0.51;
                                double mepricea = Math.round(epricea * 100.0) / 100.0;
                                String fmepricea = String.format("%.2f", mepricea);
                                System.out.println("The final price is: " + fmepricea + ". Pay here: ");
                                double pay = sc.nextDouble();
                                if (pay > mepricea) {
                                    double change = pay - mepricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay == mepricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay < mepricea) {
                                    double diff = mepricea - pay;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case "bgn":
                                double mpricea = Math.round(finalprice * 100.0) / 100.0;
                                String fmpricea = String.format("%.2f", mpricea);
                                System.out.println("The final price is: " + fmpricea + ". Pay here: ");
                                double pay2 = sc.nextDouble();
                                if (pay2 > mpricea) {
                                    double change = pay2 - mpricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay2 == mpricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay2 < mpricea) {
                                    double diff = mpricea - pay2;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }
                break;

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

                        double mpricea = Math.round(pricea * 100.0) / 100.0;
                        String fmpricea = String.format("%.2f", mpricea);
                        System.out.println("Your espresso costs: " + fmpricea);
                        System.out.println("Would you like to pay with bgn or euro?");
                        sc.nextLine();
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "euro":
                                double epricea = pricea * 0.51;
                                double mepricea = Math.round(epricea * 100.0) / 100.0;
                                String fmepricea = String.format("%.2f", mepricea);
                                System.out.println("The final price is: " + fmepricea + ". Pay here: ");
                                double pay = sc.nextDouble();
                                if (pay > mepricea) {
                                    double change = pay - mepricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay == mepricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay < mepricea) {
                                    double diff = mepricea - pay;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    boolean whi = true;
                                    while (whi) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 - diff >= 0) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case "bgn":
                                double mpricea_bgn = Math.round(pricea * 100.0) / 100.0;
                                String fmpricea_bgn = String.format("%.2f", mpricea_bgn);
                                System.out.println("The final price is: " + fmpricea_bgn + ". Pay here: ");
                                double pay2 = sc.nextDouble();
                                if (pay2 > mpricea_bgn) {
                                    double change = pay2 - mpricea_bgn;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay2 == mpricea_bgn) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay2 < mpricea_bgn) {
                                    double diff = mpricea_bgn - pay2;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    } else {
                        double finalprice = price * 0.5;
                        double finalroundprice = Math.round(finalprice * 100.0) / 100.0;
                        String ffinalroundprice = String.format("%.2f", finalroundprice);
                        System.out.println("Your espresso costs: " + ffinalroundprice + ". You have the money, right?");
                        sc.nextLine();
                        String money = sc.nextLine();
                        if (money.equals("No")) {
                            System.out.println("You have been kicked. Get some money next time.");
                            break;
                        }
                        System.out.println("Would you like to pay with bgn or euro?");
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "euro":
                                double epricea = finalprice * 0.51;
                                double mepricea = Math.round(epricea * 100.0) / 100.0;
                                String fmepricea = String.format("%.2f", mepricea);
                                System.out.println("The final price is: " + fmepricea + ". Pay here: ");
                                double pay = sc.nextDouble();
                                if (pay > mepricea) {
                                    double change = pay - mepricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay == mepricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay < mepricea) {
                                    double diff = mepricea - pay;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case "bgn":
                                double mpricea = Math.round(finalprice * 100.0) / 100.0;
                                String fmpricea = String.format("%.2f", mpricea);
                                System.out.println("The final price is: " + fmpricea + ". Pay here: ");
                                double pay2 = sc.nextDouble();
                                if (pay2 > mpricea) {
                                    double change = pay2 - mpricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay2 == mpricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay2 < mpricea) {
                                    double diff = mpricea - pay2;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
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

                        double mpricea = Math.round(pricea * 100.0) / 100.0;
                        String fmpricea = String.format("%.2f", mpricea);
                        System.out.println("Your espresso costs: " + fmpricea);
                        System.out.println("Would you like to pay with bgn or euro?");
                        sc.nextLine();
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "euro":
                                double epricea = pricea * 0.51;
                                double mepricea = Math.round(epricea * 100.0) / 100.0;
                                String fmepricea = String.format("%.2f", mepricea);
                                System.out.println("The final price is: " + fmepricea + ". Pay here: ");
                                double pay = sc.nextDouble();
                                if (pay > mepricea) {
                                    double change = pay - mepricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay == mepricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay < mepricea) {
                                    double diff = mepricea - pay;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    boolean whi = true;
                                    while (whi) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 - diff >= 0) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case "bgn":
                                double mpricea_bgn = Math.round(pricea * 100.0) / 100.0;
                                String fmpricea_bgn = String.format("%.2f", mpricea_bgn);
                                System.out.println("The final price is: " + fmpricea_bgn + ". Pay here: ");
                                double pay2 = sc.nextDouble();
                                if (pay2 > mpricea_bgn) {
                                    double change = pay2 - mpricea_bgn;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay2 == mpricea_bgn) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay2 < mpricea_bgn) {
                                    double diff = mpricea_bgn - pay2;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    } else {
                        double finalprice = price * 0.5;
                        double mfinalprice = Math.round(finalprice * 100.0) / 100.0;
                        String fmfinalprice = String.format("%.2f", mfinalprice);
                        System.out.println("Your espresso costs: " + fmfinalprice + ". You have the money, right?");
                        sc.nextLine();
                        String money = sc.nextLine();
                        if (money.equals("No")) {
                            System.out.println("You have been kicked. Get some money next time.");
                            break;
                        }
                        System.out.println("Would you like to pay with bgn or euro?");
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "euro":
                                double epricea = finalprice * 0.51;
                                double mepricea = Math.round(epricea * 100.0) / 100.0;
                                String fmepricea = String.format("%.2f", mepricea);
                                System.out.println("The final price is: " + fmepricea + ". Pay here: ");
                                double pay = sc.nextDouble();
                                if (pay > mepricea) {
                                    double change = pay - mepricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay == mepricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay < mepricea) {
                                    double diff = mepricea - pay;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case "bgn":
                                double mpricea = Math.round(finalprice * 100.0) / 100.0;
                                String fmpricea = String.format("%.2f", mpricea);
                                System.out.println("The final price is: " + fmpricea + ". Pay here: ");
                                double pay2 = sc.nextDouble();
                                if (pay2 > mpricea) {
                                    double change = pay2 - mpricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay2 == mpricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay2 < mpricea) {
                                    double diff = mpricea - pay2;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }
                break;

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

                        double mpricea = Math.round(pricea * 100.0) / 100.0;
                        String fmpricea = String.format("%.2f", mpricea);
                        System.out.println("Your latte costs: " + fmpricea);
                        System.out.println("Would you like to pay with bgn or euro?");
                        sc.nextLine();
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "euro":
                                double epricea = pricea * 0.51;
                                double mepricea = Math.round(epricea * 100.0) / 100.0;
                                String fmepricea = String.format("%.2f", mepricea);
                                System.out.println("The final price is: " + fmepricea + ". Pay here: ");
                                double pay = sc.nextDouble();
                                if (pay > mepricea) {
                                    double change = pay - mepricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay == mepricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay < mepricea) {
                                    double diff = mepricea - pay;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    boolean whi = true;
                                    while (whi) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 - diff >= 0) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case "bgn":
                                double mpricea_bgn = Math.round(pricea * 100.0) / 100.0;
                                String fmpricea_bgn = String.format("%.2f", mpricea_bgn);
                                System.out.println("The final price is: " + fmpricea_bgn + ". Pay here: ");
                                double pay2 = sc.nextDouble();
                                if (pay2 > mpricea_bgn) {
                                    double change = pay2 - mpricea_bgn;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay2 == mpricea_bgn) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay2 < mpricea_bgn) {
                                    double diff = mpricea_bgn - pay2;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    } else {
                        double finalprice = price * 0.5;
                        double finalroundprice = Math.round(finalprice * 100.0) / 100.0;
                        String ffinalroundprice = String.format("%.2f", finalroundprice);
                        System.out.println("Your latte costs: " + ffinalroundprice + ". You have the money, right?");
                        sc.nextLine();
                        String money = sc.nextLine();
                        if (money.equals("No")) {
                            System.out.println("You have been kicked. Get some money next time.");
                            break;
                        }
                        System.out.println("Would you like to pay with bgn or euro?");
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "euro":
                                double epricea = finalprice * 0.51;
                                double mepricea = Math.round(epricea * 100.0) / 100.0;
                                String fmepricea = String.format("%.2f", mepricea);
                                System.out.println("The final price is: " + fmepricea + ". Pay here: ");
                                double pay = sc.nextDouble();
                                if (pay > mepricea) {
                                    double change = pay - mepricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay == mepricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay < mepricea) {
                                    double diff = mepricea - pay;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case "bgn":
                                double mpricea = Math.round(finalprice * 100.0) / 100.0;
                                String fmpricea = String.format("%.2f", mpricea);
                                System.out.println("The final price is: " + fmpricea + ". Pay here: ");
                                double pay2 = sc.nextDouble();
                                if (pay2 > mpricea) {
                                    double change = pay2 - mpricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay2 == mpricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay2 < mpricea) {
                                    double diff = mpricea - pay2;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
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

                        double mpricea = Math.round(pricea * 100.0) / 100.0;
                        String fmpricea = String.format("%.2f", mpricea);
                        System.out.println("Your latte costs: " + fmpricea);
                        System.out.println("Would you like to pay with bgn or euro?");
                        sc.nextLine();
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "euro":
                                double epricea = pricea * 0.51;
                                double mepricea = Math.round(epricea * 100.0) / 100.0;
                                String fmepricea = String.format("%.2f", mepricea);
                                System.out.println("The final price is: " + fmepricea + ". Pay here: ");
                                double pay = sc.nextDouble();
                                if (pay > mepricea) {
                                    double change = pay - mepricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay == mepricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay < mepricea) {
                                    double diff = mepricea - pay;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    boolean whi = true;
                                    while (whi) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 - diff >= 0) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case "bgn":
                                double mpricea_bgn = Math.round(pricea * 100.0) / 100.0;
                                String fmpricea_bgn = String.format("%.2f", mpricea_bgn);
                                System.out.println("The final price is: " + fmpricea_bgn + ". Pay here: ");
                                double pay2 = sc.nextDouble();
                                if (pay2 > mpricea_bgn) {
                                    double change = pay2 - mpricea_bgn;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay2 == mpricea_bgn) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay2 < mpricea_bgn) {
                                    double diff = mpricea_bgn - pay2;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    } else {
                        double finalprice = price * 0.5;
                        double mfinalprice = Math.round(finalprice * 100.0) / 100.0;
                        String fmfinalprice = String.format("%.2f", mfinalprice);
                        System.out.println("Your latte costs: " + fmfinalprice + ". You have the money, right?");
                        sc.nextLine();
                        String money = sc.nextLine();
                        if (money.equals("No")) {
                            System.out.println("You have been kicked. Get some money next time.");
                            break;
                        }
                        System.out.println("Would you like to pay with bgn or euro?");
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "euro":
                                double epricea = finalprice * 0.51;
                                double mepricea = Math.round(epricea * 100.0) / 100.0;
                                String fmepricea = String.format("%.2f", mepricea);
                                System.out.println("The final price is: " + fmepricea + ". Pay here: ");
                                double pay = sc.nextDouble();
                                if (pay > mepricea) {
                                    double change = pay - mepricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay == mepricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay < mepricea) {
                                    double diff = mepricea - pay;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case "bgn":
                                double mpricea = Math.round(finalprice * 100.0) / 100.0;
                                String fmpricea = String.format("%.2f", mpricea);
                                System.out.println("The final price is: " + fmpricea + ". Pay here: ");
                                double pay2 = sc.nextDouble();
                                if (pay2 > mpricea) {
                                    double change = pay2 - mpricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay2 == mpricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay2 < mpricea) {
                                    double diff = mpricea - pay2;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }
                break;

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

                        double mpricea = Math.round(pricea * 100.0) / 100.0;
                        String fmpricea = String.format("%.2f", mpricea);
                        System.out.println("Your cappuccino costs: " + fmpricea);
                        System.out.println("Would you like to pay with bgn or euro?");
                        sc.nextLine();
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "euro":
                                double epricea = pricea * 0.51;
                                double mepricea = Math.round(epricea * 100.0) / 100.0;
                                String fmepricea = String.format("%.2f", mepricea);
                                System.out.println("The final price is: " + fmepricea + ". Pay here: ");
                                double pay = sc.nextDouble();
                                if (pay > mepricea) {
                                    double change = pay - mepricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay == mepricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay < mepricea) {
                                    double diff = mepricea - pay;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    boolean whi = true;
                                    while (whi) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 - diff >= 0) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case "bgn":
                                double mpricea_bgn = Math.round(pricea * 100.0) / 100.0;
                                String fmpricea_bgn = String.format("%.2f", mpricea_bgn);
                                System.out.println("The final price is: " + fmpricea_bgn + ". Pay here: ");
                                double pay2 = sc.nextDouble();
                                if (pay2 > mpricea_bgn) {
                                    double change = pay2 - mpricea_bgn;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay2 == mpricea_bgn) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay2 < mpricea_bgn) {
                                    double diff = mpricea_bgn - pay2;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    } else {
                        double finalprice = price * 0.5;
                        double finalroundprice = Math.round(finalprice * 100.0) / 100.0;
                        String ffinalroundprice = String.format("%.2f", finalroundprice);
                        System.out.println("Your cappuccino costs: " + ffinalroundprice + ". You have the money, right?");
                        sc.nextLine();
                        String money = sc.nextLine();
                        if (money.equals("No")) {
                            System.out.println("You have been kicked. Get some money next time.");
                            break;
                        }
                        System.out.println("Would you like to pay with bgn or euro?");
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "euro":
                                double epricea = finalprice * 0.51;
                                double mepricea = Math.round(epricea * 100.0) / 100.0;
                                String fmepricea = String.format("%.2f", mepricea);
                                System.out.println("The final price is: " + fmepricea + ". Pay here: ");
                                double pay = sc.nextDouble();
                                if (pay > mepricea) {
                                    double change = pay - mepricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay == mepricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay < mepricea) {
                                    double diff = mepricea - pay;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case "bgn":
                                double mpricea = Math.round(finalprice * 100.0) / 100.0;
                                String fmpricea = String.format("%.2f", mpricea);
                                System.out.println("The final price is: " + fmpricea + ". Pay here: ");
                                double pay2 = sc.nextDouble();
                                if (pay2 > mpricea) {
                                    double change = pay2 - mpricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay2 == mpricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay2 < mpricea) {
                                    double diff = mpricea - pay2;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
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

                        double mpricea = Math.round(pricea * 100.0) / 100.0;
                        String fmpricea = String.format("%.2f", mpricea);
                        System.out.println("Your cappuccino costs: " + fmpricea);
                        System.out.println("Would you like to pay with bgn or euro?");
                        sc.nextLine(); // Consume newline
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "euro":
                                double epricea = pricea * 0.51;
                                double mepricea = Math.round(epricea * 100.0) / 100.0;
                                String fmepricea = String.format("%.2f", mepricea);
                                System.out.println("The final price is: " + fmepricea + ". Pay here: ");
                                double pay = sc.nextDouble();
                                if (pay > mepricea) {
                                    double change = pay - mepricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay == mepricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay < mepricea) {
                                    double diff = mepricea - pay;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    boolean whi = true;
                                    while (whi) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 - diff >= 0) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case "bgn":
                                double mpricea_bgn = Math.round(pricea * 100.0) / 100.0;
                                String fmpricea_bgn = String.format("%.2f", mpricea_bgn);
                                System.out.println("The final price is: " + fmpricea_bgn + ". Pay here: ");
                                double pay2 = sc.nextDouble();
                                if (pay2 > mpricea_bgn) {
                                    double change = pay2 - mpricea_bgn;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay2 == mpricea_bgn) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay2 < mpricea_bgn) {
                                    double diff = mpricea_bgn - pay2;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    } else {
                        double finalprice = price * 0.5;
                        double mfinalprice = Math.round(finalprice * 100.0) / 100.0;
                        String fmfinalprice = String.format("%.2f", mfinalprice);
                        System.out.println("Your cappuccino costs: " + fmfinalprice + ". You have the money, right?");
                        sc.nextLine();
                        String money = sc.nextLine();
                        if (money.equals("No")) {
                            System.out.println("You have been kicked. Get some money next time.");
                            break;
                        }
                        System.out.println("Would you like to pay with bgn or euro?");
                        String choice = sc.nextLine();
                        switch (choice) {
                            case "euro":
                                double epricea = finalprice * 0.51;
                                double mepricea = Math.round(epricea * 100.0) / 100.0;
                                String fmepricea = String.format("%.2f", mepricea);
                                System.out.println("The final price is: " + fmepricea + ". Pay here: ");
                                double pay = sc.nextDouble();
                                if (pay > mepricea) {
                                    double change = pay - mepricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay == mepricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay < mepricea) {
                                    double diff = mepricea - pay;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case "bgn":
                                double mpricea = Math.round(finalprice * 100.0) / 100.0;
                                String fmpricea = String.format("%.2f", mpricea);
                                System.out.println("The final price is: " + fmpricea + ". Pay here: ");
                                double pay2 = sc.nextDouble();
                                if (pay2 > mpricea) {
                                    double change = pay2 - mpricea;
                                    double mchange = Math.round(change * 100.0) / 100.0;
                                    String fmchange = String.format("%.2f", mchange);
                                    System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                    break;
                                } else if (pay2 == mpricea) {
                                    System.out.println("Thank you! Come back again!");
                                    break;
                                } else if (pay2 < mpricea) {
                                    double diff = mpricea - pay2;
                                    double mdiff = Math.round(diff * 100.0) / 100.0;
                                    while (mdiff > 0) {
                                        System.out.println("You're still short! You need: " + mdiff + " more. Pay up!");
                                        double d2 = sc.nextDouble();
                                        if (d2 >= mdiff) {
                                            double change = d2 - mdiff;
                                            double mchange = Math.round(change * 100.0) / 100.0;
                                            String fmchange = String.format("%.2f", mchange);
                                            if (mchange == 0) {
                                                System.out.println("Thank you. Come back again!");
                                                break;
                                            }
                                            System.out.println("Here's your change: " + fmchange + ". Come back again!");
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }
                break;
        }
    }
}