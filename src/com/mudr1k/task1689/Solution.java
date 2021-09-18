package com.mudr1k.task1689;

public class Solution {

    public int minPartitions(String n) {
        char max = '0';
        for (int i = 0; i < n.length(); i++) {
            char curr = n.charAt(i);
            if (curr > max) {
                max = curr;
            }
        }
        return Character.digit(max, 10);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String n = "27346209830709182346";

        System.out.println("solution.minPartitions(n) = " + solution.minPartitions(n));
    }
}
