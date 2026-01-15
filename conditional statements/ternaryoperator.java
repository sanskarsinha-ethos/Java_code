import java.util.*;

public class ternaryoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result;
        result = (num % 2 == 0) ? "even" : "odd";
        System.out.println(result);

    }
}
