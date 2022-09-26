import models.*;
import models.dataSaver.DataSaver;
import models.dataSaver.FileDataSaver;
import models.dataSaver.InMemoryDataSaver;

public class main {
    public static void main(String[] args) {

        //XML, VCS, protokol, socket (V testu!)

        //Konstanta
        final int x = 10;
        final double pi = 3.14;

        ExampleClass exampleClass = new ExampleClass();
        exampleClass.publicMethod();
        System.out.println(exampleClass.publicNumber);

        System.out.println(MyMathClass.pi);
        int sum = MyMathClass.sum(10,20);

        Car skodaFabia = new Car("Skoda", "Fabia");

        Box<Car> boxOfCar = new Box<>(skodaFabia);

        Box<Integer> boxOfNumber = new Box<>(16);

        Pair<Integer, Car> pair = new Pair<>(1, skodaFabia);

        Pair<String, String> parString = new Pair<>("key1", "value 1");

        Box<Pair<String, String>> boxOfPair = new Box<>(parString);

        DataSaver<Car> dataSaver = new FileDataSaver<>();

        if(true){
            dataSaver = new InMemoryDataSaver<>();
        }



        dataSaver.save(skodaFabia);

        Car loadedCar = dataSaver.load();

        printSymbol('#', 5);

        try{
            // zápis do souboru
            throw new NullPointerException("Soubor nenalezen");
        }
        catch (NullPointerException e){

        }
        //Obecná vyjímka, když nevíme co je za chybu
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void printSymbol(char symbol, int count){
        if(count<1)
            return;

        String textToPrint = "";
        for (int i = 0; i < count; i++) {
            textToPrint = textToPrint + symbol;
        }
        System.out.println(textToPrint);
        count = count -1;
        printSymbol(symbol, count);
    }
}
