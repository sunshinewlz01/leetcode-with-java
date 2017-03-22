/**
 * Created by weileizhe589 on 3/22/17.
 */
public class LongestPanlindromicSubstringSolution {
    public String longestPalindrome(String str) {
        Integer len = str.length();
        if (len == 0 || len == 1) {
            return str;
        }
        Integer maxLength = 0;
        String resultStr = "";
        Integer[] result = new Integer[2];
        result[0] = 0;
        result[1] = 0;
        for (int i = 0;i < len-1;i++) {
            extendPalindrome(str,i,i,result);
            extendPalindrome(str,i,i+1,result);
        }
        resultStr = str.substring(result[1],result[1]+result[0]);
        return resultStr;
    }
    private void extendPalindrome(String str,Integer start,Integer end,Integer[] result) {
        while (start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
            start--;
            end++;
        }
        result[0] = Math.max(result[0],end-start-1);
        if (result[0] < end-start-1) {
            result[1] = start+1;
        }

    }
    public Boolean isPalindromic(String str,Integer start,Integer end) {
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
}
