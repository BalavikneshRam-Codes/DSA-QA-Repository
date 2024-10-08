import java.util.HashMap;

public class leetcode205 {
  public static void main(String[] args) {
    boolean result = isIsomorphic("foo", "bar");
    System.out.println(result);
  }
  public static boolean isIsomorphic(String s, String t) {
    if(s.length()!=t.length())  return false;
    HashMap <Character,Character> hm = new HashMap<>();


    for(int i=0 ; i<s.length() ; i++)
    {
        if(hm.containsKey(s.charAt(i)))
        {
            if(hm.get(s.charAt(i)) != t.charAt(i)) 
                return false;
        }
        else if(hm.containsValue(t.charAt(i)))
            return false;
        
        hm.put(s.charAt(i),t.charAt(i));

    }
    return true;
  }
}
