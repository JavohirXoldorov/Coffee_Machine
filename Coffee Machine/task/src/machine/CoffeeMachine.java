package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static Integer water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String choose = sc.nextLine();
            switch (choose) {
                case "buy": {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String n = sc.nextLine();
                    buy(n);
                    break;
                }
                case "fill": {
                    fill();
                    break;
                }
                case "remaining": {
                    print();
                    break;
                }
                case "exit": {
                    exit = true;
                    break;
                }
                case "take": {
                    take();
                    break;
                }


            }

        }
    }

    public static void buy(String n) {
        boolean ans = false;
        if (n.equals("1")) {
            if (water - 250 >= 0 && beans - 16 >= 0) {
                water -= 250;
                beans -= 16;
                money += 4;
                ans = true;
            } else {
                if (water - 250 < 0) {
                    System.out.println("Sorry, not enough water!");
                } else {
                    System.out.println("Sorry, not enough beans!");
                }
            }

        } else if (n.equals("2")) {
            if (water - 350 < 0) {
                System.out.println("Sorry, not enough water!");
            } else if (milk - 75 < 0) {
                System.out.println("Sorry, not enough milk!");
            } else if (beans - 20 < 0) {
                System.out.println("Sorry, not enough beans!");
            } else {
                water -= 350;
                milk -= 75;
                beans -= 20;
                money += 7;
                ans = true;
            }

        } else if (n.equals("3")) {
            if (water - 200 < 0) {
                System.out.println("Sorry, not enough water!");
            } else if (milk - 100 < 0) {
                System.out.println("Sorry, not enough milk!");
            } else if (beans - 12 < 0) {
                System.out.println("Sorry, not enough beans!");
            } else {
                water -= 200;
                milk -= 100;
                beans -= 12;
                money += 6;
                ans = true;
            }
        }
        if (ans) {
            cups--;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    public static void fill() {

        sc = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add: ");
        water += sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        milk += sc.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        beans += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        cups += sc.nextInt();
    }

    public static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public static void print() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }
}
