// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

public class leetcode283{
    public static void main(String args[]){
        int[] arr = {0,1,0,3,12};
        movezeros(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void movezeros(int[] arr){
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }
}