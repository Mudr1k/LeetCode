package com.mudr1k.task0003;
//3. Longest Substring Without Repeating Characters
/*
Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Example 4:
Input: s = ""
Output: 0
 */

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 1; i <= s.length(); i++) {
            char ch = s.charAt(i - 1);
            if (map.get(ch) == null) {
                ++result;
            } else {
                if (i - map.get(ch) <= result) {
                    max = Math.max(max, result);
                    result = i - map.get(ch);
                } else {
                    ++result;
                }
            }
            map.put(ch, i);
        }

        return Math.max(max, result);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "abcadcbp";
        String s2 = "";
        String s3 = "pwwkew";
        String s4 = "bbbbb";
        String s5 = "abcabcbb";
        System.out.println(solution.lengthOfLongestSubstring(s1));
        System.out.println(solution.lengthOfLongestSubstring(s2));
        System.out.println(solution.lengthOfLongestSubstring(s3));
        System.out.println(solution.lengthOfLongestSubstring(s4));
        System.out.println(solution.lengthOfLongestSubstring(s5));
    }
}
