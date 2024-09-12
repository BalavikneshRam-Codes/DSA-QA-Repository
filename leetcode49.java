import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class leetcode49 {
  public static void main(String[] args) {
    String[] strs = {"eat","tea","tan","ate","nat","bat"};
    List<List<String>> str = groupAnagrams(strs);
    System.out.println(str);
  }
  public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hashmap = new HashMap<>();
        for(String n:strs){
          char[] charArr = n.toCharArray();
          Arrays.sort(charArr);
          String sortedChar = String.valueOf(charArr);

          if(!hashmap.containsKey(sortedChar)){
            hashmap.put(sortedChar, new ArrayList<>());
          }
          hashmap.get(sortedChar).add(n);
        }
  return new ArrayList<>(hashmap.values());
  }
}
