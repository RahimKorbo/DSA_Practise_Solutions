package com.dsa;

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        //Input: strs = ["flower","flow","flight"]

        String[] strs = {"flower","flow","flight"};
        System.out.print(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        for(String s:strs) {
            System.out.print(s);
        }
        String first = strs[0],last=strs[strs.length - 1];
        int i=0;
        while(i < first.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return i==0 ? "":first.substring(0,i);
    }

}
