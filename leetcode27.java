public class leetcode27 {
  public static void main(String[] args) {
    int[] fina = {3,2,2,3};
    System.out.print(removeElement(fina, 3));
    int[] fina1 ={0,1,2,2,3,0,4,2};
    System.out.print(removeElement(fina1, 2));

  }
  public static int removeElement(int[] nums,int val){
    int result = 0;
    for(int i = 0;i< nums.length;i++){
      if(nums[i] != val){
        nums[result] = nums[i];
        result++;
      }
    }
    return result;
}
}