public class leetcode7 {
  public static void main(String[] args) {
    System.out.println(reverse(-123));
    System.out.println(reverse(1000000074));


  }
  public static int reverse(int x) {
        int rev = 0;

        while(x!=0){
          int last = x % 10;
          if(rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE/10) return 0;
          rev = (rev*10) + last;
          x= x/10;
        }
        return rev;
  }
}
