package javabook;
import java.util.*;
public class ques6_3 {
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your first number =");
        int num1=sc.nextInt();
        System.out.println("Enter your second number =");
        int num2=sc.nextInt();
        int sum=num1+num2;
        if (sum>100 && sum<200){
            System.out.println(sum+" is in range of 100 and 200");
            if((sum)%7==0){
                System.out.print(sum+" is divisible by 7");

            }else{
                System.out.print(sum+" is not divisible by 7");

            }
        }else if(sum>200){
            System.out.println(sum+" is out of range");

        }else{
            System.out.println(sum+" is below the range");

        }
        }
    }
