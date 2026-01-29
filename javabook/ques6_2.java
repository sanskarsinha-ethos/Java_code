package javabook;
import java.util.*;
public class ques6_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter your second number: ");
        int num2=sc.nextInt();
        System.out.println("Enter '+' for addition, '-' for subtraction,'*' for multiplication,'/' for division");
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+':
                int sum=num1+num2;
                System.out.print("Sum of your numbers is: "+ sum);
            break;
            case '-':
                int difference=num1-num2;
                System.out.print("Difference of the numbers is: "+difference);
                break;
            case'*':
                int multiplication=num1*num2;
                System.out.print("Product of the number is: "+multiplication);
                break;
            case'/':
            int division=num1/num2;
            System.out.print("Division of the numbers is : "+division);
            break;        
                    
        }

    }
}
