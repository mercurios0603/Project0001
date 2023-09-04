package day4.static1;

public class Exam2_3 {

    // 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.
    public static void main(String[] args) {
        People a1 = new People();
        a1.name = "홍길동";
        a1.age = 22;

        a1.Introduce();
        // 출력 : 저는 22살 홍길동 입니다.

        People a2 = new People();
        a2.name = "홍길순";
        a2.age = 25;

        a2.Introduce();
        // 출력 : 저는 25살 홍길순 입니다.

        a1.Introduce();
        // 출력 : 저는 22살 홍길동 입니다.
    }
}

class People {

    int age;
    String name;

    public void Introduce() {
        System.out.println("저는 " + age + "살 " + name + " 입니다.");
    }
}
