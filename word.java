class Solution {
    public boolean exists(char[][]board,int i,int j,char[] word,int index)
    {
        if(i<0 || i>=board.length || j>=board[0].length || board[i][j]=='*'||  board[i][j]!=word[index]) 
        return false;
        if(index==word.length-1) return true;
        char ch=board[i][j];
        board[i][j]='*';
        boolean result=exists(board,i+1,j,word,index+1)||
        exists(board,i-1,j,word,index+1)||
        exists(board,i,j+1,word,index+1)||
        exists(board,i,j-1,word,index+1);

        board[i][j]=ch;
        return result;

    } 
    public boolean exist(char[][] board, String word) {
        char[] word_ar=word.toCharArray();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word_ar[0] && exists(board,i,j,word_ar,0))
                return true;
            }
        }
        return false;
    }

}
