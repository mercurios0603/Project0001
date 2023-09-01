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

        // 전체 시행 횟수 : a
        // 별의 규칙 : 1부터 시작해서 2씩 증가 (2*n + 1), 이 때 n은 시행횟수 n=a
        // 공백의 규칙 : y-1부터 시작하여 1씩 감소 (높이 y에서 1씩 빼주는 것)
        // 증감수치가 2일 때 표기법 증가일 때 b += 2, 감소일 때 b -= 2

        for(int a = 0; a<y; a++){
            for(int b = y-1; b > a; b--){
                // 이를 다르게 표현하면 for (int b = 0; b < y-a ; b++) 도 가능하다.
                // 동일한 문맥을 다른 방법으로 표현해도 결과가 같을 수 있다.
                System.out.printf(" ");
            }
            for(int c = 0; c < 2*a+1; c++) {
                System.out.printf("*");
            }
                System.out.printf("\n");
        }

    }
}
