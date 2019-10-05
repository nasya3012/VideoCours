package JUnit;


    private double x;
    private double y;

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }



    double lenght(){
        return Math.sqrt(x*x + y*y);
    }

    public static double devadet(double x, double y) {
        if (y==0)
            throw new  ArithmeticException(" y is 0");
        return x/y;
    }

    public static void getConection(){
        //получаем доступ к серверу
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return;
    }
}
