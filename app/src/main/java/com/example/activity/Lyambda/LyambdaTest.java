package com.example.activity;

interface Excutable {
    int excute(int x, int y);
}

class  Runner {
    public void run (Excutable excutable){
        int a = excutable.excute(10, 200);
        System.out.println(a);
    }
}

public class LyambdaTest {
    public static void main(String[] args) {
        Runner runner = new Runner();

        int a= 20;

        runner.run(new Excutable() {
            @Override
            public int excute(int x, int y) {
                int a = 1000;
                System.out.println("By");
                return x+y+a;
            }
        });

        runner.run((x, y) -> {
            int b = 500;
            return y+x+a+b;});
    }
}
