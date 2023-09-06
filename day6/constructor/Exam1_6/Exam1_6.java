package day6.constructor.Exam1_6;


// 칼과 활에 중복되는 변수들을 상속을 이용해 해결해주세요.
public class Exam1_6 {
    public static void main(String[] args) {

        전사 a전사 = new 전사();
        a전사.자기소개();
        // 안녕하세요 저는 20살 홍길동입니다.

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 홍길동이/가 활로 10의 데미지를 입힙니다.
        a전사.스킬사용();
        // 출력 : 홍길동이/가 불화살 스킬을 사용합니다. 1.5배(15)의 피해를 입힙니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 홍길동이/가 칼로 15의 데미지를 입힙니다.
        a전사.스킬사용();
        // 출력 : 홍길동이/가 연속 베기 스킬을 사용합니다. 2배(30)의 피해를 입힙니다.

    }
}


    class 전사 {

        String 이름;
        int 나이;
        무기 a무기;

        public 전사() {
            this.이름 = "홍길동";
            this.나이 = 20;
        }
        public void 자기소개() {
            System.out.println("안녕하세요. 저는 " + 나이 + "살 " + 이름 + " 입니다.");
        }

        public void 공격() {
            System.out.print(이름 + "이/가 ");
            a무기.사용();
        }

        public void 스킬사용() {
            System.out.print(이름 + "이/가 ");
            a무기.무기스킬사용();
        }
    }

    class 무기 {

        double damage;
        String weaponName;
        public void 사용() {
            System.out.println("?????");
        }

        public void 무기스킬사용() {
        }
    }


    class 칼 extends 무기 {
        칼() {
            this.weaponName = "장식용칼";
            this.damage = 10;
        }
        public void 사용() {
            System.out.printf("%s로 데미지 %f 공격\n", weaponName, damage);
        }

        public void 무기스킬사용() {
            System.out.printf("연속 베기 스킬을 사용합니다. 2배(%f)의 피해를 입힙니다.", damage * 2);
        }
    }

    class 활 extends 무기 {

        활 () {
                this.weaponName = "사냥용활";
                this.damage = 10;
        }

        public void 사용() {
            System.out.printf("%s로 데미지 %f 공격\n",weaponName, damage);
        }

        public void 무기스킬사용() {
            System.out.printf("불화살 스킬을 사용합니다. 1.5배(%f)의 피해를 입힙니다.\n", damage * 1.5);
        }
    }
