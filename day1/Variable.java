package day1;
public class Variable {
    public static void main(String[] args) {
        // 홍길동의 나이를 저장했다가 필요할 때 사용
        // 값을 저장하는 상자(그릇) - 변수
        // 변수를 만들 때는 크기와 모양 결정
        // 변수를 만들 때는 변수의 이름이 필요

        // 값 -> 숫자(int), 문자(String)

        int age = 26;

        // 자료형(타입) 변수명;
        // = 기준 오른쪽 값을 왼쪽 변수에 저장

        // 변수 사용시 주의할 점.
        // 1. 같은 이름으로 두개 이상 변수 만들지 않기
        // 2. 숫자나 시작하거나 특수문자가 포함된 이름은 안됨. 공백도 안됨.

        // 잘못된 변수 선언 예시
//        25 = age; 왼쪽에 값이 오면 안된다.
//        int age = 25; // age라는 이름의 변수는 이미 존재한다.
//        int my age = 40; // 변수명에 공백이나 특수문자가 포함되었다.

        // 변수 사용 -> 변수명으로 값처럼 사용
        System.out.println(25);
        System.out.println(age);


        // 홍길동의 나이를 한번만 사용해서 자기소개 5번 출력
        // 홍길동의 나이를 26으로 수정해보세요.

        System.out.println("안녕하세요 저는 " + age + "살 홍길동입니다.");
        System.out.printf("안녕하세요 저는 %d살 홍길동입니다.\n", age);

        // 변수 사용법2
        // 변수 재활용 가능. (단, 하나의 값만 저장 가능)
        int num = 10; // int를 저장하는 num이라는 이름의 변수를 생성하고 10을 저장

        System.out.println(num);

        num = 20; // 기존의 10을 20으로 대체하는 구문.

        System.out.println(num);

        // 변수의 값을 다른 변수에 대입 가능
        int num2 = 50;

        System.out.println(num2);

        num2 = num;

        System.out.println(num2);

    }
}
