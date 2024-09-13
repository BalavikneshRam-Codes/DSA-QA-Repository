public class leetcode2 {
  public static void main(String[] args) {
    LIstNode l1 = new LIstNode(2);
    l1.next = new LIstNode(4);
    l1.next.next = new LIstNode(3);

    LIstNode l2 = new LIstNode(5);
    l2.next = new LIstNode(6);
    l2.next.next = new LIstNode(4);

    LIstNode l3 = addTwoNumber(l1, l2);

    while (l3 != null) {
      System.out.print(l3.val);
      if(l3.next != null){
        System.out.print("->");
      }
      l3 = l3.next;
    }

  }
  public static LIstNode addTwoNumber(LIstNode l1,LIstNode l2){
    LIstNode result = new LIstNode(0);
    LIstNode ptr = result;
    int carry = 0;
    while(l1 != null || l2 != null || carry != 0){
      int sum =  carry;

      if(l1 != null){
        sum+=l1.val;
        l1 = l1.next;
      }
      if(l2 != null){
        sum+=l2.val;
        l2 = l2.next;
      }

       carry = sum / 10;
       sum = sum % 10;
       ptr.next = new LIstNode(sum);
       ptr = ptr.next;


    }
    if(carry == 1){
      ptr.next = new LIstNode(1);
    }
    return result.next;
  }
}


