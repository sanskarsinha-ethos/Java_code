import java.util.*;

public class printmyname {

    public static void PrintMyName(String name) {
        System.out.print("Your name is: ");
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        PrintMyName(name);
    }
}
