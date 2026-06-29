//T.C=O(n^2)

import java.util.*;

public class bubble_sort {
    public static void main(String args[]){
        int [] nums={10,5,6,40,35};
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(nums));
        

    }
}
