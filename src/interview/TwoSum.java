package interview;

import java.util.HashMap;
import java.util.Map;

/**
 * 经典算法题 Two Sum（两数之和）的 Java 实现，
 * 用于练习数组 + HashMap 的使用。
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("index1=" + result[0] + ", index2=" + result[1]);
    }
}

