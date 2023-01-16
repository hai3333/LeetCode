package 回溯算法;

/**
 * @author 阿海774
 * @site
 * @company
 * @create 2022-12-02 15:29
 * @other
 */
public class exist {

    public boolean exist(char[][] board, String word) {
        char [] words=word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,words,i,j,0))
                return true;
            }
        }
        return false;

    }
    public boolean dfs(char[][] board, char[] words,int i,int j, int index){
        //判断条件
        //index长度达标

        if(i>=board.length|| j>= board[0].length||j<0||i<0|| board[i][j]!=words[index]){
            return false;
        }
        if(index==words.length-1){
            return true;
        }
        //保存坐标
        char tmp=board[i][j];
        board[i][j]='0';
        boolean res=dfs(board,words,i+1,j,index+1)
                || dfs(board, words, i - 1, j, index + 1)
                || dfs(board, words, i, j + 1, index + 1)
                || dfs(board, words, i, j - 1, index + 1);

        board[i][j]=tmp;
        return res;
    }

}
