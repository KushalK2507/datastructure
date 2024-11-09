package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PascalTriangle {

    public static void main(String[] args) {

        List<List<Integer>> result = new PascalTriangle().generate(5);

        result.forEach(System.out::println);



    }


    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascalTraingle = new ArrayList<>(numRows);

        for(int i=0;i<=numRows;i++){

            List<Integer> rows = new ArrayList<>();
            for(int j=0;j<=i;j++){

                if(j==0 || j==i){
                    rows.add(1);
                }
                else {
                    rows.add(pascalTraingle.get(i-1).get(j-1)+pascalTraingle.get(i-1).get(j));
                }
            }
            pascalTraingle.add(rows);
        }

return pascalTraingle;

    }
}
