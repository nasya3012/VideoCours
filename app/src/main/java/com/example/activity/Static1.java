package com.example.activity;

class Static1 {
    static  final double pi =3.14;

    static int summa1(int a, int b, int c){
        return a*b*c;
    }

    static  void summa2(int a, int b){
        System.out.println(a/b);
    }

    void ploshad(double r){
        System.out.println("ploshad   "+pi*r*r);
    }

    static void dlinaOkryzhnosti (double r){
        System.out.println("dlinaOkryzhnosti   "+2*pi*r);
    }

    void print(double r){
        System.out.println("radius  "+r);
        Static1 st = new Static1();
        st.ploshad(r);
        Static1.dlinaOkryzhnosti(r);

    }
}


class Static2 {

    public static void main(String[] args) {

        System.out.println(Static1.summa1(1,1,3));
        System.out.println(Static1.summa1(3,1,3));

        Static1.summa2(3,3);
        Static1.summa2(9,3);



        Static1 st1 = new Static1();
        st1.print(9);
        st1.ploshad(2);
        Static1.dlinaOkryzhnosti(3);
    }

}
