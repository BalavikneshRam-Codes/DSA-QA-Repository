// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:

// Input: s = "()"
// Output: true
// Example 2:

// Input: s = "()[]{}"
// Output: true
// Example 3:

// Input: s = "(]"
// Output: false







import java.util.Stack;

public class leetcode20{
  public static void main(String[] args) {
    String input = "()[]{}";
    boolean result = isValid(input);
    System.out.println(result);
  }
  public static boolean isValid(String s) {
    Stack<Character> stack1 = new Stack<>();
        for(int i = 0;i< s.length();i++){
          char curr = s.charAt(i);
          if(!stack1.isEmpty()){
            char last = stack1.peek();
            if(isPair(curr, last)){
              stack1.pop();
              continue;
            }
          }
          stack1.push(curr);
        }
        return stack1.isEmpty();
  }
  private static boolean isPair(char curr,char last){
    return (last == '(' && curr == ')') ||
    (last == '[' && curr == ']') ||
    (last == '{' && curr == '}');
  }
}