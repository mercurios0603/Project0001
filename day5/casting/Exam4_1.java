package day5.casting;

public class Exam4_1 {
    public static void main(String[] args) {

        무기 a무기 = new 칼();
        // 무기 클래스 타입의 변수 a무기를 선언하고, 이를 칼 클래스의 인스턴스로 초기화합니다.
        // 이 문장은 다형성의  예시입니다. 무기 클래스는 부모 클래스이며, 칼 클래스는 이를 상속받는 자식 클래스입니다.
        // 부모 클래스 타입의 변수로 자식 클래스의 인스턴스를 참조할 수 있습니다.
        a무기.공격();
        // 출력 : 칼로 공격합니다.

        a무기 = new 활();
        // a무기 변수에 새로운 활 객체를 할당합니다. 이전에 참조하던 객체는 더 이상 사용할 수 없게 됩니다.
        // 여기서 중요한 개념은 다형성으로 인해 a무기 변수가 다른 자식 클래스(활)의 인스턴스를 참조할 수 있다는 것입니다.
        a무기.공격();
        // 출력 : 활로 공격합니다.
    }
}

class 무기 {
    public void 공격() {
    }
    public void 스킬사용() {
    }
}

// 칼 클래스 정의 (무기를 상속)
class 칼 extends 무기 {
    @Override
    public void 공격() {
        System.out.println("홍길동이/가 칼로 공격합니다.");
    }
    public void 스킬사용() {
        System.out.println("홍길동이/가 연속 베기 스킬을 사용합니다. 2배(30)의 피해를 입힙니다.");
    }
}

// 활 클래스 정의 (무기를 상속)
class 활 extends 무기 {
    @Override
    public void 공격() {
        System.out.println("홍길동이/가 활로 공격합니다.");
    }
    public void 스킬사용() {
        System.out.println("홍길동이/가 불화살 스킬을 사용합니다. 1.5배(15)의 피해를 입힙니다.");
    }
}
