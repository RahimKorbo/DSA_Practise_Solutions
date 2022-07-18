package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class LeetCode02 {

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        if(x<0 || (x!=0 && x%10==0))
            return false;
        int remainder = 0, reversed = 0,og=x;
        while(x != 0){
             reversed = reversed * 10 + x % 10;
             x = x / 10;
        }
        return (og==reversed || og==reversed%10);
    }
}
