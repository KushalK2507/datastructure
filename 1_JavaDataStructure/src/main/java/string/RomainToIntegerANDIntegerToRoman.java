package string;

import java.util.Map;

public class RomainToIntegerANDIntegerToRoman {

    public static void main(String[] args) {

        System.out.println("Value = "+romainToInt("IV"));

        System.out.println("Value = "+intToRomain(3999));



    }

    public static String intToRomain(int num){

        String[] ones = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hundereds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thousands ={"","M","MM","MMM"};


        return thousands[num/1000] + hundereds[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];


    }

    public static int romainToInt(String s){

        Map<Character,Integer> symbolToValue = Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);

        int sum = symbolToValue.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){

            if(symbolToValue.get(s.charAt(i))< symbolToValue.get(s.charAt(i+1))){
                sum = sum-symbolToValue.get(s.charAt(i));
            }
            else {
                sum=sum+symbolToValue.get(s.charAt(i));
            }
        }
        return sum;
    }
}
