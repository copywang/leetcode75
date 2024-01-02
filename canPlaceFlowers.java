/**
 * 种花问题
 * https://leetcode.cn/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
 */
public class canPlaceFlowers {
    static class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            if (n == 0) {
                return true;
            }
            boolean result = false;
            for (int i = 0; i < flowerbed.length; i++) {
                // 前后边界
                int pre = i == 0 ?  0 : flowerbed[i - 1];
                int curr = flowerbed[i];
                int next = i == flowerbed.length - 1 ? 0 : flowerbed[i + 1];
                if (pre == 0 && curr == 0 && next == 0) {
                    n--;
                    flowerbed[i] = 1;
                    if (n == 0) {
                        result = true;
                        break;
                    }
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        System.out.println(new Solution().canPlaceFlowers(flowerbed, n));
    }
}
