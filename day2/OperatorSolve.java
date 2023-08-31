package day2;

public class OperatorSolve {
    public static void main(String[] args) {

        if ( true ) {
            System.out.println("true");
        }

        if ( false ) {
            System.out.println("false");
        }

        int a = 10;
        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println("true");
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println("false");
        }

        if ( a > 10 ) {
            System.out.println("false");
        }

        if ( a >= 10 ) {
            System.out.println("true");
        }

        int b = 10;

        if ( a == b ) {
            System.out.println("true");
        }

        //boolean c => c 에는 오직 true/false 만 담을 수 있다.

        boolean c = a != b; //우측 a != b 부터 계산하고 이것이 c에 대입된다.

        if ( c ) {
            System.out.println("false");
        }

        if ( c == false ) {
            System.out.println("true");
        }

        // `!` => 반전, 단일 반전.
        if ( !c ) {
            System.out.println("true");
        }

        // `!` => 반전, 이중 반전.
        if ( !(!c) ) {
            System.out.println("false");
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println("true");

        System.out.println("====== 증감연산자 ======");
        int num = 10;
        System.out.println(num + 10);

        //num은 몇인가 20 -> 틀림, 변수는 대입하지 않으면 바귀찌 않음.

        // num의 값을 10 증가
        num = num + 10;
        num += 10;
        System.out.println(num);

        // num의 값을 5 감소
        num = num - 5;
        num -= 5;
        System.out.println(num); // 15

        // num의 값을 2배 증가
        num *= 2;
        System.out.println(num);

        // num의 값을 절반으로 감소
        num /= 2; // num = num / 2와 같은 표현임.
        System.out.println(num);

        // 1 증가
        num += 1; // 1 증가는 많이 씀
        num++; // 위와 같은 표현
        System.out.println(num);

        // 1 감소
        num = num-1;
        num -= 1;
        num--;
        System.out.println(num);

        }
    }
}
