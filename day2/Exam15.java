package day2;

public class Exam15 {
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
        int n = 3;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {  // 공백의 수 계산 (공백은 줄어간다 n-i)
                System.out.printf(" ");
            }
            for (int k = 0; k <=i; k++) {   // 별 계산 (별은 늘어난다)
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
