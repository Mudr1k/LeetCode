package com.mudr1k.task0007;
/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the
signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21

Example 4:
Input: x = 0
Output: 0
 */

public class Solution {
    public int reverse(int x) {
        if (x >= -9 && x <= 9) {
            return x;
        }
        int result = 0;
        int tail;

        while (x != 0) {
            tail = x % 10;
            x /= 10;

            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;
            }

            result *= 10;
            result += tail;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(-123456789));
    }
}
