/**
 * Created by weileizhe589 on 3/19/17.
 */
public class MedianOfTwoSortedArraysSolution {
    public double findMedianOfTwoSortedArrays2(int[] nums1,int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        if (len1 > len2) {
            int[] temp;
            int tempLen = 0;
            temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            tempLen = len1;
            len1 = len2;
            len2 = tempLen;
        }
        if (len2 == 0) {
            return 0;
        }
        if (len1 == 0) {
            if (len2 % 2 == 0) {
                return (nums2[len2/2-1]+nums2[len2/2])/2.0;
            } else {
                return nums2[len2/2];
            }
        }
        int halfLength = (len1+len2+1)/2;
        int iMin = 0;
        int iMax = len1;
        int i = 0;
        int j = 0;
        int maxOfLeft = 0;
        int minOfRight = 0;
        while (iMin <= iMax) {
            i = (iMin+iMax)/2;
            j = halfLength-i;
            if (i < len1 && nums2[j-1] > nums1[i]) {
                iMin = i+1;
            } else if (i > 0 && nums1[i-1] > nums2[j]) {
                iMin = i-1;
                if (iMin == 0) {
                    maxOfLeft = nums2[j-1];
                    minOfRight = nums1[i];
                    break;
                }
            } else {
                if (i == 0) {
                    maxOfLeft = nums2[j-1];
                } else if (j == 0) {
                    maxOfLeft = nums1[i-1];
                } else {
                    maxOfLeft = Math.max(nums1[i-1],nums2[j-1]);
                }

                if (i == len1) {
                    minOfRight = nums2[j];
                } else if (j == len2) {
                    minOfRight = nums1[i];
                } else {
                    minOfRight = Math.min(nums1[i],nums2[j]);
                }
                break;
            }
        }
        if ((len1+len2) % 2 == 1) {
            return maxOfLeft;
        } else {
            return (maxOfLeft+minOfRight)/2.0;
        }

    }
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
