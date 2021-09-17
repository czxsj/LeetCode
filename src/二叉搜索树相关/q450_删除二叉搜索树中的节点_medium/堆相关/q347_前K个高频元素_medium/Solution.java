package 二叉搜索树相关.q450_删除二叉搜索树中的节点_medium.堆相关.q347_前K个高频元素_medium;

import java.util.*;

/**
 * 利用大根堆（PriorityQueue）实现 o(n*log(k))
 */
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(count::get));

        for (int n : count.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        List<Integer> topK = new LinkedList<>();
        while (!heap.isEmpty()) {
            topK.add(heap.poll());
        }
        Collections.reverse(topK);
        return topK;
    }
}
