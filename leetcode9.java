public class leetcode9{
    public static void main(String[] args) {
        boolean result = isPalindrome(121);
        System.out.println(result);
    }
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int temp = x;
        int reverse = 0;
        while(temp != 0){
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /=10;
        }
        return (reverse == x);
    }
}