package arrays;

public class sum_of_subarrays {
    public static void sumofsubarrays(int num[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<num.length; i++){
            int sum = 0; // reset sum for each new subarray starting at i
            for(int j=i; j<num.length; j++){
                sum += num[j]; // accumulate subarray sum
                System.out.println("Sum of subarray from index " + i + " to " + j + " = " + sum);

                // Track max and min
                if(sum > max) max = sum;
                if(sum < min) min = sum;

                // Print the subarray elements
                System.out.print("Subarray: ");
                for(int k=i; k<=j; k++){
                    System.out.print(num[k] + " ");
                }
                System.out.println("\n");
            }
        }

        System.out.println("Maximum subarray sum = " + max);
        System.out.println("Minimum subarray sum = " + min);
    }

    public static void main(String args[]){
        int num[]={2,4,6,8,10};
        sumofsubarrays(num);
    }
}