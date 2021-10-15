package com.mudr1k.task0035;

/*
35. Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4

Example 4:
Input: nums = [1,3,5,6], target = 0
Output: 0

Example 5:
Input: nums = [1], target = 0
Output: 0

 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        return searchIndex(nums, target, 0, nums.length - 1);
    }

    public int searchIndex(int[] nums, int target, int head, int tail) {
        int mid = 0;
        while (head <= tail) {
            mid = (head + tail) / 2; // >>> 1;
            if (nums[mid] < target) {
                head = mid + 1;
            } else if (nums[mid] > target) {
                tail = mid - 1;
                if (nums[tail] < target) {
                    return mid;
                }
            } else {
                return mid;
            }
        }
        return mid + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6};
        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int[] nums2 = {1, 3, 4, 5};
        int[] nums3 = {0, 1, 2, 3, 5, 6, 7, 8, 9};
        int[] nums4 = {0, 1, 2, 3, 4, 6, 7, 8, 9};
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(nums, 4));
        System.out.println(solution.searchInsert(nums1, 4));
        System.out.println(solution.searchInsert(nums2, 2));
        System.out.println(solution.searchInsert(nums2, 0));
        System.out.println(solution.searchInsert(nums2, 6));
        System.out.println(solution.searchInsert(nums3, 4));
        System.out.println(solution.searchInsert(nums4, 5));
    }
}
