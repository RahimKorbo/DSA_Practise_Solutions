package com.dsa;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));

    }

    private static int romanToInt(String s) {
                HashMap<Character, Integer> map= new HashMap<Character, Integer>();
                map.put('I', 1);
                map.put('V',5);
                map.put('X',10);
                map.put('L',50);
                map.put('C',100);
                map.put('D',500);
                map.put('M',1000);
                HashMap<String, Integer> secondMap = new HashMap<String, Integer>();
                s=s.replaceAll("IV","IIII");
                s=s.replaceAll("IX", "VIIII");
                s=s.replaceAll("XL","XXXX");
                s=s.replaceAll("XC","LXXXX");
                s=s.replaceAll("CD","CCCC");
                s=s.replaceAll("CM","DCCCC");

                int res=0;
                for(int i=0;i<s.length();i++) {
                    if(map.containsKey(s.charAt(i))){
                        res = res + map.get(s.charAt(i));
                    }
                }

                return res;

    }


}
