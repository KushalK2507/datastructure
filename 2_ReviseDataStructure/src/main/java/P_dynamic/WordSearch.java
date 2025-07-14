package P_dynamic;

public class WordSearch {

    public static void main(String[] args) {

        char[][] board = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";

        System.out.println(exist(board,word));
        //Output = true;
    }
    public static boolean exist(char[][] board, String word) {

        int rows = board.length;
        int columns = board[0].length;

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(findWord(board,rows,columns,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private  static boolean findWord(char[][] board,int rows,int columns,String word,int i, int j, int count){

        if(i<0 || j<0 ||i>=rows || j >= columns){
            return false;
        }

        if(board[i][j] == word.charAt(count)){
            char temp = board[i][j];
            board[i][j] = '*';

            if(count == word.length()-1){
                return true;
            }
            else if(findWord(board,rows,columns,word,i-1,j,count+1) || findWord(board,rows,columns,word,i+1,j,count+1)
                    || findWord(board,rows,columns,word,i,j-1,count+1) || findWord(board,rows,columns,word,i,j+1,count+1) ){
                return true;
            }
            board[i][j] = temp;
        }

        return false;

    }
}
