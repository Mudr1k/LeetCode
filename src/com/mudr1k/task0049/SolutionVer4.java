package com.mudr1k.task0049;

import java.util.*;
import java.util.stream.Collectors;

public class SolutionVer4 {
    public List<List<String>> groupAnagrams(String[] strs) {
        var result = Arrays.stream(strs).
                collect(Collectors.groupingBy(SolutionVer4::getSort,
                        Collectors.mapping(str -> str, Collectors.toList())));

        return new ArrayList<>(result.values());
    }

    private static String getSort(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return Arrays.toString(ch);
    }

    public static void main(String[] args) {
        SolutionVer4 solutionVer4 = new SolutionVer4();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solutionVer4.groupAnagrams(strs));
    }
}
