package loops;

import java.util.*;

public class squarepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// n=4 for this question
        // for (int i = 1; i <= n; i++) {
        // System.out.println("****");
        // }\
        int i = 1;
        while (i <= n) {
            System.out.println("****");
            i++;
        }
    }

}
