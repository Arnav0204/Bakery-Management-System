package bakery;

import java.util.HashMap;
import java.util.Scanner;

public class BakeryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Bakery Management System");
        System.out.println("----------------------------------------------------");
        System.out.println("Below is the list of items that you can order :");
        System.out.print(" Item : Bread -------- Cost : 20");
        System.out.println("Item : Coffee -------- Cost : 10");
        System.out.println("Item : Pastry -------- Cost : 30");
        System.out.println("Item : Cookie -------- Cost : 40");
        System.out.println("-----------------------------------------------------");
        HashMap<String, Integer> orders = new HashMap<>();
        System.out.println("Enter number items you wish to order : ");
        int items = sc.nextInt();
        for (int i = 0; i < items; i++) {
            System.out.println("Enter item : ");
            String item = sc.next();
            System.out.println("Enter quantity : ");
            int quantity = sc.nextInt();
            orders.put(item, quantity);
        }
        Order order = new Order(orders);
        order.printReciept();
    }
}
