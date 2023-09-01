package day3;

public class Exam3_5 {

    public static void introduce(int num) {
        for (int i=0 ; i < num ; i++) {
            System.out.println("안녕하세요. 20살 홍길동입니다.!");
        }
    }

    public static void main(String[] args) {


        System.out.println("Case1");
        introduce(3);
        System.out.println("Case2");
        introduce(5);
        System.out.println("Case3");
        introduce(10);
    }
}

