package C_arrays.D_2Pointers;

import java.util.HashMap;
import java.util.Map;

public class C_MinWindowSubstring {

	public String minWindow(String s, String t) {
    if (t.isEmpty() || s.length() < t.length()) return "";

    Map<Character, Integer> tMap = new HashMap<>();
    for (char c : t.toCharArray())
        tMap.put(c, tMap.getOrDefault(c, 0) + 1);

    Map<Character, Integer> windowCount = new HashMap<>();
    int formed = 0, required = tMap.size();
    int left = 0, right = 0, minLen = Integer.MAX_VALUE, minLeft = 0;

    while (right < s.length()) {
        char c = s.charAt(right);
        windowCount.put(c, windowCount.getOrDefault(c, 0) + 1);

        if (tMap.containsKey(c) && windowCount.get(c).intValue() == tMap.get(c).intValue())
            formed++;

        while (formed == required) {
            if (right - left + 1 < minLen) {
                minLen = right - left + 1;
                minLeft = left;
            }
            char startChar = s.charAt(left);
            windowCount.put(startChar, windowCount.get(startChar) - 1);

        if (tMap.containsKey(startChar) && windowCount.get(startChar) < tMap.get(startChar)){
            formed--;
        }
            left++;
        }
        right++;
    }

    return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
}
}