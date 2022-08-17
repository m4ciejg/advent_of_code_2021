package com.maciejg.leetCode75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Day2 {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    //205. Isomorphic Strings
    public static boolean isIsomorphic(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        var map = new HashMap<Character, Character>();

        for(int i = 0; i < s1.length; i++) {
            if (map.containsKey(s1[i])
                    && map.get(s1[i]) != s2[i]) {
                return false;
            }
            map.put(s1[i], s2[i]);
        }
        return true;
    }

    //392. Is Subsequence
    public static boolean isSubsequence(String s, String t) {   // a b  -> d a
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
            if (i == s.length()) {
                return true;
            }
        }
        return false;
    }

}
