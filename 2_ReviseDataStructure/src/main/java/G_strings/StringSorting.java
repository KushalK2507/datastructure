package G_strings;

public class StringSorting {


    public String sortedString(String s){

        int[] arr = new int[52];

        for (char c:s.toCharArray()){
            int asciiValue = (int) c;
        if (asciiValue >=65 && asciiValue<=90){
            int index = asciiValue-65;
            arr[index]++;
        }
            if (asciiValue >=97 && asciiValue<=122){
                int index = asciiValue-71;
                arr[index]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<26;i++){
            if (arr[i] != 0){
                for (int j=0;j<arr[i];j++){
                    sb.append((char)(i+65));
                }
            }
            if (arr[i+26] != 0){
                for (int j=0;j<arr[i+26];j++){
                    sb.append((char)(i+26+71));
                }
            }
        }


        return sb.toString();
    }
}
