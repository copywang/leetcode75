import java.util.Objects;

/**
 * link
 * https://leetcode.cn/problems/greatest-common-divisor-of-strings/solutions/143956/zi-fu-chuan-de-zui-da-gong-yin-zi-by-leetcode-solu
 * 字符串的最大公因子
 */
public class gcdOfStrings {
    static class Solution {
        public String gcdOfStrings(String str1, String str2) {
            int n = str1.length();
            int m = str2.length();
            for (int i = Math.min(n, m); i > 0; i--) {
                if (n % i == 0 && m % i == 0) {
                    String x = str1.substring(0, i);
                    if (check(x, str1) && check(x, str2)) {
                        return x;
                    }
                }
            }
            return "";
        }

        public boolean check(String sub, String full) {
            int count = full.length() / sub.length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < count; i++) {
                sb.append(sub);
            }
            return Objects.equals(sb.toString(), full);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().gcdOfStrings("ABC", "ABC"));
    }
}
