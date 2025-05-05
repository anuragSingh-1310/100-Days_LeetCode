public class Search_a_2D_Matrix_II {
    public static boolean searchMatrix(int mat[][], int x) {
        int n = mat.length;
        int m = mat[0].length;
        int row = 0, col = m - 1;
        while (row < n && col >= 0) {
            if (mat[row][col] == x) {
                return true;
            } else if (mat[row][col] > x) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
