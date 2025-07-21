package C_arrays.B_AdvanceArray;

import java.util.Map;

public class P_RomanToInteger {
 public int romanToInt(String s) {
        var romanToInt = Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);
        var prev=0;
        var total=0;
        for(int i=s.length()-1;i>=0;i--){
            var curr = romanToInt.get(s.charAt(i));
            if(curr >= prev){
                total=total+curr;
            }else{
                total = total-curr;
            }
            prev=curr;
        }

        return total;
    }
}