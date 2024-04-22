package inheritance_Example;

public class SubClass extends SuperClass{
    int count = 15; //this.count
    void callNum(){
        System.out.println("count= " + count);
        System.out.println("this.count= " + this.count);
        System.out.println("super.count= "+ super.count);
    }
}
