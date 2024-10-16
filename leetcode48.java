import java.util.Arrays;

public class leetcode48 {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for(int[] i:matrix){
            for(int j:i){
                System.out.print(j+ " ");
            }
        }
    }
    public static void rotate(int[][] matrix) {
        transposeMatrix(matrix);
        reverse(matrix);
    }

    private static void transposeMatrix(int[][] matrix){
        for (int i = 0;i < matrix.length;i++){
            for(int j = 0; j <= i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    private static void reverse(int[][] matrix){
        for(int i = 0;i< matrix.length;i++){
            int left = 0;
            int right = matrix[i].length - 1;
            while (left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
