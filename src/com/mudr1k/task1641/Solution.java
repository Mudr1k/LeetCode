package com.mudr1k.task1641;

// 1641.Count Sorted Vowel Strings

/*
формула сочетаний с повторениями: имеется по r одинаковых предметов каждого из t различных типов;
сколькими способами можно выбрать n (n<=r) из этих (t*r) предметов?
(t + n - 1)! 'факториал' разделить на n! разделить на (t - 1)!
В нашей задаче t = 5, т.е. есть 5 различных букв, следовательно можно упростить формулу
(4 + n)! / (n! * 4!) -> (4 + n)! / (n! * 24) и еще упростить
(n! * (n + 1) * (n + 2) * (n + 3) * (n + 4)) / 24 * n! -> (n + 1) * (n + 2) * (n + 3) * (n + 4) / 24
 */

public class Solution {

    public int countVowelStrings(int n) {
        return (n + 1) * (n + 2) * (n + 3) * (n + 4) / 24;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("countVowelStrings = " + solution.countVowelStrings(33));

    }

//    //понравилось чужое изящное решение
//    public int countVowelStrings(int n) {
//        int a = 1, e = 1, i = 1, o = 1, u = 1;
//        while(n > 0) {
//            a = a + e + i + o + u;
//            e = e + i + o + u;
//            i = i + o + u;
//            o = o + u;
//            // u = u;
//            n--;
//        }
//        return a;
//    }

}




