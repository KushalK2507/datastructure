package G_strings;

public class D_LongestPrefixInStringArray {

  public String longestPrefix(String[] arr) {

    String longestPrefix = arr[0];

    for (int i = 1; i < arr.length; i++) {
      while (!arr[i].startsWith(longestPrefix)) {
        longestPrefix = longestPrefix.substring(0, longestPrefix.length() - 1);
        if (longestPrefix.isEmpty()) {
          return "";
        }
      }
    }
    return longestPrefix;
  }
}
