/**
 * 反转字符串中的元音字母
 * https://leetcode.cn/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75
 */
public class reverseVowels {
    static class Solution {
        public String reverseVowels(String s) {
            int n = s.length();
            char[] arr = s.toCharArray();
            int i = 0, j = n - 1;
            while (i < j) {
                while (i < n && noVowel(arr[i])) {
                    ++i;
                }
                while (j > 0 && noVowel(arr[j])) {
                    --j;
                }
                if (i < j) {
                    swap(arr, i, j);
                    ++i;
                    --j;
                }
            }
            return new String(arr);
        }

        public boolean noVowel(char ch) {
            return "aeiouAEIOU".indexOf(ch) < 0;
        }

        public void swap(char[] arr, int i, int j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseVowels("hello"));
    }
}
