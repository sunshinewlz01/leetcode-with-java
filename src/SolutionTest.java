import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by weileizhe589 on 3/12/17.
 */
public class SolutionTest {
    public static void main(String args[]) {
//        System.out.println("Hello JAVA!");
//        twoSumTest();
//        addTwoNumbersTest();
//        reverseIntegerTest();
//        lengthOfLongestSubstringTest();
        medianOfTwoSortedArraysTest();
    }
    public static void medianOfTwoSortedArraysTest() {
        int[] nums1 = {2,5,6,7,8};
        int[] nums2 = {1,3,4};
        MedianOfTwoSortedArraysSolution medianOfTwoSortedArraysSolution = new MedianOfTwoSortedArraysSolution();
        double medianValue = medianOfTwoSortedArraysSolution.findMedianOfTwoSortedArrays2(nums1,nums2);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(medianValue);
    }
    public static void lengthOfLongestSubstringTest() {
        String str = "fdsfadfgsggggggg";
        LengthOfLongestSubstringSolution lengthOfLongestSubstringSolution = new LengthOfLongestSubstringSolution();
        Integer lengthOfLongestSubstring = lengthOfLongestSubstringSolution.lengthOfLongestSubstring(str);
        System.out.println(str);
        System.out.println(lengthOfLongestSubstring);
    }
    public static void  reverseIntegerTest() {
        int num = -156469;
        ReverseIntegerSolution reverseIntegerSolution = new ReverseIntegerSolution();
        int reverseNum = reverseIntegerSolution.reverse2(num);
        System.out.println(num);
        System.out.println(reverseNum);
    }
    public static void twoSumTest() {
        int[] nums = {1,2,3,8,4,10,7,9};
        int target = 8;
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int[] twoSumIndices = twoSumSolution.twoSum(nums,target);
        System.out.println(twoSumIndices[0]);
        System.out.println(twoSumIndices[1]);
    }

    public static void addTwoNumbersTest() {
        int[] nums1 = {2,4,3};
        int[] nums2 = {5,6,4};
        AddTwoNumbersSolution addTwoNumbersSolution = new AddTwoNumbersSolution();
        SingleLinkedListNode list1 = createSingleLinkedList(nums1);
        SingleLinkedListNode list2 = createSingleLinkedList(nums2);
        printSingleLinkedList(list1);
        printSingleLinkedList(list2);
        SingleLinkedListNode twoNumsSumList = addTwoNumbersSolution.addTwoNumbers(list1,list2);
        printSingleLinkedList(twoNumsSumList);
    }

    public static SingleLinkedListNode createSingleLinkedList(int[] nums) {
        int numsLength = nums.length;
        SingleLinkedListNode first = new SingleLinkedListNode(0);
        SingleLinkedListNode newList = first;
        newList.next = null;
        for (int i = 0;i < numsLength;i++) {
            newList.val = nums[i];
            if (i < numsLength-1) {
                newList.next = new SingleLinkedListNode(0);
                newList = newList.next;
            } else {
                newList.next = null;
            }

        }
        return first;
    }

    public static void printSingleLinkedList(SingleLinkedListNode list) {
        while (list != null) {
            System.out.print(list.val);
            list = list.next;
            if (list != null) {
                System.out.print("->");
            }
        }
        System.out.print("\n");
    }
}
