package C_arrays.B_AdvanceArray;

import java.util.ArrayList;
import java.util.Collections;

//Given an array arr[] consisting of n integers,
// the task is to find all the array elements which occurs more than floor(n/3) times.
//Input: arr[] = [2, 2, 3, 1, 3, 2, 1, 1]
//        Output: [1, 2]
//        Explanation: The frequency of 1 and 2 is 3, which is more than floor n/3 (8/3 = 2).

public class Q_MajorityElements {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        Integer candidate1=null;
        Integer candidate2=null;
        int count1=0;
        int count2=0;
        for(int ele:arr){
            if(candidate1 != null && ele == candidate1)
                count1++;
            else if(candidate2 != null && ele == candidate2)
                count2++;
            else if(count1 == 0){
                candidate1 = ele;
                count1++;
            }
            else if(count2 == 0){
                candidate2 =ele;
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int ele:arr){
            if(candidate1!= null && ele == candidate1)count1++;
            if(candidate2 != null && ele == candidate2)count2++;
        }

        ArrayList<Integer> elements = new ArrayList<>();
        if(count1 > arr.length/3)elements.add(candidate1);
        if(count2 > arr.length/3 && !candidate2.equals(candidate1)) elements.add(candidate2);

        Collections.sort(elements);

        return elements;
    }
}
