package day4.Scope;

public class LocalVar {

    public static void main(String[] args) {
        Calculator c1 = new Calculator() ;
        c1.plus(5,6);
        c1.test();
    }
}

class Calculator {
    int result ; // 인스턴스 변수 -> 두 함수가 공유

    // 클래스 변수 -> 모든 인스턴스가 공유
    // 인스턴스 변수 -> 모든 함수(메서드)가 공유
    // 지역 변수 -> 함수(메서드)가 단독으로 사용하는 변수 (다른 함수에서 사용 X)

    public void plus (int num1, int num2) {
    // 아래의 result를 int result로 썼다면 인스턴스 변수가 아니라 plus 함수의 지역변수 result를 또 만든 셈이 된다
    // 즉, plus 메서드 안에서 사용되고 사라지므로 test 메서드에서는 출력되지 않는다. (직접 해봤음!)
    // 이 result는 인스턴스 변수와 동일한 변수임.
        result = num1 + num2;
        System.out.println(result);
    }

    public void test() {
    // 이 result는 인스턴스 변수와 동일한 변수임.
        System.out.println(result);
    }
}