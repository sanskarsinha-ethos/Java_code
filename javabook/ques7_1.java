package javabook;
import java.util.*;

public class ques7_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(number + "\t");
                number++;
            }
            System.out.println();
        }
    }
}
