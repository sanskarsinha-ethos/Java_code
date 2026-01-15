import java.util.*;

public class divisiblebythreeorfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        if (num % 3 == 0 || num % 5 == 0) {
            System.out.println(num + " is divisible by either 5 or 3");
        } else {
            System.out.println(num + " Neither divisible by 3 nor 5");
        }
    }
}
