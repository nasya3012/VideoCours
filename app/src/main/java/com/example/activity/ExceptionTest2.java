package com.example.activity;

public class ExceptionTest2 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("myaso");
//        t.eat("med");
        try { t.drink("voda");
            try {t.drink("pivo");
            }
            catch (NeVodaException e){
                System.out.println(e.getMessage());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("finally vn ");
            }
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}



class NeMyasoException extends RuntimeException{

    String e;
    NeMyasoException(String e){
        super(e);
    }
}
class NeVodaException extends Exception{

    String v;
    NeVodaException(String v){
        super(v);
    }
}


class Tiger {

    public void eat(String e){

        if (!e.equals("myaso")){
            throw new NeMyasoException(" Tiger ne est " +e);
        }
        System.out.println("Tiger est myaso");
    }
    public void drink(String v) throws NeVodaException{

        if (!v.equals("voda")){
            throw new NeMyasoException(" Tiger ne puet " +v);
        }
        System.out.println("Tiger puet vody");
    }
}