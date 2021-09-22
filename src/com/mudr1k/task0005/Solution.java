package com.mudr1k.task0005;
// 5. Longest Palindromic Substring
/*
Given a string s, return the longest palindromic substring in s.

Example 1:
Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"

Example 3:
Input: s = "a"
Output: "a"

Example 4:
Input: s = "ac"
Output: "a"
 */

public class Solution {
    public String longestPalindrome(String s) {
        int sLen = s.length();
        if (sLen == 1) {
            return s;
        }
        if (isPalindrome(s)) {
            return s;
        }

        for (int i = sLen - 1; i >= 2; i--) {
            for (int j = 0; j <= sLen - i; j++) {
                String substring = s.substring(j, j + i);
                if (isPalindrome(substring)) {
                    return substring;
                }
            }
        }
        return s.substring(0, 1);
    }

    private boolean isPalindrome(String substring) {
        int length = substring.length();
        for (int i = 0; i < length / 2; i++) {
            if (substring.charAt(i) != substring.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "babad";
        String s2 = "cbbd";
        String s3 = "a";
        String s4 = "ac";
        String s5 = "abbababa";
        String s6 = "abba";
        String s7 = "abb";
        String s8 = "aacabdkacaa";
        String s9 = "miycvxmqggnmmcwlmizfojwrurwhwygwfykyefxbgveixykdebenzitqnciigfjgrzzbtgeazyrbiirmejhdwcgjzwqolrturj" +
                "lqpsgunuqerqjevbheblmbvgxyedxshswsokbhzapfuojgyfhctlaifrisgzqlczageirnukgnmnbwogknyyuynwsuwbumdmoqwxp" +
                "rykmazghcpmkdcjduepjmjdxrhvixxbfvhybjdpvwjbarmbqypsylgtzyuiqkexgvirzylydrhrmuwpmfkvqllqvekyojoacvyrzj" +
                "evaupypfrdguhukzuqojolvycgpjaendfetkgtojepelhcltorueawwjpltehbbjrvznxhahtuaeuairvuklctuhcyzomwrrznrcq" +
                "movanxmiyilefybkbveesrxkmqrqkowyrimuejqtikcjfhizsmumajbqglxrvevexnleflocxoqgoyrzgqflwiknntdcykuvdcpzl" +
                "akljidclhkllftxpinpvbngtexngdtntunzgahuvfnqjedcafzouopiixw";
        String s10 = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagr" +
                "eatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoherega" +
                "vetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecan" +
                "notdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehavecons" +
                "ecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebu" +
                "titcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichthey" +
                "whofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbefore" +
                "usthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevot" +
                "ionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirth" +
                "offreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";

        System.out.println("solution.longestPalindrome(s1) = " + solution.longestPalindrome(s1));
        System.out.println("solution.longestPalindrome(s2) = " + solution.longestPalindrome(s2));
        System.out.println("solution.longestPalindrome(s3) = " + solution.longestPalindrome(s3));
        System.out.println("solution.longestPalindrome(s4) = " + solution.longestPalindrome(s4));
        System.out.println("solution.longestPalindrome(s5) = " + solution.longestPalindrome(s5));
        System.out.println("solution.longestPalindrome(s6) = " + solution.longestPalindrome(s6));
        System.out.println("solution.longestPalindrome(s7) = " + solution.longestPalindrome(s7));
        System.out.println("solution.longestPalindrome(s8) = " + solution.longestPalindrome(s8));
        System.out.println("solution.longestPalindrome(s9) = " + solution.longestPalindrome(s9));
        System.out.println("solution.longestPalindrome(s10) = " + solution.longestPalindrome(s10));
    }
}
