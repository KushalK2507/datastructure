package C_arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    int height;
    List<List<Integer>> result;

    public PascalTriangle(int height){
        this.height = height;
        result = new ArrayList<>();
    }

    public List<List<Integer>> pascalTriangle(){

        for (int i=0;i<=height;i++){
            List<Integer> row = new ArrayList<>();
            for (int j=0;j<=i;j++){
                if (j==0 || j==i){
                    row.add(1);
                }
                else {
                    row.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
            }
            result.add(row);
        }

        return result;
    }

}
