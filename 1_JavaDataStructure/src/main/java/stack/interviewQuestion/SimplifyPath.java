package stack.interviewQuestion;

import java.util.Stack;

public class SimplifyPath {

//    Example 1:
//    Input: path = "/home/"
//    Output: "/home"
//    Explanation: Note that there is no trailing slash after the last directory name.
//
//    Example 2:
//    Input: path = "/../"
//    Output: "/"
//    Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
//
//    Example 3:
//    Input: path = "/home//foo/"
//    Output: "/home/foo"
//    Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
    public static void main(String[] args) {

    }

    public static String simplifyPath(String path) {

        Stack<String> elements= new Stack<>();
        StringBuilder res= new StringBuilder();

        String[] str = path.split("/");

        for(int i=0;i<str.length;i++){

            if(!elements.isEmpty() && str[i].equals("..")){
                elements.pop();
            }
            else if(!str[i].equals(".") && !str[i].equals("..") && !str[i].equals("")){
                elements.push(str[i]);
            }
        }

        if(elements.isEmpty()){
            res.append("/");

        }

        while(!elements.empty()){
            res.insert(0,elements.pop()).insert(0,"/");
        }

        return res.toString();


    }
}
