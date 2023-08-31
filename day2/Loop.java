package day2;

public class Loop {
    public static void main(String[] args) {

        //반복문 -> 첫번째 벽

        // while, for

        // while (if문은 한번 조건을 실행하고 다음 구문으로 넘어감, while은 다시 반복함

        int i = 0;

        while(i < 10) {                  // while안의 조건이 false가 되는 순간 루프가 멈출 것이다.
            System.out.println("안녕");
            i++;
        }

        // for (while을 문법적으로 개선한 것)
        for (int j=0 ; j < 3 ; j++) {       // 초기값 : 반복조건 : 증감조건
            System.out.println("안녕");
        }
    }
}
