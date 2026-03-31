class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];
        for(int i = 0; i<9; i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char num = board[i][j];
                int boxIdx = ((i/3)*3)+(j/3);
                if(num!='.'){
                    if(row[i].contains(num))return false;
                    row[i].add(num);
                    if(col[j].contains(num))return false;
                    col[j].add(num);
                    if(box[boxIdx].contains(num))return false;
                    box[boxIdx].add(num);
                }
            }
        }
        return true;
    }
}
