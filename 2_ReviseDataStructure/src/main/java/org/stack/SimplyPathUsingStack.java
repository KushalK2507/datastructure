package org.stack;

import java.util.Arrays;
import java.util.Stack;

public class SimplyPathUsingStack {

    public static void main(String[] args) {

        System.out.println(simplifyPath("/home/"));
        System.out.println("----------------------------");
        System.out.println(simplifyPath("/../"));
        System.out.println("----------------------------");
        System.out.println(simplifyPath("/home//foo/"));
    }

    public static String simplifyPath(String input){

        String[] ch = input.split("/");
        Stack<String> path = new Stack<>();
        for (String s : ch) {

            if(!path.isEmpty() && s.equals("..")){
                path.pop();
            } else if (!s.equals(".") && !s.equals("..") && !s.equals("")) {
                path.push(s);
            }
        }
        StringBuilder result = new StringBuilder();

        if (path.isEmpty()){
            result.append("/");
        }

        while (!path.isEmpty()){
            result.insert(0,path.pop()).insert(0,"/");
        }

        return result.toString();
    }
}
