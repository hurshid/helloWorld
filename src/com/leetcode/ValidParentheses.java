package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String text = "((()(())))";
        System.out.println(isValid(text));
    }

    public static boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        char top, ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (map.containsKey(ch)) {
                top = !stack.isEmpty() ? stack.pop() : 0;
                if (map.get(ch) != top) {
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
