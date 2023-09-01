package day3;

public class Exam4_4 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        // 배열 안의 숫자들의 합을 구해주세요.
		/*
		아래 4줄은 위 1줄과 같은 의미 입니다.
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
		*/

         for (int i = 0; i < arr.length; i++) {
                sum += arr[i]; // 배열의 각 요소를 더하여 합산
         }
         System.out.println(sum);
    }
}
