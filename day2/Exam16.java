package day2;

public class Exam16 {
    public static void main(String[] args) {

        // 출력
        /* y = 3;


           *
          ***
         *****


         */


        // 출력
        /* y = 5;


             *
            ***
           *****
          *******
         *********


         */


        // 출력
        /* y = 7;


               *
              ***
             *****
            *******
           *********
          ***********
         *************


         */
        int y = 5;

        for(int a = 0; a<y; a++){
            for(int b = y-1; b > a; b--){
                System.out.printf(" ");
            }
            for(int c = 0; c<2*a+1;c++) {
                System.out.printf("*");
            }
                System.out.printf("\n");
        }

    }
}
