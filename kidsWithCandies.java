import java.util.LinkedList;
import java.util.List;

/**
 * link
 * https://leetcode.cn/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75
 * 拥有最多糖果的孩子
 */
public class kidsWithCandies {
    static class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> result = new LinkedList<>();
            for (int i = 0; i < candies.length; i++) {
                int add = candies[i] + extraCandies;
                boolean max = true;
                for (int j = 0; j < candies.length; j++) {
                    if (j == i) {
                        continue;
                    }
                    if (candies[j] > add) {
                        max = false;
                        break;
                    }
                }
                result.add(max);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] candies = {1, 2};
        System.out.println(new Solution().kidsWithCandies(candies, 1));
    }
}
