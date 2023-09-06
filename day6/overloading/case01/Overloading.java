package day6.overloading.case01;

public class Overloading {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        int result =  c1.plus(1,2);
        System.out.println(result);

        int result2 =  c1.plus(1,2,3);
        System.out.println(result2);
    }
}

class Calculator {

    // 메서드 오버로딩 -> 같은 이름으로 메서드를 여러개 만드는 것.
    // 조건 : 매개변수의 생김새(개수, 자료형 타입)가 달라야 한다.

    public int plus (int num1, int num2) {

        return num1 + num2;
    }

    public double plus (double num1, double num2) {

        return num1 + num2;
    }

    public int plus (int num1, int num2, int num3) {

        return num1 + num2 + num3;
    }

    public int plus (int num1, int num2, int num3, int num4) {

        return num1 + num2 + num3 + num4;
    }
}

