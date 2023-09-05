package day5.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();

        Cat c1 = new Cat();
        c1.meow();

        d1.move();
        c1.move();

        // 클래스 단위에서 중복이 발생할 수 있다. 발생하는 경우에 어떻게 해야하는가?
        // 상속을 사용하면 된다.
        // 고양이, 개를 아우르는 상위개념 -> 포유류, 동물, 생물 : 이중에서 적절한 범위를 선택하여 만듦
        // extends를 사용하여 상속의 부모와 자식을 정의. 상위개념인 부모부터 불러옴.
    }
}

class Animal {
    public void breathe() {
        System.out.println("숨쉬다.");
    }
    public void move() {
        System.out.println("움직이다.");
    }
}

class Dog extends Animal {  // 개는 동물의 확장이다.
    int age;
    String kind;


    public void bark(){
        System.out.println("멍멍");
    }

}

class Cat extends Animal { // 고양이는 동물의 확장이다.
    int age;
    String kind;
    public void meow(){
        System.out.println("야옹");
    }
}
