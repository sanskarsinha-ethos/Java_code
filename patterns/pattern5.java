/*

*
**
***
****
*****
****
***
**
*

*/



package patterns;
import java.util.*;
public class pattern5 {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println(" Enter your rows number: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows*2-1;i++){
            int totcols= i> rows ? 2*rows -i: i;
            for(int j=1;j<=totcols;j++){
                System.out.print("*");
            }
            System.out.println();
 
        }
    }
}
