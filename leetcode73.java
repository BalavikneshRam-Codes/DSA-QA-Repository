import java.util.HashSet;
import java.util.Set;

public class leetcode73 {
    public static void main(String[] args){
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        for(int[] i:matrix){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix) {

        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();
        for(int i = 0;i< matrix.length;i++){
            for(int j = 0;j < matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        for(int i = 0;i< matrix.length;i++){
            for(int j = 0;j < matrix[i].length;j++){
                if(rowSet.contains(i) || colSet.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
