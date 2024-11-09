package string;

public class SortingString {

    public static void main(String[] args){

        //Sort String with O(N) complexity
        System.out.println("Sorted String: "+sortString("aadAcBbGz"));
    }

    public static String sortString(String str){

        int[] arr = new int[52];
        for (char c: str.toCharArray()){
            if(c > 64 && c< 90){
                arr[(int)c - 65]++;
            }
            else {
                arr[(int)c - 71]++;
            }
        }
        StringBuilder sortedString=new StringBuilder();
        for (int i=0;i<26;i++){
            if(arr[i] != 0){
                for (int z=0;z<arr[i];z++){
                    sortedString.append((char)(i+65));
                }
            }
            if(arr[i+26] !=0){

                for (int z=0;z<arr[i+26];z++){
                    sortedString.append((char)(i+26+71));
                }
            }
        }
        return sortedString.toString();
    }
}
