public class Leetcode977 {
    public static void main(String args[]){
        int[] arr = {-4,-1,0,3,10};
        int[] result = sortedSquares(arr);
        for(int i :result){
            System.out.print(i+" ");
        }
    }
    public static int[] sortedSquares(int[] nums) {
        for(int i = 0;i< nums.length;i++){
            nums[i] = nums[i] * nums[i];
        }
        bubbleSort(nums);
        return nums;

    }
    public static void bubbleSort(int[] nums){

        for(int i = 0;i< nums.length;i++){
            for(int j = 0;j< nums.length -1 ;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
