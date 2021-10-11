package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[] {};
        }
        else{
            for (int i = 0; i < nums.length; i++) {
                int difference = target - nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == difference) {
                        return new int[]{nums[i],nums[j]};
                    }
                }
            }
        }
        return new int[] {};
    }
}
