package arrays;
import java.util.*;
public class input_array {
    public static void main(String args[]){
        int marks[]=new int[50];
        Scanner sc=new Scanner (System.in);
        
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("Subject 1: "+marks[0]);
        System.out.println("Subject 2: "+marks[1]);
        System.out.println("Subject 3: "+marks[2]);
    }
}
