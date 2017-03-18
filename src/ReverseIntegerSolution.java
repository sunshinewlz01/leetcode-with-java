import java.util.ArrayList;

import static java.lang.Math.abs;

/**
 * Created by weileizhe589 on 3/18/17.
 */
public class ReverseIntegerSolution {
    public Integer reverse(Integer x) {
        Integer maxInteger = (int)Math.pow(2,31)-1;
        Integer minInteger = 0-(int)Math.pow(2,31);
        if (x > maxInteger || x < minInteger) {
            return 0;
        }
        Boolean nagativeSign = false;
        if (x < 0) {
            nagativeSign = true;
            x = Math.abs(x);
        }
        Integer[] remainderArray = new Integer[32];
        Integer i = 0;
        while(x >= 10) {
            Integer remainder = x % 10;
            Integer factor = (x - remainder)/10;
            x = factor;
            remainderArray[i] = remainder;
            i++;
        }

        Integer len = i + 1;
        if (len > 10) {
            return 0;
        }
        remainderArray[len-1] = x;
        Integer reverseNum = 0;
        Integer tempSum = 0;
        for (Integer j = 0;j < len;j++) {
            Integer temp = remainderArray[j]*(int)Math.pow(10,len-j-1);
            if (temp % (int)Math.pow(10,len-j-1) != 0) {
                return 0;
            }
            tempSum = reverseNum + remainderArray[j]*(int)Math.pow(10,len-j-1);
            if (tempSum < reverseNum) {
                return 0;
            }
            reverseNum = tempSum;
        }
        if (nagativeSign) {
            tempSum = 0 - reverseNum;
            if (tempSum > 0) {
                return 0;
            }
            reverseNum = tempSum;
        }
        return reverseNum;
    }
}
