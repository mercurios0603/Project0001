package day7.Exam2_4;

public class Exam2_4 {
    public static void main(String[] args) {

        저장소.저장(new 사람());
        저장소.저장(new 사과());
        저장소.저장("안녕"); // "안녕" 은 String 클래스의 객체이다.
        저장소.저장(new String("안녕"));

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

        // int 형 변수 i의 값 '3'을 객체화 하는 방법

        Integer iObj = new Integer(i);


        저장소.저장(new Byte(b));
        저장소.저장(new Short(s));
        저장소.저장(new Character(c));
        저장소.저장(new Integer(i));
        저장소.저장(new Long(l));
        저장소.저장(new Float(f));
        저장소.저장(new Double(d));
        저장소.저장(new Boolean(bl));
    }
}

class 저장소 {
//    static void 저장(double v) {
//        System.out.println("double 값 : " + v);
//    }
//
//    static void 저장(boolean v) {
//        System.out.println("boolean 값 : " + v);
//    }
//
//    static void 저장(String v) {
//        System.out.println("String 값 : " + v);
//    }

    static void 저장(Object v) {
        System.out.println("Object 값 : " + v);
    }
}

class 사람 extends 동물 {
}

class 동물 extends 생물 {
}

class 식물 extends 생물 {
}

class 사과 extends 식물 {
}

// `extends Object` 는 생략가능하다.
class 생물 extends Object {
}

// 이 세상에 있는 모든 클래스는 Object 클래스의 하위 클래스 이다.
// 다시말하면 Object 클래스는 모든 클래스의 최초조상이다.