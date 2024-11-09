package string;

public class ReplaceAndRemoveDuplicatesInString {

    public static void main(String[] args){

        //Removing Special character
        System.out.println("Java&%df%".replaceAll("[^a-zA-z0-9]",""));

        //Removing Extra whitespaces in between string
        System.out.println("Ku sh ak jk".replaceAll("\\s",""));

        // Removing the duplicates in string
        String duplicatesInput = "dsfgdfgtddd";
        StringBuffer sb = new StringBuffer();
        duplicatesInput.chars().distinct().forEach(c -> sb.append((char) c));
        System.out.println("Removal of Duplicates: "+sb);

    }

}
