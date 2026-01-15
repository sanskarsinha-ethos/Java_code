package loops;

public class reverofnumber {
    public static void main(String[] args) {
        int n = 10899;
        int reverse = 0;
        for (; n > 0;) {
            reverse = n % 10;
            System.out.print(reverse);
            n = n / 10;

        }

    }
}
