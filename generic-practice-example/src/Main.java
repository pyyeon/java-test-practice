import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Basket<String> basket = new Basket<>("자바");
        System.out.println(basket.getItem());


        Basket<Integer> basket1 = new Basket<>(1);
        Basket<Array> arrayBasket = new Basket<>({});

    }
}
