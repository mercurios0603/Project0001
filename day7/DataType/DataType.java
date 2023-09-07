package day7.DataType;

public class DataType {
    public static void main(String[] args) {
    // 자료형
    // 원시타입, 객체타입
    // 숫자형, 객체형

    // 숫자형 (원시타입)
    // 정수 - byte, short, int, long
    // 실수 - float, double
    // 논리값 (참 - 1, 거짓 - 0) - boolean
    // 문자 -> 단일문자 (a - 97) - char

    // 객체형
    // int[] -> 배열
    // String -> 문자열 (배열)
    // class로 만드는 모든 것

    // 형변환 -> 안전한 경우 자동형변환.
    //           위험한 경우 수동형변환./
    //           관계 없는 것끼리는 형변환 X

    // 자바는 객체지향언어
    int num = 10; // 숫자타입은 개체지향의 혜택을 받지 못함. 따라서 숫자를 객체로 만들어야 할 때가 있음


    // 래퍼 클래스 (Wrapper Class)

    // 원시 타입을 객체 타입으로 감싸는 역할을 하는 클래스입니다.
    // 래퍼 클래스는 원시 타입의 값을 객체로 다룰 수 있도록 도와줍니다.
    // 래퍼 클래스의 객체 변수는 해당 원시 타입 값을 갖고 있으며, 객체 지향 프로그래밍 환경에서 유용합니다.
    // 래퍼 클래스를 사용하면 원시 타입을 객체로 다룰 수 있어서
    // 객체 메서드를 호출하거나 컬렉션과 같은 객체 기능을 활용할 수 있습니다.
    // 자바 5부터는 오토박싱(Auto-Boxing)과 언박싱(Unboxing)을 지원하여,
    // 원시 타입과 래퍼 클래스 간 변환을 자동으로 처리할 수 있습니다.

    // Interger는 객체이며 그에 따른 메소드를 JAVA에서 지원한다.
    // 입력값 없이 실행해보면 기본값이나 범위 등을 결과를 보고 추산할 수 있다.

    // int의 래퍼클래스 사용해보기
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.MAX_VALUE);

    // 숫자를 객체화 시키는 것 valueOf (JAVA 9 버전 전후로 new Interger(123)에서 Interger.valueOf(123)으로 바뀜

    // 숫자타입 -> 객체타입 (박싱, Boxing)
    Integer iobj = Integer.valueOf(10);
    System.out.println(iobj);

    // 객체타입 -> 숫자타입 (언박싱, Unboxing)
    int i = iobj.intValue();
    System.out.println(i);

    // 오토박싱, 오토언박싱 (JAVA 5부터 지원)

    i = iobj; // i는 int, iobj는 Integer => 오토 언박싱 (자동으로 객체를 숫자로 변환)

    Integer iobj2 = 20; // 오토박싱    // 오토박싱
    Integer num1 = 20;

    System.out.println(iobj2);

    // 원시타입(int, char, 은 주황색으로 표시
    // 원시타입에 해당하는 자료형에는 모두 래퍼클래스가 존재.
    // 원시타입 -> 래퍼클래스 표기
    // int -> Integer, char -> Character
    // double -> Double, float -> Float, short -> Short ...

    String str = "hihi"; // String도 객체 타입

    }
}
