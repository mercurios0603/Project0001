package day8.ArrayList;
import java.util.ArrayList;

public class Exam1_2 {
    public static void main(String[] args) {

        사람 사람1 = new 사람(24, "홍길동");
        사람 사람2 = new 사람(30, "이순신");
        사람 사람3 = new 사람(41, "을지문덕");
        사람 사람4 = new 사람(32, "황진이");

        // 1. 네 사람을 ArrayList에 저장
        // 데이터 형 사람인 ArrayList의 인스턴스 person을  생성한 것.

        ArrayList<사람> person = new ArrayList<>();

        // 이후 person 배열에 나이와 이름을 갖는 사람 4명을 추가.

        person.add(사람1);
        person.add(사람2);
        person.add(사람3);
        person.add(사람4);

        // 2. 네 사람에게 자기소개 시키기

        // 결국 person.get(i)는 ArrayList의 인스턴스 person에 저장된 i번째 객체를(에) 조회(접근)하는 것을 의미한다.
        // 따라서 그 인스턴스의 메서드를 바로 호출하면 정상적으로 기능하는 것.

        System.out.println("--- 네 사람에게 자기소개 시키기 ---");
        for (int i = 0; i < person.size(); i++) {
            person.get(i).introduce();
        }

        // 3. 30대인 사람에게만 자기소개 시키기

        System.out.println("--- 30대인 사람에게만 자기소개 시키기 ---");
        for (int i = 0; i < person.size(); i++) {
            if (person.get(i).getAge() >= 30 && person.get(i).getAge() < 40) {
                person.get(i).introduce();
            }
        }
    }
}

class 사람 {
    private int age;
    private String name;

    사람(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void introduce() {
        System.out.printf("%d살 %s입니다.\n", age, name);
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }
}
