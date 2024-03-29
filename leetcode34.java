// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]



public class leetcode34 {
    public static void main(String[] args) {
        int[] nums = {6,7,7,8,8,10};
        int target = 8;
        int[] result = searchRange(nums,target);
        for(int i:result){
            System.out.print(i+" ");
        }        
    }
    public static int[]  searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;

    }
    public static int search(int[] nums,int target,boolean firststartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start+(end - start) / 2;
            if(target > nums[mid]){
                start = mid+1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                ans = mid;
                if(firststartIndex){
                    end = mid - 1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
