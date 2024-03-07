// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.



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
