package day2;

public class Exam14 {
    public static void main(String[] args) {

        // 출력
    /*
    높이 : [3]

    *
    **
    ***


    */

    /*

    높이 : [5]

    *
    **
    ***
    ****
    *****

    */

    /*

    높이 : [7]

    *
    **
    ***
    ****
    *****
    ******
    *******

    */

        int h1 = 3;

        for (int i = 0; i < h1 ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.printf("*");  // printf는 줄바뀜이 일어나지 않는다.
            }
                System.out.printf("\n");
        }

        int h2 = 5;

        for (int i = 0; i < h2 ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.printf("*");  // printf는 줄바뀜이 일어나지 않는다.
            }
            System.out.printf("\n");
        }

        int h3 = 7;

        for (int i = 0; i < h3 ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.printf("*");  // printf는 줄바뀜이 일어나지 않는다.
            }
            System.out.printf("\n");
        }
    }
}
