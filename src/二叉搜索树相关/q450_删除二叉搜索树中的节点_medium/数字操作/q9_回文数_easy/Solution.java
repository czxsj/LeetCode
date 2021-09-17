package 二叉搜索树相关.q450_删除二叉搜索树中的节点_medium.数字操作.q9_回文数_easy;

/**
 * 不转换成String 反转一半的数字o(log(n))
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }
        int rs = 0;
        while (rs < x / 10) {
            int y = x % 10;
            x = x / 10;
            rs = rs * 10 + y;
            if (rs == x) {
                return true;
            } else if (x / 10 == rs) {
                return true;
            }
        }
        return false;
    }
}
