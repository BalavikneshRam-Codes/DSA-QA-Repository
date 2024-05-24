import java.util.HashSet;

public class leetcode217 {
  public static void main(String args[]){
    int[] dulipateArr = {1,2,3,1};
    System.out.println(containsDulipcate(dulipateArr));

  }
  public static boolean containsDulipcate(int[] nums){
    HashSet<Integer> seen = new HashSet<>();
    for(int i : nums){
      if(seen.contains(i)){
        return true;
      }
      seen.add(i);
    }
    return false;
  }
}
