package day6.ducksimulation;

public class ducksimulation {
    public static void main(String[] args) {

        System.out.println("==== 청둥오리 ====");
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        a청둥오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.

        System.out.println("==== 흰오리 ====");
        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        a흰오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.

        System.out.println("==== 고무오리 ====");
        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        a고무오리.헤엄치다();
        //출력 : 오리가 날개로 날아갑니다.

        // 상속만으로 코드 중복을 완전히 해소할 수 없었다.
        // 코드 중복을 해소하기 위해서 상속을 사용하는 건 본질 X
        // 계층 구조를 표현 가능

        System.out.println("==== 아수라오리 ====");
        아수라오리 a아수라오리 = new 아수라오리();
        a아수라오리.날다();
        a아수라오리.헤엄치다();


    }
}

class 오리 {

    날개아이템 a날개;
    발아이템 a발;

    // 이 생성자를 통해 오리는 기본날개를 가지고 태어난다. (생성자에 의한 초기값 부여)
    오리() {
        a날개 = new 기본날개아이템();
        a발 = new 기본발아이템();
    }

    // 자식 클래스는 부모 클래스로 모습을 바꿀 수 있다. (43줄 46줄이 성립하는 이유)

    public void 날다() {
        a날개.사용();
    }

    public void 헤엄치다() {
        a발.사용();
    }

}
class 청둥오리 extends 오리 {
}

class 흰오리 extends 오리  {
}

class 고무오리 extends 오리 {
    고무오리() {
        a날개 = new 고무날개아이템();
        a발 = new 고무발아이템();
    }
}

class 고무2오리 extends 고무오리 {
}

class 아수라오리 extends 오리 {

    // 메서드 재정의(오버라이딩)
    public 아수라오리 () {
        a날개 = new 기본날개아이템();
        a발 = new 고무발아이템();
    }
}


// 123 ~ 126줄은 클래스 상속을 위해 메소드가 없어도 선언한 것임.
class 날개아이템 {
    public void 사용() {
    }
}

class 기본날개아이템 extends 날개아이템 {
    public void 사용() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class 고무날개아이템 extends 날개아이템 {
    public void 사용() {
        System.out.println("고무 날개로는 날 수 없어요..");
    }
}

class 발아이템 {
    public void 사용() {

    }
}

class 기본발아이템 extends 발아이템 {
    public void 사용() {
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
}

class 고무발아이템 extends 발아이템 {
    public void 사용() {
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}