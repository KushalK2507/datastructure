package org.dynamic;

import java.util.LinkedList;
import java.util.List;

public class GenerateParenthesis {

    public static void main(String[] args) {
        List<String> res = new LinkedList<>();
        StringBuilder combine = new StringBuilder();
        generateParenthesis(res,combine,0,0,3);
        res.forEach(ele -> System.out.print(ele+" "));

    }

    private static void generateParenthesis(List<String> res,StringBuilder combine,int left, int right, int n){

        if (combine.length() == n*2){
            res.add(combine.toString());
        }
        if (left < n){
            combine.append("(");
            generateParenthesis(res,combine,left+1,right,n);
            combine.deleteCharAt(combine.length()-1);
        }
        if (right < left){
            combine.append(")");
            generateParenthesis(res,combine,left,right+1,n);
            combine.deleteCharAt(combine.length()-1);
        }
    }


}
