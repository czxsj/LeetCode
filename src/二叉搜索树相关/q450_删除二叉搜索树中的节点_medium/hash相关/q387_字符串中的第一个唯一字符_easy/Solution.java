package 二叉搜索树相关.q450_删除二叉搜索树中的节点_medium.hash相关.q387_字符串中的第一个唯一字符_easy;

import java.util.HashMap;

/**
 * Hash o(n)
 */
public class Solution {

    public static void main(String[] args) {
        String s = "ddwwndaweda";
        int i = firstUniqChar(s);
        System.out.println(i);
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
