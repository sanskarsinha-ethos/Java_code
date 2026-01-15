import java.util.*;

public class ifelseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        if (age <= 12) {
            System.out.println("You are child");
        } else if (age <= 18) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are an adult");
        }

    }
}
