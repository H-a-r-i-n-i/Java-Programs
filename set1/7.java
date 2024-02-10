
public class Pattern7 {
    public static void main(String args[]) {
        int n = 5;
        int[][] arr = new int[n][n];
        int num = 1;
        int row = 0, col = 0;

        while (num <= n * n) {

            while (row >= 0 && col < n) {
                arr[row--][col++] = num++;
            }
            if (col == n) {
                row += 2;
                col--;
            } else {
                row++;
            }

           
            while (row < n && col >= 0) {
                arr[row++][col--] = num++;
            }
            if (row == n) {
                row--;
                col += 2;
            } else {
                col++;
            }
        }

     
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
