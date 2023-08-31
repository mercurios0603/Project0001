package day2;

public class Operator {
    public static void main(String[] args) {

        // 산술연산자
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);

        // 나누기 할 때 -> 정수 / 정수 = 정수 (소숫점이 없는 수)
        // 컴퓨터는 정수와 정수끼리, 실수는 실수끼리 계산 가능하다. (1과 1.0은 완전히 다른 수)
        // 정수 - int, 실수 - double
        System.out.println(10 / 20);
        System.out.println(1 / 2); // 0.5이지만 결과가 나오지 않는다. (정수간의 연산이므로 0.5는 정수가 아니기 때문)
        System.out.println(1.0 / 2.0); // 실수간의 연산이므로 결과가 출력된다.

        int a = 10; // 정수형
        double b = 10.0; // 실수형, 만약 int b = 10;으로 정의했다면 오류가 발생한다.
        String c = "홍길동"; // 문자형

        // 나머지 구하기
        // 나누기는 배수, 짝수, 주기를 구할 때 사용한다.
        System.out.println(10 % 6);

        // 비교 연산자 (크다, 작다, 같다)
        System.out.println(10 > 5); // 네
        System.out.println(10 < 5); // 아니오
        System.out.println(10 >= 5); // 네
        System.out.println(10 <= 5); // 아니오
        System.out.println(10 == 5); // 아니오
        System.out.println(10 != 5); // 네

        // 비교연산자의 결과는 논리값(맞다/틀리다)
        // 논리값 -> boolean

        System.out.print(10+"\n"); // 숫자
        System.out.print("10\n");  // 문자

        System.out.print("true\n"); // 문자
        System.out.print(true); // 논리값

        boolean d = true;
        boolean e = false;

    }
}
