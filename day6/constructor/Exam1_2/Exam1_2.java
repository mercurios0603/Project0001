package day6.constructor.Exam1_2;

public class Exam1_2 {
    public static void main(String[] args) {
    사람 a사람 = new 사람();
    a사람.나이 = 10;
    a사람.a왼팔 = new 팔();

    System.out.println(a사람.a왼팔.길이 + "cm");
    // 출력 : 100cm
    }
}

class 사람 {

    int 나이;

    팔 a왼팔;

    public 사람() {

    }

}

class 팔 {
    int 길이;

    // 입력값 없이 생성자 내부에서 상수로 초긱밧을 지정. 이를 this로 받아 팔 클래스의 인스턴스 변수로 사용(?)
    public 팔() {
      this.길이 = 100;
    }
}