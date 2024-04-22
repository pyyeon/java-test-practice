package javabasic.example05;

public class example05_01 {
    public static void main(String[] args) {
        //Person 클래스를 생성하고,
        // 이름(name)과 나이(age)를 필드로 가지게 하세요.
        // 이름과 나이를 설정할 수 있는 생성자와, 이를 출력할 수 있는 메서드를 포함하세요.
        class Person {
            //이름(name)과 나이(age)를 필드로
            public String name;
            public int age;

            //생성자
            public Person(String name, int age) {
                this.name = name;
                this.age = age;

                // 생성자 내에서 정보 출력
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);

//
//                Person yeeyeon = new Person("yeeyeon", 30);// 객체 생성
//                System.out.println(yeeyeon.age);
//                System.out.println(yeeyeon.name);
//
            }


        }


    }
}

