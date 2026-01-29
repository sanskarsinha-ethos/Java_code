package javabook;
import java.util.*;
public class ques6_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your basic pay");
        float basicpay=sc.nextFloat();
        float DA = (basicpay*50)/100;
        float HRA= (basicpay*20)/100;
        float PF=(basicpay*14)/100;
        System.out.println(DA);
        System.out.println(HRA);
        System.out.println(PF);
        System.out.println("Gross pay ="+(basicpay+DA+HRA-PF));

    }
}
