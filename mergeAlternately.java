/**
 * link https://leetcode.cn/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75
 * 交替合并字符串
 * 1. 输入参数校验
 * 2. 字符串长度
 * 3. 循环条件为两个字符串其中之一遍历完成
 */
public class mergeAlternately {
    public static class Solution {
        public String mergeAlternately(String word1, String word2) {
            if (word1.isEmpty()) {
                return word2;
            }
            if (word2.isEmpty()) {
                return word1;
            }
            StringBuilder result = new StringBuilder();
            int n = word1.length();
            int m = word2.length();
            int i = 0;
            while (i < n || i < m) {
                if (i < n) {
                    result.append(word1.charAt(i));
                }
                if (i < m) {
                    result.append(word2.charAt(i));
                }
                i++;
            }
            return result.toString();
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.mergeAlternately("abc", "df"));
        }
    }
}
