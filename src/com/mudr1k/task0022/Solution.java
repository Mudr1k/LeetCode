package com.mudr1k.task0022;
/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example 1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

Example 2:
Input: n = 1
Output: ["()"]
 */
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateAllCombs(result, "", 0, 0, n);
        return result;
    }

    private void generateAllCombs(List<String> result, String s, int open, int close, int n) {
        if (s.length() == n * 2) {
            result.add(s);
            return;
        }

        if (open < n) {
            generateAllCombs(result, s + "(", open + 1, close, n);
        }

        if (close < open) {
            generateAllCombs(result, s + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateParenthesis(5));
    }
}
