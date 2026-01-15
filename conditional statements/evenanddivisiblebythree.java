import java.util.*;

public class evenanddivisiblebythree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Num is even and divisible by three");
        } else {
            System.out.println("Num is not satisfying the condition ");
        }
    }
}
