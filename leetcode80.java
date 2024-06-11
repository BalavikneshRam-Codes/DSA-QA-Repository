public class leetcode80 {
  public static void main(String args[]){
    int[] result = {1,1,1,2,2,3};
    removeDuplicates(result);
    for(int n:result){
      System.out.print(n);
    }
  }
  public static int removeDuplicates(int[] nums){
    int j = 0;
    for(int n :nums){
        if(j<2 || n != nums[j - 2]){
            nums[j] = n;
            j++;
        }
    }
    return j;
  }
}
