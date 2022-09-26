package models;

public class ExampleClass {
    //Můžu volat mimo package a mimo tuto třídu
    public int publicNumber = 11;
    //Můžu volat v rámci této třídy nebo v potomkách této třídy
    protected int protectedNumber = 15;
    //Můžu volat jen v rámci této třídy
    private int privateNumber = 12;

    public void publicMethod(){
        protectedMethod();
        privateMethod();

        System.out.println(privateNumber);
        System.out.println(protectedNumber);
    }
    protected void protectedMethod(){

    }
    private void privateMethod(){

    }
}
