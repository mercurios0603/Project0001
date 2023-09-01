package day3;

public class Exam3_8 {

    public static int plus(int a, int b) {
       int result = a + b;
       return result;
    }

    public static int minus(int c, int d) {
        int result = c - d;
        return result;
    }

    public static int multiple(int e, int f) {
        int result = e * f;
        return result;
    }

    public static int divide(int g, int h) {
        int result = g/h;
        return result;
    }

    public static int square(int i) {
        int result = i*i;
        return result;
    }
    public static void main(String[] args) {
        int rst1 = plus(10, 20);
        System.out.println(rst1);  // 출력 : 30

        int rst2 = minus(10, 20);
        System.out.println(rst2); // 출력 : -10

        int rst3 = multiple(5, 4);
        System.out.println(rst3); // 출력 : 20

        int rst4 = divide(10, 3);
        System.out.println(rst4); // 출력 : 3

        int rst5 = square(5);
        System.out.println(rst5); // 출력 : 25
    }
}
