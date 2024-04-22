package V2;

public class Basket <T> {
    private T obj;
    private  String str;
    public Basket(T obj){
        this.obj = obj;
    }

    public <U> void print(U item){// 타입변수를 받을 수 있는 용도
        System.out.println(item);//타입 매개변수를 메서드에 쓸 수 있다.
        String str; //지역 타입 매개변수
    }

    public static void main(String[] args) {
        Basket<Integer> basket = new Basket<>(123);
        basket.print("Java");
    }

}
