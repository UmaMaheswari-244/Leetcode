class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int magicCount = 0;
        int magicSum = 15;
        for (int r = 0; r <= rows - 3; r++) {
            for (int c = 0; c <= cols - 3; c++) {
                if (isMagicSquare(grid, r, c, magicSum)) {
                    magicCount++;
                }
            }
        }
        return magicCount;
    }
    private boolean isMagicSquare(int[][] grid, int r, int c, int magicSum) {
        int[] counts = new int[10];
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                int num = grid[i][j];
                if (num < 1 || num > 9) return false; 
                counts[num]++;
            }
        }
        for (int k = 1; k <= 9; k++) {
            if (counts[k] != 1) return false;
        }
        int[] sums = new int[8];
        for (int i = 0; i < 3; i++) {
            sums[i] = grid[r + i][c] + grid[r + i][c + 1] + grid[r + i][c + 2];
        }
        for (int j = 0; j < 3; j++) {
            sums[j + 3] = grid[r][c + j] + grid[r + 1][c + j] + grid[r + 2][c + j];
        }
        sums[6] = grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2];
        sums[7] = grid[r][c + 2] + grid[r + 1][c + 1] + grid[r + 2][c];
        for (int sum : sums) {
            if (sum != magicSum) return false;
        }
        return true;
    }
}