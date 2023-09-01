package day3;

public class Array {
    public static void main(String[] args) {

        // 배열 (Array)
        // 데이터가 많아지면 변수만으로 관리 힘들다.

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        // 배열은 하나의 변수로 여러개의 값을 관리. 두 가지 방식이 있음.
        // 1. 선언과 동시에 저장
        int[] arr = {1,2,3,4,5}; // int 5개짜리 배열. 순서는 0번부터 시작함.

        // 순서(순번) - index로 배열 요소에 접근 가능
        System.out.println(arr[2]);
        System.out.println(arr[0]);

        // 2. 선언하고 나중에 저장 (선호되는 방식)
        // new 자료형[개수]
        int[] arr2 = new int[100]; // 0이 100개 만들어짐. (미리 공간을 만들어 두는 것)
        int[] arr3 = new int[5]; // 0이 5개 만들어짐.

        // arr3에 5개의 숫자 저장

        arr3[0] = 7;
        arr3[1] = 4;
        arr3[2] = 8;
        arr3[3] = 5;
        arr3[4] = 3;

        // 0~4 출력
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println(arr3[3]);
        System.out.println(arr3[4]);

        // 반복문 사용 가능 -> 일괄 처리(순회)
        for(int i = 0; i<5 ; i++) {
            System.out.println(arr3[i]);
        }

        // 배열은 같은 자료형만 저장 가능하다.
        // String[] arr4 = {1, "hello", true, 1.4}; -> 안 됨

        String[] arr5 = new String[3]; // 문자의 빈 공간은 null 3개가 채워짐 (숫자의 0과 같은 의미)

        arr5[0] = "hello";
        arr5[1] = "bye";
        arr5[2] = "good";

        for(int i = 0 ; i<3 ; i++) {
            System.out.println(arr5[i]);
        }
    }
}

