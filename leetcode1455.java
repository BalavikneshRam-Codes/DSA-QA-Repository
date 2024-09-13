public class leetcode1455 {
  public static void main(String[] args) {
    String sentence = "i love eating burger";
    System.out.println(isPrefixOfWord(sentence, "burg"));
  }
  public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] individualStr = sentence.split(" ");

        for(int i = 0;i<individualStr.length;i++){
          if(individualStr[i].startsWith(searchWord)){
            return i+1;
          }
        }
        return -1;
  }
}
