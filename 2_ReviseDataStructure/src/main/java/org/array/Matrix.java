package org.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Matrix {

    public static void main(String[] args) {

        spiralForm(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}});
        System.out.println();
        System.out.println("-------------");

        mergeInterval(new int[][]{{1,3},{2,6},{8,10},{15,18}}).forEach(System.out::print);
        System.out.println();
        System.out.println("-------------");

    }


    private static void rotateMatrixBy90(int[][] arr){

        int n = arr.length;

        for(int layer=0;layer<n/2;layer++){
            int last = n-1-layer;
            for(int i=layer;i<last;i++){
                int offset=i-layer;
                int top = arr[layer][i];
                arr[layer][i] = arr[last-offset][layer];
                arr[last-offset][layer] = arr[last][last-offset];
                arr[last][last-offset] = arr[i][last];
                arr[i][last] = top;
            }

        }

    }

    public static List<List<Integer>> mergeInterval(int[][]arr){

        int start = arr[0][0];
        int end =arr[0][1];

        List<List<Integer>> res = new LinkedList<>();
        for(int i=1;i<arr.length;i++){
            int nextStart=arr[i][0];
            int nextEnd=arr[i][1];
            if(nextStart <= end){
                end = Math.max(end,nextEnd);
            }
            else {
                res.add(List.of(start,end));
                start = nextStart;
                end = nextEnd;
            }
        }

        res.add(List.of(start,end));

        return res;
    }

    public static void spiralForm(int[][] arr){

        if(arr.length ==0){
            return;
        }

        int row = arr.length-1;
        int col = arr[0].length-1;
        int r=0;
        int c=0;

        while (r<row&& c<col) {

            for (int i = c; i <= col; i++) {
                System.out.print(arr[r][i]+" ");
            }
            r++;
            for (int i = r; i <= row; i++) {
                System.out.print(arr[i][col]+" ");
            }
            col--;
            for (int i = col; i >= c; i--) {
                System.out.print(arr[row][i]+" ");
            }
            row--;
            for(int i=row;i>=r;i--){
                System.out.print(arr[i][c]+" ");

            }
            c++;
        }


    }
}
