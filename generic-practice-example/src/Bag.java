public class Bag <T, K, V>{
private  T item1;
private K item2;
private V[] array;

public Bag(T item1, K item2, V[] item3){
    this.item1 = item1;
    this.item2 = item2;
    this.array = item3;
    }

    public static void main(String[] args) {
        Bag<String, Integer, Boolean> bag = new Bag<>(
                "Java", 1,
        );
    }
}
