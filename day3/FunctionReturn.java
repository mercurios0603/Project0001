package day3;

public class FunctionReturn {

    public static double circleS1(int hl) {  // void -> double. 이 함수는 최종적으로 double 자료형을 남길 것이다.
                                             // 해당 부분을 리턴 타입이라고 한다.
        double S = hl * hl * 3.14;           // 함수에서 계산된 출력값과 return 하는 값은 아무 상관이 없다. (중요!)
        System.out.println(S);

        return S;
    }

//    public static void circleS2(int hl) {
//        double S = hl * hl * 3.14/2;
//        System.out.println(S);
//    }
//
//    public static void circleS3(int hl) {
//        double S = hl * hl * 3.14*2;
//        System.out.println(S);
//    }
    public static void main(String[] args) {

        // 1. 반지름으로 원의 넓이를 구하는 함수 만들기
        // 반지름 * 반지름 * 3.14

        // 2. 반지름이 5인 원의 넓이를 구해서 출력.

        double R = circleS1(5); // 함수가 리턴할 때, 값을 하나 가지고 올 수 있다. -> 리턴값 (중요)

        // 모든 값은 자료형을 가지고 있다.
        // 1 -> 정수형(int)
        // 3.14 -> 실수형(double)
        // "hello" -> 문자형(String)
        // true -> 불형(boolean)

        // 3. 반지름이 5인 원의 넓이를 2로 나눈 값

        System.out.println(R/2);

        // 4. 반지름이 5인 원의 넓이를 2 곱한 값.

        System.out.println(R*2);

        // 리턴 -> 함수가 작업한 결과를 직접 받을 수 있음.
        // 함수의 결과를 2차 가공할 수 있음.

    }
}
