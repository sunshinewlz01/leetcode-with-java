/**
 * Created by weileizhe589 on 3/23/17.
 */
public class ZigzagConversionSolution {
    public String convert(String s, int nRows) {
        char[] charsArray = s.toCharArray();
        int len = charsArray.length;
        StringBuffer[] stringBuffers = new StringBuffer[nRows];
        for (int i = 0; i < stringBuffers.length; i++) {
            stringBuffers[i] = new StringBuffer();
        }

        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < nRows && i < len; idx++) {
                stringBuffers[idx].append(charsArray[i++]);
            }
            for (int idx = nRows-2; idx >= 1 && i < len; idx--) {
                stringBuffers[idx].append(charsArray[i++]);
            }
        }
        for (int idx = 1; idx < stringBuffers.length; idx++) {
            stringBuffers[0].append(stringBuffers[idx]);
        }

        return stringBuffers[0].toString();
    }
}
