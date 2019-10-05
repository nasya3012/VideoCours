package Regexp;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String st = "123";
        System.out.println(st.matches("\\d"));

        String st1 = "123";
        System.out.println(st1.matches("\\d+"));

        String st2 = "";
        System.out.println(st2.matches("\\d*"));

        String st3 = "-123";
        System.out.println(st3.matches("-\\d*"));

        String st4 = "a";
        System.out.println(st4.matches("(a|b|c)"));

        String st5 = "ABC";
        System.out.println(st5.matches("[a-zA-Z]+"));

        String st6 = "ABC2";
        System.out.println(st6.matches("[a-zA-Z123]+"));

        String st7 = "Ddd";
        System.out.println(st7.matches("[^abc]+"));

        String st8 = "hello world";
        String[] words = st8.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println(st8.replace(" ", "."));
    }
}
