public class Leetcode6Part1 {
    public static void main(String[] args){
        String que = "PAYPALISHIRING";
        String result = convert(que,3);
        System.out.println(result);
    }
    public static String convert(String s, int numRows) {
    if(numRows == 1)return s;
    StringBuilder result = new StringBuilder();
        int increment = 2 *(numRows - 1);

        for(int r = 0;r<numRows;r++){
            for(int i = r;i< s.length();i+=increment){
                result.append(s.charAt(i));
                if(r > 0 && r < numRows - 1 && i+increment - 2*r<s.length()){
                    result.append(s.charAt(i+increment- 2*r));
                }
            }
        }
        return result.toString();
    }
}
