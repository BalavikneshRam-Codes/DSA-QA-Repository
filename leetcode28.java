public class leetcode28 {
  public static void main(String[] args) {
    int result = strStr("sadbutsad", "sad");
    System.out.println(result);
  }
  public static int strStr(String haystack, String needle) {
    for(int i = 0; i <= haystack.length() - needle.length(); i++){
        if(haystack.charAt(i) == needle.charAt(0)){
            if(haystack.substring(i,needle.length()+i).equals(needle)){
                return i;
            }
        }
    }
    return -1;
}
}
