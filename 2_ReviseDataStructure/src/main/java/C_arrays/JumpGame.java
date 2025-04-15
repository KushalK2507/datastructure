package C_arrays;

public class JumpGame {

    int[] arr;

    public JumpGame(int[] arr){
        this.arr = arr;
    }

    public boolean isJumpPossible(){

        if (arr.length <= 1){
            return true;
        }
        int jumpStart = arr[0];
        int index=1;
        while (jumpStart > 0){

            if (index == arr.length){
                return true;
            }

            jumpStart = Math.max(jumpStart-1,arr[index]);
            index++;
        }

        return false;
    }

    public int minSteps(){

        int len = arr.length-1;
        int curr =-1;
        int next =0;
        int ans =0;
        for (int i=0;next<len;i++){
            if (i> curr){
                ans++;
                curr=next;
            }
            next = Math.max(next,arr[i]+i);

        }
        return ans;
    }

}
