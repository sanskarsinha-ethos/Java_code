package javabook;
import java.util.*;

public class Aggregation_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> cart = new LinkedHashMap<>();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Total Bill");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String item = sc.nextLine();
                    System.out.print("Enter item price: ");
                    int price = sc.nextInt();
                    cart.put(item, price);
                    System.out.println(item + " added to cart.");
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeItem = sc.nextLine();
                    if (cart.containsKey(removeItem)) {
                        cart.remove(removeItem);
                        System.out.println(removeItem + " removed from cart.");
                    } else {
                        System.out.println("Item not found in cart.");
                    }
                    break;

                case 3:
                    int total = 0;
                    System.out.println("\nItems in Cart:");
                    for (Map.Entry<String, Integer> entry : cart.entrySet()) {
                        System.out.println(entry.getKey() + " - $" + entry.getValue());
                        total += entry.getValue();
                    }
                    System.out.println("Total Bill: $" + total);
                    break;

                case 4:
                    running = false;
                    System.out.println("Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}