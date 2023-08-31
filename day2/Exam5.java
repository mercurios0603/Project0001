package day2;

public class Exam5 {
    public static void main(String[] args) {
        // 두수 num1과 num2가 주어집니다.
        // 두 수중 더 큰수에서 더 작은 수를 뺀 결과를 출력해주세요.
        int num1 = 10;
        int num2 = 15;
        int judge = num1 - num2;

        // 만약 두 수의 차가 양수라면 num1이 큰 것, 음수라면 num2가 큰 것. 0이면 같다.
        if (judge > 0) {
            int result = num1-num2;
            System.out.println(result);
        }
        else if (judge < 0) {
            int result = num2-num1;
            System.out.println(result);
        }
        else {
            System.out.println("두 값은 같다");
        }

    }
}
