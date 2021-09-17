package 二叉搜索树相关.q450_删除二叉搜索树中的节点_medium.hash相关.q1_两数之和_easy.f1;

/**
 * 暴力法 o(n^2)
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}
