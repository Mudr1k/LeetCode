package com.mudr1k.task0859;
/*
859. Buddy Strings

Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal,
otherwise, return false.

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the
characters at s[i] and s[j].

    For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

Example 1:
Input: s = "ab", goal = "ba"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.

Example 2:
Input: s = "ab", goal = "ab"
Output: false
Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.

Example 3:
Input: s = "aa", goal = "aa"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.

Example 4:
Input: s = "aaaaaaabc", goal = "aaaaaaacb"
Output: true

 */

public class Solution {

    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        boolean result = false;

        if (s.equals(goal)) {
            int[] charArray = new int[26];
            for (char ch : s.toCharArray()) {
                if (charArray[ch - 'a'] == 1) {
                    return true;
                }
                ++charArray[ch - 'a'];
            }
        } else {
            int count = 0;
            int prev = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    ++count;
                    if (count == 3) {
                        return false;
                    } else if (count == 2) {
                        result = s.charAt(prev) == goal.charAt(i) && s.charAt(i) == goal.charAt(prev);
                    } else {
                        prev = i;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.buddyStrings("abb", "baa"));
        System.out.println(solution.buddyStrings("ab", "ba"));
        System.out.println(solution.buddyStrings("aa", "aa"));
        System.out.println(solution.buddyStrings("aac", "aad"));
    }
}
