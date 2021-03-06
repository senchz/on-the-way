package com.exp.zsq.leetcode;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/3sum-closest/
 *
 * @author zhaoshengqi
 * @date 2021/3/2 5:15 下午
 */
public class ThreeSumClosest {

    public static void main(String[] args) {

    }

    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3)
            return 0;

        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                int sum = nums[start] + nums[end] + nums[i];

                if (Math.abs(target - sum) < Math.abs(target - ans))//找到最接近的
                    ans = sum;
                if (sum > target)//太大,向前找
                    end--;
                else if (sum < target)//太小,向后找
                    start++;
                else
                    return ans;
            }
        }
        return ans;

    }
}
