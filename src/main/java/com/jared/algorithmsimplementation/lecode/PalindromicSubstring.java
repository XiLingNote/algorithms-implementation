package com.jared.algorithmsimplementation.lecode;

/**
 * 最长回文子串
 * 中心扩散法
 *
 */
public class PalindromicSubstring {
    public static void main(String[] args) {
        PalindromicSubstring p = new PalindromicSubstring();
        System.out.println(p.longestPalindrome("aba1ac"));
    }
    public String longestPalindrome(String s) {
        if(s == null || s.length() <= 1){
            return s;
        }

        int maxStart = 0;
        int maxEnd = 0;
        int maxLength = 1;
        boolean[][] index = new boolean[s.length()][s.length()];
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(s.charAt(j) == s.charAt(i) && (i-j<=2 || index[i-1][j+1]) ){
                    index[i][j] = true;
                    if(maxLength > j -i +1){
                        maxStart = j;
                        maxEnd = i;
                        maxLength = j-i +1;
                    }

                }

            }
        }

        return s.substring(maxStart,maxEnd+1);
    }
}
