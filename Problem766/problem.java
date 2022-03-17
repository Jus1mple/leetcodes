package Problem766;

/**
 * 问题描述：
 * 给你一个 m x n 的矩阵matrix，如果这个矩阵是托普利茨矩阵，返回true，否则，返回false
 * 托普利茨矩阵：如果矩阵上每一条由左上到右下的对角线上的元素都相同，那么就是~~
 * 
 * 示例：
 * matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
 * 
 * 
 */

public class problem {
    public static void main(String[] args) {
        
        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        System.out.println(isToeplitzMatrix(matrix));
    }


    public static boolean isToeplitzMatrix(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        if(row == 1 || col == 1){
            return true;
        }
        for(int i = 0; i < row - 1; ++i){
            for(int j = 0; j < col - 1; ++j){
                if(matrix[i][j] != matrix[i + 1][j + 1]){
                    return false;
                }
            }
        }
        return true;
    }
}
