public class Pattern6 {
    public static void main(String args[]) {
        int n = 5;
        int[][] arr = new int[n][n];
        int num = 1;
        int row = n - 1, col = 0;

        while (num <= n * n) {
            int r = row;
            int c = col;

            while (r < n && c < n) {
                arr[r++][c++] = num++;
            }

            if (row > 0) {
                row--;
            } else {
                col++;
            }
        }

        // Print the pattern
        for (int i = n-1; i>=0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

