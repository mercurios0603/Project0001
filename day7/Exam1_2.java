package day7;

// 문제 : 사람의 id를 출력해주세요.
// 조건 : 사람의 id를 20으로 설정해주세요.
// 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
// 조건 : 사람 클래스에서 출력할 수 없습니다.
public class Exam1_2 {
    public static void main(String[] args) {
        Person2 p2 = new Person2();

        // 구현시작
        p2.setId(15);
        System.out.println(p2.getId());
        // 구현끝

        // 출력 : 제 번호는 20 입니다.
    }
}

class Person2 {
    private int id;

    // 힌트 : 여기에 메소드 2개 추가해야 합니다.
    // 답 : 변수 하나당 입력값을 받는 set과, 반환하는 get을 만들어야 한다.
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}