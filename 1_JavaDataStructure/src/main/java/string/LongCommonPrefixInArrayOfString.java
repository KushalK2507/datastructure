package string;

public class LongCommonPrefixInArrayOfString {

    public static void main(String[] args) {

        //Output: "fl"
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }


    public static String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length ==0){
            return "";
        }

        String prefix = strs[0];

        for(int i=1;i<strs.length;i++){

            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.length() == 0){
                    return "";

                }
            }

        }

        return prefix;
    }
}
