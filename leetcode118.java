// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:

// Input: numRows = 1
// Output: [[1]]
 

// Constraints:

// 1 <= numRows <= 30


import java.util.*;
public class leetcode118 {
  public static void main(String args[]){
    generate(5);
  }
  public static void generate(int numRows){
    List<List<Integer>> res = new ArrayList<>();



    res.add(List.of(1));
    for(int i = 0;i< numRows - 1;i++){

      List<Integer> dummyRow = new ArrayList<>();
      dummyRow.add(0);
      dummyRow.addAll(res.get(res.size() - 1));
      dummyRow.add(0);

      List<Integer> row = new ArrayList<>();
      for(int j = 0;j<dummyRow.size() -1 ;j++){
        row.add(dummyRow.get(j)+dummyRow.get(j+1));
      }
      res.add(row);
    }
    System.out.print(res);

  }
}
