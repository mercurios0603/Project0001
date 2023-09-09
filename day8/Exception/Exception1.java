package day8.Exception;

public class Exception1 {

    public static void main(String[] args) {


        // [*.JAVA] --- compile ---- [*.class] ---- runtime ---- [머신(CPU. RAM)]

//        int a = "hihi";

        // 예외처리

        // 컴파일 타임 -> 컴파일 에러
        // 문법 오류

        // 런타임(프로그램 실행중) -> 런타임 에러
        // 문법적 오류는 없으나 논리적 오류가 발생할 때, 런타임 에러가 발생할 수 있음
        // 에러 -> 시스템, 네트워크, 머신
        // 예외 -> 프로그래머의 실수

        System.out.println("hihi");

        // 갑자기 꺼지지 않게 우회 -> 예외처리

        try { // 예외가 발생할 만한 지점을 try로 감싼다.

            int[] arr = new int[3];
            arr[10] = 10; // 프로그램의 실수

        } catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("배열에 대한 예외 문제가 발생했습니다.");

        }

        System.out.println("byebye");
    }
}
