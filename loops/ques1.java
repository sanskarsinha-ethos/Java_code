import java.util.*;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;

        while (true) {
            System.out.print("Type 'break' to stop or press Enter to continue: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("break")) {
                break;
            }

            System.out.print("Enter your number: ");
            // Read integer input
            int n = Integer.parseInt(sc.nextLine());

            if (n % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }
        }

        System.out.println("Sum of even numbers is: " + evenSum);
        System.out.println("Sum of odd numbers is: " + oddSum);
    }
}