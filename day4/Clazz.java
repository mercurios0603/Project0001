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

//        안되는 예시 02
//        int[] arr = new int[3];
//
//        arr[0] = 20;
//        arr[1] = "대전";
//        arr[2] = "홍길동";

          Person2 abc = new Person2();

          abc.age = 20;
          abc.home = "대전";
          abc.name = "홍길동";

          Person2 abc2 = new Person2();

          abc2.age = 25;
          abc2.home = "서울";
          abc2.name = "김서방";

          // 중복되는 것. 함수로 바꾸어 일괄적으로 통제하기.
          System.out.printf("%d살 %s사는 %s입니다.", abc.age, abc.home, abc.name);
          System.out.printf("%d살 %s사는 %s입니다.", abc2.age, abc2.home, abc2.name);

//        함수로 받기
//        introduce(abc.age, abc.home, abc.name);
//        introduce(abc2.age, abc2.home, abc2.name);

          // 위에도 비효율적임. 그냥 class를 통째로 넘김.
          // 함수 -> 같은 클래스 내의 함수끼리는 서로 호출(사용) 가능
          // introduce(abc2);
          // 타 클래스의 함수를 불러오려면 클래스명.함수() 의 형태를 따른다.
          // Person.introduce2();
          // Person.introduce2(); 와 abc.introduce2()의 차이는... Person 꾸러미보다. 개별객체 abc or abc2에 중점을 둔것?
          // 이게 인스턴스를 사용한 것인듯
          // 인스턴스를 사용하면 객체명.함수() 의 형태를 따른다.

          abc.introduce2();
          abc2.introduce2();
    }

    public static void introduce(Person2 abc) {
        System.out.printf("안녕하세요. %d살 %s사는 %s입니다.\n", abc.age, abc.home, abc.name);
    }
}

// 컴퓨터에게 내가 생각한 어떤 개념 -> 컴퓨터에게 직접 알려줘야 함. (컴퓨터가 알아듣는 문법으로)

// 함수를 함수 안에 만들지 않듯이, 클래스를 클래스 안에 만들지 않는다. 대등한 것은 서로 종속되지 않는다. (독립성)
// 클래스의 본질 -> 관련 데이터의 묶음 + 해당 데이터를 사용하는 함수. (개념을 구현하기 위한 것)

//class Person {
//        static int age;
//        static String name;
//        static String home;
//
//        public static void introduce2() {
//        System.out.printf("안녕하세요. %d살 %s사는 %s입니다.\n", age, home, name);
//    }

// 인스턴스(복사본, 객체)를 사용하려면 static이 있어서는 안된다.
class Person2 {
        int age;
        String name;
        String home;

        //데이터를 사용, 활용하는 것은 함수가 한다. (그래서 class 안에 존재하는 것이다)
        public void introduce2() {
        System.out.printf("안녕하세요. %d살 %s사는 %s입니다.\n", age, home, name);
    }
}


class computer {
    double cpu;
    int ram;
    int ssd;

    public void poweron() {
    }

    public void poweroff() {
    }

    public void spec() {
    }
}
