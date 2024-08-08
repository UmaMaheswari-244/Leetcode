class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0; 
        int steps = 0; 
        int totalCells = rows * cols;
        int index = 0; 
        
        result[index++] = new int[]{rStart, cStart};
        
        while (index < totalCells) {
            if (directionIndex % 2 == 0) {
                steps++; 
            }
            for (int i = 0; i < steps; i++) {
                rStart += directions[directionIndex][0];
                cStart += directions[directionIndex][1];
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    result[index++] = new int[]{rStart, cStart};
                }
            }
            directionIndex = (directionIndex + 1) % 4;
        }
        
        return result;
    }
}