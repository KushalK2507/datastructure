package string;

public class StringEncoding {

	public static void main(String[] args) {
		
		String s="eeddaeeffat";
		String encodedString = encodingString(s);
		System.out.println(encodedString);

	}

	private static String encodingString(String s) {
		StringBuffer sb= new StringBuffer();
		char[] sArray= s.toCharArray();
		int count=1;
		for(int i=0;i<sArray.length;i++) {
			if(i< sArray.length-1 && sArray[i] == sArray[i+1]) {
				count++;
			}
			else {
				sb.append(count).append(sArray[i]);
				count=1;
			}
		}
		
		return sb.toString();
	}

}
