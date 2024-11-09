package string;

public class ReplaceCharacterWithItsOccurence {

    public static void main (String[] args){

        String s = "opentext";
        char charToBeReplaced ='t';
        int count=1;
        char[] sArray = s.toCharArray();
        for(int i=0;i<sArray.length;i++){
            if(sArray[i]== charToBeReplaced){
                sArray[i] = String.valueOf(count).charAt(0);
                count++;
            }
        }
        System.out.println(new String(sArray));

    }
}
