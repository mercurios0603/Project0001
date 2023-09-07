package day7;

// 가정 : 우리는 오라클 자바 개발팀에 취업을 했습니다. 우리는 자바 10의 새로운 기능은 `저장소` 클래스를 만들어야 합니다.
// 기본형 변수의 경우 자동형변환을 이용하여 `저장 메서드`의 개수를 최대한 줄여보세요.
public class Exam2_3 {
    public static void main(String[] args) {
        저장소.저장(10);
        저장소.저장("안녕");
        저장소.저장(new 사람());
        저장소.저장(new 사과());

        // 데이터형 변수 의 형태, 사람 a1 = new 사람()의 우변인 인스턴스값을 넣는 것이다. (실제 입력값인 셈) 좌변은 변수

        저장소.저장(5.5);
        저장소.저장(false);
        저장소.저장('a');

        // 정수 계열
        byte b = 0; // 1바이트
        char c = 1; // 2바이트
        short s = 2; // 2바이트
        int i = 3; // 4바이트
        long l = 4; // 8바이트

        // 실수 계열
        // 4.1f => float 형 실수를 의미
        float f = 3.14f; // 4바이트
        // 3.141592 => double 형 실수를 의미
        double d = 3.141592; // 8 바이트

        // 논리 계열
        boolean bl = false; // 1/8 바이트, 1비트

        저장소.저장(b);
        저장소.저장(s);
        저장소.저장(c);
        저장소.저장(i);
        저장소.저장(l);
        저장소.저장(f);
        저장소.저장(d);
        저장소.저장(bl);
    }
}

class 저장소 {
//    static void 저장(byte v) {
//        System.out.println("byte 값 : " + v);
//    }

//    static void 저장(char v) {
//        System.out.println("char 값 : " + v);
//    }

//    static void 저장(short v) {
//        System.out.println("short 값 : " + v);
//    }

//    static void 저장(int v) {
//        System.out.println("int 값 : " + v);
//    }

//    static void 저장(long v) {
//        System.out.println("long 값 : " + v);
//    }

//    static void 저장(float v) {
//        System.out.println("float 값 : " + v);
//    }

    // 숫자 관련 값은 double로 다 형변환해서 받을 수 있다.
    static void 저장(double v) {
        System.out.println("double 값 : " + v);
    }

    static void 저장(boolean v) {
        System.out.println("boolean 값 : " + v);
    }

    static void 저장(String v) {
        System.out.println("String 값 : " + v);
    }

    // 객체 관련 값음 Object로 다 형변환 해서 받을 수 있다.
    static void 저장(사람 v) {
        System.out.println("생물 값 : " + v);
    }

    static void 저장(사과 v) {
        System.out.println("생물 값 : " + v);
    }

//        static void 저장(사람 v) {
//        System.out.println("사람 값 : " + v);
//    }

//    static void 저장(사과 v) {
//        System.out.println("사과 값 : " + v);
//    }
}

// 최상위 클래스 = Object
// Java의 모든 객체는 Object를 상속받는다.
// class Object {
// }

// 만약 Object를 상속받지 않는다면 새로운 객체가 추가될 때마다
// 해당 객체를 매개변수로 받는 저장 메서드를 일일이 새로 만들어야한다.

class 사람 { // extends Object가 생략되어 있는셈.
}

class 사과 { // extends Object가 생략되어 있는셈.
}
