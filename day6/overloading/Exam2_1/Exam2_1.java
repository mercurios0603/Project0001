package day6.overloading.Exam2_1;

public class Exam2_1 {

    public static void main(String[] args) {
    new 사람();
    // 출력 : 사람이 태어났습니다.

    new 사람(10);
    // 출력 : 태어나서부터 10살인 사람이 태어났습니다.

    new 사람(20);
    // 출력 : 태어나서부터 20살인 사람이 태어났습니다.
    }
}

class 사람 {

    사람() {
        System.out.println("사람이 태어났습니다.");
    }

    사람(int age) {
        System.out.printf("태어나서부터 %d살인 사람이 태어났습니다.\n", age);
    }

}
