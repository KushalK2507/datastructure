package I_stack;

import java.util.Stack;

public class SimplifyPath {

    String givenPath;
    Stack<String> path;

    public SimplifyPath(String givenPath){
        this.givenPath = givenPath;
        path = new Stack<>();
    }

    public String simplifyPath(){
        String[] splittedPath = givenPath.split("/");
        for (String ele:splittedPath){
            if (!ele.equals(".") && !ele.isBlank()){
                if (ele.equals("..") && !path.isEmpty()){
                    path.pop();
                }
                else if (!ele.equals("..")){
                    path.push(ele);
                }

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
