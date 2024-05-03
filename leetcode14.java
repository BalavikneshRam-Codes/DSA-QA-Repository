import java.util.Arrays;

public class leetcode14{
    public static void main(String args[]){
        String[] arr = {"flower","flow","flight"};
        String result = longestCommonPrefix(arr);
        System.out.println(result);
    }
    public  static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            }else{
                break;
            }
        }
        return s1.substring(0,idx);
    }
}