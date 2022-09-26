package models;

//Přidáním <T> může být uvnitř cokoliv jakýkoliv datový typ je takzvaně generická
//Datový typ se ji dá při vytváření instance třídy
public class Box<T> {
    private T data;

    public Box(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }

}
