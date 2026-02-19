package arrays;
import java.util.*;
public class largest_in_array {

    public static int largestnum(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }
        }
        return largest;

    }
    public static void main(String args[]){
        int num[]={1,2,6,3,5};
        System.out.println("The largest number in the array is: ");
        System.out.print(largestnum(num));

    }
}
