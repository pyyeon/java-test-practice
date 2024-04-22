package abstract_example;

 class Dog extends Animal{//Animal 클래스로부터 상속
  public Dog() {
      this.kind = "포유류";
;  }
     public void sound(){//메서드 오버라이딩
         System.out.println("멍멍");
     }

}
