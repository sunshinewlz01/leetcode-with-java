/**
 * Created by weileizhe589 on 3/19/17.
 */
public class MedianOfTwoSortedArraysSolution {
    public double findMedianOfTwoSortedArrays(int[] nums1,int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] combinedNums = new int[len1+len2];
        int i = 0,j = 0,k = 0;
        while (i < len1 || j <len2) {
            if (i >= len1) {
                combinedNums[k] = nums2[j];
                j++;
            } else if (j >= len2) {
                combinedNums[k] = nums1[i];
                i++;
            } else {
                if (nums1[i] <= nums2[j]) {
                    combinedNums[k] = nums1[i];
                    i++;
                } else {
                    combinedNums[k] = nums2[j];
                    j++;
                }
            }

            k++;
        }
        int combinedLength = k;
        double medianValue = 0;
        if (combinedLength % 2 == 0) {
            medianValue = (double) (combinedNums[(combinedLength-1)/2]+combinedNums[combinedLength/2])/2;
        } else {
            medianValue = combinedNums[(combinedLength-1)/2];
        }

        return medianValue;
    }
}
