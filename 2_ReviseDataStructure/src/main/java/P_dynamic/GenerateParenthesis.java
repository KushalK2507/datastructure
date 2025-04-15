package P_dynamic;

import java.util.List;

public class GenerateParenthesis {


    public void generateParenthesis(int n, int left, int right, StringBuffer parenthesis, List<String> res){

        if (parenthesis.length() == n*2){
            res.add(parenthesis.toString());
        }
        if (left < n){
            parenthesis.append("(");
            generateParenthesis(n,left+1,right,parenthesis,res);
            parenthesis.deleteCharAt(parenthesis.length()-1);
        }
        if (right < left){
            parenthesis.append(")");
            generateParenthesis(n,left,right+1,parenthesis,res);
            parenthesis.deleteCharAt(parenthesis.length()-1);
        }

    }
}
