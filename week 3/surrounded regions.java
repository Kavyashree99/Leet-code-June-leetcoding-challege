class Solution {
    
    boolean[][] visited;
    public void solve(char[][] board) {
        if(board.length == 0) return;
        visited = new boolean[board.length][board[0].length];
        
        for(int i=0;i<board.length;i++) {   // Run dfs on left and right borders and change '0's to '#'
            dfs(board, i, 0, visited);
            dfs(board, i, board[0].length-1, visited);
        }
        
        for(int j=1;j<board[0].length-1;j++) { // Run dfs on top and bottom borders and change '0's to '#'
            dfs(board, 0, j, visited);
            dfs(board, board.length-1, j, visited);
        }
        
        for(int i=0;i<board.length;i++) 
            for(int j=0;j<board[0].length;j++) 
                if(board[i][j] == 'O')      // Change surrounded '0' to 'X'
                    board[i][j] = 'X';
                else if(board[i][j] == '#')    // Change '#' (not surrounded) back to '0'
                    board[i][j] = 'O';
    }
    
    public void dfs(char[][] board,int i,int j,boolean[][] visited) {
        if(i>=0 && i < board.length && j>=0 && j<board[0].length && !visited[i][j] && board[i][j] == 'O') {
            visited[i][j] = true;
            board[i][j] = '#';
            dfs(board,i+1,j,visited);
            dfs(board,i-1,j,visited);
            dfs(board,i,j+1,visited);
            dfs(board,i,j-1,visited);
        }
    }
}
