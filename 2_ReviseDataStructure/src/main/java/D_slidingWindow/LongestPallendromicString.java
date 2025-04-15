package D_slidingWindow;

public class LongestPallendromicString {

    String s;

    public LongestPallendromicString(String s){
        this.s = s;
    }

    public String longestString(){
        int start =0;
        int end =0;
        for (int i=0;i<s.length();i++){
            int len1 = expandPallendrome(s,i,i);
            int len2 = expandPallendrome(s,i,i+1);
            int maxLen = Math.max(len1,len2);
            if (maxLen > end-start){
                start = i - ((maxLen-1)/2);
                end = i+ (maxLen/2);
            }
        }
        return s.substring(start,end+1);
    }

    private int expandPallendrome(String s, int left, int right){

        if (s == null || left > right){
            return 0;
        }
        while (left>= 0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
