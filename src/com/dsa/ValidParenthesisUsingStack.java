package com.dsa;

import java.util.Stack;

public class ValidParenthesisUsingStack {

    public static void main(String[] args) {

        System.out.println(validParenthesis("(){}}{"));
    }

    private static boolean validParenthesis(String s) {

        //Declare the stack of characters
        Stack<Character> stack=new Stack<Character>();

        //iterate through the string
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.add(s.charAt(i));
            }else {
                if(stack.empty()) {
                    return false;
                }else {
                    char c=stack.peek();
                    stack.pop();
                    if((s.charAt(i) == ')'&& c == '(') || (s.charAt(i) == ']'&& c == '[') || (s.charAt(i) == '}'&& c == '{')) {
                    }else {
                        return false;
                    }
                }
            }
        }

        if(stack.empty()) {
            return true;
        }else {
            return false;
        }

    }
}
