package 二叉搜索树相关.q450_删除二叉搜索树中的节点_medium.hash相关.q1_两数之和_easy.f2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 一遍hash o(n)
 */
public class Solution {

    public static void main(String[] args) {
        int[] array = {2,3,15,1,5,3};
        int[] ints = twoSum(array, 8);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
