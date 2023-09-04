package day4.static1;

public class Exam2_2 {
    // 문제 : 아래 코드의 잘 못된 점을 고쳐보세요. 그리고 printValue 함수를 완성시켜주세요.


        public static void main(String[] args) {

            int num = 10; // 해당 변수가 main 바깥에 있었음.

            System.out.println(num); // 출력 : 10

            printValue("안녕");
            // 출력 : 안녕
        }

         public static void printValue(String input) {
            System.out.println(input);
         }

         // 또는.

}
