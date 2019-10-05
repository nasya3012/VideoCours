package com.example.activity;

public class Overloading {

    int show (){
        int result = 0;
        System.out.println(result);
        return result;
    }

    int show ( int a1){
        int result1 = a1;
        System.out.println(result1);
        return result1 ;
    }

    int show ( int a2, int b2){
        int result2 = show(a2) + b2;
        System.out.println(result2);
        return result2;
    }

    int show ( int a3, int b3, int d3){
        int result3 = show(a3,b3) + d3;
        System.out.println(result3);
        return result3;
    }

    int show ( int a4, int b4, int d4, int e4){
        int result4 = show(a4, b4,d4) + e4;
        System.out.println(result4);
        return result4;
    }


}
class  OverloadingTest {

    public static void main(String[] args) {
        Overloading o = new Overloading();
//        int kk = o.show(2,2,2,2,2);
//        System.out.println(kk);

        o.show();
        o.show(3);
        o.show(3,3);
        o.show(3,3,3);
        o.show(3,3,3,3);
    }
}