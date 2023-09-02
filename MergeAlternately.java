/**
 * link https://leetcode.cn/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75
 * 交替合并字符串
 * 1. 输入参数校验
 * 2. 字符串长度
 * 3. 循环条件为两个字符串其中之一遍历完成
 */
class Solution {
    public String doit(String word1, String word2) {
        if(word1.length()<=0) {
            return word2;
        }
        if(word2.length()<=0) {
            return word1;
        }
        String result = "";
        int n=word1.length();
        int m=word2.length();
        int i=0;
        while(i<n || i<m) {
            if(i<n) {
                result+=word1.charAt(i);
            }
            if(i<m) {
                result+=word2.charAt(i);
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.doit("abc", "df"));
    }
}