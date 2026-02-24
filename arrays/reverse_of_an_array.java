package arrays;

public class reverse_of_an_array {
    public static void main(String args[]){
        int num[]={1,2,3,4};
        int start=0;
        int end=num.length-1;
        for(int i=0;i<num.length/2;i++){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
