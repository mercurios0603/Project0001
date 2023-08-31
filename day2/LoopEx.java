package day2;

public class LoopEx {
    public static void main (String[] args) {

        // 2중 반복문

        // 1. 1~5까지 3번 출력 (단순구조)

        System.out.println("=== 1회차 ===");
        for(int i = 1 ; i < 6 ; i++) {
            System.out.println(i);
        }

        System.out.println("=== 2회차 ===");
        for(int i = 1 ; i < 6 ; i++) {
            System.out.println(i);
        }

        System.out.println("=== 3회차 ===");
        for(int i = 1 ; i < 6 ; i++) {
            System.out.println(i);
        }

        // 2. 1~5까지 3번 출력 (이중 for - 이중 반복문 이용)

        for (int i = 0 ; i <3 ; i++) {
            System.out.println("=== " + (i+1) + "회차 ===");
            for(int j = 1 ; j < 6 ; j++) {
                System.out.println(j);
            }
        }

        // 3. 직사각형 만들기
        // * 기호를 많이 사용

        /*

        *****
        *****
        *****

         */

        // Version 1
        System.out.println("Version 1");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");

        // Version 2
        System.out.println("Version 2");
        for (int i = 0; i < 3 ; i++) {
            System.out.println("*****");
        }

        // Version 3
        System.out.println("Version 3");
        for (int i = 0; i < 3 ; i++) {
            for (int  j = 0; j < 5 ; j++) {
                System.out.printf("*");  // printf는 줄바뀜이 일어나지 않는다.
            }
            System.out.println(); // 그러나 1회 루프이후 줄바꿈이 필요하므로 해당 구문 사용.
        }
    }
}
