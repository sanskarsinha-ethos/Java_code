package arrays;

public class binary_search {
    public static int binarysearch(int num[],int key ){
            int start=0;
            int end=num.length-1;
            for (int i=0;i<num.length;i++){
                int mid=(start+end)/2;
                if (num[mid]==key){
                    return mid;//found
                }else if(num[mid]>key){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

            return -1;//not found
    }
    public static void main (String args[]){
        int num[]={2,4,6,8,10};
        int key=10;
        System.out.print(key+" is present at position: "+(binarysearch(num,key)));
    }
}
