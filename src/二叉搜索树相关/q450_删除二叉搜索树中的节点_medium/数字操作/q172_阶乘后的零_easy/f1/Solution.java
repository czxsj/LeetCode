package 二叉搜索树相关.q450_删除二叉搜索树中的节点_medium.数字操作.q172_阶乘后的零_easy.f1;

/**
 * 找因子直接遍历（o(n)超时）
 */
public class Solution {
    public int trailingZeroes(int num) {
        int rs = 0;
        for (int i = 1; i <= num; i++) {
            int j = i;
            while (j % 5 == 0) {
                rs++;
                j /= 5;
            }
        }
        return rs;
    }
}
