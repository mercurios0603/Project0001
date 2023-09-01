package day3;

public class Function {

    // 함수 정의
    // void - 리턴 타입
    // test - 함수명
    // () - 매개변수

    public static void test() {
        System.out.println("코드1");
        System.out.println("코드2");
        System.out.println("코드3");
        System.out.println("코드4");

        return;
        //함수가 끝나면 호출한 부분으로 리턴한다.
    }

    public static void plus(int num1, int num2, int num3) {

        int result = num1 + num2 + num3;

        System.out.println(result);

        return;
    }

    // main이 함수임.
    public static void main(String[] args) {                    // 프로그램의 시작

        // 함수란?
        // 코드 저장소라고 할 수 있다.

        // 1. 함수 - 코드 저장소, 특정한 기능을 가지는 코드의 모임.
        // 2. 함수는 입력 -> 처리 -> 출력의 과정 중 <처리>를 담당한다.
        // 3. 함수 규칙
        //    - 규칙 1. 함수는 클래스 안에서 정의해야 한다(본 문서의 경우 public class). (함수 안에 함수 정의 X)
        //    - 규칙 2. 리턴타입, 함수명, 매개변수를 지정해야 한다.
        //    - 규칙 3. 같은 이름의 함수를 2개 이상 만들지 않는다. (변수와 비슷함, 고유한 특성)
        //    - 규칙 4. 함수는 호출(사용) 해야만 실행된다.
        //    - 규칙 5. 함수의 개수는 제한이 없음
        // 4. 함수의 가장 큰 사용 목적 -> 코드의 재사용

//        test();
//        System.out.println("another code1");
//        test();
//        System.out.println("another code1");
//        test();
//        System.out.println("another code1");

        // 함수의 확장 -> 매개변수와 인자
        // 함수가 호출 될 때마다 원하는 값을 함수에 전달할 수 있다 (인자)
        // 같음 함수를 여러 방식으로 사용할 수 있음
        plus(10, 20, 30); // 30

        plus(100, 200, 300); // 300

    }                                                           // 프로그램의 끝
}
