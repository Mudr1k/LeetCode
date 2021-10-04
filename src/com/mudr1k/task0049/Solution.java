package com.mudr1k.task0049;

import java.util.ArrayList;
import java.util.List;

/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all
the original letters exactly once.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]

 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list_result = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            String curr_i = strs[i];
            if (curr_i == null) {
                continue;
            }
            ArrayList<String> list = new ArrayList<>();
            list.add(curr_i);
            for (int j = i + 1; j < strs.length; j++) {
                String curr_j = strs[j];
                if (curr_j == null) {
                    continue;
                }
                if (isAnagram(curr_i, curr_j)) {
                    list.add(curr_j);
                    strs[j] = null;
                }
            }
            list_result.add(list);
        }
        return list_result;
    }

    private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] s2_ch = s2.toCharArray();

        for (int i = 0; i < s1.length(); i++) {
            boolean found = false;
            for (int j = 0; j < s2_ch.length; j++) {
                if (s1.charAt(i) == s2_ch[j]) {
                    found = true;
                    s2_ch[j] = '0';
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solution.groupAnagrams(strs));
    }
}
