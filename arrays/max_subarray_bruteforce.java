package arrays;

public class max_subarray_bruteforce {
    public static void maxsubarr(int num[]){
            int max=Integer.MIN_VALUE;
            int sum=0;
        for (int i=0;i<num.length;i++){
            for (int j=i;j<num.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=num[k];
                }
                if(max<sum){
                    max=sum;
                }
            }
        }
        System.out.print(max);
    }
    public static void main (String args[]){
        int num[]={1,-2,6,-1,3};
        maxsubarr(num);
    }
}
