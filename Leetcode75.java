public class Leetcode75 {
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length -1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            }else{
                mid++;
            }
        }
    }
    public static void swap(int[]nums,int a,int b){
        int temp = nums[a];
       nums[a] =nums[b];
        nums[b] = temp;
    }
}
