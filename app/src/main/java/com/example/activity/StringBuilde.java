package com.example.activity;

public class StringBuilde {

    public StringBuilde(String s) {
    }

    boolean ravenstvo (StringBuilder a, StringBuilder b){
        boolean result = true;
        if (a.length() == b.length()){
            for(int i = 0; i< a.length(); i++){
                if (a.charAt(i) != b.charAt(i)){
                    result = false;
                    break;
                }
            }
        }
        else result = false;
        return result;
    }

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("12345");
        StringBuilder b = new StringBuilder("12345");
        StringBuilde sb = new StringBuilde("");
        System.out.println(sb.ravenstvo(a,b));
        System.out.println(sb.ravenstvo(new StringBuilder("gg"), new StringBuilder("g")));
        System.out.println(sb.ravenstvo(new StringBuilder(), new StringBuilder()));
    }

}

