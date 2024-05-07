public class leetcode1 {
  public static void main(String args[]){
    int[] qn = {2,7,11,15};
    int[] result = twoSum(qn, 9);
    for(int res:result){
      System.out.print(res+" ");
    }
  }
  public static int[] twoSum(int[] nums, int target) {
    for(int i =0;i< nums.length - 1;i++){
        for(int j = i+1;j< nums.length;j++){
            if(nums[i]+nums[j] == target){
                return new int[]{i,j};
            }
        }
    }
    return new int[]{};
}
}
