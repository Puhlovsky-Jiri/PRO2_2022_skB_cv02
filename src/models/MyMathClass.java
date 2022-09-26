package models;

public class MyMathClass {
    //pokud je Static, tak můžu k ní přistupovat aniž bych vytvářel instanci třídy v mainu (MyMathClass mathClass = new MyMathClass();)
    public static final double pi = 3.14;

    private MyMathClass(){

    }
    public static int sum(int a, int b){
        return a+b;
    }
}
