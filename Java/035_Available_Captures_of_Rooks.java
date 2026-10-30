class Solution {
    public int numRookCaptures(char[][] board) {
        int rr=-1;
        int rc=-1;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='R'){
                    rr=i;
                    rc=j;
                }
            }
        }
        int cnt=0;
        int i=rr-1;
        while(i>=0){
            if(board[i][rc]=='B'){
                break;
            }
            if(board[i][rc]=='p'){
                cnt++;
                break;
            }
            i--;
        }
        int j=rr+1;
        while(j<8){
            if(board[j][rc]=='B'){
                break;
            }
            if(board[j][rc]=='p'){
                cnt++;
                break;
            }
            j++;
        }
        int k=rc-1;
        while(k>=0){
            if(board[rr][k]=='B'){
                break;
            }
            if(board[rr][k]=='p'){
                cnt++;
                break;
            }
            k--;
        }
        int l=rc+1;
        while(l<8){
            if(board[rr][l]=='B'){
                break;
            }
            if(board[rr][l]=='p'){
                cnt++;
                break;
            }
            l++;
        }
        return cnt;
    }
}