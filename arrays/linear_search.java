package arrays;

public class linear_search {
    public static int search(int marks[], int key){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String args[]){
        int marks[]={2,4,6,8,10,12,14,16};
        int key=10;

        int index=search(marks,key);
        if(index==-1){
            System.out.print("Key is not present in the array");

        }else{
            System.out.println("At index: "+index);

        }


    }
}
