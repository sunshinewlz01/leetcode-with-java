/**
 * Created by weileizhe589 on 3/12/17.
 */
public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        int numsLength = nums.length;
        int[] twoSumIndex = new int[2];
        for(int i = 0;i < numsLength;i++) {
            for(int j = i+1;j < numsLength;j++) {
                if(nums[i] + nums[j] == target) {
                    twoSumIndex[0] = i;
                    twoSumIndex[1] = j;
                }
            }
        }
        return twoSumIndex;
    }
}
