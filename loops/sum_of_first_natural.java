package loops;

import java.util.*;

public class sum_of_first_natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            int temp = i;
            sum = sum + temp;
            i++;

        }
        System.out.print("The total sum is : " + sum);
    }
}
