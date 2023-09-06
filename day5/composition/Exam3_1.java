package day5.composition;

public class Exam3_1 {
    // 출력 : 아래와 같이 출력되게 해주세요.

            public static void main(String[] args) {
            사람 a사람 = new 사람();
            a사람.나이 = 20;
            a사람.a왼팔 = new 팔();

            System.out.println(a사람.a왼팔.길이 + "cm");
            // 출력 : 100cm
            }

}

class 사람 {

    // 팔 클래스의 객체를 생성.
    // 이를 통해 사람 클래스 내부에서 팔의 메소드를 사용할 수 있게 된다.
    팔 a왼팔 = new 팔();
    int 나이;

}

class 팔 {

    int 길이 = 100;
}

