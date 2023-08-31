package day2;

public class Exam11 {
    public static void main(String[] args) {
        // a b 두 수가 주어지면 a와 b사이의 수를 오름차순 출력해주세요.
        // 오름차순은 작은 수 부터 큰수로 정렬되는 것을 말합니다.
        // ex )
        // 오름차순 :  1, 2, 3, 4, 5
        // 내림차순 :  5, 4, 3, 2, 1

        int a = 5;
        int b = 12;
        int c = Math.abs(a-b);

        if (a > b) {
            System.out.printf("오름차순 : ");
            for (int i=0 ; i <= c ; i++ ) {
                System.out.printf(b+i + ",");
            }
            System.out.println();
            System.out.printf("내림차순 : ");
            for (int i=0 ; i <= c ; i++ ) {
                System.out.printf(a-i + ",");
            }
        } else {
            System.out.printf("오름차순 : ");
            for (int i=0 ; i <= c ; i++ ) {
                System.out.printf(a+i + ",");
            }
            System.out.println();
            System.out.printf("내림차순 : ");
            for (int i=0 ; i <= c ; i++ ) {
                System.out.printf(b-i + ",");
            }
        }
    }
}

