package day3;

public class Exam4_2 {
    // 배열을 두 번 출력해주세요.
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for (int j = 0 ; j < 2 ; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.printf(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
