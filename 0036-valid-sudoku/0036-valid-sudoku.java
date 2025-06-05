class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];
        for(int i=0;i<9;i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char n = board[i][j];
                if(Character.isDigit(n)){
                    int index = i/3*3 + j/3;
                    if(row[i].contains(n) || col[j].contains(n) || box[index].contains(n)){
                        return false;
                    }
                    row[i].add(n);
                    col[j].add(n);
                    box[index].add(n);
                }
            }
        }
        return true;
    }
}