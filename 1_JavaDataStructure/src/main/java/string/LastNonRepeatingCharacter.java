package string;

public class LastNonRepeatingCharacter {

    public static void main(String[] args){
        String s = "addvvffbbchhtt";

        System.out.println("Last Non Repeating Character");
        Character result = lastNonRepeatingCharacterWithOnComplexity(s);
        System.out.println("O(n) Complexity: "+result);

        Character result2 = lastNonRepatingCharacterWithOn2Complexity(s);
        System.out.println("O(n2) Complexity: "+result2);

    }

    public static Character lastNonRepeatingCharacterWithOnComplexity(String input){

        char[] inputArray = input.toCharArray();
        for (int x=inputArray.length-1;x>0;x--){
            if(input.indexOf(inputArray[x]) == input.lastIndexOf(inputArray[x])){
                return inputArray[x];
            }
        }

        return null;
    }

    public static Character lastNonRepatingCharacterWithOn2Complexity(String input){

        return null;
    }
}
