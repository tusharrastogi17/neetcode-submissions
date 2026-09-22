class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row[] = new int[9];
        int cols[] = new int[9];
        int boxes[] = new int[9];

        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                char val = board[r][c];
                if(val == '.'){
                    continue;
                }

                int bit = 1 << (val-'1');
                int boxIndex = (r/3)*3+(c/3);

                if((row[r] & bit)!=0 ||
                    (cols[c] & bit)!=0 ||
                    (boxes[boxIndex] & bit)!=0 ){
                        return false;
                    }

                row[r] |=bit;
                cols[c] |=bit;
                boxes[boxIndex] |=bit;
            }
        }

        return true;
    }
}
