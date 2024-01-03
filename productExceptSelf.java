import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 除自身以外数组的乘积
 * https://leetcode.cn/problems/product-of-array-except-self/?envType=study-plan-v2&envId=leetcode-75
 */
public class productExceptSelf {
    static class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] result = new int[nums.length];
            int numsLength = nums.length;
            for (int i = 0; i < numsLength; i++) {
                int k = 1;
                for (int j = 0; j < numsLength; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (nums[j] == 0) {
                        k = 0;
                        break;
                    }
                    if (nums[j] == 1) {
                        // no change
                    } else if(nums[j] == -1) {
                        k = -k;
                    } else {
                        k*=nums[j];
                    }
                }
                result[i] = k;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}
