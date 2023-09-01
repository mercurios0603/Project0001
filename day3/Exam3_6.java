package day3;

public class Exam3_6 {
    public static void greeting1 (int m) {
        if (m==1) {
            System.out.println("안녕하세요");
        } else if (m==2) {
            System.out.println("하이~");
        } else if (m==3) {
            System.out.println("봉쥬");
        } else {
            System.out.println("지원하지 않는 언어입니다");
        }
    }

    public static void greeting2 (int n,int l) {
        for (int i=0 ; i < l ; i++){
            if (n==1) {
            System.out.println("안녕하세요");
            } else if (n==2) {
            System.out.println("하이~");
            } else if (n==3) {
            System.out.println("봉쥬");
            } else {
            System.out.println("지원하지 않는 언어입니다");
            }
        }
    }
    public static void main(String[] args) {
        greeting1(2);

        greeting1(3);

        greeting1(1);

        greeting1(4);

        greeting2(1, 3);

        greeting2(2, 5);

        greeting2(3, 7);
    }
}
