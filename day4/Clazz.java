package day4;

public class Clazz {
    public static void main(String[] args) {
        // 1. 클래스가 함수를 모아놓는 느낌
        // 2. 변수를 모아놓는 느낌

        // 변수를 썼다가 변수의 한계를 느껴 배열을 쓰고, 배열을 쓰다 한계를 느껴 객체를 쓰는 역사가 있었다.

        // 변수
        // 사람 표현 -> 이름, 나이, 거주지 (특정 사람에 대한 정보, 일종의 회원정보 DB)

        String name = "홍길동";
        String home = "대전";
        int age = 20;

        String name1 = "김서방";
        String home2 = "서울";
        int age2 = 22;

        System.out.printf("%d살 %s사는 %s입니다\n", age, home, name);

        // 배열
        // 키, 몸무게, 나이
        // 175, 60, 22

        int[] person1 = {175, 60, 22};
        int[] person2 = {175, 60, 22};

        System.out.printf("키 : %d, 몸무게 : %d, 나이 : %d\n", person1[0], person1[1], person1[2]);

        // 이러한 방법들의 단점은
        // 1. 같은 자료형 밖에 사용하지 못한다. 0번쨰, 1번째..
        // 2. 각 배열의 index가 어떤 정보인지 따로 적어놓지 않는 이상 구분하기 어렵다.

        // 객체 -> 관련된 데이터를 묶는다. (객체의 본질, 알파이자 오메가)
        // int : 4
        // String : 8

//        안되는 예시 01
//        int[] arr = {20, "대전", "홍길동"};
//        {170, 67, "이순신"};
//        {170, "이순신", 67};

//        안되는 예시 020
//        int[] arr = new int[3];
//
//        arr[0] = 20;
//        arr[1] = "대전";
//        arr[2] = "홍길동";

          Person abc = new Person();

          abc.age = 20;
          abc.home = "대전";
          abc.name = "홍길동";

          Person abc2 = new Person();

          abc2.age = 25;
          abc2.home = "서울";
          abc2.name = "김서방";

          System.out.printf("%d살 %s사는 %s입니다.", abc.age, abc.home, abc.name);
          System.out.printf("%d살 %s사는 %s입니다.", abc2.age, abc2.home, abc2.name);

    }
}

// 컴퓨터에게 내가 생각한 어떤 개념 -> 컴퓨터에게 직접 알려줘야 함. (컴퓨터가 알아듣는 문법으로)

// 함수를 함수 안에 만들지 않듯이, 클래스를 클래스 안에 만들지 않는다. 대등한 것은 서로 종속되지 않는다. (독립성)
// 클래스의 본질 -> 관련 데이터의 묶음

class Person {
        int age;
        String name;
        String home;
}
