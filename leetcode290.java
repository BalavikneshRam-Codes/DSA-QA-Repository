import java.util.HashMap;

public class leetcode290 {
 public static void main(String[] args) {
  System.out.println(wordPattern("abba", "dog cat cat dog"));
 } 
 public static boolean wordPattern(String pattern, String s) {
      String[] arr = s.split(" ");
      HashMap<Character,String> hash = new HashMap<>();

      for(int i = 0;i < pattern.length();i++){
        char ch = pattern.charAt(i);
        boolean isContainsKey = hash.containsKey(ch);

        if(hash.containsValue(arr[i]) && !isContainsKey){
          return false;
        }
        if(isContainsKey && !hash.get(ch).equals(arr[i])){
          return false;
        }

        else{
          hash.put(ch, arr[i]);
        }
      }
      return true;

 }
}
