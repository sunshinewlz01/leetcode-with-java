import java.util.HashMap;

/**
 * Created by weileizhe589 on 3/18/17.
 */
public class LengthOfLongestSubstringSolution {
    public Integer lengthOfLongestSubstring(String str) {
        Integer len = str.length();
        if (0 == len) {
            return 0;
        }
        HashMap<Character,Integer> strMap = new HashMap<Character, Integer>();
        Integer maxLength = 0;
        for (Integer i = 0,j = 0;i < len;i++) {
            Character c = str.charAt(i);
            if (strMap.containsKey(c)) {
                j = Math.max(j,strMap.get(c)+1);
            }
            strMap.put(c,i);
            maxLength = Math.max(maxLength,i-j+1);
        }

        return maxLength;
    }
}
