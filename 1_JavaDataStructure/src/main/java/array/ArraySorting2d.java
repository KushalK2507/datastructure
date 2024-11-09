package array;

import java.util.Arrays;

public class ArraySorting2d {

    public static void main (String[] args){
        String [][] orderedPair = {{"1","Red"},{"2","Pink"},{"3","Blue"},{"4","Black"},{"5","Green"}};
        String [] colors = new String[orderedPair.length];
        for(int i=0;i<orderedPair.length;i++){
            colors[i]=orderedPair[i][1];
        }

        Arrays.sort(colors);

        for (int j=0;j<orderedPair.length;j++){
            orderedPair[j][1]=colors[j];
        }

        System.out.println(Arrays.deepToString(orderedPair));
    }
}
