package Regexp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {
    public static void main(String[] args) {
        String st = " Fhhhjkkhh hhjf jhcjfh fjcikj lljhgbjjmkk  Jeny@mail.ru jvdvndjv hn bhgjbhjbh kbjhvvg jbhjhbhj kolya@yandex.com";
        Pattern pattern = Pattern.compile("(\\w+)@(mail|yandex)\\.(ru|com)");
        Matcher matcher = pattern.matcher(st);
        while (matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
        }
    }
}
