package day8.Exception;

public class Exception2 {
    public static void main(String[] args) {
        Person p1 = null;

        try {
            p1.hi();
        } catch(NullPointerException e) {
            System.out.println("객체 초기화 예외가 발생했습니다.");
        }
            System.out.println("프로그램 종료.");
    }

}
class Person {
    public void hi() {
        System.out.println("안녕");
    }
}