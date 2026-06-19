class Solution {
    public boolean squareIsWhite(String coordinates) {
        char[][] board = {
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'}
        };

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if((coordinates.charAt(0)-'a') == j && coordinates.charAt(coordinates.length()-1) == (char)('8'-i)){
                    return board[i][j] == 'W'; 
                }
            }
        }
        return false;
    }
}

