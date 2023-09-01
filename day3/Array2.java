package day3;

public class Array2 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;

        int[] arr = {a,b,c};

        int d = arr[0];

        // 2차원 배열 -> 배열의 배열

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int[] arr3 = {9,10,11,12};

        int[][] darr = {arr1, arr2, arr3};

        int[] arr4 = darr[0];
        System.out.println(darr[1][0]); // 같은값 System.out.println(arr4[0]);
        System.out.println(darr[1][1]); // 같은값 System.out.println(arr4[1]);

        //     [0] [1] [2] [3]
        // [0]  1   2   3   4
        // [1]  5   6   7   8
        // [2]  9   10  11  12
        // 즉, 이차원배열[세로][가로] 또는 이차원배열[행][열]. 행렬의 개념이다.

        // 2차원 배열 선언

        int[][] darr2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12}
        };

        System.out.println(darr2[2][2]);

        // 2차원 배열 순회
        for (int i = 0 ; i < 3 ; i ++) {   // 외부 for 구문이 행 구문, 내부 for 구문이 열 부분
            for (int j = 0; j < 4; j++) {
                System.out.print(darr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

