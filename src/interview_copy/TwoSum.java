package interview_copy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] handleSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];
            if (map.containsKey(rest)) {
                return new int[]{map.get(rest), i};
            }
            map.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 13 };
        int target = 20;
        int[] result = handleSum(nums, target);

        System.out.print("计算结果的两个数的序号是：" + result[0] + "," + result[1]);
    }
}
