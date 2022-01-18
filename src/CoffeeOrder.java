import java.util.Hashtable;
import java.util.Scanner;
import java.util.*;

public class CoffeeOrder {

    static class Order {   //TODO: crate an array of objects and push() method
        String orderId; // for array
        String coffeeType;
        String cupSize;
        int quantity;
        int perPrice;

        public String toString() {
            return "Coffee: " + this.coffeeType + "\n quantity: " + this.quantity + "\n bill: $" + this.quantity * this.perPrice;
        }
    }

    public static void handleOrder(String coffeeType) {

        Order order = new Order();
        order.coffeeType = coffeeType;
        Scanner scanner = new Scanner(System.in);
        System.out.println("select cup size " + coffeeType + " \n a) 50ml \n b) 100ml");
        order.cupSize = scanner.next();
        System.out.println("Enter the quantity of cups: ");
        order.quantity = scanner.nextInt();
        order.perPrice = getPrice(order.coffeeType + order.cupSize);
        System.out.println(order.toString());
    }

    public static int getPrice(String nameCoffee) {
        Map<String, Integer> coffeePrices = new Hashtable<String, Integer>();
        coffeePrices.put("Lattea", 1);
        coffeePrices.put("Latteb", 2);
        coffeePrices.put("Espressoa", 3);
        coffeePrices.put("Espressob", 4);
        coffeePrices.put("Cappuccinoa", 5);
        coffeePrices.put("Cappuccinob", 6);
        coffeePrices.put("Americanoa", 7);
        coffeePrices.put("Americanob", 8);

        return coffeePrices.get(nameCoffee);
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which coffee do you want? \n Please choose ☕: \n a) Latte \n b) Espresso \n c) Cappuccino \n d) Americano ");
        String coffee = scanner.next();
        System.out.println(coffee);
//        handleOrder(coffee);
        switch (coffee) {
            case "a":
                handleOrder("Latte");
                break;
            case "b":
                handleOrder("Espresso");
                break;
            case "c":
                handleOrder("Cappuccino");
                break;
            case "d":
                handleOrder("Americano");
                break;
            default:
                System.out.println("wrong");
        }
    }

    public static void main(String[] args) {
        menu();
    }
}