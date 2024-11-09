package array;

import java.util.HashSet;
import java.util.Set;

public class ValidSoduku {

    public boolean isValidSudoku(char[][] board) {

        Set<Character> elements = new HashSet<>();
        //Checking Row
        for(int i=0;i<9;i++){
            elements.clear();
            for(int j=0;j<9;j++){

                if(board[i][j] != '.'){

                    if(!elements.add(board[i][j])){
                        return false;
                    }
                }
            }
        }

        //Checking Column

        for(int i=0;i<9;i++){
            elements.clear();
            for(int j=0;j<9;j++){

                if(board[j][i] != '.'){

                    if(!elements.add(board[j][i])){
                        return false;
                    }
                }
            }
        }

        for(int i =0;i< 9;i=i+3){
            for(int j =0;j< 9;j=j+3){

                elements.clear();
                for(int k =0;k<3;k++){
                    for(int m =0;m<3;m++){
                        if(board[i+k][j+m] != '.'){

                            if(!elements.add(board[i+k][j+m])){
                                return false;
                            }
                        }
                    }
                }
            }
        }


        return true;
    }
}
