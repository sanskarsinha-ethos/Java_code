/*

*****
****
***
**
*


*/
package patterns;
import java.util.*;
public class pattern3 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println(" Enter your number of rows to print *");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=i;j<=rows;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
