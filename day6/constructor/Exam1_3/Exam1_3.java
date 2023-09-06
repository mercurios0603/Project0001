package day6.constructor.Exam1_3;

// 출력 : 아래와 같이 출력되게 해주세요.
public class Exam1_3 {
    public static void main(String[] args) {
    new 사람().걷다();

    System.out.println(new 사람().a왼팔.길이 + "cm");
    // 출력 : 100cm
}
}
class 사람 {

    팔 a왼팔;

    // 클래스 팔을 따르는 a왼팔 인스턴스 변수 생성


    사람() {
    // 클래스 팔을 따르는 a왼팔 인스턴스 변수에 클래스 팔의 사본 대입(?)
        a왼팔 = new 팔();
    }

    // 14행부터 18행까지를 팔 a왼팔 = new 팔(); 한줄로 줄일 수 있지만 본문의 코드가 더 안정적이다.
    // 이유로 상속(inheritance)에서 부모와 자식간의 변수를 정의할 때 아래 방법으로 명확하게 분리할 수 잇다.

    public void 걷다() {
        System.out.println("사람 걷는다.");
    }
}

class 팔 {

    int 길이;

    public 팔() {
        this.길이 = 100;
    }
}