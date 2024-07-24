package bakery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private ArrayList<Item> orders;

    public Order(HashMap<String, Integer> orders) {
        for (Map.Entry<String, Integer> order : orders.entrySet()) {
            String item = order.getKey();
            Integer quantity = order.getValue();
            switch (item) {
                case "Bread":
                    this.orders.add(new Bread(quantity));
                case "Pastry":
                    this.orders.add(new Pastry(quantity));
                case "Coffee":
                    this.orders.add(new Coffee(quantity));
                case "Cookie":
                    this.orders.add(new Cookie(quantity));
            }
        }
    }

    public void printReciept() {
        for (Item it : orders) {
            System.out.println("Item No :" + it.getNo() + "Quantity :" + it.getQuantity() + "Cost :"
                    + it.getCost() * it.getQuantity());
        }
    }
}
