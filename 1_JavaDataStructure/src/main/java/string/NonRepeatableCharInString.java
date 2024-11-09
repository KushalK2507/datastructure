package string;

import java.util.LinkedHashMap;
import java.util.Map;


public class NonRepeatableCharInString {

    public static void main (String[] args){

        String s="zzzzzbbbaccccddehhhhiii";
        LinkedHashMap<Character,Integer> valueToCount = new LinkedHashMap<>();
        for (int i=0;i<s.length();i++){

            if(valueToCount.containsKey(s.charAt(i))){
                int count = valueToCount.get(s.charAt(i)) +1;
                valueToCount.put(s.charAt(i),count);
            }
            else {
                valueToCount.put(s.charAt(i),1);
            }
        }

        for (Map.Entry<Character,Integer> value :valueToCount.entrySet()){

            if(value.getValue()==1){
                System.out.println(value.getKey());
                break;
            }

        }



    }
}
