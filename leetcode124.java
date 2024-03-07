public class leetcode124 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        if(isPalindrome(s)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
    }
    public static boolean isPalindrome(String S) {
        StringBuilder sb = new StringBuilder();
        for(char ch : S.toCharArray()){
        if(Character.isLetterOrDigit(ch)){
            sb.append(Character.toLowerCase(ch));
        }
    }
    if(sb.toString().equals(sb.reverse().toString())){
    return true;
    }
    return false;
}
}
