package com.mudr1k.task1769;
//1769. Minimum Number of Operations to Move All Balls to Each Box
/*
You have n boxes. You are given a binary string boxes of length n, where boxes[i] is '0' if the ith box is empty,
and '1' if it contains one ball.
In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if abs(i - j) == 1.
Note that after doing so, there may be more than one ball in some boxes.
Return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls
to the ith box.
Each answer[i] is calculated considering the initial state of the boxes.
 */

import java.util.Arrays;

public class Solution {
    public int[] minOperations(String boxes) {
        int boxLen = boxes.length();
        int[] result = new int[boxLen];
        char[] chBoxes = boxes.toCharArray();

        for (int i = 0; i < boxLen; i++) {
            if (chBoxes[i] == '1') {
                for (int j = 0; j < i; j++) {
                    result[j] += i - j;
                }
                for (int j = i + 1; j < boxLen; j++) {
                    result[j] += j - i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.minOperations("001011")));
    }
}
