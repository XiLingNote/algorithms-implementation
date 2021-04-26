package com.jared.algorithmsimplementation.lecode;

/**
 *
 */
public class PalindromicSubstring {
    public static void main(String[] args) {
        PalindromicSubstring p = new PalindromicSubstring();
        System.out.println(p.longestPalindrome_1("abb1a"));
    }

    /**
     * 暴力解法
     */
    String sub = "";
    public String longestPalindrome_1(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1 ; j <= s.length(); j++) {
                if(isPalindromic(s.substring(i,j))){
                    if(sub.length()< s.substring(i,j).length()){
                        sub = s.substring(i,j);
                    }
                }
            }
        }
        return sub;
    }
    /**
     ** @return
     */
    public boolean isPalindromic(String s){
        for (int i = 0; i < s.length()/2; i++) {
            boolean b = s.charAt(i) != s.charAt(s.length() - i - 1);
            if(b){
                return false;
            }
        }
        return  true;
    }
}
