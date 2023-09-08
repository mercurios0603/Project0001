package day8.input;

import java.util.Scanner;

public class ParseInt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("나이를 입력해주세요:");

        // 문자를 -> 숫자로 변환하고 싶음
        // 그러나 관련 없는 타입끼리는 형변환 불가

        // Integer 래퍼클래스 사용
        int num = Integer.parseInt("10"); // 문자로 된 숫자를 실제 숫자형으로 변환

        int age = Integer.parseInt(scan.nextLine());

//        scan.nextLine(); // 버퍼 비우기용~ 이었지만 parseInt에 의해 줄바꿈이 필요없어짐

        System.out.print("이름을 입력해주세요:");
        String name = scan.nextLine();

        System.out.printf("안녕하세요 %d세 %s입니다.", age, name);
    }
}
