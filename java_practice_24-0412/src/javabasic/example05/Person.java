
 package javabasic.example05;

    public class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void introduce() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

