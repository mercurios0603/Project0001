package day5;

public class Reference2 {
    public static void main(String[] args) {
        Person p1;  // 클래스Person 사람을 저정할 변수. 무슨 의미인가? 사람이 한명 있다. (X, 아직 아니다)
                    // 현재 시점에서 p1의 값이 없다.

        p1 = new Person(); // 사람 한명 생성해서 사람 리모컨을 p1에 저장.
        Person p2 = new Person(); //사람 생성해서 사람 리모컨을 p2에 제장.

        p1.age = 20 ;
        p1.name = "홍길동";

        p2.age = 25 ;
        p2.name = "이순신";

        p1.introduce();
        p2.introduce();

        // num1, num2는 원본이고, p1, p2는 참조(reference)다.

        int num1 = 10;
        int num2 = num1;

        System.out.println(num1);
        System.out.println(num2);


        num2 = 20; // num2에 20 대입, 그렇다고 num1이 20으로 바뀌진 않는다.

        System.out.println(num1);
        System.out.println(num2);

        p2 = p1;
        p1.name = "임꺽정";
        p2.name = "홍길동";
        p2.name = "마동석";

        System.out.println(p1.name);
        System.out.println(p2.name);
        }
}
