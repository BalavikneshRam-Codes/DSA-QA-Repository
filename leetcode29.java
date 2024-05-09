public class leetcode29 {
  public static void main(String[] args) {
    int[] fina = {1,1,2};
    System.out.println(removeDuplicates(fina));

    
  }
  public static int removeDuplicates(int[] nums) {
    if(nums.length == 0){
      return 0;
    }
    int k = 1;
    for(int i = 1;i< nums.length;i++){
      if(nums[i] != nums[k - 1]){
        nums[k]= nums[i];
        k++;
      }
    }
    return k;
  }

}
