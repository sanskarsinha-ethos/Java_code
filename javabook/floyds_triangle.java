package javabook;
import java.util.*;
public class floyds_triangle {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number of rows: ");
        int rows=sc.nextInt();
        int number=1;
        for(int i=1;i<=rows;i++){
            for(int num=1;num<=i;num++){
                System.out.print(number+"\t");
                number++;
            }
            System.out.println();
        }
    }
}
