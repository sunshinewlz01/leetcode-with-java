/**
 * Created by weileizhe589 on 3/12/17.
 */
public class SolutionTest {
    public static void main(String args[]) {
        System.out.println("Hello JAVA!");
        twoSumTest();
    }
    public static void twoSumTest() {
        int[] nums = {1,2,3,8,4,10,7,9};
        int target = 8;
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int[] twoSumIndices = twoSumSolution.twoSum(nums,target);
        System.out.println(twoSumIndices[0]);
        System.out.println(twoSumIndices[1]);
    }
}
