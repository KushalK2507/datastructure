package linkedList.interviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonUnCommonElements {

    public static void main (String[] args){

        Set<Integer> set1=Set.of(2,4,6,8,10,12,14,16,18,20);
        Set<Integer> set2 = Set.of(3,6,9,12,15,18,21,24,27,30);

        Map<Integer,Integer> valueToCount=new HashMap<>();
        for (int value:set1){
            if(valueToCount.containsKey(value)){
                int count=valueToCount.get(value)+1;
                valueToCount.put(value,count);
            }
            else {
                valueToCount.put(value,1);
            }
        }

        for (int value:set2){
            if(valueToCount.containsKey(value)){
                int count=valueToCount.get(value)+1;
                valueToCount.put(value,count);
            }
            else {
                valueToCount.put(value,1);
            }
        }

        for (Map.Entry<Integer,Integer> entry: valueToCount.entrySet()){
            if(entry.getValue() > 1){
                System.out.println("Common"+entry.getKey());
            }
            else {
                System.out.println("UnCommon"+entry.getKey());
            }
        }

    }
}
