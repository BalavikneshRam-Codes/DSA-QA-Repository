public class leetcode136{
  public static void main(String[] args) {
    int[] result = {2,2,1};
    System.out.println(singleNumber(result));
  }
  public static int singleNumber(int[] nums) {
    int num = 0;
    for(int n:nums){
        num = num^n;
    }
    return num;
}
}