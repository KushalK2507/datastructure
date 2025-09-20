package P_dynamic.C_2DP;

public class D_MaximalSquare {

    public int maximalSquare(int[][] matrix){

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m+1][n+1];
        int maxSize=0;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i-1][j-1] == 1){
                    dp[i][j] = 1+Math.max(dp[i-1][j],Math.max(dp[i][j-1],dp[i-1][j-1]));
                    maxSize = Math.max(maxSize,dp[i][j]);
                }
            }
        }
        return maxSize*maxSize;
    }
}
