package com.example.activity.p4;

import p1.A;
import static p1.p2.B.*;
import p1.p2.B;
import p1.p2.p3.C;
import com.example.activity.p4.p5.*;


public class D {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);

        System.out.println(b);

        C c = new  C();
        c.showSms();
        System.out.println();

        E e = new  E();
        System.out.print(e.e);
        System.out.println();

        B b = new  B();
        b.showInt();
    }

}