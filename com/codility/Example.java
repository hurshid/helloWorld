package com.codility;

/**
 * Created by Hurshid on 3/25/2015.
 */
public class Example {

    public static void main(String[] args) {
       String A = "first,solve the problem.then, write the code.";
       String A1 = "this is a test... and another test.";
       String A2 = "hello. how are you today? great! i'm fine too.";
       String A3 = "Do. Or do not. There is no try";
       String A4 = "The house is on fire!? Run!";
       String A5 = "the conference has people who have come from Moscow,Idaho;Paris,Texas;London,Ohio; and other places as well.";
        solution(A);
        solution(A1);
        solution(A2);
        solution(A3);
        solution(A4);
        solution(A5);
    }

    public static void solution(String text) {
        int position = 0;
        text = text.replaceAll("(?<=[,.!?;:])(?!$)", " ").replace(". . .", "...").replace("! ! !", "!!!").replace("! ?", "!?").replace("? !", "?!");
//        text = text.replaceAll("(?<=[,.!?;:])(?!$)", " ").trim().replaceAll("\n ", "");
        boolean c = true;
        StringBuilder sb = new StringBuilder(text);
        while (position < sb.length()) {
            if (sb.charAt(position) == '.' || sb.charAt(position) == '?' || sb.charAt(position) == '!'||sb.charAt(position) == ';') {
                c = true;
            } else if (c && !Character.isWhitespace(sb.charAt(position))) {
                sb.setCharAt(position, Character.toUpperCase(sb.charAt(position)));
                c = false;
            }
            position++;
        }

        System.out.println(sb.toString().trim().replaceAll("\\s{2,}", " "));
    }
}
