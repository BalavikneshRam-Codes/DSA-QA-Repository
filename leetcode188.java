public class leetcode188 {
  public static void main(String[] args) {
    int[] final1 = {1,2,3,4,5,6,7};
    rotate(final1, 3);
    for(int i:final1){
      System.out.print(i);
    }
  }
  public static void rotate(int[] nums, int k) {
    reverse(nums,0,nums.length-1);
    reverse(nums,0,k-1);
    reverse(nums,k,nums.length -1);
  }
  public static void reverse(int[] nums,int start,int end){
    while(start < end){
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }
}
