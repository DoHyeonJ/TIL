import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        Arrays.sort(strs); // 사전순 정렬

        for(int i=0; i<strs.length; i++) {
            prefix = check(prefix, strs[i]);
            if(prefix.equals("")) {
                return prefix;
            }
        }

        return prefix;
    }

    // Check Prefix
    public String check(String prefix, String str) {
        while(true) {
            if(str.startsWith(prefix)) {
                return prefix;
            } else if(prefix.length() == 1) {
                return "";
            } else {
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
    }
}
