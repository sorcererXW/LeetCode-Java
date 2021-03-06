import java.util.Arrays;

/**
 * Created by Sorcerer on 2016/1/14 0014.
 * <p>
 * https://leetcode.com/problems/single-number/
 */
public class _136_Single_Number {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }
}
