package day7.AccessModifier;
import day7.AccessModifier2.Calculator2;

// 접근제어자

// public : 어디서든 누구나 접근 가능 (V)
// protected -> 같은 패키지(폴더) + 상속관계에서만 가능
// default -> 같은 패키지에서만 가능 (아무것도 적지 않으면 그게 default 임)
// private -> 자기 자신만 가능. 클래스면 클래스, 메서드면 메서드 (V)
public class  AccessModifier {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        System.out.println(c1.plus());

        // 숫자를 0으로 나누면 안된다.
        // 객체의 인스턴스 변수를 바꾸는 것은 부담스러운 작업이다.
        // private 접근제어자를 이용해 접근을 막는다.
        // private 접근제어자 자료형을 통해 변수를 지정하면 외부에서 조작할 수 없다.

//        c1.num1 = 200; // 대입 x
//        c1.num2 = 0;

        // setter 메서드를 통해 우회 접근하도록 해야한다.

        c1.setNum1(100); // setter
        c1.setNum2(0); // setter

        System.out.println(c1.getNum1());
        System.out.println(c1.devide());

        // 아래의 Calculator2는 import 구문을 통해 작동되도록 허용한 것. 본래 강의에서는 불가능한 쪽으로 설명했었음
        Calculator2 c2 = new Calculator2();
        System.out.println(c2.plus2());
    }
}

class Calculator {

    // 가급적이면 객체 변수는 private를 이용 (시스템의 안정성과 보호를 위함)
    private int num1 = 10;
    private int num2 = 20;

    // 외부에서 객체 변수에 접근하기 위한 메서드 2개 필요
    // setter -> 변수에 값을 세팅
    // getter -> 변수의 값을 가져감
    // setter, getter 이름 짓는법
    // set+변수명, get+변수명 : 단 변수명 시작 알파벳은 대문자. (개발자들의 약속)

    public void setNum1(int num) { // num1 변수에 대한 setter
        this.num1 = num;
    }
    public void setNum2(int num) { // num2 변수에 대한 setter
        if (num == 0) {
            System.out.println("0은 입력할 수 없습니다.");
            return;
        }
        this.num2 = num;
    }

    public int getNum1() {
        return this.num1;
    }

    public int plus() {
        return num1 + num2;
    }

    public double devide() {
        return (double) num1 / num2;
    }
}